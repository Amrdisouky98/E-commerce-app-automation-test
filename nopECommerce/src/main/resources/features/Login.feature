@regression
  Feature: User could log in to the system successfully

    Scenario: User could log in with valid email and password
      Given User navigates to Login page
      When Insert enter valid email
      And Insert valid password
      And Click on login button
      Then The user should be logged in successfully


