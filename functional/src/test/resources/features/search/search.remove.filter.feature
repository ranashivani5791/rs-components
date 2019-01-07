@version:Sprint
@issue:
Feature: remove applied filters

  Background:
  As a functional tester
  I Want to validate remove filter functionality

  @search @filter
  Scenario Outline: remove applied filters
    Given As a user for for given '<category>'
    And applied '<categoryAttribute>' with '<categoryValue>'
    When I want to remove applied filters
    Then applied filters should get removed
    Examples:
      |category|categoryAttribute|categoryValue|
      |Torch Batteries|Brand|Wolf Safety|