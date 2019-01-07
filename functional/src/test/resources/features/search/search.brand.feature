@version:Sprint
@issue:
Feature: search product by name and use product filters

  Background:
  As a functional tester
  I Want to validate search and filter functionality

  @search @filter
  Scenario Outline: search product by category and use product filters
    Given As a random rs-component guest user
    When I search for product by '<brand>'
    And add apply a filters with '<categoryAttribute>' and '<categoryValue>'
    Then given filter should be applied
    Examples:
      |brand|categoryAttribute|categoryValue|
      |ras|Name|Raspberry Pi 3 Model B+|