@K
Feature:  As a user, I want to be able to choose different student loan types, So that I can land on Ascent web page.

  Background:
    Given I`m on home page
    Then I choose Loans
    And  I pick an option In-school student loans

@1
    Scenario: choose undergraduate student loans
      Then I`m able to choose undergraduate student loans
      And I should be able to land on Ascent web page

    Scenario:choose graduate student loans
      Then I`m able to choose graduate student loans
      And I should be able to land on Ascent web page

    Scenario:choose no-essay scholarship student loans
      Then I`m able to choose no-essay scholarship student loans
      And I should be able to land on Ascent web page