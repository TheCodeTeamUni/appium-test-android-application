package testScript;

import baseClass.BaseClass;
import io.appium.java_client.MobileElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class CompanyCandidateListTest extends BaseClass {

    @Test(priority = 1)
    public void createCompanyAndListCandidatesSuccess() throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        RegisterUserFormPage registerUserFormPage = new RegisterUserFormPage(driver);
        CompanyHomePage companyHomePage = new CompanyHomePage(driver);
        CandidatesListPage candidatesListPage = new CandidatesListPage(driver);
        System.out.println("Login User Test started");

        loginPage.signUpButton();
        signUpPage.companyProfileButton();
        registerUserFormPage.signUpUserNameTextView("Automation Company Test");
        registerUserFormPage.signUpEmailTextView("corporate@mail.com");
        registerUserFormPage.signUpPasswordTextView("AA1234aa");
        registerUserFormPage.signUpConfirmPasswordTextView("AA1234aa");
        registerUserFormPage.signUpCreateUserButton();

        MobileElement assertValidateMessage = loginPage.assertValidateRegisterUser();
        Assert.assertEquals(assertValidateMessage.getText(), "¿Need an account?");
        System.out.println("Successful - Test OK..." + assertValidateMessage.getText());

        loginPage.loginEmailTextView("corporate@mail.com");
        loginPage.loginPasswordTextView("AA1234aa");
        loginPage.loginButton();

        companyHomePage.companyCandidatesListButton();

        MobileElement element = candidatesListPage.candateListNameTextView();
        boolean isDisplayed = element.isDisplayed();
        Assert.assertTrue(isDisplayed);
        System.out.println("Successful - Test OK");
    }

    @Test(priority = 2)
    public void createProjectSuccess() throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        CompanyHomePage companyHomePage = new CompanyHomePage(driver);
        ProjectPage projectPage = new ProjectPage(driver);
        System.out.println("Login User Test started");

        loginPage.loginEmailTextView("corporate@mail.com");
        loginPage.loginPasswordTextView("AA1234aa");
        loginPage.loginButton();

        companyHomePage.companyProjectsButton();

        projectPage.createProjectIconButton();
        projectPage.createProjectNameForm("Proyecto Automatizado");
        projectPage.createProjectStartDateForm("11/11/2011");
        projectPage.createProjectEndDateForm("12/12/2012");
        projectPage.createProjectDescriptionForm("Este es un proyecto automático");
        projectPage.createProjectAspirantsForm("5");
        projectPage.saveInformationButton();

        MobileElement assertProject = projectPage.assertProjectCreated();
        Assert.assertEquals(assertProject.getText(), "Create Project");
        System.out.println("Successful - Test OK..." + assertProject.getText());
    }

    @Test(priority = 3)
    public void listProjectSuccess() throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        CompanyHomePage companyHomePage = new CompanyHomePage(driver);
        ProjectPage projectPage = new ProjectPage(driver);
        System.out.println("Login User Test started");

        loginPage.loginEmailTextView("corporate@mail.com");
        loginPage.loginPasswordTextView("AA1234aa");
        loginPage.loginButton();

        companyHomePage.companyProjectsButton();

        projectPage.listProjectIconButton();
        MobileElement element = projectPage.projectListName();
        boolean isDisplayed = element.isDisplayed();
        Assert.assertTrue(isDisplayed);
        System.out.println("Successful - Test OK");

    }
}
