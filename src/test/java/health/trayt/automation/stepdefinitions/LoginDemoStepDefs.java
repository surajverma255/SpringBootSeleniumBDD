package health.trayt.automation.stepdefinitions;

import health.trayt.automation.annotations.LazyAutowired;
import health.trayt.automation.pages.HomePage;
import health.trayt.automation.pages.HubStaffPage;
import health.trayt.automation.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

@Slf4j
public class LoginDemoStepDefs {
  @LazyAutowired private LoginPage loginPage;
  @LazyAutowired private HomePage homePage;
  @LazyAutowired private HubStaffPage hubStaffPage;
  @LazyAutowired private HubStaffPage referralStaffPage;

  //  @Given("^User opens clinician portal$")
  //  public void userOpensClinicianPortal() {
  //    loginPage.openPortal(portalName);
  //  }

  @Given("User opens {string} portal")
  public void userOpensPortal(String portalName) {
    loginPage.openPortal(portalName);
  }

  @Then("^User validate that Login is Successful$")
  public void userValidateThatLoginIsSuccessful() {
    homePage.isLoaded();
  }

  @And("Sign into {string} portal as {string}")
  public void signIntoPortalAs(String portalName, String arg0) {
    loginPage.login(portalName, arg0);
  }

  @Given("User is in clinician portal")
  public void userIsInClinicianPortal() {
    Assert.assertFalse(homePage.isLoaded());
    // assertTrue
  }

  @Given("User is in school portal")
  public void userIsInSchoolPortal() {
    Assert.assertFalse(homePage.isLoaded());
    // assertTrue
  }

  @Given("User clicks on Hub Staff")
  public void userClicksOnHubStaff() {
    homePage.getHriStaffTabLink().click();
  }

  @When("User clicks on Add Staff")
  public void userClicksOnAddStaff() {
    hubStaffPage.addStaff();
  }

  @When("Confirm {string} Pop-up opened")
  public void confirmPopUpOpened(String title) {
    log.info("hubStaffPage.getPopUpTitle().getText()={}", hubStaffPage.getPopUpTitle().getText());
    Assert.assertTrue(hubStaffPage.isPopUpOpen(title));
  }

  @When("User enters fields {string}, {string}, {string}, {string}, {string} and Save")
  public void enterAddStaffData(
      String firstName, String lastName, String phone, String email, String checkBox) {
    hubStaffPage.getFirstName().sendKeys(firstName);
    hubStaffPage.getLastName().sendKeys(lastName);
    hubStaffPage.getPhoneNumber().sendKeys(phone);
    hubStaffPage.getEmail().sendKeys(email);
    hubStaffPage.selectCheckBox(checkBox);
    hubStaffPage.clickSaveButton();
  }

  @Then("Confirm User navigates back to Hub Staff Page")
  public void confirmUserNavigatesBackToPage() {
    Assert.assertTrue(hubStaffPage.isLoaded());
  }

  @Then("User enters {string} in the search field")
  public void userEnterssearchStrInTheSearchField(String searchString) {
    hubStaffPage.searchInputText(searchString);
  }

  @Then("User confirms {string} details shown are as expected")
  public void confirmSearchResults(String firstName) {
    Assert.assertTrue(hubStaffPage.confirmSearchResultsContains(firstName));
  }

  @Then("User clicks on Edit button and confirm {string} Pop-up opened")
  public void editPopUpWindow(String title) {
    hubStaffPage.getEditButton().click();
    Assert.assertTrue(hubStaffPage.isPopUpOpen(title));
  }

  @Then("User enables {string} checkbox and Save")
  public void addRoleAndSave(String title) {
    hubStaffPage.selectCheckBox(title);
    hubStaffPage.clickSaveButton();
  }

  @Then("User enables {string} checkbox and disables {string} and save")
  public void addRoleAndSave(String role1, String role2) {
    hubStaffPage.selectCheckBox(role1);
    hubStaffPage.selectCheckBox(role2);
    hubStaffPage.clickSaveButton();
  }

  @Then("confirm the user saved the roles {string} and {string}")
  public void confirmRoles(String role1, String role2) {
    hubStaffPage.getEditButton().click();
    WebElement webElement = hubStaffPage.getCheckBox(role1);
    Assert.assertTrue(webElement != null && webElement.isSelected());
    webElement = hubStaffPage.getCheckBox(role2);
    Assert.assertTrue(webElement != null && webElement.isSelected());
    hubStaffPage.getDeleteButton().click();
    //        hubStaffPage.getConfirmDeleteButton().click();
  }

  @Then("delete user")
  public void deleteUser() {
    hubStaffPage.getConfirmDeleteButton().click();
  }

  @Then("User logout of the portal")
  public void logout() {
    hubStaffPage.getConfigButton().click();
    hubStaffPage.getLogoutButton().click();
  }

  //    @Then("User deletes the Staff")
  public void deleteStaff() {
    hubStaffPage.deleteStaff();
  }
}
