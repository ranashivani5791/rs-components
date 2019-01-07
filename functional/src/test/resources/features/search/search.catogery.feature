@version:Sprint
@issue:
Feature: search product by category and use filter product Brand

  Background:
  As a functional tester
  I Want to validate search and filter functionality

  @search @filter
  Scenario Outline: search product by category and use filter product Brand
    Given As a random guest user
    When I search for a product by '<category>'
    And add apply filters with '<categoryAttribute>' and '<categoryValue>'
    Then given filters should be applied
    Examples:
      |category|categoryAttribute|categoryValue|
      |Torch Batteries|Brand|Wolf Safety|