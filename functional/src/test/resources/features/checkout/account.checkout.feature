@version:
@issue:
Feature: checkout using product name and guest user account

  Background:
  As a functional tester
  I Want to validate end-to-end user journey for registered user

  @checkout @account
  Scenario Outline: buy a product as a registered user
    Given As a registered user
    When I will search the product by '<productId>'
    And add them to the basket
    And will perform the checkout as registered user with '<username>' and '<password>'
    Then I will be presented with options to pay
  Examples:
    |productId|username|password|
    |597-835|shivanirana|Shivani#1234|
