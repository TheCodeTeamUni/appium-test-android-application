package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SignUpPage extends BasePage {

    //******************** Select profile module ********************//

    @AndroidFindBy(id = "com.example.vinilos:id/return_login_btn")
    private AndroidElement returnLoginButton;

    @AndroidFindBy(id = "com.example.vinilos:id/aspirant_profile_icon")
    private AndroidElement aspirantProfileButton;

    @AndroidFindBy(id = "com.example.vinilos:id/build_profile_icon")
    private AndroidElement companyProfileButton;

    public SignUpPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void returnLoginButton() {
        returnLoginButton.click();
    }

    public void aspirantProfileButton() {
        aspirantProfileButton.click();
    }

    public void companyProfileButton() {
        companyProfileButton.click();
    }

}
