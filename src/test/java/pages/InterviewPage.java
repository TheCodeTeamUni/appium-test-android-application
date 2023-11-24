package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class InterviewPage extends BasePage{

    //********************* Select Option ******************//

    @AndroidFindBy(id = "com.example.vinilos:id/create_interview_icon")
    private AndroidElement createInterviewIconButton;

    @AndroidFindBy(id = "com.example.vinilos:id/list_interview_icon")
    private AndroidElement ListInterviewIconButton;

    //********************* Interview Form ******************//

    @AndroidFindBy(id = "com.example.vinilos:id/companyNameEt")
    private AndroidElement interviewCompanyNameTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/idCandidateEt")
    private AndroidElement interviewIdCandidateTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/candidateNameEt")
    private AndroidElement interviewCandidateNameTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/lastNameCandidateInterviewEt")
    private AndroidElement interviewCandidateLastNameTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/rolEt")
    private AndroidElement interviewRolTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/dateInterviewEt")
    private AndroidElement interviewDateTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/notesInterviewEt")
    private AndroidElement interviewNotesTextView;

    @AndroidFindBy(id = "com.example.vinilos:id/saveInformationBtn")
    private AndroidElement saveInformationButton;

    //********************* Interview List Elements ******************//

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]")
    private AndroidElement InterviewListName;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[2]")
    private AndroidElement InterviewListDate;

    public InterviewPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
}
