package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class EmploymentInformationFormPage extends BasePage{

    @AndroidFindBy(id = "com.example.vinilos:id/companyEt")
    private AndroidElement employmentInformationCompanyNameTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/positionEt")
    private AndroidElement employmentInformationPositionTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/actualJobEt")
    private AndroidElement employmentInformationActualJobTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/startDateEt")
    private AndroidElement employmentInformationStartDateTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/endDateEt")
    private AndroidElement employmentInformationEndDateTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/saveWorkInformationBtn")
    private AndroidElement saveInformationButton;

    public EmploymentInformationFormPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void employmentInformationCompanyNameTextView(String string) {
        employmentInformationCompanyNameTextView.sendKeys(string);
    }

    public void employmentInformationPositionTextView(String string) {
        employmentInformationPositionTextView.sendKeys(string);
    }

    public void employmentInformationActualJobTextView(String string) {
        employmentInformationActualJobTextView.sendKeys(string);
    }

    public void employmentInformationStartDateTextView(String string) {
        employmentInformationStartDateTextView.sendKeys(string);
    }

    public void employmentInformationEndDateTextView(String string) {
        employmentInformationEndDateTextView.sendKeys(string);
    }

    public void saveInformationButton() {
        saveInformationButton.click();
    }
}
