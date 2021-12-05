
@3
Feature:As a user, I want to use a calculator for new auto loan, So that I can see estimated monthly payments

  Scenario:Fill out all information in New Auto Loan calculator,so that I can see estimated monthly payments

    Given I`m on home page
    Then I choose Auto
    And I choose Auto Loan Application
    Then I should be able to fill out all information

      |purchase price|down payment|trade-in value|amount owe on trade|
      |20000         |2000        |200           |100                |

    Then I click on calculate button
    Then I should be able to see estimated monthly payments