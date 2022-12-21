@smoke
Feature: Choose item in home slider
  Background:
    Given The user should be logged in successfully

  Scenario: User can select first product from Home sliders
    Given user select the first slider on homepage
    Then user head to first product's page

  Scenario: User can select second product from Home sliders
    Given user select the second slider on homepage
    Then user head to second product's page