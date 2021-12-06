
Feature: As a non-registered user, I should be able to access mortgage calculator and check my mortgage affordability ratio

  Background:
    Given I am on the homepage

  Scenario: Go to Mortgage Affordability Ratio Calculator

    When  I hover over MORTGAGE & HOME EQUITY Tab
    Then  I choose Mortgage Calculators under TOOLS & RESOURCES Tab
    Then  I click on Affordability Calculator
    Then  I should land on Affordability Calculator Page

  Scenario: Calculate mortgage affordability ratio using mortgage calculator
  by filling out all the required info field

    When I go to Affordability Calculator
    Then I fill in the required fields
    Then I click on Calculate button on affordability calculator tab
    Then I should be able to calculate mortgage affordability ratio

  Scenario: Calculate mortgage affordability ratio using mortgage calculator by leaving

