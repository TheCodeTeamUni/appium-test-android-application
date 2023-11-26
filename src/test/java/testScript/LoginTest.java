package testScript;

import baseClass.BaseClass;
import io.appium.java_client.MobileElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CandidateHomePage;
import pages.CompanyHomePage;
import pages.LoginPage;

public class LoginTest extends BaseClass {

    @Test
    public void candidateLoginSuccess() throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        CandidateHomePage candidateHome = new CandidateHomePage(driver);
        System.out.println("Login User Test started");

        loginPage.loginEmailTextView("mmorales@crehana.com");
        loginPage.loginPasswordTextView("AA1234aa");
        loginPage.loginSeePassword();
        loginPage.loginButton();

        MobileElement elementErrorMessage = candidateHome.candidateHomeTitle();
        Assert.assertEquals(elementErrorMessage.getText(), "Candidate Portal");
        System.out.println("Successful - Test OK..." + elementErrorMessage.getText());
    }

    @Test
    public void candidateLoginInvalidEmail() throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        System.out.println("Login User Test started");

        loginPage.loginEmailTextView("noexiste@correo.com");
        loginPage.loginPasswordTextView("AA1234aa");
        loginPage.loginSeePassword();
        loginPage.loginButton();

        MobileElement elementErrorMessage = loginPage.loginErrorMessage();
        Assert.assertEquals(elementErrorMessage.getText(), "El usuario no existe\n");
        System.out.println("Successful - Test OK..." + elementErrorMessage.getText());
    }

    @Test
    public void candidateLoginInvalidPassword() throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        System.out.println("Login User Test started");

        loginPage.loginEmailTextView("mmorales@crehana.com");
        loginPage.loginPasswordTextView("AAA1234aaa");
        loginPage.loginSeePassword();
        loginPage.loginButton();

        MobileElement elementErrorMessage = loginPage.loginErrorMessage();
        Assert.assertEquals(elementErrorMessage.getText(), "La contraseña es incorrecta\n");
        System.out.println("Successful - Test OK..." + elementErrorMessage.getText());
    }

    @Test
    public void companyLoginSuccess() throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        CompanyHomePage companyHome = new CompanyHomePage(driver);
        System.out.println("Login User Test started");

        loginPage.loginEmailTextView("company@crehana.com");
        loginPage.loginPasswordTextView("AA1234aa");
        loginPage.loginSeePassword();
        loginPage.loginButton();

        MobileElement elementErrorMessage = companyHome.companyHomeTitle();
        Assert.assertEquals(elementErrorMessage.getText(), "Company Portal");
        System.out.println("Successful - Test OK..." + elementErrorMessage.getText());

        /*MobileElement element = home.homeLogoCrehanaImage();
        boolean isDisplayed = element.isDisplayed();
        Assert.assertTrue(isDisplayed);
        System.out.println("Successful - Test OK");*/
    }

    @Test
    public void companyLoginInvalidEmail() throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        System.out.println("Login User Test started");

        loginPage.loginEmailTextView("noexiste@correo.com");
        loginPage.loginPasswordTextView("AA1234aa");
        loginPage.loginSeePassword();
        loginPage.loginButton();

        MobileElement elementErrorMessage = loginPage.loginErrorMessage();
        Assert.assertEquals(elementErrorMessage.getText(), "El usuario no existe\n");
        System.out.println("Successful - Test OK..." + elementErrorMessage.getText());
    }

    @Test
    public void companyLoginInvalidPassword() throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        System.out.println("Login User Test started");

        loginPage.loginEmailTextView("company@crehana.com");
        loginPage.loginPasswordTextView("AAA1234aaa");
        loginPage.loginSeePassword();
        loginPage.loginButton();

        MobileElement elementErrorMessage = loginPage.loginErrorMessage();
        Assert.assertEquals(elementErrorMessage.getText(), "La contraseña es incorrecta\n");
        System.out.println("Successful - Test OK..." + elementErrorMessage.getText());
    }
}