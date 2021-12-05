@2

Feature: As a user, I want to use a calculator for new auto loan, So that I can see estimated monthly payment
  Background:
    Given I`m on home page
    When I choose Auto
    Then I click on Auto Loan Application

    Scenario: Use a calculator for new auto loan, So that I can see estimated monthly payment
      Then purchase price is "10.000"
      And down payment "1.000"
      And I click calculate
      Then I should see corresponding monthly payment

  Scenario: Use a calculator for new auto loan, So that I can see estimated monthly payment
    Then purchase price is "20.000"
    And down payment "2.000"
    And I click calculate
    Then I should see corresponding monthly payment


  Scenario: Use a calculator for new auto loan, So that I can see estimated monthly payment
    Then purchase price is "30.000"
    And down payment "3.000"
    And I click calculate
    Then I should see corresponding monthly payment