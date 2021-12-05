package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.NewAutoLoanCalculatorPage;

public class NewAutoLoanCalculatorStepDef {

    HomePage homePage=new HomePage();
    NewAutoLoanCalculatorPage newAutoLoanCalculatorPage=new NewAutoLoanCalculatorPage();

    @When("I choose Auto")
    public void i_choose_auto() {
        homePage.Auto.click();


    }
    @Then("I click on Auto Loan Application")
    public void i_click_on_auto_loan_application() {
        homePage.AutoLoanApplication.click();

    }
    @Then("I put purchase price {String}")
    public void i_put_purchase_price(String price) {
        newAutoLoanCalculatorPage.purchasePrice.sendKeys(price);


    }
    @Then("down payment {String}")
    public void down_payment(String downPayment) {
        newAutoLoanCalculatorPage.downPayment.sendKeys(downPayment);
    }

    @Then("I click calculate")
    public void i_click_calculate() {
        newAutoLoanCalculatorPage.calculateButton.click();

    }
    @Then("I should see corresponding monthly payment")
    public void i_should_see_corresponding_monthly_payment() {
        String actual=newAutoLoanCalculatorPage.monthlyCost.getText();
        String expected="";
        Assert.assertEquals(expected,actual);

    }


}
