package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CompanyHomePage extends BasePage {

    @AndroidFindBy(id = "com.example.vinilos:id/textView3")
    private AndroidElement companyHomeTitle;

    @AndroidFindBy(id = "com.example.vinilos:id/list_candidates_icon")
    private AndroidElement companyCandidatesListButton;

    @AndroidFindBy(id = "com.example.vinilos:id/project_module_icon")
    private AndroidElement companyProjectsButton;

    @AndroidFindBy(id = "com.example.vinilos:id/interview_module_icon")
    private AndroidElement companyInterviewsButton;

    @AndroidFindBy(id = "com.example.vinilos:id/technical_test_result_icon")
    private AndroidElement companyTestButton;

    public CompanyHomePage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public MobileElement companyHomeTitle() {
        companyHomeTitle.getText();
        return companyHomeTitle;
    }

    public void companyCandidatesListButton() {
        companyCandidatesListButton.click();
    }

    public void companyProjectsButton() {
        companyProjectsButton.click();
    }

    public void companyInterviewsButton() {
        companyInterviewsButton.click();
    }

    public void companyTestButton() {
        companyTestButton.click();
    }
}
