@ReferralFlows
Feature: Adding Referrals via School Portal

  Background:
    Given User opens "school" portal

  Scenario: User adds New Referral and Enrolls Patient via School Portal.
    And Sign into "school" portal as "AUTO_ADMIN"
    Then User validate that Login is Successful
    Given User is in school portal
    When User clicks on New Referral
    And Confirm 'Confirm Family & Student Consent' Pop-up opened
    And Click Confirm button
    And Use Random Data
    And select todays date as Referral Date
    And select yes in the Does the school contact know their NCES School ID
    And enter 'SPUR' in NCES School ID
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
    And User clicks on Submit and confirm navigates to "school" Referrals Page
    And Verify referral is submitted successfully