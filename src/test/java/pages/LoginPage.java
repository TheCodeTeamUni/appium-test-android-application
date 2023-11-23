package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BasePage {
    @AndroidFindBy(id = "com.example.vinilos:id/sign_up_btn")
    private AndroidElement signUpButton;

    @AndroidFindBy(id = "com.example.vinilos:id/emailAddressEt")
    private AndroidElement loginEmailTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/passwordEt")
    private AndroidElement loginPasswordTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/text_input_end_icon")
    private AndroidElement loginSeePassword;

    @AndroidFindBy(id = "com.example.vinilos:id/loginBtn")
    private AndroidElement loginButton;

    @AndroidFindBy(id = "com.example.vinilos:id/loginWithGoogleBtn")
    private AndroidElement loginGoogleButton;

    @AndroidFindBy(id = "android:id/message")
    private AndroidElement loginErrorMessage;

    @AndroidFindBy(id = "android:id/button1")
    private AndroidElement loginErrorMessageButton;

    public LoginPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public MobileElement signUpButton() {
        signUpButton.click();
        return signUpButton;
    }

    public void loginEmailTextView(String string) {
        loginEmailTextView.sendKeys(string);
    }

    public void loginPasswordTextView(String string) {
        loginPasswordTextView.sendKeys(string);
    }

    public void loginSeePassword() {
        loginSeePassword.click();
    }

    public void loginButton() {
        loginButton.click();
    }

    public void loginGoogleButton() {
        loginGoogleButton.click();
    }

    public MobileElement loginErrorMessage(){
        loginErrorMessage.getText();
        return loginErrorMessage;
    }

    public void loginErrorMessageButton() {
        loginErrorMessageButton.click();
    }
}
