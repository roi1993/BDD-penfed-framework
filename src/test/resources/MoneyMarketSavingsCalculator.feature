@Z
Feature: As a user, I should be able to arrive on the Money Market Savings Calculator page,
  so that i can use a calculator to see my savings.

  Background:
    Given I`m on home page
    Then I choose Learn
    Then I click on Calculators
    Then I click on Money Market Savings Calculator

    Scenario: Go to Money Market Savings Calculator page
      Then I am able to fill out the calculator and submit to see my earnings


  Scenario: Enter alphabetical characters for the initial amount
    Then I am able to enter alphabetical characters for initial amount and submit to see my earnings

  Scenario: Enter alphabetical characters for the number of years
    Then I am able to enter alphabetical characters for the number of years and submit to see my earnings

  Scenario: Enter numerical characters for the monthly additions
    Then I am able to enter numerical characters for monthly additions

  Scenario: Enter numerical characters for the initial amount
    Then I am able to enter numerical characters for the initial amount

  Scenario: Enter numerical characters for the number of years
    Then I am able to enter numerical characters for the number of years