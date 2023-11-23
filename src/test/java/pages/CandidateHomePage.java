package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CandidateHomePage extends BasePage {

    @AndroidFindBy(id = "com.example.vinilos:id/textView3")
    private AndroidElement candidateHomeTitle;

    @AndroidFindBy(id = "com.example.vinilos:id/aspirant_profile_icon")
    private AndroidElement candidatePersonalInformationButton;

    @AndroidFindBy(id = "com.example.vinilos:id/employment_profile_icon")
    private AndroidElement candidateEmploymentInformationButton;

    @AndroidFindBy(id = "com.example.vinilos:id/professional_information_icon")
    private AndroidElement candidateVocationalInformationButton;

    @AndroidFindBy(id = "com.example.vinilos:id/skill_icon")
    private AndroidElement candidateSkillInformationButton;

    public CandidateHomePage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public MobileElement candidateHomeTitle() {
        candidateHomeTitle.getText();
        return candidateHomeTitle;
    }

    public void candidatePersonalInformationButton() {
        candidatePersonalInformationButton.click();
    }

    public void candidateEmploymentInformationButton() {
        candidateEmploymentInformationButton.click();
    }

    public void candidateVocationalInformationButton() {
        candidateVocationalInformationButton.click();
    }

    public void candidateSkillInformationButton() {
        candidateSkillInformationButton.click();
    }
}
