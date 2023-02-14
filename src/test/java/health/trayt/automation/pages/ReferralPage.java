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
public class ReferralPage extends Base {

  @FindBy(xpath = "(//div[@id='menu-']/div[1])[1]")
  private WebElement mainDiv;

  @FindBy(xpath = "(//span[text()='New Referral'])[1]")
  private WebElement addNewReferralButton;

  @FindBy(xpath = "(//span[text()='Add New'])[1]")
  private WebElement addNewButton;

  @FindBy(xpath = "(//span[text()='Confirm'])[1]")
  private WebElement ConfirmButton;

  @FindBy(xpath = "(//span[text()='Yes, Confirm'])[1]")
  private WebElement clickConfirmPatient;

  @FindBy(xpath = "(//input[@name='referralDate'])[1]")
  private WebElement referralDate;

  @FindBy(xpath = "(//input[@name='schoolContact.firstName'])[1]")
  private WebElement referralFirstName;

  @FindBy(xpath = "(//input[@name='schoolContact.lastName'])[1]")
  private WebElement referralLastName;

  @FindBy(xpath = "(//input[@name='schoolContact.phoneNumber'])[1]")
  private WebElement referralContactNumber;

  @FindBy(xpath = "(//input[@name='schoolContact.email'])[1]")
  private WebElement referralEmail;

  @FindBy(xpath = "(//input[@name='knowNCESId'])")
  private List<WebElement> knowNCESId;

  @FindBy(
      xpath =
          "(//section[@id='SchoolContact']/div[contains(@class,'ReferralForm_userInputSection__')]//div[@role='combobox']//input)[1]")
  private WebElement NCESSchoolIDSearch;

  @FindBy(xpath = "(//input[@name='hasReceivedServices'])")
  private List<WebElement> hasReceivedServices;

  @FindBy(xpath = "(//input[@name='firstName'])[1]")
  private WebElement firstName;

  @FindBy(xpath = "(//input[@name='lastName'])[1]")
  private WebElement lastName;

  @FindBy(xpath = "(//input[@name='dob'])[1]")
  private WebElement dob;

  @FindBy(xpath = "(//input[@name='gender'])")
  private List<WebElement> gender;

  @FindBy(xpath = "(//input[@value='noMobileAccess'])")
  private List<WebElement> MobileOption;

  @FindBy(xpath = "(//div[@id='mui-component-select-ethnicity'])[1]")
  private WebElement ethnicityComponent;

  @FindBy(xpath = "(//div[@id='menu-ethnicity']//ul[@role='listbox']/li[2])[1]")
  private WebElement ethnicity;

  @FindBy(
      xpath =
          "(//div[contains(@class,'ReferralForm_userInputSection__')]/div[2]/div[7]/div/div[@role='button'])[1]")
  private WebElement raceComponent;

  @FindBy(xpath = "(//div[@id='menu-']//ul[@role='listbox']/li[3]//span[.='White'])[1]")
  private WebElement race;

  @FindBy(xpath = "(//div[@id='menu-']//ul[@role='listbox'])[1]")
  private WebElement raceList;

  @FindBy(xpath = "(//input[@name='haveIntOrDevtDisability'])")
  private List<WebElement> haveIntOrDevtDisability;

  @FindBy(xpath = "(//div[@id='mui-component-select-schoolGrade'])[1]")
  private WebElement schoolGradeComponent;

  @FindBy(xpath = "(//div[@id='menu-schoolGrade']//ul[@role='listbox']/li[6])[1]")
  private WebElement schoolGrade;

  @FindBy(xpath = "(//input[@name='legalGuardians.0.firstName'])[1]")
  private WebElement parentFirstName;

  @FindBy(xpath = "(//input[@name='legalGuardians.0.lastName'])[1]")
  private WebElement parentLastName;

  @FindBy(xpath = "(//div[@id='mui-component-select-legalGuardians.0.familyRelation'])[1]")
  private WebElement familyRelationComponent;

  @FindBy(
      xpath = "(//div[@id='menu-legalGuardians.0.familyRelation']//ul[@role='listbox']/li[3])[1]")
  private WebElement familyRelation;

  @FindBy(xpath = "(//input[@name='legalGuardians.0.phoneNumber'])[1]")
  private WebElement parentPhone;


  @FindBy(xpath = "//*[contains(@class,'MuiInputBase-input MuiInput-input')]")
  private WebElement newPhoneNumber;

  @FindBy(
      xpath = "(//section[@id='ReasonForReferral']//div[@class='MuiFormGroup-root mt-10-imp'])[1]")
  private WebElement reasonForReferral;

  @FindBy(
      xpath =
          "(//div[@role='presentation']/div[@role='none presentation']/div[@role='dialog']//form/div/div/button[@type='button']/span[@class='MuiButton-label'])[1]")
  private WebElement clinicianSubmit;

  @FindBy(
      xpath =
          "(//div[@id='root']//form/div/button[@type='button']/span[@class='MuiButton-label'])[1]")
  private WebElement schoolSubmit;

  //@FindBy(xpath = "(//div[@id='root']/main/div[4]/div/div[3]/div/div[1]/div[1]/div/div//input)[1]")
  //@FindBy(xpath = "(//div[@id='root']//div[@class='MuiFormControl-root MuiTextField-root MuiFormControl-fullWidth']/label[contains(text(),'Search referrals')]")
  @FindBy(css= ".MuiInput-input.MuiInputBase-input")
  private WebElement referralSearch;


  @FindBy(xpath = "(//button[span[text()='button']]")
  private WebElement hitContinue;

  @FindBy(xpath =
          "(//div[@id='root']//table[@role='table']/tbody[@role='rowgroup']/tr[@role='row']/td[7]/button[@type='button']/span[@class='MuiButton-label'])[1]")
//        "(//div[@id='root']/main/div[4]/div/div[3]/div/div[2]/div[1]/table[@role='table']/tbody[@role='rowgroup']/tr[@role='row']/td[7]/button[@type='button']/span[@class='MuiButton-label'])[1]")
  private WebElement referralSearchResultButton;

  @FindBy(xpath = "(//input[@name='consentToService.hasConsent'])")
  private List<WebElement> hasConsent;

  @FindBy(xpath = "(//div[@class='ml-auto-imp mr-auto-imp']//span[.='Click here'])[1]")
  private WebElement jumpDownLink;

  @FindBy(
      xpath =
          "(//form/div[contains(@class,'ReferralForm_btnGroup__')]/div[2]/button[@type='button']/span[@class='MuiButton-label'])[1]")
  private WebElement proceedToEnrollButton;

  @FindBy(
      xpath =
          "(//section[@id='ConsentToCare']//div[@role='radiogroup']/label[1]/span[1]//input[@name='consentToCare.yesNo'])[1]")
  private WebElement consentToCare;

  @FindBy(xpath = "(//input[@name='consentToCare.parentName'])[1]")
  private WebElement consentToCareParentName;

  @FindBy(xpath = "(//input[@name='consentToCare.signedDate'])[1]")
  private WebElement consentToCareSignedDate;

  @FindBy(xpath = "(//div[@id='mui-component-select-consentToCare.relationshipToPatient'])[1]")
  private WebElement relationshipToPatientComponent;

  @FindBy(
      xpath =
          "(//div[@id='menu-consentToCare.relationshipToPatient']//ul[@role='listbox']/li[3])[1]")
  private WebElement relationshipToPatient;

//  @FindBy(
//      xpath =
//          "(//section[@id='ClinicalCareTeam']/div[contains(@class,'EnrollPatientDialogTCHATT_userInputSection__')]//div[@role='combobox']//input)[1]")
//  private WebElement clinicalCareTeamComponent;
  
@FindBy(xpath ="(//*[contains(@class,'MuiInputAdornment-root MuiInputAdornment-positionStart')])[2]/following-sibling::input")
private WebElement clinicalCareTeamComponent;
  @FindBy(xpath = "//input[contains(@aria-activedescendant,'option-1')]")
  private WebElement clinicalCareTeam;


  @FindBy(xpath = "(//input[@name='emergencyContacts.0.firstName'])[1]")
  private WebElement ecFirstName;

  @FindBy(xpath = "(//input[@name='emergencyContacts.0.lastName'])[1]")
  private WebElement ecLastName;

  @FindBy(xpath = "(//input[@name='emergencyContacts.0.phoneNumber'])[1]")
  private WebElement ecPhoneNumber;

  @FindBy(xpath = "(//input[@name='isPartOfSteppedCare'])")
  private List<WebElement> isPartOfSteppedCare;

  @FindBy(xpath = "(//form//button[@type='submit']/span[@class='MuiButton-label'])[1]")
  private WebElement enrollPatient;

  @FindBy(xpath = "(//div[@id='root']//h2)[1]")
  private WebElement schoolReferralSubmitSuccess;

  public boolean isLoaded() {
    return addNewReferralButton.getText().trim().contains("New referral");
  }

  public void addReferral() {
    addNewReferralButton.click();
  }
}
