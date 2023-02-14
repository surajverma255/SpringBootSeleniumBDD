package health.trayt.automation.pages;

import health.trayt.automation.annotations.Page;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Page
@Getter
@Setter
@Slf4j
public class DocumentsPage extends Base {

    @FindBy(xpath = "(//span[text()='Start Session'])[1]")
    private WebElement startSession;

    @FindBy(xpath = "(//span[text()='New Referral'])[1]")
    private WebElement addNewReferralButton;

    @FindBy(xpath = "(//*[contains(text(),'Documents')])[3]")
    private WebElement uploadDocumentsButton;


    @FindBy(xpath = "//*[contains(@class,'dropzone')]/input")
    private WebElement uploadDocumentsDropZone;


    @FindBy(xpath = "(//*[contains(@class,'Upload')])[2]")
    private WebElement uploadButton;


    @FindBy(xpath = "//*[contains(text(),'Delete (')]")
    private WebElement deleteDocument;

    @FindBy(xpath = "//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-contained delete-confirm-btn')]")
    private WebElement confirmDeleteDocument;
    public boolean isLoaded() {
        return addNewReferralButton.getText().trim().contains("New referral");
    }

    public void ClickOnStartSession() {
        startSession.click();
    }
}
