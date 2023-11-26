package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PersonalInformationFormPage extends BasePage{

    @AndroidFindBy(id = "com.example.vinilos:id/userNameEt")
    private AndroidElement personalInformationNameTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/lastNameEt")
    private AndroidElement personalInformationLastNameTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/documentTypeEt")
    private AndroidElement personalInformationDocumentTypeTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/documentEt")
    private AndroidElement personalInformationDocumentTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/genderEt")
    private AndroidElement personalInformationGenderTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/telephoneEt")
    private AndroidElement personalInformationTelephoneTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/countryEt")
    private AndroidElement personalInformationCountryTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/addressEt")
    private AndroidElement personalInformationAddressTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/birthDateEt")
    private AndroidElement personalInformationBirthdayTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/descriptionEt")
    private AndroidElement personalInformationDescriptionTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/photoEt")
    private AndroidElement personalInformationPhotoTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/saveInformationBtn")
    private AndroidElement saveInformationButton;

    public PersonalInformationFormPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void personalInformationNameTextView(String string) {
        personalInformationNameTextView.sendKeys(string);
    }

    public void personalInformationLastNameTextView(String string) {
        personalInformationLastNameTextView.sendKeys(string);
    }

    public void personalInformationDocumentTypeTextView(String string) {
        personalInformationDocumentTypeTextView.sendKeys(string);
    }

    public void personalInformationDocumentTextView(String string) {
        personalInformationDocumentTextView.sendKeys(string);
    }

    public void personalInformationGenderTextView(String string) {
        personalInformationGenderTextView.sendKeys(string);
    }

    public void personalInformationTelephoneTextView(String string) {
        personalInformationTelephoneTextView.sendKeys(string);
    }

    public void personalInformationCountryTextView(String string) {
        personalInformationCountryTextView.sendKeys(string);
    }

    public void personalInformationAddressTextView(String string) {
        personalInformationAddressTextView.sendKeys(string);
    }

    public void personalInformationBirthdayTextView(String string) {
        personalInformationBirthdayTextView.sendKeys(string);
    }

    public void personalInformationDescriptionTextView(String string) {
        personalInformationDescriptionTextView.sendKeys(string);
    }

    public void personalInformationPhotoTextView(String string) {
        personalInformationPhotoTextView.sendKeys(string);
    }

    public void saveInformationButton() {
        saveInformationButton.click();
    }
}
