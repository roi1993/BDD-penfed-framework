
Feature: As a non-registered user, I should be able to access mortgage calculator and check estimated monthly principal and interest payment

 Background:
  Given I am on the homepage


 Scenario: Go to Mortgage Payment Calculator

  When  I hover over MORTGAGE & HOME EQUITY Tab
  Then  I choose Mortgage Calculators under TOOLS & RESOURCES Tab
  Then  I should land on Mortgage Payment Calculator


 Scenario: Calculate estimated monthly mortgage principal and interest payment using mortgage payment calculator
               by filling out all the required info field

  When I go to Mortgage Payment Calculator
  Then I fill out all the required field
  Then I click on Calculate
  Then I should be able to calculate estimated monthly mortgage principal and interest payment


 Scenario: Calculate estimated monthly mortgage principal and interest payment using mortgage payment calculator
 by leaving PRICE OF THE HOME field with default amount $0.00

  When I go to Mortgage Payment Calculator
  Then I fill out all the required field but leave PRICE OF THE HOME field with default amount $0.00
  Then I click on Calculate
  Then I should not be able to calculate estimated monthly mortgage principal and interest payment


