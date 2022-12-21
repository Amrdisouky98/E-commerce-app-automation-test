@smoke
Feature: Hover over categories and sub-categories

  Background:
    Given The user should be logged in successfully

    Scenario: Logged user could select different Categories
      When User hover with mouse on Apparel category
      And User click on shoes sub-category in DDL
      Then User heads to Apparel category page