package health.trayt.automation.stepdefinitions;

import health.trayt.automation.annotations.LazyAutowired;
import health.trayt.automation.pages.*;
import health.trayt.automation.utilities.CommonUtil;
import io.cucumber.java.en.Given;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;

@Slf4j
public class DocumentsStepDefs {
    @LazyAutowired private HomePage homePage;
    @LazyAutowired private ReferralPage referralPage;
    @LazyAutowired private PatientPage patientPage;
    @LazyAutowired private ServicesPage servicesPage;
    @LazyAutowired private DocumentsPage documentsPage;
    @LazyAutowired private CommonUtil commonUtil;

    public static String randomStr = "";
    public static final String referrerPrefix = "TestSchoolContact";
    public static final String studentPrefix = "TestStudent";
    public static final String parentPrefix = "TestParent";
    public static final String emergencyPrefix = "TestEmergency";


    @Given("User clicks on Documents tab")
    public void userClicksOnDocumentsTab() throws InterruptedException {
        Thread.sleep(2000);
        homePage.getDocumentsTabLink().click();
    }

    @Given("User clicks on Settings Icon")
    public void userClicksOnSettingsIcon() throws InterruptedException {
        Thread.sleep(2000);
        homePage.getSettingsButton().click();
    }

    @Given("User Clicks on Change Phone Number")
    public void userClicksOnChangePhoneNumber() throws InterruptedException {
        Thread.sleep(2000);
        homePage.getChangePhoneNumber().click();
    }


    @Given("User Confirms Change of Phone Number")
    public void UserConfirmsChangeOfPhoneNumber() throws InterruptedException {
        Thread.sleep(2000);
        servicesPage.getUpdateConfirmation().click();
    }


    @Given("User Clicks on Upload Document and Upload Document")
    public void UserClicksUploadDocumentAndUploadDocument() throws InterruptedException {
        Thread.sleep(2000);
        documentsPage.getUploadDocumentsButton().click();
        documentsPage.getUploadDocumentsDropZone().sendKeys("C:\\Users\\suraj\\Downloads\\myUpload.pdf");
        Thread.sleep(1000);
        documentsPage.getUploadButton().click();
    }

    @Given("Verify File is Uploaded")
    public void VerifyFileisUpload() throws InterruptedException {
        Thread.sleep(2000);
        servicesPage.getDriver().navigate().refresh();
        Thread.sleep(3000);
        patientPage.getPatientSearch().click();
        referralPage.getReferralSearch().sendKeys("myUpload");
        Thread.sleep(2000);
        Assert.assertEquals("myUpload.pdf",patientPage.getFileUploaded().getText());
    }
    @Given("User Deletes the Uploaded File")
    public void UserDeletesTheUploadedFile() throws InterruptedException {
        Thread.sleep(2000);
        patientPage.getSearchResultCheckBox().click();
        documentsPage.getDeleteDocument().click();
        Thread.sleep(2000);
        documentsPage.getConfirmDeleteDocument().click();

    }

}
