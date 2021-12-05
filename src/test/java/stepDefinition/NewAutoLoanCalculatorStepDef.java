package stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.CookiesHandlingPage;
import pages.HomePage;
import pages.NewAutoLoanCalculatorPage;

import java.util.List;
import java.util.Map;


public class NewAutoLoanCalculatorStepDef {
    HomePage homePage=new HomePage();
    NewAutoLoanCalculatorPage newAutoLoanCalculatorPage=new NewAutoLoanCalculatorPage();
    CookiesHandlingPage cookiesHandlingPage=new CookiesHandlingPage();


    @Then("I choose Auto")
    public void i_choose_auto() {
        homePage.Auto.click();

    }
    @Then("I choose Auto Loan Application")
    public void i_choose_auto_loan_application() {
        homePage.AutoLoanApplication.click();
        cookiesHandlingPage.click();
        newAutoLoanCalculatorPage.newCalculator.click();


    }
    @Then("I should be able to fill out all information")

    public void i_should_be_able_to_fill_out_all_information(List<Map<String, String>> data) throws InterruptedException {

        newAutoLoanCalculatorPage.purchasePrice.clear();
        newAutoLoanCalculatorPage.purchasePrice.sendKeys(data.get(0).get("purchase price"));
        newAutoLoanCalculatorPage.downPayment.click();
        newAutoLoanCalculatorPage.downPayment.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE);
        newAutoLoanCalculatorPage.downPayment.sendKeys(data.get(0).get("down payment"));
        newAutoLoanCalculatorPage.tradeInValue.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE);
        newAutoLoanCalculatorPage.tradeInValue.sendKeys(data.get(0).get("trade-in value"));
        newAutoLoanCalculatorPage.amountOwedOnTrade.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE);
        newAutoLoanCalculatorPage.amountOwedOnTrade.sendKeys(data.get(0).get("amount owe on trade"));

        Thread.sleep(2000);



    }
    @Then("I click on calculate button")
    public void i_click_on_calculate_button() {
        newAutoLoanCalculatorPage.calculateButton.click();


    }
    @Then("I should be able to see estimated monthly payments")
    public void i_should_be_able_to_see_estimated_monthly_payments() {
        String actual=newAutoLoanCalculatorPage.monthlyCost.getText();
        String expected= "511";
        Assert.assertEquals(expected,actual);


    }
}
