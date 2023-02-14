package health.trayt.automation.pages;

import health.trayt.automation.annotations.Page;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Page
@Slf4j
public class LoginPage extends Base {

  @FindBy(xpath = "(//input[@name='email'])[1]")
  private WebElement loginEmail;

  @FindBy(xpath = "(//input[@name='password'])[1]")
  private WebElement loginPassword;

  @FindBy(xpath = "(//button[@type='submit'])[1]")
  private WebElement loginButton;

  @FindBy(xpath = "(//a[@href='/reset-password'])[1]")
  private WebElement forgotPasswordLink;

  @FindBy(xpath = "(//a[@href='/support'])[1]")
  private WebElement getSupportLink;

  @FindBy(xpath = "(//h1[contains(@class,'Login_title')])[1]")
  private WebElement portalTitle;

  public void goToClinicianPortal() {
    this.driver.get(applicationConfig.getClinicianPortalURL());
  }

  public void goToSchoolPortal() {
    this.driver.get(applicationConfig.getSchoolPortalURL());
  }

  public void login(String portalName, String userType) {
    loginEmail.sendKeys(applicationConfig.getUserCredentials(portalName, userType).getUserName());
    loginPassword.sendKeys(
        applicationConfig.getUserCredentials(portalName, userType).getPassword());
    loginButton.click();
  }

  public void openPortal(String portalName) {
    if (portalName.equalsIgnoreCase("school")) goToSchoolPortal();
    else goToClinicianPortal();
    Assert.assertTrue("Unable to load portal", isLoaded(portalName));
  }

  private boolean isLoaded(String portalName) {
    log.info("portalTitle.getText() = {}", portalTitle.getText());
    return portalTitle.getText().equalsIgnoreCase(portalName + " Portal");
  }

  @Override
  public boolean isLoaded() {
    log.info("portalTitle.getText() = {}", portalTitle.getText());
    return portalTitle.getText().contains("Clinician Portal");
  }
}
