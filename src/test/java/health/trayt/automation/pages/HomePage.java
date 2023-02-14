package health.trayt.automation.pages;

import health.trayt.automation.annotations.Page;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Page
@Getter
@Setter
public class HomePage extends Base {
  @FindBy(xpath = "//a[contains(@class,'Navigation_navigationLink')]")
  private List<WebElement> headerLinks;

  @FindBy(xpath = "(//a[@href='/services'])[1]")
  private WebElement servicesTabLink;

  @FindBy(xpath = "(//a[@href='/referrals'])[1]")
  private WebElement referralsTabLink;

  @FindBy(xpath = "(//a[@href='/home'])[1]")
  private WebElement patientsTabLink;

  @FindBy(xpath = "(//*[contains(text(),'Documents')])[1]")
  private WebElement documentsTabLink;

  @FindBy(xpath = "(//a[@href='/insights/data-exports'])[1]")
  private WebElement insightsTabLink;

  @FindBy(xpath = "(//a[@href='/aboutTrayt'])[1]")
  private WebElement traytHelpTabLink;

  @FindBy(xpath = "(//a[@href='/hri-staff'])[1]")
  private WebElement hriStaffTabLink;

  @FindBy(xpath = "(//span[@class='MuiButton-label'])[1]")
  private WebElement settingsButton;

  @FindBy(xpath = "(//div[contains(@class,'Header_title')])[1]")
  private WebElement homepageHeader;

  @FindBy(xpath = "//*[contains(text(),'Change Phone Number')]")
  private WebElement changePhoneNumber;

  @Override
  public boolean isLoaded() {
    waitElement(homepageHeader);
    return homepageHeader.getText().trim().contains("TCHATT Trayt") && headerLinks.size() == 6;
  }
}
