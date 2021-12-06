@regression
Feature: As a non-registered user, I should be able to go to PenFed Title LLC on the website


  Scenario: Go to PenFed Title LLC Page
    Given I am on the homepage
   # Given I’m in a role of non-registered user
    When  I hover over MORTGAGE & HOME EQUITY Tab
    And   I choose PenFed Title LLC under TOOLS & RESOURCES
    Then  I should land on PenFed Title Website on different browser tab