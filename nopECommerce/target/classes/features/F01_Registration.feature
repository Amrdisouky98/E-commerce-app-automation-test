@smoke
Feature: User could register to the system successfully

  Scenario: User could register successfully with valid data
    Given User navigate to register page
    Then Guest user should be directed to registering page
    When User select gender
    And Insert valid Firstname
    And Insert valid Lastname
    And Enter his birthday
    And Enter his birthmonth
    And Enter his birthyear
    And Enter valid email
    And Enter any company name
    And Enter valid password
    And Confirm recently entered password
    And Click register button

    Then the user should be registered successfully
    And a success green message is displayed
