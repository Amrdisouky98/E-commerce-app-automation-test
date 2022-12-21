@smoke
Feature: User restore his lost password

  Background:
    Given User navigates to Login page

  Scenario: User could reset his/her password successfully
    Given User clicks on forget password button
    Then User navigates to password recovery page
    And User enters the email he wants to reset the passowrd at
    And User clicks on recover button
    Then A reset confirmation message appears