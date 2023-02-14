package health.trayt.automation.stepdefinitions;

import health.trayt.automation.annotations.LazyAutowired;
import health.trayt.automation.pages.HomePage;
import health.trayt.automation.pages.PatientPage;
import health.trayt.automation.pages.ReferralPage;
import health.trayt.automation.pages.ServicesPage;
import health.trayt.automation.utilities.CommonUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.openqa.selenium.*;

@Slf4j
public class ServicesStepDefs {
    @LazyAutowired private HomePage homePage;
    @LazyAutowired private ReferralPage referralPage;
    @LazyAutowired private ServicesPage servicesPage;
    @LazyAutowired private PatientPage patientPage;
    @LazyAutowired private CommonUtil commonUtil;

    public static String randomStr = "";
    public static String TestData = "";
    public static final String referrerPrefix = "TestSchoolContact";
    public static final String studentPrefix = "TestStudent";
    public static final String parentPrefix = "TestParent";
    public static final String emergencyPrefix = "TestEmergency";


    @Given("User clicks on Services tab")
    public void userClicksOnServicesTab() {
        homePage.getServicesTabLink().click();
    }
    @When("User clicks on Services Start Session")
    public void userClicksServicesStartSession() throws InterruptedException {
        Thread.sleep(3000);
        ((JavascriptExecutor) servicesPage.getDriver()).executeScript("arguments[0].scrollIntoView(true);", servicesPage.getStartSession());
        servicesPage.ClickOnStartSession();
    }

    //Below method clicks on Add/Update Diagnoses and selects Agoraphobia under Psychiatric Disorders drop down.
    @When("User clicks on Add Diagnoses")
    @When("User clicks on Update Diagnoses")
    public void user_clicks_on_add_update_diagnosis() throws InterruptedException {
        Thread.sleep(3000);
        servicesPage.getAddDiagnoses().click();
        servicesPage.getPsychiatricDisorders().click();
//        servicesPage.getAgoraphobia().click();
//        ((JavascriptExecutor) servicesPage.getDriver()).executeScript("arguments[0].scrollIntoView(true);", servicesPage.getSaveDisorders());
//        servicesPage.getSaveDisorders().click();
    }

    @When("User selects any 2 options under 'Psychiatric Disorders' and click Save")
    public void userSelectsAnyTwoPsychiatricDisorders() throws InterruptedException {
        Thread.sleep(3000);
        servicesPage.getAgoraphobia().click();
        servicesPage.getAnxietyDisorder().click();
        ((JavascriptExecutor) servicesPage.getDriver()).executeScript("arguments[0].scrollIntoView(true);", servicesPage.getSaveDisorders());
        servicesPage.getSaveDisorders().click();
    }

    @When("User confirms diagnosis added on Health Record page")
    public void userConfirmsDiagnosesAddedHealthRecordPage() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals("Agoraphobia",servicesPage.getAgoraphobia().getText());
        Assert.assertEquals("Anxiety Disorder",servicesPage.getAnxietyDisorder().getText());
    }

    @When("User clicks on Complete Session")
    public void userClicksOnCompleteSession() throws InterruptedException {
        Thread.sleep(1000);
        servicesPage.getCompleteSession().click();
    }

    @Then("Select Document Session notes now Option and select Yes for Episode of care")
    public void selectDocumentSessionNotesNowOptionAndSelectYesForEpisodeOfCare() throws InterruptedException {
        Thread.sleep(1000);
        servicesPage.getDocumentSessionNotesNow().click();
        servicesPage.getYes().click();
        servicesPage.getSessionDocumentContinue().click();
    }

    @Then("Complete End of Session Form")
    public void completeEndOfSessionForm() throws InterruptedException {
        Thread.sleep(3000);
        ((JavascriptExecutor) servicesPage.getDriver()).executeScript("arguments[0].scrollIntoView(true);", servicesPage.getStudent_presentDuringTheSessionCheckbox());
        servicesPage.getStudent_presentDuringTheSessionCheckbox().click();
        servicesPage.getYes().click();
        ((JavascriptExecutor) servicesPage.getDriver()).executeScript("arguments[0].scrollIntoView(true);", servicesPage.getTypeOfARPAFunding());
        servicesPage.getTypeOfARPAFunding().click();
        servicesPage.getTCHATTAnxietyDropDownValue().click();
        servicesPage.getPsychiatrist_AsRoleCheckBox().click();
        ((JavascriptExecutor) servicesPage.getDriver()).executeScript("arguments[0].scrollIntoView(true);", servicesPage.getCaseManagement_TypesOfInterventionCheckBox());
        servicesPage.getCaseManagement_TypesOfInterventionCheckBox().click();
        ((JavascriptExecutor) servicesPage.getDriver()).executeScript("arguments[0].scrollIntoView(true);", servicesPage.getEndOfSessionSubmit());
        servicesPage.getEndOfSessionSubmit().click();
    }

    @Then("User Verify Complete Session Button is {string}")
    public void VerifyCompleteSessionButtonStatus(String EnabledDisabled) throws InterruptedException {
        Thread.sleep(3000);
        if(EnabledDisabled.equalsIgnoreCase("Enabled")){
            Assert.assertFalse("Validating if Complete Session Button is Disabled",servicesPage.getCompleteSession().isEnabled());
        }
        else if(EnabledDisabled.equalsIgnoreCase("Disabled")){
            Assert.assertTrue("Complete Session Button Seems to be Enabled",servicesPage.getCompleteSession().isEnabled());
        }
    }

    @Then("User Clicks on Assessments tab and verify Assign Assessment Button is Enabled")
    public void UserClicksOnAssessmentsTabAndVerifyAssignAssessmentButtonIsEnabled() throws InterruptedException {
            Thread.sleep(1000);
            servicesPage.getAssessmentsTab().click();
            Assert.assertTrue("Assign Assessment Button is Disabled", servicesPage.getAssignAssessmentButton().isEnabled());
    }

    @Then("User Clicks on Mobile Access tab and Invite a Family Member")
    public void UserClicksOnMobileAccessTabAndInviteFamilyMember() throws InterruptedException {
            Thread.sleep(1000);
            servicesPage.getMobileAccessTab().click();
            servicesPage.getInviteFamilyMember().click();
            Thread.sleep(2000);
            servicesPage.getFirstNameInviteFamilyMember().click();
            servicesPage.getFirstNameInviteFamilyMember().sendKeys(parentPrefix + randomStr);
            TestData = parentPrefix+randomStr;
            servicesPage.getLastNameInviteFamilyMember().click();
            servicesPage.getLastNameInviteFamilyMember().sendKeys(parentPrefix + randomStr);
            servicesPage.getEmailInviteFamilyMember().click();
            servicesPage.getEmailInviteFamilyMember().sendKeys("abc@xyz.com");
            servicesPage.getRoleInviteFamilyMember().click();
            servicesPage.getPatientRoleInviteFamilyMember().click();
            servicesPage.getYes().click();
            servicesPage.getSendInviteFamilyMember().click();

    }

    @Then("User clicks on Update Services")
    public void userClicksOnUpdateServices() throws InterruptedException {
        homePage.getServicesTabLink().click();
        servicesPage.updateServicest();
        Thread.sleep(5000);
//        servicesPage.getServicesSearch().click();
//        servicesPage.getServicesSearch().sendKeys(studentPrefix + randomStr);
//        servicesPage.getServicesSearch().sendKeys(Keys.RETURN);
        ((JavascriptExecutor) servicesPage.getDriver()).executeScript("arguments[0].scrollIntoView(true);", servicesPage.getEncounterNo());
        System.out.println(servicesPage.getEncounterNo().getText());
    }

    @Then("Verify Encounter No is {string}")
    public void VerifyEncounterNo(String string) throws InterruptedException {
        ((JavascriptExecutor) servicesPage.getDriver()).executeScript("arguments[0].scrollIntoView(true);", servicesPage.getEncounterNo());
        Assert.assertEquals(servicesPage.getEncounterNo().getText(),string);
    }

    @Then("User Perform End of Service")
    public void UserPerformEndOfService() throws InterruptedException {
        servicesPage.getEllipsisOption().click();
        servicesPage.getEndService().click();
        servicesPage.getSelectReasonToEnd().click();
        servicesPage.getGoalComplete().click();
        servicesPage.getEndServiceConfirmation().click();
        Thread.sleep(5000);

    }

    @Then("Validate Episode Status is {string}")
    public void ValidateEpisodeStatusIs(String status) throws InterruptedException {
        Assert.assertEquals(servicesPage.getEpisodeStatus().getText(),status);
    }

    @When("User clicks on Review Report")
    public void UserClicksOnReviewReport() throws InterruptedException {
        Thread.sleep(3000);
        ((JavascriptExecutor) servicesPage.getDriver()).executeScript("arguments[0].scrollIntoView(true);", servicesPage.getReviewReport());
        servicesPage.getReviewReport().click();
    }

    @When("User perform Edit Diagnosis")
    public void UserPerformEditDiagnosis () throws InterruptedException {
        Thread.sleep(4000);
        ((JavascriptExecutor) servicesPage.getDriver()).executeScript("arguments[0].scrollIntoView(true);", servicesPage.getEditCareReferrals());
        servicesPage.getEditCareReferrals().click();
    }

    @When("User Fill Disposition of Care Referral Form")
    public void UserFillDispositionOfCareReferralForm() throws InterruptedException {
        Thread.sleep(2000);
        servicesPage.getPsychiatristCAPWithinTCHATTHubTeamCheckBox().click();
        ((JavascriptExecutor) servicesPage.getDriver()).executeScript("arguments[0].scrollIntoView(true);", servicesPage.getTherapyIndividualCheckbox());
        servicesPage.getTherapyIndividualCheckbox().click();
        ((JavascriptExecutor) servicesPage.getDriver()).executeScript("arguments[0].scrollIntoView(true);", servicesPage.getGeneralResourcesLocalSupportGroupsCheckBox());
        servicesPage.getGeneralResourcesLocalSupportGroupsCheckBox().click();
        ((JavascriptExecutor) servicesPage.getDriver()).executeScript("arguments[0].scrollIntoView(true);", servicesPage.getSchoolBasedServices504Recommendations());
        servicesPage.getSchoolBasedServices504Recommendations().click();
        ((JavascriptExecutor) servicesPage.getDriver()).executeScript("arguments[0].scrollIntoView(true);", servicesPage.getOtherServicesPCPwithCPANsupport());
        servicesPage.getOtherServicesPCPwithCPANsupport().click();
        Thread.sleep(1000);
        ((JavascriptExecutor) servicesPage.getDriver()).executeScript("arguments[0].scrollIntoView(true);", servicesPage.getSaveAndContinue());
        servicesPage.getSaveAndContinue().click();
        Thread.sleep(3000);
        ((JavascriptExecutor) servicesPage.getDriver()).executeScript("arguments[0].scrollIntoView(true);", servicesPage.getSubmitEndOfCareSummaryReport());
        servicesPage.getSubmitEndOfCareSummaryReport().click();
    }

    @Then("User Clicks on Archive This Service")
    public void UserClicksOnArchiveThisService() throws InterruptedException {
        Thread.sleep(8000);
        ((JavascriptExecutor) servicesPage.getDriver()).executeScript("arguments[0].scrollIntoView(true);", servicesPage.getArchiveThisService());
        servicesPage.getArchiveThisService().click();
        servicesPage.getArchiveServiceInitials().sendKeys("Test Archive");
        servicesPage.getUpdateConfirmation().click();

    }
    @Then("Validate user is landed on Archived Tab")
    public void ValidateUserIsLandedOnArchivedTab() throws InterruptedException {
        Thread.sleep(8000);
        ((JavascriptExecutor) servicesPage.getDriver()).executeScript("arguments[0].scrollIntoView(true);", servicesPage.getArchiveThisService());
        servicesPage.getArchiveThisService().click();
        servicesPage.getArchiveServiceInitials().sendKeys("Test Archive");
        servicesPage.getUpdateConfirmation().click();
        Thread.sleep(3000);
        Assert.assertTrue(servicesPage.getValidateUserIsInArchivedTab().isDisplayed());
    }
}
