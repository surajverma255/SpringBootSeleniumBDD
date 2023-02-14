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
public class PatientStepDefs {
    @LazyAutowired private HomePage homePage;
    @LazyAutowired private ReferralPage referralPage;
    @LazyAutowired private PatientPage patientPage;
    @LazyAutowired private ServicesPage servicesPage;
    @LazyAutowired private CommonUtil commonUtil;

    public static String randomStr = "";
    public static final String referrerPrefix = "TestSchoolContact";
    public static final String studentPrefix = "TestStudent";
    public static final String parentPrefix = "TestParent";
    public static final String emergencyPrefix = "TestEmergency";


    @Given("User clicks on Patient tab")
    public void userClicksOnPatientTab() throws InterruptedException {
        Thread.sleep(2000);
        homePage.getPatientsTabLink().click();
    }
    @Given("User Selects Patient on Archived Search Result Page")
    public void UserSelectsPatientonArchivedSearchResultPage() throws InterruptedException {
        patientPage.getSelectPatient().click();
        Thread.sleep(4000);
    }

    @Given("User Validates Assign Assessments Button Is Not Visible")
    public void UserValidatesAssignAssessmentsButtonIsNotVisible() throws InterruptedException {
        Thread.sleep(2000);
        servicesPage.getAssessmentsTab().click();
        Assert.assertTrue(servicesPage.getAssignAssessmentButton().isDisplayed());
    }
    @Given("User Navigates to MobileAccess and Validates Invite Family Member is Visible Or Not")
    public void UserNavigatesMobileAccessAndValidatesInviteFamilyMember() throws InterruptedException {
        Thread.sleep(2000);
        servicesPage.getMobileAccessTab().click();
        Assert.assertTrue(servicesPage.getInviteFamilyMember().isDisplayed());
    }
}
