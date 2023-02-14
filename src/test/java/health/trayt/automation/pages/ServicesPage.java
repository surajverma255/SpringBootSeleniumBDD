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
public class ServicesPage extends Base {

  @FindBy(xpath = "(//span[text()='Start Session'])[1]")
  private WebElement startSession;

  @FindBy(xpath = "//span[text()='+ Add/Update Diagnoses']")
  private WebElement addDiagnoses;

  @FindBy(xpath = "//*[contains(text(),'Psychiatric Disorders')]")
  private WebElement psychiatricDisorders;

  @FindBy(xpath = "//*[contains(text(),'Agoraphobia')]")
  private WebElement agoraphobia;

  @FindBy(xpath = "//*[contains(text(),'Anxiety Disorder')]")
  private WebElement anxietyDisorder;

  @FindBy(xpath = "//*[contains(text(),'Save')]")
  private WebElement saveDisorders;

  @FindBy(xpath = "//*[contains(text(),'Complete Session')]")
  private WebElement completeSession;

  @FindBy(xpath = "//*[contains(text(),'Document session notes now')]")
  private WebElement DocumentSessionNotesNow;

  @FindBy(xpath = "//*[contains(text(),'Yes')]")
  private WebElement Yes;

  @FindBy(xpath = "//*[contains(text(),'Continue')]")
  private WebElement sessionDocumentContinue;

  @FindBy(xpath = "//*[contains(text(),'Student')]")
  private WebElement student_presentDuringTheSessionCheckbox;

  @FindBy(xpath = "(//*[contains(@id,'typeOfARPAFunding')])[2]")
  private WebElement typeOfARPAFunding;


  @FindBy(xpath = "//*[contains(@data-value,'TCHATT Anxiety')]")
  private WebElement TCHATTAnxietyDropDownValue;

  @FindBy(xpath = "//*[contains(text(),'Psychiatrist')]")
  private WebElement psychiatrist_AsRoleCheckBox;

  @FindBy(xpath = "//*[contains(text(),'Case management')]")
  private WebElement CaseManagement_TypesOfInterventionCheckBox;

  @FindBy(xpath = "//*[contains(text(),'Submit Details')]")
  private WebElement EndOfSessionSubmit;


  @FindBy(xpath = "(//*[contains(text(),'Assessments')])[1]")
  private WebElement AssessmentsTab;


  @FindBy(xpath = "//*[contains(text(),'+ Assign Assessment')]")
  private WebElement AssignAssessmentButton;

  @FindBy(xpath = "(//*[contains(text(),'Mobile Access')])[1]")
  private WebElement MobileAccessTab;


  @FindBy(xpath = "(//*[contains(text(),'+ Invite Family Member')])[1]")
  private WebElement InviteFamilyMember;


  @FindBy(xpath = "(//*[contains(@class,'MuiInputBase-input MuiInput-input')])[1]")
  private WebElement firstNameInviteFamilyMember;

  @FindBy(xpath = "(//*[contains(@class,'MuiInputBase-input MuiInput-input')])[2]")
  private WebElement lastNameInviteFamilyMember;

  @FindBy(xpath = "(//*[contains(@class,'MuiInputBase-input MuiInput-input')])[3]")
  private WebElement emailInviteFamilyMember;

  @FindBy(xpath = "(//*[contains(@class,'MuiInputBase-input MuiInput-input')])[4]")
  private WebElement roleInviteFamilyMember;

  @FindBy(xpath = "//*[contains(@data-value,'patient')]")
  private WebElement patientRoleInviteFamilyMember;


  @FindBy(xpath = "//*[contains(text(),'Send Invite')]")
  private WebElement sendInviteFamilyMember;


  @FindBy(xpath = "//*[contains(text(),'Update Services')]")
  private WebElement updateServices;

  @FindBy(xpath = "//*[contains(@type,'submit')]")
  private WebElement updateConfirmation;

  @FindBy(xpath = "//*[contains(@class,'MuiTableRow-root table-row cursor-pointer')]//td[4]")
  private WebElement EncounterNo;


  @FindBy(xpath = "//*[contains(@class,'MuiButtonBase-root MuiIconButton-root ellipsis')]")
  private WebElement ellipsisOption;

  @FindBy(xpath = "//*[contains(text(),'End Service')]")
  private WebElement endService;

  @FindBy(xpath = "//*[contains(@id,'mui-component-select-reason')]")
  private WebElement selectReasonToEnd;

  @FindBy(xpath = "//*[contains(@data-value,'Complete')]")
  private WebElement goalComplete;

  @FindBy(xpath = "(//*[contains(text(),'End Service')])[3]")
  private WebElement endServiceConfirmation;

  @FindBy(xpath = "//*[contains(@class,'MuiTableRow-root table-row cursor-pointer')]//td[5]")
  private WebElement episodeStatus;

  @FindBy(xpath = "(//span[text()='Review Report'])[1]")
  private WebElement reviewReport;

  @FindBy(xpath = "(//*[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary')])[3]")
  private WebElement editCareReferrals;

  @FindBy(xpath = "//*[contains(text(),'CAP within TCHATT Hub Team')]")
  private WebElement PsychiatristCAPWithinTCHATTHubTeamCheckBox;

  @FindBy(xpath = "//*[contains(text(),'Individual therapy')]")
  private WebElement TherapyIndividualCheckbox;

  @FindBy(xpath = "//*[contains(text(),'Local support groups')]")
  private WebElement GeneralResourcesLocalSupportGroupsCheckBox;

  @FindBy(xpath = "//*[contains(text(),'504 Recommendations')]")
  private WebElement schoolBasedServices504Recommendations;


  @FindBy(xpath = "//*[contains(text(),'PCP with CPAN support')]")
  private WebElement otherServicesPCPwithCPANsupport;

  @FindBy(xpath = "(//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary')])[5]")
  private WebElement saveAndContinue;

  @FindBy(xpath = "//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary')]")
  private WebElement archiveThisService;

  //a[@class='ServicesDashboard_tabRoute__cGNSX ServicesDashboard_tabCurrentRoute__eMQ0+' and ./a[contains(text(),'Model')]]
  @FindBy(xpath = "//*[contains(text(),'Save & Continue')]")
  private WebElement submitEndOfCareSummaryReport;


  @FindBy(xpath = "(//*[contains(@class,'MuiInputBase-input MuiInput-input')])[2]")
  private WebElement archiveServiceInitials;


  @FindBy(xpath = "//a[@class='ServicesDashboard_tabRoute__cGNSX ServicesDashboard_tabCurrentRoute__eMQ0+' and //a[contains(text(),'Archived')]]")
  private WebElement validateUserIsInArchivedTab;

  //@FindBy(xpath = "(//div[@id='root']/main/div[4]/div/div[3]/div/div[1]/div[1]/div/div//input)[1]")
  @FindBy(css= ".MuiInput-input.MuiInputBase-input")
  private WebElement servicesSearch;

  @FindBy(xpath = "(//div[@id='menu-']/div[1])[1]")
  private WebElement mainDiv;

  @FindBy(xpath = "(//span[text()='New Referral'])[1]")
  private WebElement addNewReferralButton;

  @FindBy(xpath = "(//span[text()='Add New'])[1]")
  private WebElement addNewButton;

  @FindBy(xpath = "(//button[@type='Yes, Confirm'])[1]")
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

  //  @FindBy(xpath = "(//input[contains(@class,'MuiInputBase-input')])[1]")
  @FindBy(
      xpath =
          "(//section[@id='SchoolContact']/div[@class='ReferralForm_userInputSection__c0cWh']//div[@role='combobox']//input)[1]")
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
          "(//div[@class='ReferralForm_userInputSection__c0cWh']/div[2]/div[7]/div/div[@role='button'])[1]")
  private WebElement raceComponent;

  @FindBy(xpath = "(//div[@id='menu-']//ul[@role='listbox']/li[3]//span[.='White'])[1]")
  private WebElement race;

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

  @FindBy(
      xpath =
          "(//section[@id='ReasonForReferral']/div[@class='ReferralForm_userInputSection__c0cWh']//span[.='Depression'])[1]")
  private WebElement reasonForReferral;

  @FindBy(
      xpath =
          "(//div[@role='presentation']/div[@role='none presentation']/div[@role='dialog']//form/div/div/button[@type='button']/span[@class='MuiButton-label'])[1]")
  private WebElement submit;

  @FindBy(
      xpath =
          "(//div[@id='root']/main/div[4]/div/div[3]/div/div[2]/div[1]/table[@role='table']/tbody[@role='rowgroup']/tr[@role='row']/td[7]/button[@type='button']/span[@class='MuiButton-label'])[1]")
  private WebElement servicesSearchResultButton;

  @FindBy(xpath = "(//input[@name='consentToService.hasConsent'])")
  private List<WebElement> hasConsent;

  @FindBy(xpath = "(//div[@class='ml-auto-imp mr-auto-imp']//span[.='Click here'])[1]")
  private WebElement jumpDownLink;

  @FindBy(
      xpath =
          "(//form/div[@class='ReferralForm_btnGroup__ROeGA']/div[2]/button[@type='button']/span[@class='MuiButton-label'])[1]")
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

  @FindBy(
      xpath =
          "(//section[@id='ClinicalCareTeam']/div[@class='EnrollPatientDialogTCHATT_userInputSection__xnwb3']//div[@role='combobox'])[1]")
  private WebElement clinicalCareTeamComponent;

  @FindBy(xpath = "(//body/div[4]//ul[@role='listbox'])[1]")
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

  public boolean isLoaded() {
    return addNewReferralButton.getText().trim().contains("New referral");
  }

  public void ClickOnStartSession() {
    startSession.click();
  }

  public void addReferral() {
    addNewReferralButton.click();
  }

  public void clickConfirmPatient() {
    clickConfirmPatient.click();
  }

  public void updateServicest() throws InterruptedException {
    Thread.sleep(3000);
    updateServices.click();
    if(updateConfirmation.isDisplayed()){
      updateConfirmation.click();
    }

  }
}
