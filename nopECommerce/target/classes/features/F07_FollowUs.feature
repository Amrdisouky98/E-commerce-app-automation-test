@smoke
Feature: User navigate to website's social pages

  Background:
    Given The user should be logged in successfully

    Scenario: user visits facebook page
      Given user clicks on facebook link
      Then user heads to "https://www.facebook.com/nopCommerce" page

    Scenario: user visits twitter page
      Given user clicks on twitter link
      Then user heads to "https://twitter.com/nopCommerce" page

    Scenario: user visits rss page
      Given user clicks on rss link
      Then user heads to "https://demo.nopcommerce.com/new-online-store-is-open" page

    Scenario: user visits youtube channel
      Given user clicks on youtube link
      Then user heads to "https://www.youtube.com/user/nopCommerce" page