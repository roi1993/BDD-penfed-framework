package stepDefinition;

import io.cucumber.java.en.Then;
import pages.CookiesHandlingPage;
import pages.HomePage;
import pages.MoneyMarketSavingsCalculatorPage;

public class MoneyMarketSavingsCalculatorStepDef {

    HomePage homePage=new HomePage();
    CookiesHandlingPage cookiesHandlingPage=new CookiesHandlingPage();
    MoneyMarketSavingsCalculatorPage moneyMarketSavingsCalculatorPage = new MoneyMarketSavingsCalculatorPage();

    @Then("I choose Learn")
    public void i_choose_learn() {
     homePage.learnTab.click();

    }
    @Then("I click on Calculators")
    public void i_click_on_calculators() {
        homePage.calculatorTab.click();

    }
    @Then("I click on Money Market Savings Calculator")
    public void i_click_on_money_market_savings_calculator() {
        cookiesHandlingPage.click();
        moneyMarketSavingsCalculatorPage.moneyMarketSavingsCalculatorTab.click();

    }
    @Then("I am able to enter alphabetical characters for the monthly additions and submit to see my earnings")
    public void i_am_able_to_enter_alphabetical_characters_for_the_monthly_additions_and_submit_to_see_my_earnings() {

        moneyMarketSavingsCalculatorPage.monthlyAdditions.click();
        moneyMarketSavingsCalculatorPage.monthlyAdditions.clear();
        moneyMarketSavingsCalculatorPage.monthlyAdditions.sendKeys("sdjbasdjd");
        //throw new io.cucumber.java.PendingException();
        moneyMarketSavingsCalculatorPage.initialAmount.click();
        moneyMarketSavingsCalculatorPage.initialAmount.clear();
        moneyMarketSavingsCalculatorPage.initialAmount.sendKeys("1234");
        moneyMarketSavingsCalculatorPage.numberOfYears.click();
        moneyMarketSavingsCalculatorPage.numberOfYears.clear();
        moneyMarketSavingsCalculatorPage.numberOfYears.sendKeys("3");
        moneyMarketSavingsCalculatorPage.calculateButton.click();
    }
    @Then("I am able to enter alphabetical characters for initial amount and submit to see my earnings")
    public void i_am_able_to_enter_alphabetical_characters_for_initial_amount_and_submit_to_see_my_earnings() {
        // Write code here that turns the phrase above into concrete actions
        moneyMarketSavingsCalculatorPage.monthlyAdditions.clear();
        moneyMarketSavingsCalculatorPage.monthlyAdditions.click();
        moneyMarketSavingsCalculatorPage.monthlyAdditions.clear();
        moneyMarketSavingsCalculatorPage.monthlyAdditions.sendKeys("1234");
        //throw new io.cucumber.java.PendingException();
        moneyMarketSavingsCalculatorPage.initialAmount.click();
        moneyMarketSavingsCalculatorPage.initialAmount.clear();
        moneyMarketSavingsCalculatorPage.initialAmount.sendKeys("shsbfhdhsdf");
        moneyMarketSavingsCalculatorPage.numberOfYears.click();
        moneyMarketSavingsCalculatorPage.numberOfYears.clear();
        moneyMarketSavingsCalculatorPage.numberOfYears.sendKeys("3");
        moneyMarketSavingsCalculatorPage.calculateButton.click();
        //throw new io.cucumber.java.PendingException();
    }
    @Then("I am able to enter alphabetical characters for the number of years and submit to see my earnings")
    public void i_am_able_to_enter_alphabetical_characters_for_the_number_of_years_and_sumbit_to_see_my_earnings() {
        // Write code here that turns the phrase above into concrete actions
        moneyMarketSavingsCalculatorPage.monthlyAdditions.click();
        moneyMarketSavingsCalculatorPage.monthlyAdditions.clear();
        moneyMarketSavingsCalculatorPage.monthlyAdditions.sendKeys("12345");
        moneyMarketSavingsCalculatorPage.initialAmount.click();
        moneyMarketSavingsCalculatorPage.initialAmount.clear();
        moneyMarketSavingsCalculatorPage.initialAmount.sendKeys("1234");
        moneyMarketSavingsCalculatorPage.numberOfYears.click();
        moneyMarketSavingsCalculatorPage.numberOfYears.clear();
        moneyMarketSavingsCalculatorPage.numberOfYears.sendKeys("dsfbdshkbf");
        moneyMarketSavingsCalculatorPage.calculateButton.click();
      //  throw new io.cucumber.java.PendingException();
    }
    @Then("I am able to enter numerical characters for monthly additions")
    public void i_am_able_to_enter_numerical_characters_for_monthly_additions() {
        // Write code here that turns the phrase above into concrete actions
        moneyMarketSavingsCalculatorPage.monthlyAdditions.clear();
        moneyMarketSavingsCalculatorPage.monthlyAdditions.click();
        moneyMarketSavingsCalculatorPage.monthlyAdditions.clear();
        moneyMarketSavingsCalculatorPage.monthlyAdditions.sendKeys("1234");
        //throw new io.cucumber.java.PendingException();
        moneyMarketSavingsCalculatorPage.initialAmount.click();
        moneyMarketSavingsCalculatorPage.initialAmount.clear();
        moneyMarketSavingsCalculatorPage.initialAmount.sendKeys("sfjnsdkf");
        moneyMarketSavingsCalculatorPage.numberOfYears.click();
        moneyMarketSavingsCalculatorPage.numberOfYears.clear();
        moneyMarketSavingsCalculatorPage.numberOfYears.sendKeys("dskfdsb");
        moneyMarketSavingsCalculatorPage.calculateButton.click();
       // throw new io.cucumber.java.PendingException();
    }
    @Then("I am able to enter numerical characters for the initial amount")
    public void i_am_able_to_enter_numerical_characters_for_the_initial_amount() {
        // Write code here that turns the phrase above into concrete actions
        moneyMarketSavingsCalculatorPage.monthlyAdditions.clear();
        moneyMarketSavingsCalculatorPage.monthlyAdditions.click();
        moneyMarketSavingsCalculatorPage.monthlyAdditions.clear();
        moneyMarketSavingsCalculatorPage.monthlyAdditions.sendKeys("asudkhr32784");
        //throw new io.cucumber.java.PendingException();
        moneyMarketSavingsCalculatorPage.initialAmount.click();
        moneyMarketSavingsCalculatorPage.initialAmount.clear();
        moneyMarketSavingsCalculatorPage.initialAmount.sendKeys("1234");
        moneyMarketSavingsCalculatorPage.numberOfYears.click();
        moneyMarketSavingsCalculatorPage.numberOfYears.clear();
        moneyMarketSavingsCalculatorPage.numberOfYears.sendKeys("dskfdsb");
        moneyMarketSavingsCalculatorPage.calculateButton.click();
       // throw new io.cucumber.java.PendingException();
    }

    @Then("I am able to enter numerical characters for the number of years")
    public void i_am_able_to_enter_numerical_characters_for_the_number_of_years() {
        // Write code here that turns the phrase above into concrete actions
        moneyMarketSavingsCalculatorPage.monthlyAdditions.clear();
        moneyMarketSavingsCalculatorPage.monthlyAdditions.click();
        moneyMarketSavingsCalculatorPage.monthlyAdditions.clear();
        moneyMarketSavingsCalculatorPage.monthlyAdditions.sendKeys("knsdfjdk24324");
        //throw new io.cucumber.java.PendingException();
        moneyMarketSavingsCalculatorPage.initialAmount.click();
        moneyMarketSavingsCalculatorPage.initialAmount.clear();
        moneyMarketSavingsCalculatorPage.initialAmount.sendKeys("sdfjdsfdf3242");
        moneyMarketSavingsCalculatorPage.numberOfYears.click();
        moneyMarketSavingsCalculatorPage.numberOfYears.clear();
        moneyMarketSavingsCalculatorPage.numberOfYears.sendKeys("12345");
        moneyMarketSavingsCalculatorPage.calculateButton.click();
        // throw new io.cucumber.java.PendingException();
    }

    }
