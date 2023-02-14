@ReferralFlows
Feature: Adding Referrals via Clinician Portal

  Background:
    Given User opens "clinician" portal

  Scenario: User adds New Referral and Enrolls Patient via Clinician Portal.
    And Sign into "clinician" portal as "AUTO_ADMIN"
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
    And enter '480000101145' in NCES School ID
    And select 'yes' in the Has the student received TCHATT services previously
    And enter random value for the Student First Name field
    And enter random value for the Student Last Name field
    And enter random value for the in the Student Date of Birth field
    And select 'Male' option in the Student Gender options
    And select 'Non-Hispanic' in the Student Ethnicity dropdown
    And select 'White' in the Student Race dropdown
    And select 'No' in the Does this student have an intellectual or developmental disability?
    And select Grade in the Student School Information
    And enter random value for the Legal Parent-Guardian First Name field
    And enter random value for the Legal Parent-Guardian Last Name field
    And select a value in the Family Relation dropdown
    And enter random value for the Contact Number Field
    And select 'None of the above' checkbox for Has student experienced any
    And User clicks on Submit and confirm navigates to "clinician" Referrals Page
    And search for referral with student name and press continue button on the first result
#    And hit continue button
    And Click yes in Consent to Service, clicks link and press Proceed to Enrollment button
    And click yes under Consent to Care, and fill Consent to Care section
    And select clinicalCareTeam in Clinical care Team dropdown
    And select 'Male' option in the Student Gender options
    And select 'noMobileAccess' option in the Mobile App Access options
    And enter Emergency Contact section
    And select yes in Service Information Section and submit form
    Then Confirm added patient is shown in the Services search results page

  Scenario: User Archives patient after diagnosis, confirm diagnosis added and Submit session with option 'document session now' and Validate Archived patient data in Patient Tab
    And Sign into "clinician" portal as "AUTO_ADMIN"
    Then User validate that Login is Successful
    Given User is in clinician portal
    And User clicks on Services tab
    And search for patient in the Services search results page
    When User clicks on Services Start Session
    And User clicks on Add Diagnoses
    And User selects any 2 options under 'Psychiatric Disorders' and click Save
    Then User confirms diagnosis added on Health Record page
    And User clicks on Complete Session
    And Confirm 'Session Documentation' Pop-up opened
    And Select Document Session notes now Option and select Yes for Episode of care
    And Complete End of Session Form
    Then search for patient in the Services search results page
    When User clicks on Services Start Session
    Then User Verify Complete Session Button is "Disabled"
    Then User Clicks on Assessments tab and verify Assign Assessment Button is Enabled
    Then User Clicks on Mobile Access tab and Invite a Family Member
    Then search for patient in the Services search results page
    Then User clicks on Update Services
    Then search for patient in the Services search results page
    Then Verify Encounter No is "2"
    Then User Perform End of Service
    Then search for patient in the Services search results page
    Then Validate Episode Status is "End Of Service"
    When User clicks on Review Report
    And  User perform Edit Diagnosis
    When User Fill Disposition of Care Referral Form
    Then User Clicks on Archive This Service
    When User clicks on Patient tab
    Then search for patient in the Patient search results page
    Then User Selects Patient on Archived Search Result Page
    Then User Validates Assign Assessments Button Is Not Visible
    Then User Navigates to MobileAccess and Validates Invite Family Member is Visible Or Not

  Scenario: Verify User is able to Upload and Delete document successfully
    And Sign into "clinician" portal as "AUTO_ADMIN"
    Then User validate that Login is Successful
    Given User is in clinician portal
    When User clicks on Documents tab
    Then User Clicks on Upload Document and Upload Document
    Then Verify File is Uploaded
    Then User Deletes the Uploaded File

  Scenario: Verify user is able to update phone Number via settings icon
    And Sign into "clinician" portal as "AUTO_ADMIN"
    Then User validate that Login is Successful
    Given User is in clinician portal
    When User clicks on Settings Icon
    Then User Clicks on Change Phone Number
    Then enter random value for New Phone Number Field
    Then User Confirms Change of Phone Number
