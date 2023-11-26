package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CandidatesListPage extends BasePage{

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Imagen del artista,album o coleccionista\"])[1]")
    private AndroidElement candidateListPhotoImage;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]")
    private AndroidElement candateListNameTextView;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[2]")
    private AndroidElement candidateListTelephone;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[3]")
    private AndroidElement candidateListCountry;

    @AndroidFindBy(id = "com.example.vinilos:id/btn_fab_create_candidate")
    private AndroidElement candidateListAddInterview;

    public CandidatesListPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public MobileElement candidateListPhotoImage() {
        candidateListPhotoImage.getTagName();
        return candidateListPhotoImage;
    }

    public MobileElement candateListNameTextView() {
        candateListNameTextView.getText();
        return candateListNameTextView;
    }

    public MobileElement candidateListTelephone() {
        candidateListTelephone.getText();
        return candidateListTelephone;
    }

    public MobileElement candidateListCountry() {
        candidateListCountry.getText();
        return candidateListCountry;
    }

    public void candidateListAddInterview() {
        candidateListAddInterview.click();
    }

}
