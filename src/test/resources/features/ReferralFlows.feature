##@ReferralFlows
##WIP
#Feature: Adding Referrals via Clinician Portal
#
##  Background:
##    Given User opens "clinician" portal
#
#
##  Scenario Outline: User adds New Referral and Enrolls Patient via Clinician Portal.
##    And Sign into portal as "AUTO_ADMIN"
##    Then User validate that Login is Successful
##    Given User is in clinician portal
##    And User clicks on Referrals tab
##    When User clicks on New Referral
##    And User clicks on Add New link
##    And Confirm 'Confirm New Patient' Pop-up opened
##    And Click Yes, Confirm button
##    And Use Random Data
##    And select todays date as Referral Date
##    And enter random value for Referral First Name field
##    And enter random value for Referral Last Name field
##    And enter random value for Referral Contact Number field
##    And select yes in the Does the school contact know their NCES School ID
##    And enter '480000101145' in NCES School ID
##    And select 'yes' in the Has the student received TCHATT services previously
###    And User enters "StudentFName<random>", "StudentLName<random>", "StudentDOB<random>", "StudentGender<random>", "StudentEthnicity<random>", "StudentRace<random>", "StudentMRN<random>" in the School Contact Section
##    And enter random value for the Student First Name field
##    And enter random value for the Student Last Name field
##    And enter random value for the in the Student Date of Birth field
##    And select 'Male' option in the Student Gender options
##    And select 'Non-Hispanic' in the Student Ethnicity dropdown
##    And select 'White' in the Student Race dropdown
###    And User enters "auto<random>" in the MRN field
###    And User enters <Student ID> in the Student MRN field
##    And select 'No' in the Does this student have an intellectual or developmental disability?
##    And select Grade in the Student School Information
###    And User enters <Student ID> in Student ID Field
###    And User enters <Contact Number> in Contact Number Field
###    And User selects <Preferred Language> in the Preferred Language
###    And User selects <Preferred Language> in the Preferred Pronoun
###    And User enters "auto<random>" in the Email field
###    And User enters "auto<random>" in the zipcode field
###    And User confirms 'Texas' in the State Dropdown
###    And User enters "auto<random>" in the Street Address field
###    And User enters "auto<random>" in the City field
##    And enter random value for the Legal Parent-Guardian First Name field
##    And enter random value for the Legal Parent-Guardian Last Name field
##    And select a value in the Family Relation dropdown
##    And enter random value for the Contact Number Field
###    And select a value for the Preferred Language dropdown
###    And User enters "auto<random>" in the Legal Parent/Guardian Email Address field
###    And User enables No in the Does the parent share the same address as the student?
###    And User enables checkbox Student's emergency contact
###    And User selects multiple checkboxes <Call Time preference> in the Call Time preference dropdown
###    And User selects multiple checkboxes except None of the above<Call Time preference> in the Reason for referral
##    And select 'None of the above' checkbox for Has student experienced any
###    And User enters "auto<random>" in the Use the box below to capture any additional notes.
##    #And User Uploads supported documents and Submit (Applicable only form school portal flow)
##    And User clicks on Submit and confirm navigates to Referrals Page
##    And search for referral with student name and press continue button on the first result
##    And Click yes in Consent to Service, clicks link and press Proceed to Enrollment button
###    And user clicks 'Proceed to Enrollment' button navigates to Patient Enrollment Form
##    And click yes under Consent to Care, and fill Consent to Care section
###    And user enters "pMRN<random>" in MRN Field
###    And user selects on "PrimareCProvider<random>" in Primary care provider dropdown
##    And select clinicalCareTeam in Clinical care Team dropdown
##    And select 'Male' option in the Student Gender options
##    And select 'noMobileAccess' option in the Mobile App Access options
##    And enter Emergency Contact section
###    And user enables Signed for ROI PCP, and Declined for ROI School in Release of Information section
##    And select yes in Service Information Section and submit form
##  Then Confirm added patient is shown in the Services search results page
###
###
####    Examples:
####      | firstName  | lastName  | role           | editRole        |
####      | "Mirror20" | "Bench20" | "Psychiatrist" | "Administrator" |
###
###    # lastname and DOB should be matching to precondtion for this flow.
#
#  Background:
#    Given User opens "school" portal
#
#  Scenario Outline: User adds New Referral and Enrolls Patient via School Portal.
#    And Sign into "school" portal as "AUTO_ADMIN"
##    And Sign into portal as "SchoolAUTO_ADMIN"
#    Then User validate that Login is Successful
#    #Given User is in clinician portal
#    Given User is in school portal
#    #And User clicks on Referrals tab
#    When User clicks on New Referral
##    And User clicks on Add New link
#    And Confirm 'Confirm Family & Student Consent' Pop-up opened
#    And Click Confirm button
#    And Use Random Data
#    And select todays date as Referral Date
#    And select yes in the Does the school contact know their NCES School ID
#    And enter 'SPUR' in NCES School ID
#    And select 'yes' in the Has the student received TCHATT services previously
##    And User enters "StudentFName<random>", "StudentLName<random>", "StudentDOB<random>", "StudentGender<random>", "StudentEthnicity<random>", "StudentRace<random>", "StudentMRN<random>" in the School Contact Section
#    And enter random value for the Student First Name field
#    And enter random value for the Student Last Name field
#    And enter random value for the in the Student Date of Birth field
#    And select 'Male' option in the Student Gender options
#    And select 'Non-Hispanic' in the Student Ethnicity dropdown
#    And select 'White' in the Student Race dropdown
##    And User enters "auto<random>" in the MRN field
##    And User enters <Student ID> in the Student MRN field
#    And select 'No' in the Does this student have an intellectual or developmental disability?
#    And select Grade in the Student School Information
##    And User enters <Student ID> in Student ID Field
##    And User enters <Contact Number> in Contact Number Field
##    And User selects <Preferred Language> in the Preferred Language
##    And User selects <Preferred Language> in the Preferred Pronoun
##    And User enters "auto<random>" in the Email field
##    And User enters "auto<random>" in the zipcode field
##    And User confirms 'Texas' in the State Dropdown
##    And User enters "auto<random>" in the Street Address field
##    And User enters "auto<random>" in the City field
#    And enter random value for the Legal Parent-Guardian First Name field
#    And enter random value for the Legal Parent-Guardian Last Name field
#    And select a value in the Family Relation dropdown
#    And enter random value for the Contact Number Field
##    And select a value for the Preferred Language dropdown
##    And User enters "auto<random>" in the Legal Parent/Guardian Email Address field
##    And User enables No in the Does the parent share the same address as the student?
##    And User enables checkbox Student's emergency contact
##    And User selects multiple checkboxes <Call Time preference> in the Call Time preference dropdown
##    And User selects multiple checkboxes except None of the above<Call Time preference> in the Reason for referral
#    And select 'None of the above' checkbox for Has student experienced any
##    And User enters "auto<random>" in the Use the box below to capture any additional notes.
#    #And User Uploads supported documents and Submit (Applicable only form school portal flow)
#    And User clicks on Submit and confirm navigates to Referrals Page
##    And Sign into portal as "SCHOOL_ADMIN"
##    Then User validate that Login is Successful
##    Given User is in school portal
##    And User lands on Referrals tab
##    When User clicks on New Referral
##    And Confirm 'Confirm New Patient' Pop-up opened
##    And Click Yes, Confirm button
##    And User enters "schContactRefDate<random>", "schContactFName<random>", "schContactLName<random>", "schContactContactNum<random>" in the School Contact Section
###    And User enters "fName<random>" in the Referral First Name field
###    And User enters "auto<random>" in the Referral Last Name field
###    And User enters "auto<random>" in the Referral Contact Number field
##    And User enables yes in the Does the school contact know their NCES School ID?
##    And User enters <NCES School ID> and selects from dropdown
##    And User enables 'yes' in the <Has the student received TCHATT services previously?> and enter '00000123' in TCHATT ID Field
##    And User enters "StudentFName<random>", "StudentLName<random>", "StudentDOB<random>", "StudentGender<random>", "StudentEthnicity<random>", "StudentRace<random>", "StudentMRN<random>" in the School Contact Section
###    And User enters "auto<random>" in the Student First Name field
###    And User enters "auto<random>" in the Student Last Name field
###    And User enters "auto<random>" in the Student Date of Birth field
###    And User enables Male option in the Student Gender options
###    And User selects <Ethnicity> in the Student Ethnicity dropdown
###    And User selects <Race> in the Student Race dropdown
###    And User enters "auto<random>" in the MRN field
##    And User enters <Student ID> in the Student MRN field
##    And User enables No in the Does this student have an intellecutal or developmental disability?
##    And User selects 'Grade' in the Student School Information
##    And User enters <Student ID> in Student ID Field
##    And User enters <Contact Number> in Contact Number Field
##    And User selects <Preferred Language> in the Preferred Language
##    And User selects <Preferred Language> in the Preferred Pronoun
##    And User enters "auto<random>" in the Email field
##    And User enters "auto<random>" in the zipcode field
##    And User confirms 'Texas' in the State Dropdown
##    And User enters "auto<random>" in the Street Address field
##    And User enters "auto<random>" in the City field
##    And User enters "auto<random>" in the Legal Parent/Guardian First Name field
##    And User enters "auto<random>" in the Legal Parent/Guardian Last Name field
##    And User selects <Family Relation> in the Family Relation dropdown
##    And User enters <Contact Number> in Contact Number Field
##    And User selects <Preferred Language> in the Preferred Language dropdown
##    And User enters "auto<random>" in the Legal Parent/Guardian Email Address field
##    And User enables No in the Does the parent share the same address as the student?
##    And User enables checkbox Student's emergency contact
##    And User selects multiple checkboxes <Call Time preference> in the Call Time preference dropdown
##    And User selects multiple checkboxes except None of the above<Call Time preference> in the Reason for referral
##    And User enters "auto<random>" in the Use the box below to capture any additional notes.
##    And user uploads 6 supported documents
##    #And User Uploads supported documents and Submit (Applicable only form school portal flow)
##    And User clicks on Submit and confirm navigates to Referrals Page
##    Then user Sign into portal as "AUTO_ADMIN"
##    And User searches for school referral added with "StudentFName<random>", "StudentLName<random>" and hit 'Continue'
##    And user navigates to Select Existing Patient screen
##    And user confirms all details shown under Referral Student section matches the details added from School Portal
##    And user confirms details shown under Existing patient record section matches with Lastname and DOB
##    And user clicks Select this patient button, navigates to  Confirm and Update the Patient Record pop up shown
##    And user clicks yes, confirm navigates to Patient referral form page
##    And user confirms all the details matches to school portal details added and click yes in Consent to Service, and click 'click here' link takes to bottom of the page 'Save' and 'Proceed to Enrollment' visible
##    And user clicks 'Proceed to Enrollment' button navigates to Patient Enrollment Form
##    And User clicks yes under Consent to Care, and enters "CocPName<random>", "CocSDate<random>", "CocRelationtoPatient<random>" in Consent to Care section
##    And user enters "pMRN<random>" in MRN Field
##    And user selects on "PrimareCProvider<random>" in Primary care provider dropdown
##    And user selects on "clinicalCateTeam<random>" in Clinical care Team dropdown
##    And user Confirms enabling Patient, Parent/Guardian 1 checkbox details appear under Mobile App Access sections
##    And user enters "eContactFName<random>", "eContactLName<random>", "eContactPhoneNumber<random>" in Emergency Contact section
##    And user enables Signed for ROI PCP, and Declined for ROI School in Release of Information section
##    And user enables yes in Service Information Section
##    Then user clicks on submit button
##
##  Scenario Outline: User adds session to the Patient under Services
##    And Sign into portal as "AUTO_ADMIN"
##    Then User validate that Login is Successful
##    Given User is in clinician portal
##    And User clicks on Services tab
##    And User searches for patient added with "StudentFName<random>", "StudentLName<random>" and hit 'Start Session'
##    And User clicks 'Complete Session' navigates to Session Documentation pop-up
##    And user selects 'Document session now' option and selects 'yes' and hit continue navigates to End of session form
##    And user confirms details under Patient Details matches
##    And user selects all the options in Who was present during the session? under session information
##    And user selects all the options inlcuding Other with free text in Please indicate your role under Provider Type section
##    And user selects all the options inlcuding Other care provided in Please select all types of interventions provided
##    And user clicks 'Submit' navigates to Services
##    When user clicks on Update Services link and confirm Update Service pop-up shown
##    And user clicks Update navigates to Service page
##    And confirm Encounter No. is incremented by 1
##    And user clicks Ellipsis Icon and clicks on 'End Service' takes to End Service pop-up
##    And user selects Declined continuaiton of service from why are you ending this service? and clicks End Service button takes to services page
##    And user clicks on Review Report button takes to End of summary Report
##    And user click confirm under Diagnosis section
##    And user clicks 'Edit Care Referrals' takes to Disposition care referral form
##    And user selects all options under Psychiatrist, Therapy except No Referrals Recommended, General Resources, School-based services, Other services and for Other Referral add free text
##    And user clicks Save & Continue navigates to End of Care Summary Report page
##    And user clicks on Save & Continue navigates to End of Care Summary Report
##    And user clicks on Archive This Service button opens Archive Service pop-up
##    And enter miminum 2 characters enables Confirm button
##    And user clicks on Confirm button takes to Service page Archived tab
##    Then user searches for patient added with "StudentFName<random>", "StudentLName<random>" and hit 'Start Session'
##    And user confirms Service Status is 'declined', and Service No is 1
##    And user clicks on ellipsis icon and confirm 6 options appear
##    And user clicks on ellipsis icon and clicks on 'End of Care Report' option takes End of Care Summary Report
##    And user confirm data is not editable on End of Care Summary Report and clicks on Cross sign takes to Services page
##
##
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
##    And User enters School Contact details <ReferralDate>, <firstName>, <lastName>, <contactNumber>, <NCESSchoolId>
##    And User enters Student details <TCHATTStudentPreviously>, <firstName>, <lastName>, <DateOfBirth>, <Gender>, <Ethnicity>, <Race>, <disability>, <Grade>, <ContactNumber>, <ReasonForReferral>, <StdAssessment>
##    And User clicks Submit
##    Then User navigated back to Referral page
##    And User enters <firstName> in the search field
##    And User clicks continue button and confirm 'Select Existing Patient' page opened
##    And confirm 'No Students' appear on Right side view
##    And User clicks 'Add New Patient' button and confirm 'Confirm New Patient' pop-up opened
##    And User clicks 'Yes Confirm' button and confirm 'Patient Referral Form' page opened
##    And confirm HRI entered details matching on this 'Patient Referral Form' page
##    And user clicks on Consent to Service 'yes' option
##    And user clicks 'Proceed To Enrollment' button
##    And confirm HRI entered details matching on this 'Patient Enrollment Form' page
##    And User enters Patient MRN <MRN>, <Primary Care Provider>, select <Clinical Care Team> from dropdown, select Mobile App access, Parent/Guardian 1
##    And user enables Release Information ROI PCP <Declined>, ROI School <Signed>, <Parent/Guardian Name>, <Signed Date>, <Relationship to Patient>, and user enables Service Information 'Yes'
##    And User clicks on 'Enroll Patient' button
##
##
##    Examples:
##      | ReferralDate | firstName | lastName | contactNumber  | NCESSchoolId          |
##      | 01/03/2022   | "SCF1"    | "SCL1"   | "234-456-1220" | "devSCFL1@random.com" |
##    Examples:
##      | TCHATTStudentPreviously | firstName | lastName | DateOfBirth | Gender | Ethnicity | Race  | disability | Grade | ContactNumber  | ReasonForReferral | StdAssessment |
##      | yes                     | AutoSDF1  | AutoSDL1 | 10-10-1990  | Male   | Hispanic  | Asian | Yes        | 13th  | "234-456-1220" | Bullying          | No            |
##
#
##  Scenario Outline: User adds Referral from Referrals tab.
##    Given User is in clinician portal
##    And User clicks on Referrals
##    When User clicks on New Referral button
##    When User clicks on Add New button
##    When User clicks on 'Yes, Confirm' button from 'Confirm New Patient' pop-up
##    And User navigates to 'Patient Referral form' page
##    And User fills all the School Contact Mandatory Fields <sCDate>,<sCfirstName>, <sClastName>, <sCContactNumber>, <sCNCESSchoolID>
##    And User fills Student Details <TCHATTSvcsPreviously>, <sDfirstName>, <sDfirstName>, <sDDOB>, <Gender>, <Ethnicity>, <Race>, <disability>, <Grade>, <ContactNumber> and Save
##
##    And User navigates back to Hub Staff Page
##    And User searches with firstName or LastName should be displayed
##    And User confirms <firstName>, <LastName>, <phoneNumber>, <email>, <Role> details shown are as expected
##    Examples:
##      |TCHATTSvcsPreviously| sDfirstName     |LastName|phoneNumber|email|Role|
##      | "Random" |"Random"     |"Random"   |"Random""|Psychiatrist|