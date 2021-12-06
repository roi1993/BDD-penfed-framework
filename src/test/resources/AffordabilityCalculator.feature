@regression
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

      |annual income  |debt         |down payment |
      |130000         |500          |15000        |

    Then I click on Calculate button on affordability calculator tab
    Then I should be able to calculate mortgage affordability ratio

  Scenario: Calculate mortgage affordability ratio using mortgage calculator by leaving Annual Income field blank

    When I go to Affordability Calculator
    Then I fill in the required fields, but leave annual income space empty

       |debt   |down payment |
       |5005   |20000       |

    Then I click on Calculate button on affordability calculator tab
    Then System should give me error on Annual Income space


 # Scenario: Move Ratio Slider to Left

 #   When I go to Affordability Calculator
 #   Then I fill in the required fields
 #     |annual income  |debt  |down payment |
 #     |130000         |500   |15000        |
 #   Then I click on Calculate button on affordability calculator tab
 #   Then I will get the result
 #   Then I move Ratio Slider to Left to see the changes in my mortgage affordability ratio
 #   Then I should be able to see new Total Home Cost


 # Scenario: Move Ratio Slider to Right

 #   When I go to Affordability Calculator
 #   Then I fill in the required fields
 #     |annual income  |debt  |down payment |
 #     |130000         |500   |15000        |
 #   Then I click on Calculate button on affordability calculator tab
 #   Then I will get the result
 #   Then I move Ratio Slider to Right to see the changes in my mortgage affordability ratio
 #   Then I should be able to see new Total Home Cost




