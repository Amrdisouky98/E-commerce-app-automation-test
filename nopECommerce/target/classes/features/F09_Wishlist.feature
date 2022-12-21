@smoke
Feature: Add products to wishlist

  Background:
    Given The user should be logged in successfully

    Scenario: Success message appears when adding product to wishlist
      Given user navigates to needed product then click add to wishlist button
      Then A green success message should appear

    Scenario: Number of wishlist items increase
      Given user navigates to needed product then click add to wishlist button
      Then number of wishlist products on homepage get increased
      And number of wishlist products equals to number of real wishlist actions