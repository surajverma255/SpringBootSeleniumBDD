@TraytLoginDemo
# WIP
Feature: Trayt portal Automation framework demo

  Background:
    Given User opens clinician portal

  Scenario: User logs into Trayt clinical portal and navigate to homepage.
    And Sign into portal as "AUTO_ADMIN"
    Then User validate that Login is Successful

    Given User is in clinician portal
  # Add 'Administrator' Role to and Delete User
    And User clicks on Hub Staff
    And User enters "Autotchattdev2 Hristaff" in the search field
    And User clicks on Edit button and confirm 'TCHATT Staff Member' Pop-up opened
    And User enables "Psychiatrist" checkbox and disables "Administrator" and save
    And User logout of the portal
    And Sign into portal as "AUTO_ADMIN2"
    Then User validate that Login is Successful
#    Examples:
#      | firstName  | lastName  | role           | editRole        |
#      | "Mirror20" | "Bench20" | "Psychiatrist" | "Administrator" |
#
#    Given User is in clinician portal
#   # Add 'Therapist' Role to and Delete User
#    And User clicks on Edit button and confirm 'TCHATT Staff Member' Pop-up opened
#    And User enables to <editRole> checkbox and Save
#    And User enters <lastName> in the search field
#    And User confirms <firstName> details shown are as expected
#    And confirm the user saved the roles <role> and <editRole>
#    And delete user
#    Examples:
#      | firstName  | lastName  | phoneNumber    | email                         | role           | editRole    |
#      | "Mirror20" | "Bench20" | "234-456-1220" | "mirror20.bench20@random.com" | "Psychiatrist" | "Therapist" |
#
#    Given User is in clinician portal
#     # Add 'Medical Assistant' Role to and Delete User
#    And User clicks on Edit button and confirm 'TCHATT Staff Member' Pop-up opened
#    And User enables to <editRole> checkbox and Save
#    And User enters <lastName> in the search field
#    And User confirms <firstName> details shown are as expected
#    And confirm the user saved the roles <role> and <editRole>
#    And delete user
#    Examples:
#      | firstName  | lastName  | phoneNumber    | email                         | role           | editRole            |
#      | "Mirror20" | "Bench20" | "234-456-1220" | "mirror20.bench20@random.com" | "Psychiatrist" | "Medical Assistant" |
#
#    Given User is in clinician portal
#   # Add 'Physician Assistant' Role to and Delete User
#    And User clicks on Edit button and confirm 'TCHATT Staff Member' Pop-up opened
#    And User enables to <editRole> checkbox and Save
#    And User enters <lastName> in the search field
#    And User confirms <firstName> details shown are as expected
#    And confirm the user saved the roles <role> and <editRole>
#    And delete user
#    Examples:
#      | firstName  | lastName  | phoneNumber    | email                         | role           | editRole              |
#      | "Mirror20" | "Bench20" | "234-456-1220" | "mirror20.bench20@random.com" | "Psychiatrist" | "Physician Assistant" |
#
#    Given User is in clinician portal
#  # Add 'Patient Coordinator' Role to and Delete User
#    And User clicks on Edit button and confirm 'TCHATT Staff Member' Pop-up opened
#    And User enables to <editRole> checkbox and Save
#    And User enters <lastName> in the search field
#    And User confirms <firstName> details shown are as expected
#    And confirm the user saved the roles <role> and <editRole>
#    And delete user
#    Examples:
#      | firstName  | lastName  | phoneNumber    | email                         | role           | editRole              |
#      | "Mirror20" | "Bench20" | "234-456-1220" | "mirror20.bench20@random.com" | "Psychiatrist" | "Patient Coordinator" |
#
#    Given User is in clinician portal
#   # Add 'Nurse' Role to and Delete User
#    And User clicks on Edit button and confirm 'TCHATT Staff Member' Pop-up opened
#    And User enables to <editRole> checkbox and Save
#    And User enters <lastName> in the search field
#    And User confirms <firstName> details shown are as expected
#    And confirm the user saved the roles <role> and <editRole>
#    And delete user
#    Examples:
#      | firstName  | lastName  | phoneNumber    | email                         | role           | editRole |
#      | "Mirror20" | "Bench20" | "234-456-1220" | "mirror20.bench20@random.com" | "Psychiatrist" | "Nurse"  |
#
#    Given User is in clinician portal
#   # Add 'Front Desk' Role to and Delete User
#    And User clicks on Edit button and confirm 'TCHATT Staff Member' Pop-up opened
#    And User enables to <editRole> checkbox and Save
#    And User enters <lastName> in the search field
#    And User confirms <firstName> details shown are as expected
#    And confirm the user saved the roles <role> and <editRole>
#    And delete user
#    Examples:
#      | firstName  | lastName  | phoneNumber    | email                         | role           | editRole     |
#      | "Mirror20" | "Bench20" | "234-456-1220" | "mirror20.bench20@random.com" | "Psychiatrist" | "Front Desk" |
#
#    Given User is in clinician portal
#     # Add 'Front Desk' Role to and Delete User
#    And User clicks on Edit button and confirm 'TCHATT Staff Member' Pop-up opened
#    And User enables to <editRole> checkbox and Save
#    And User enters <lastName> in the search field
#    And User confirms <firstName> details shown are as expected
#    And confirm the user saved the roles <role> and <editRole>
#    And delete user
#    Examples:
#      | firstName  | lastName  | phoneNumber    | email                         | role           | editRole  |
#      | "Mirror20" | "Bench20" | "234-456-1220" | "mirror20.bench20@random.com" | "Psychiatrist" | "Analyst" |
#
#    Given User is in clinician portal
# # Add 'Data Manager' Role to and Delete User
#    And User clicks on Edit button and confirm 'TCHATT Staff Member' Pop-up opened
#    And User enables to <editRole> checkbox and Save
#    And User enters <lastName> in the search field
#    And User confirms <firstName> details shown are as expected
#    And confirm the user saved the roles <role> and <editRole>
#    And delete user
#    Examples:
#      | firstName  | lastName  | phoneNumber    | email                         | role           | editRole       |
#      | "Mirror20" | "Bench20" | "234-456-1220" | "mirror20.bench20@random.com" | "Psychiatrist" | "Data Manager" |
#
#    Given User is in clinician portal
#  # Add 'Data Manager' Role to and Delete User
#    And User clicks on Edit button and confirm 'TCHATT Staff Member' Pop-up opened
#    And User enables to <editRole> checkbox and Save
#    And User enters <lastName> in the search field
#    And User confirms <firstName> details shown are as expected
#    And confirm the user saved the roles <role> and <editRole>
#    And delete user
#    Examples:
#      | firstName  | lastName  | phoneNumber    | email                         | role           | editRole     |
#      | "Mirror20" | "Bench20" | "234-456-1220" | "mirror20.bench20@random.com" | "Psychiatrist" | "Leadership" |

#
#
#  Scenario Outline: User deletes Hub Staff.
#    Given User is in clinician portal and on Hub Staff Page
#    And User searches with <firstName> or <LastName> should be displayed
#    When User clicks on Delete button
#    And User views Confirm Delete pop-up and clicks on Delete button
#    And User navigates back to Hub Staff Page
#    And User searches with <firstName> or <LastName> should be displayed
#    And User confirms deleted Hub Staff is no shown
#    Examples:
#      | firstName     |LastName|
#


# this comes in line 10-line 35
#  Scenario Outline: User adds Hub Staff with 'Psychiatrist' role selected.
    # Create staff
#    And User clicks on Hub Staff
#    When User clicks on Add Staff
#    And Confirm 'Add Staff' Pop-up opened
#    And User enters fields <firstName>, <lastName>, <phoneNumber>, <email>, <role> and Save
#    Then Confirm User navigates back to Hub Staff Page
#    And User enters <firstName> in the search field
#    And User confirms <firstName> details shown are as expected

#  Scenario Outline: User updates Hub Staff to different role 'Therapist'.
#    Given User is in clinician portal
#    And User click on Hub Staff
#    And User searches with <firstName> or <LastName> should be displayed

  # Add 'Psychiatrist' Role to and Delete User
#    And User clicks on Edit button and confirm 'TCHATT Staff Member' Pop-up opened
#    And User enables to <editRole> checkbox and Save
#    And User enters <lastName> in the search field
#    And User confirms <firstName> details shown are as expected
#    And confirm the user saved the roles <role> and <editRole>
#    And delete user
#    Examples:
#      | firstName  | lastName  | phoneNumber    | email                         | role           | editRole             |
#      | "Mirror20" | "Bench20" | "234-456-1220" | "mirror20.bench20@random.com" | "Psychiatrist" | "Nurse Practitioner" |


  Scenario Outline: User adds New Referral and Enrolls Patient via Clinician Portal.
    And Sign into portal as "AUTO_ADMIN"
    Then User validate that Login is Successful
    Given User is in clinician portal
    And User clicks on Referrals tab
    When User clicks on New Referral
    And User clicks on Add New link
    And Confirm 'Confirm New Patient' Pop-up opened
    And Click Yes, Confirm button
    And Use Random Data
    And select todays date as Referral Date
    And enter random value for Referral First Name field
    And enter random value for Referral Last Name field
    And enter random value for Referral Contact Number field
    And select yes in the Does the school contact know their NCES School ID
#    And enter '480000101145' in NCES School ID
    And select 'yes' in the Has the student received TCHATT services previously
#    And User enters "StudentFName<random>", "StudentLName<random>", "StudentDOB<random>", "StudentGender<random>", "StudentEthnicity<random>", "StudentRace<random>", "StudentMRN<random>" in the School Contact Section
    And enter random value for the Student First Name field
    And enter random value for the Student Last Name field
    And enter random value for the in the Student Date of Birth field
    And select 'Male' option in the Student Gender options
    And select 'Non-Hispanic' in the Student Ethnicity dropdown
    And select 'White' in the Student Race dropdown
#    And User enters "auto<random>" in the MRN field
#    And User enters <Student ID> in the Student MRN field
    And select 'No' in the Does this student have an intellectual or developmental disability?
    And select Grade in the Student School Information
#    And User enters <Student ID> in Student ID Field
#    And User enters <Contact Number> in Contact Number Field
#    And User selects <Preferred Language> in the Preferred Language
#    And User selects <Preferred Language> in the Preferred Pronoun
#    And User enters "auto<random>" in the Email field
#    And User enters "auto<random>" in the zipcode field
#    And User confirms 'Texas' in the State Dropdown
#    And User enters "auto<random>" in the Street Address field
#    And User enters "auto<random>" in the City field
    And enter random value for the Legal Parent-Guardian First Name field
    And enter random value for the Legal Parent-Guardian Last Name field
    And select a value in the Family Relation dropdown
    And enter random value for the Contact Number Field
#    And select a value for the Preferred Language dropdown
#    And User enters "auto<random>" in the Legal Parent/Guardian Email Address field
#    And User enables No in the Does the parent share the same address as the student?
#    And User enables checkbox Student's emergency contact
#    And User selects multiple checkboxes <Call Time preference> in the Call Time preference dropdown
#    And User selects multiple checkboxes except None of the above<Call Time preference> in the Reason for referral
    And select 'None of the above' checkbox for Has student experienced any
#    And User enters "auto<random>" in the Use the box below to capture any additional notes.
    #And User Uploads supported documents and Submit (Applicable only form school portal flow)
    And User clicks on Submit and confirm navigates to Referrals Page
    And search for referral with student name and press continue button on the first result
    And Click yes in Consent to Service, clicks link and press Proceed to Enrollment button
#    And user clicks 'Proceed to Enrollment' button navigates to Patient Enrollment Form
    And click yes under Consent to Care, and fill Consent to Care section
#    And user enters "pMRN<random>" in MRN Field
#    And user selects on "PrimareCProvider<random>" in Primary care provider dropdown
    And select clinicalCareTeam in Clinical care Team dropdown
    And select 'Male' option in the Student Gender options
    And select 'noMobileAccess' option in the Mobile App Access options
    And enter Emergency Contact section
#    And user enables Signed for ROI PCP, and Declined for ROI School in Release of Information section
    And select yes in Service Information Section and submit form
    Then Confirm added patient is shown in the Services search results page
#
#
##    Examples:
##      | firstName  | lastName  | role           | editRole        |
##      | "Mirror20" | "Bench20" | "Psychiatrist" | "Administrator" |
#
#    # lastname and DOB should be matching to precondtion for this flow.


