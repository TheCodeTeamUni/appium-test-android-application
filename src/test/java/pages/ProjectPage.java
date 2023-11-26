package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProjectPage extends BasePage{

    //********************* Select Option ******************//

    @AndroidFindBy(id = "com.example.vinilos:id/create_project_icon")
    private AndroidElement createProjectIconButton;

    @AndroidFindBy(id = "com.example.vinilos:id/list_projects_icon")
    private AndroidElement listProjectIconButton;

    @AndroidFindBy(id = "com.example.vinilos:id/textVie3")
    private AndroidElement assertProjectCreated;

    //********************* Project Form ******************//

    @AndroidFindBy(id = "com.example.vinilos:id/projectNameEt")
    private AndroidElement createProjectNameForm;

    @AndroidFindBy(id = "com.example.vinilos:id/startDateEt")
    private AndroidElement createProjectStartDateForm;

    @AndroidFindBy(id = "com.example.vinilos:id/endDateEt")
    private AndroidElement createProjectEndDateForm;

    @AndroidFindBy(id = "com.example.vinilos:id/descriptionEt")
    private AndroidElement createProjectDescriptionForm;

    @AndroidFindBy(id = "com.example.vinilos:id/aspirantEt")
    private AndroidElement createProjectAspirantsForm;

    @AndroidFindBy(id = "com.example.vinilos:id/saveInformationBtn")
    private AndroidElement saveInformationButton;

    //********************* Project List Elements ******************//

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]")
    private AndroidElement projectListName;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[2]")
    private AndroidElement projectListDetail;


    public ProjectPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    //********************* Select Option ******************//

    public void createProjectIconButton() {
        createProjectIconButton.click();
    }

    public void listProjectIconButton() {
        listProjectIconButton.click();
    }

    public MobileElement assertProjectCreated() {
        assertProjectCreated.getText();
        return assertProjectCreated;
    }

    //********************* Project Form ******************//

    public void createProjectNameForm(String string) {
        createProjectNameForm.sendKeys(string);
    }

    public void createProjectStartDateForm(String string) {
        createProjectStartDateForm.sendKeys(string);
    }

    public void createProjectEndDateForm(String string) {
        createProjectEndDateForm.sendKeys(string);
    }

    public void createProjectDescriptionForm(String string) {
        createProjectDescriptionForm.sendKeys(string);
    }

    public void createProjectAspirantsForm(String string) {
        createProjectAspirantsForm.sendKeys(string);
    }

    public void saveInformationButton() {
        saveInformationButton.click();
    }

    //********************* Project List Elements ******************//

    public MobileElement projectListName() {
        projectListName.getText();
        return projectListName;
    }

    public MobileElement projectListDetail() {
        projectListDetail.getText();
        return projectListDetail;
    }
}
