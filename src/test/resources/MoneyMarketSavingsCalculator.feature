@Z
Feature: As a user, I should be able to arrive on the Money Market Savings Calculator page,
  so that i can use a calculator to see my savings.

    Scenario: Go to Money Market Savings Calculator page
      Given I`m on home page
      Then I choose Learn
      Then I click on Calculators
      Then I click on Money Market Savings Calculator
      Then I am able to fill out the calculator and submit to see my earnings