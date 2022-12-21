@smoke
Feature: Change currency

  Background:
    Given The user should be logged in successfully

  Scenario: Logged User could switch between currencies US-Euro
    When User click on currencies DDL then click on Euro sign
    Then Currency changes from US to Euro
