package testScript;

import baseClass.BaseClass;
import io.appium.java_client.MobileElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class RegisterInformationCandidateTest extends BaseClass {

    @Test (priority = 1)
    public void savePersonalInformationSuccess() throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        RegisterUserFormPage registerUserFormPage = new RegisterUserFormPage(driver);
        CandidateHomePage candidateHome = new CandidateHomePage(driver);
        PersonalInformationFormPage personalInformation = new PersonalInformationFormPage(driver);
        System.out.println("Login User Test started");

        loginPage.signUpButton();
        signUpPage.aspirantProfileButton();
        registerUserFormPage.signUpUserNameTextView("Automation Test");
        registerUserFormPage.signUpEmailTextView("automation01@mail.com");
        registerUserFormPage.signUpPasswordTextView("AA1234aa");
        registerUserFormPage.signUpConfirmPasswordTextView("AA1234aa");
        registerUserFormPage.signUpCreateUserButton();

        MobileElement assertValidateMessage = loginPage.assertValidateRegisterUser();
        Assert.assertEquals(assertValidateMessage.getText(), "¿Need an account?");
        System.out.println("Successful - Test OK..." + assertValidateMessage.getText());

        loginPage.loginEmailTextView("automation01@mail.com");
        loginPage.loginPasswordTextView("AA1234aa");
        loginPage.loginButton();

        candidateHome.candidatePersonalInformationButton();
        personalInformation.personalInformationNameTextView("Prueba");
        personalInformation.personalInformationLastNameTextView("Automatizada");
        personalInformation.personalInformationDocumentTypeTextView("CC");
        personalInformation.personalInformationDocumentTextView("80123456");
        personalInformation.personalInformationGenderTextView("Masculino");
        personalInformation.personalInformationTelephoneTextView("3051234567");
        personalInformation.personalInformationCountryTextView("Colombia");
        personalInformation.personalInformationAddressTextView("Calle 5 8 87");
        personalInformation.personalInformationBirthdayTextView("12/12/2012");
        personalInformation.personalInformationDescriptionTextView("Descripción automatizada");
        personalInformation.personalInformationPhotoTextView("https://i.imgur.com/0KvxXUQ.jpg");
        personalInformation.saveInformationButton();

        MobileElement assertRegister = candidateHome.assertRegisterCandidateInformation();
        Assert.assertEquals(assertRegister.getText(), "Candidate Portal");
        System.out.println("Successful - Test OK..." + assertRegister.getText());
    }

    @Test (priority = 2)
    public void saveEmploymentInformationSuccess() throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        CandidateHomePage candidateHome = new CandidateHomePage(driver);
        EmploymentInformationFormPage employmentInformation = new EmploymentInformationFormPage(driver);
        System.out.println("Login User Test started");

        loginPage.loginEmailTextView("automation01@mail.com");
        loginPage.loginPasswordTextView("AA1234aa");
        loginPage.loginButton();

        candidateHome.candidateEmploymentInformationButton();

        employmentInformation.employmentInformationCompanyNameTextView("Automation Corp");
        employmentInformation.employmentInformationPositionTextView("Ingeniero");
        employmentInformation.employmentInformationActualJobTextView("true");
        employmentInformation.employmentInformationStartDateTextView("11/11/2011");
        employmentInformation.employmentInformationEndDateTextView("12/12/2012");
        employmentInformation.saveInformationButton();

        MobileElement assertRegister = candidateHome.assertRegisterCandidateInformation();
        Assert.assertEquals(assertRegister.getText(), "Candidate Portal");
        System.out.println("Successful - Test OK..." + assertRegister.getText());
    }

    @Test (priority = 3)
    public void saveVocationalInformationSuccess() throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        CandidateHomePage candidateHome = new CandidateHomePage(driver);
        VocationalInformationFormPage vocationalInformation = new VocationalInformationFormPage(driver);
        System.out.println("Login User Test started");

        loginPage.loginEmailTextView("automation01@mail.com");
        loginPage.loginPasswordTextView("AA1234aa");
        loginPage.loginButton();

        candidateHome.candidateVocationalInformationButton();

        vocationalInformation.vocationalInformationEducationTypeTextView("Formal");
        vocationalInformation.vocationalInformationLevelTextView("Master");
        vocationalInformation.vocationalInformationTitleTextView("Master en software");
        vocationalInformation.vocationalInformationGradeTextView("true");
        vocationalInformation.vocationalInformationInstitutionTextView("Uniandes");
        vocationalInformation.vocationalInformationStartDateTextView("11/11/2011");
        vocationalInformation.vocationalInformationEndDateTextView("12/12/2012");
        vocationalInformation.saveInformationButton();

        MobileElement assertRegister = candidateHome.assertRegisterCandidateInformation();
        Assert.assertEquals(assertRegister.getText(), "Candidate Portal");
        System.out.println("Successful - Test OK..." + assertRegister.getText());
    }

    @Test (priority = 4)
    public void saveSkillInformationSuccess() throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        CandidateHomePage candidateHome = new CandidateHomePage(driver);
        SkillInformationFormPage skillInformation = new SkillInformationFormPage(driver);
        System.out.println("Login User Test started");

        loginPage.loginEmailTextView("automation01@mail.com");
        loginPage.loginPasswordTextView("AA1234aa");
        loginPage.loginButton();

        candidateHome.candidateSkillInformationButton();

        skillInformation.skillInformationSkillTextView("Python");
        skillInformation.skillInformationSkillLevelTextView("80%");
        skillInformation.skillInformationExperienceTextView("2 años");
        skillInformation.saveInformationButton();

        MobileElement assertRegister = candidateHome.assertRegisterCandidateInformation();
        Assert.assertEquals(assertRegister.getText(), "Candidate Portal");
        System.out.println("Successful - Test OK..." + assertRegister.getText());
    }
}
