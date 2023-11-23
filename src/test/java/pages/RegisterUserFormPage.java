package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RegisterUserFormPage extends BasePage {

    @AndroidFindBy(id = "com.example.vinilos:id/userNameEt")
    private AndroidElement signUpUserNameTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/emailAddressEt")
    private AndroidElement signUpEmailTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/passwordEt")
    private AndroidElement signUpPasswordTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/confirmPasswordEt")
    private AndroidElement signUpConfirmPasswordTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/loginSignUpBtn")
    private AndroidElement signUpLoginButton;

    @AndroidFindBy(id = "com.example.vinilos:id/createUserBtn")
    private AndroidElement signUpCreateUserButton;

    public RegisterUserFormPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void signUpUserNameTextView(String string) {
        signUpUserNameTextView.sendKeys(string);
    }

    public void signUpEmailTextView(String string) {
        signUpEmailTextView.sendKeys(string);
    }

    public void signUpPasswordTextView(String string) {
        signUpPasswordTextView.sendKeys(string);
    }

    public void signUpConfirmPasswordTextView(String string) {
        signUpConfirmPasswordTextView.sendKeys(string);
    }

    public void signUpLoginButton() {
        signUpLoginButton.click();
    }

    public void signUpCreateUserButton() {
        signUpCreateUserButton.click();
    }
}
