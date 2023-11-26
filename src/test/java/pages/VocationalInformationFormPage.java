package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class VocationalInformationFormPage extends BasePage{

    @AndroidFindBy(id = "com.example.vinilos:id/educationTypeEt")
    private AndroidElement vocationalInformationEducationTypeTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/levelEt")
    private AndroidElement vocationalInformationLevelTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/titleEt")
    private AndroidElement vocationalInformationTitleTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/gradeEt")
    private AndroidElement vocationalInformationGradeTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/institutionEt")
    private AndroidElement vocationalInformationInstitutionTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/startDateEt")
    private AndroidElement vocationalInformationStartDateTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/endDateEt")
    private AndroidElement vocationalInformationEndDateTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/saveInformationBtn")
    private AndroidElement saveInformationButton;

    public VocationalInformationFormPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void vocationalInformationEducationTypeTextView(String string) {
        vocationalInformationEducationTypeTextView.sendKeys(string);
    }

    public void vocationalInformationLevelTextView(String string) {
        vocationalInformationLevelTextView.sendKeys(string);
    }

    public void vocationalInformationTitleTextView(String string) {
        vocationalInformationTitleTextView.sendKeys(string);
    }

    public void vocationalInformationGradeTextView(String string) {
        vocationalInformationGradeTextView.sendKeys(string);
    }

    public void vocationalInformationInstitutionTextView(String string) {
        vocationalInformationInstitutionTextView.sendKeys(string);
    }

    public void vocationalInformationStartDateTextView(String string) {
        vocationalInformationStartDateTextView.sendKeys(string);
    }

    public void vocationalInformationEndDateTextView(String string) {
        vocationalInformationEndDateTextView.sendKeys(string);
    }

    public void saveInformationButton() {
        saveInformationButton.click();
    }
}
