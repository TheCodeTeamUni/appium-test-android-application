package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SkillInformationFormPage extends BasePage{

    @AndroidFindBy(id = "com.example.vinilos:id/skillEt")
    private AndroidElement skillInformationSkillTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/levelEt")
    private AndroidElement skillInformationSkillLevelTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/experienceEt")
    private AndroidElement skillInformationExperienceTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/saveInformationBtn")
    private AndroidElement saveInformationButton;

    public SkillInformationFormPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void skillInformationSkillTextView(String string) {
        skillInformationSkillTextView.sendKeys(string);
    }

    public void skillInformationSkillLevelTextView(String string) {
        skillInformationSkillLevelTextView.sendKeys(string);
    }

    public void skillInformationExperienceTextView(String string) {
        skillInformationExperienceTextView.sendKeys(string);
    }

    public void saveInformationButton(String string) {
        saveInformationButton.sendKeys(string);
    }

    public void saveInformationButton() {
        saveInformationButton.click();
    }
}
