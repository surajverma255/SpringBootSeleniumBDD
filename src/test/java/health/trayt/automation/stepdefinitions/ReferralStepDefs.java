package health.trayt.automation.stepdefinitions;

import health.trayt.automation.annotations.LazyAutowired;
import health.trayt.automation.pages.HomePage;
import health.trayt.automation.pages.PatientPage;
import health.trayt.automation.pages.ReferralPage;
import health.trayt.automation.pages.ServicesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Slf4j
public class ReferralStepDefs {
  @LazyAutowired private HomePage homePage;
  @LazyAutowired private ReferralPage referralPage;
  @LazyAutowired private ServicesPage servicesPage;
  @LazyAutowired private PatientPage patientPage;

  public static String randomStr = "";
  public static final String referrerPrefix = "TestSchoolContact";
  public static final String studentPrefix = "TestStudent";
  public static final String parentPrefix = "TestParent";
  public static final String emergencyPrefix = "TestEmergency";

  @Given("User clicks on Referrals tab")
  public void userClicksOnReferralsTab() {
    // Write code here that turns the phrase above into concrete actions
    homePage.getReferralsTabLink().click();
  }

  @When("User clicks on New Referral")
  public void userClicksOnNewReferral() {
    // Write code here that turns the phrase above into concrete actions
    referralPage.addReferral();
  }

  @When("User clicks on Add New link")
  public void userClicksOnAddNewLink() {
    // Write code here that turns the phrase above into concrete actions
    referralPage.getAddNewButton().click();
  }

  @When("Click Yes, Confirm button")
  public void clickConfirmPatient() {
    referralPage.getClickConfirmPatient().click();
  }

  @When("Click Confirm button")
  public void clickConfirmConsent() {
    referralPage.getConfirmButton().click();
  }

  @When("Use Random Data")
  public void useRandomData() {
    randomStr = String.valueOf(ZonedDateTime.now().toEpochSecond());
  }

  @When("enter random value for Referral First Name field")
  public void enterReferralFirstName() {
    referralPage.getReferralFirstName().sendKeys(referrerPrefix + randomStr);
  }

  @When("enter random value for Referral Last Name field")
  public void enterReferralLastName() {
    referralPage.getReferralLastName().sendKeys(referrerPrefix + randomStr);
  }

  @When("enter random value for Referral Contact Number field")
  public void enterReferralContactNumber() {
    Random rand = new Random();
    StringBuilder sb = new StringBuilder("");
    for (int i = 0; i < 4; i++) sb.append(rand.nextInt(10));
    referralPage.getReferralContactNumber().sendKeys("925123" + sb);
  }

  @When("select todays date as Referral Date")
  public void selectReferralDate() {
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("MMddyyyy");
    String strDate = formatter.format(date);
    referralPage.getReferralDate().sendKeys(strDate);
  }

  @When("select yes in the Does the school contact know their NCES School ID")
  public void selectKnowNCESId() {
    selectRadio(referralPage.getKnowNCESId(), "yes");
  }

  @SneakyThrows
  @And("enter {string} in NCES School ID")
  public void enterInNCESSchoolID(String id) {
    Thread.sleep(1000);
     referralPage.getNCESSchoolIDSearch().click();
    referralPage.getNCESSchoolIDSearch().sendKeys(id.trim());
    Thread.sleep(5000);
     referralPage.getNCESSchoolIDSearch().sendKeys(Keys.ENTER);
  }

  @And("select {string} in the Has the student received TCHATT services previously")
  public void selectYesInTheHasTheStudentReceivedTCHATTServicesPreviously(String response) {
    selectRadio(referralPage.getHasReceivedServices(), response);
  }

  @And("enter random value for the Student First Name field")
  public void enterRandomValueForTheStudentFirstNameField() {
    referralPage.getFirstName().sendKeys(studentPrefix + randomStr);
  }

  @And("enter random value for the Student Last Name field")
  public void enterRandomValueForTheStudentLastNameField() {
    referralPage.getLastName().sendKeys(studentPrefix + randomStr);
  }

  @And("enter random value for the in the Student Date of Birth field")
  public void enterRandomValueForTheInTheStudentDateOfBirthField() {
    LocalDate date = LocalDate.now().minusYears(10);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMddyyyy");
    String strDate = date.format(formatter);
    referralPage.getDob().sendKeys(strDate);
  }

  @And("select {string} option in the Student Gender options")
  public void selectMaleOptionInTheStudentGenderOptions(String gender) {
    selectRadio(referralPage.getGender(), gender);
  }

  @And("select {string} in the Student Ethnicity dropdown")
  public void selectNonHispanicInTheStudentEthnicityDropdown(String ethnicity) {
    referralPage.getEthnicityComponent().click();
    referralPage.getEthnicity().click();
  }

  @SneakyThrows
  @And("select {string} in the Student Race dropdown")
  public void selectWhiteInTheStudentRaceDropdown(String race) {
    referralPage.getRaceComponent().click();
    referralPage.getRace().click();
    referralPage.getRaceList().sendKeys(Keys.ESCAPE);
    Thread.sleep(500);
    Actions action = new Actions(referralPage.getDriver());
    action
        .moveToElement(referralPage.getHaveIntOrDevtDisability().get(0))
        .click()
        .build()
        .perform();
  }

  @And("select {string} in the Does this student have an intellectual or developmental disability?")
  public void selectNoInTheDoesThisStudentHaveAnIntellectualOrDevelopmentalDisability(
      String option) {
    selectRadio(referralPage.getHaveIntOrDevtDisability(), option);
  }

  @And("select Grade in the Student School Information")
  public void selectGradeInTheStudentSchoolInformation() {
    referralPage.getSchoolGradeComponent().click();
    referralPage.getSchoolGrade().click();
  }

  @And("enter random value for the Legal Parent-Guardian First Name field")
  public void enterRandomValueForTheLegalParentGuardianFirstNameField() {
    referralPage.getParentFirstName().sendKeys(parentPrefix + randomStr);
  }

  @And("enter random value for the Legal Parent-Guardian Last Name field")
  public void enterRandomValueForTheLegalParentGuardianLastNameField() {
    referralPage.getParentLastName().sendKeys(parentPrefix + randomStr);
  }

  @And("select a value in the Family Relation dropdown")
  public void selectAValueInTheFamilyRelationDropdown() {
    referralPage.getFamilyRelationComponent().click();
    referralPage.getFamilyRelation().click();
  }

  @And("enter random value for the Contact Number Field")
  public void enterRandomValueForTheContactNumberField() {
    Random rand = new Random();
    StringBuilder sb = new StringBuilder("");
    for (int i = 0; i < 4; i++) sb.append(rand.nextInt(10));
    referralPage.getParentPhone().sendKeys("925123" + sb);
  }

  @And("enter random value for New Phone Number Field")
  public void enterRandomValueForNewPhoneNumberField() {
    Random rand = new Random();
    StringBuilder sb = new StringBuilder("");
    for (int i = 0; i < 4; i++) sb.append(rand.nextInt(10));
    referralPage.getNewPhoneNumber().sendKeys("925123" + sb);
  }

  @And("select {string} checkbox for Has student experienced any")
  public void selectNoneOfTheAboveCheckboxForHasStudentExperiencedAny(String option) {
    referralPage.getReasonForReferral().click();
  }

  @And("User clicks on Submit and confirm navigates to {string} Referrals Page")
  public void userClicksOnSubmitAndConfirmNavigatesToReferralsPage(String portal) throws InterruptedException {
    if (portal.equalsIgnoreCase("clinician")) {
      Actions action = new Actions(referralPage.getDriver());
      referralPage.getClinicianSubmit().click();
      action.moveToElement(referralPage.getClinicianSubmit()).click().build().perform();
      System.out.println("in ifffffffffff");
    } else {
      System.out.println("in elseeeeeeeeeeeeee");
      Thread.sleep(5000);
      referralPage.getSchoolSubmit().click();
    }
  }

  @SneakyThrows
  @And("search for referral with student name and press continue button on the first result")
  public void searchForReferralWithStudentName() {
    referralPage.getReferralSearch().click();
    //    searchInput.sendKeys(Keys.SPACE);
    referralPage.getReferralSearch().sendKeys(studentPrefix + randomStr);
    System.out.println(studentPrefix+randomStr+"this is it");
    referralPage.getReferralSearch().sendKeys(Keys.ENTER);
    Thread.sleep(5000);
    referralPage.getReferralSearchResultButton().click();
  }

  @And("hit continue button")
  public void hitContinueButton() {
    referralPage.getHitContinue().click();
  }

  @SneakyThrows
  @And("Click yes in Consent to Service, clicks link and press Proceed to Enrollment button")
  public void clickYesInConsentToServiceClicksLinkAndPressProceedToEnrollmentButton() {
    selectRadio(referralPage.getHasConsent(), "yes");
    Thread.sleep(3000);
    referralPage.getJumpDownLink().click();
    referralPage.getProceedToEnrollButton().click();
  }

  private void selectRadio(List<WebElement> elementsGrp, String label) {
    elementsGrp.forEach(
        element -> {
          log.info("Radio label={}", element.getAttribute("value"));
          if (element.getAttribute("value").equalsIgnoreCase(label)) element.click();
        });
  }

  private void selectCheckbox(List<WebElement> elementsGrp, String label) {
    elementsGrp.forEach(
        element -> {
          log.info("Checkbox label={}", element.getAttribute("value"));
          if (element.getAttribute("value").equalsIgnoreCase(label)) element.click();
        });
  }

  @SneakyThrows
  @And("click yes under Consent to Care, and fill Consent to Care section")
  public void clickYesUnderConsentToCareAndFillConsentToCareSection() {
    Thread.sleep(2000);
    referralPage.getConsentToCare().click();

    Thread.sleep(1000);
    referralPage
        .getConsentToCareParentName()
        .sendKeys(parentPrefix + randomStr + " " + parentPrefix + randomStr);
    LocalDate date = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMddyyyy");
    String strDate = date.format(formatter);
    referralPage.getConsentToCareSignedDate().sendKeys(strDate);
    referralPage.getRelationshipToPatientComponent().click();
    referralPage.getRelationshipToPatient().click();
  }

  @SneakyThrows
  @And("select clinicalCareTeam in Clinical care Team dropdown")
  public void selectClinicalCareTeamInClinicalCareTeamDropdown() {
    Thread.sleep(1000);
    referralPage.getClinicalCareTeamComponent().sendKeys(Keys.ARROW_DOWN);
    Thread.sleep(1000);
    referralPage.getClinicalCareTeamComponent().sendKeys(Keys.ENTER);
    //referralPage.getClinicalCareTeam().click();
  }

  @And("select {string} option in the Mobile App Access options")
  public void selectFamilyDoesNotHaveMobileAccessOptionOptionInTheMobileAppAccessOptions(
      String mobileOption) {
    selectCheckbox(referralPage.getMobileOption(), mobileOption);
  }

  @And("enter Emergency Contact section")
  public void enterEmergencyContactSection() {
    referralPage.getEcFirstName().sendKeys(emergencyPrefix + randomStr);
    referralPage.getEcLastName().sendKeys(emergencyPrefix + randomStr);
    Random rand = new Random();
    StringBuilder sb = new StringBuilder("");
    for (int i = 0; i < 4; i++) sb.append(rand.nextInt(10));
    referralPage.getEcPhoneNumber().sendKeys("925997" + sb);
  }

  @And("select yes in Service Information Section and submit form")
  public void selectYesInServiceInformationSectionAndSubmitForm() {
    selectRadio(referralPage.getIsPartOfSteppedCare(), "yes");
    referralPage.getEnrollPatient().click();
  }

  @SneakyThrows
  @Then("search for patient in the Services search results page")
  @Then("Confirm added patient is shown in the Services search results page")
  public void confirmAddedPatientIsShownInTheServicesSearchResultsPage() {
    Thread.sleep(3000);
    servicesPage.getDriver().navigate().refresh();
    Thread.sleep(3000);
    homePage.getServicesTabLink().click();
    Thread.sleep(1000);
    servicesPage.getServicesSearch().click();
    servicesPage.getServicesSearch().sendKeys(studentPrefix + randomStr);
    servicesPage.getServicesSearch().sendKeys(Keys.RETURN);
  }

  @SneakyThrows
  @Then("search for patient in the Patient search results page")
  @Then("Confirm added patient is shown in the Patient search results page")
  public void confirmAddedPatientIsShownInThePatientSearchResultsPage() {
    Thread.sleep(3000);
    servicesPage.getDriver().navigate().refresh();
    Thread.sleep(3000);
    homePage.getPatientsTabLink().click();
    Thread.sleep(1000);
    patientPage.getPatientSearch().click();
    referralPage.getReferralSearch().sendKeys(studentPrefix + randomStr);
    System.out.println(studentPrefix+randomStr);
    patientPage.getPatientSearch().sendKeys(Keys.RETURN);
  }

  @SneakyThrows
  @And("Verify referral is submitted successfully")
  public void verifyReferralIsSubmittedSuccessfully() {
    Thread.sleep(3000);
    Assert.assertTrue(referralPage.getSchoolReferralSubmitSuccess().getText().contains("Thank you for submitting"));
  }
//
//  @Given("search for patient in the Services search results page")
//  public void search_for_patient_in_the_services_search_results_page() {
//
//
//  }

}
