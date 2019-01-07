@version:
@issue:
Feature: checkout using product name and guest user account

  Background:
  As a functional tester
  I Want to validate end-to-end user journey for guest user

  @checkout @guest
  Scenario Outline: buy a product as a guest user
    Given As a guest user
    When I will search the required product by '<name>'
    And add it to the basket
    And will perform the checkout as random guest
    Then I should be presented with options to pay
  Examples:
    |name|
    |Lead Acid Battery|