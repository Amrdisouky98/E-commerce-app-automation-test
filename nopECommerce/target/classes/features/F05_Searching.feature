@smoke
Feature: Product search

  Background:
    Given The user should be logged in successfully

    Scenario: Logged User could search for any product
      Given User click on search field
      And Start typing favoured product name
      And Click on search button
      Then User should be directed to search result page
