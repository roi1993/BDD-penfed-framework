
Feature: As a non-registered user, I should be able to go to Mortgage Calculator Page on the website

  @smoke
  Scenario: Go to Mortgage Calculator Page
    Given I am on the homepage
   # Given I’m in a role of non-registered user
    When  I hover over MORTGAGE & HOME EQUITY Tab
    And   I choose Mortgage Calculators under TOOLS & RESOURCES
    Then  I should land on the Mortgage Calculators Page

