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
    @Then("I am able to fill out the calculator and submit to see my earnings")
    public void i_am_able_to_fill_out_the_calculator_and_submit_to_see_my_earnings() {

        moneyMarketSavingsCalculatorPage.initialAmount.sendKeys("asdfasfkb");
        moneyMarketSavingsCalculatorPage.monthlyAdditions.click();
        moneyMarketSavingsCalculatorPage.monthlyAdditions.sendKeys("10000");
        moneyMarketSavingsCalculatorPage.numberOfYears.click();
        moneyMarketSavingsCalculatorPage.numberOfYears.sendKeys("3");
        moneyMarketSavingsCalculatorPage.calculateButton.click();


    }
}
