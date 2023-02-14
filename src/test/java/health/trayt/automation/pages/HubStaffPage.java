package health.trayt.automation.pages;

import health.trayt.automation.annotations.Page;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Page
@Getter
@Setter
@Slf4j
public class HubStaffPage extends Base {
  @FindBy(xpath = "(//span[text()='Add Staff'])[1]")
  private WebElement addStaffButton;

  @FindBy(xpath = "(//input[@name='firstName'])[1]")
  private WebElement firstName;

  @FindBy(xpath = "(//input[@name='lastName'])[1]")
  private WebElement lastName;

  @FindBy(xpath = "(//input[@name='phoneNumber'])[1]")
  private WebElement phoneNumber;

  @FindBy(xpath = "(//input[@name='email'])[1]")
  private WebElement email;

  @FindBy(xpath = "(//label[@class='MuiFormControlLabel-root'])")
  private List<WebElement> checkBoxes;

  @FindBy(xpath = "(//button[@type='submit'])[1]")
  private WebElement saveButton;

  @FindBy(xpath = "(//div[contains(@class,'MuiDialogTitle-root')])[1]")
  private WebElement popUpTitle;

  @FindBy(xpath = "(//input[@type='text'])[1]")
  private WebElement searchInput;

  @FindBy(xpath = "(//tbody[@class='MuiTableBody-root'])")
  private List<WebElement> searchResults;

  @FindBy(xpath = "(//span[text()='Edit'])[1]")
  private WebElement editButton;

  @FindBy(xpath = "(//span[text()='Delete'])[1]")
  private WebElement deleteButton;

  @FindBy(
      xpath =
          "(//div[@role='dialog']//div[@class='MuiDialogActions-root MuiDialogActions-spacing']/button[2]/span[@class='MuiButton-label'])[1]")
  private WebElement confirmDeleteButton;

  @FindBy(
      xpath =
          "(//nav[@class='Header_headerContainer__3wpSZ']/section[@class='Header_wrapperContainer__248ku']//button[@type='button'])[1]")
  private WebElement configButton;

  @FindBy(xpath = "(//div[@id='menu-settings']//ul[@role='menu']/li[@role='menuitem'])[1]")
  private WebElement logoutButton;

  @Override
  public boolean isLoaded() {
    return addStaffButton.getText().trim().contains("Add Staff");
  }

  public void addStaff() {
    addStaffButton.click();
  }

  public WebElement getCheckBox(String type) {
    for (WebElement webElement : checkBoxes) {
      log.info("webElement.getText() = {}", webElement.toString());
      if (webElement.getText().equalsIgnoreCase(type))
        return webElement.findElement(By.tagName("input"));
    }
    return null;
  }

  public void selectCheckBox(String type) {
    WebElement webElement = getCheckBox(type);
    if (webElement != null) webElement.click();
    else Assert.fail();
  }

  public void clickSaveButton() {
    saveButton.click();
  }

  public void searchInputText(String searchStr) {
    searchInput.click();
    searchInput.sendKeys(Keys.SPACE);
    searchInput.sendKeys(searchStr);
    searchInput.sendKeys(Keys.ENTER);
  }

  public boolean confirmSearchResultsContains(String firstName) {
    for (WebElement webElement : searchResults) {
      log.info(webElement.getText());
      if (webElement.getText().contains(firstName)) return true;
    }
    return false;
  }

  public void deleteStaff() {
    // TODO:
  }

  public boolean isPopUpOpen(String title) {
    return popUpTitle.getText().trim().equalsIgnoreCase(title);
  }
}
