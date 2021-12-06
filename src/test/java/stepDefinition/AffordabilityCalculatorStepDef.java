package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import pages.AffordabiltyCalculatorPage;
import utilities.Driver;

import java.util.List;
import java.util.Map;

public class AffordabilityCalculatorStepDef {

    @Then("I click on Affordability Calculator")
    public void i_click_on_affordability_calculator() {
        AffordabiltyCalculatorPage affordabiltyCalculatorPage = new AffordabiltyCalculatorPage();
        affordabiltyCalculatorPage.affordabilityTab.click();

    }
    @Then("I should land on Affordability Calculator Page")
    public void i_should_land_on_affordability_calculator_page() {
        AffordabiltyCalculatorPage affordabiltyCalculatorPage = new AffordabiltyCalculatorPage();
        String expected = "MORTGAGE AFFORDABILITY CALCULATOR";
        String actual = affordabiltyCalculatorPage.AffordabilityCalcPageTitle.getText();

        Assert.assertEquals(expected,actual);

    }

    @When("I go to Affordability Calculator")
    public void i_go_to_affordability_calculator() {
        AffordabiltyCalculatorPage affordabiltyCalculatorPage = new AffordabiltyCalculatorPage();
        affordabiltyCalculatorPage.affordabilityTab.click();

    }
    @Then("I fill in the required fields")
    public void i_fill_in_the_required_fields(List<Map<String, String>> data) {
        AffordabiltyCalculatorPage affordabiltyCalculatorPage = new AffordabiltyCalculatorPage();
        affordabiltyCalculatorPage.annualIncome.sendKeys(Keys.BACK_SPACE);
        affordabiltyCalculatorPage.annualIncome.sendKeys(data.get(0).get("annual income"),Keys.TAB,Keys.TAB);
        affordabiltyCalculatorPage.monthlyDebts.sendKeys(Keys.BACK_SPACE,data.get(0).get("debt"),Keys.TAB);
        affordabiltyCalculatorPage.downPayment.sendKeys(Keys.BACK_SPACE,data.get(0).get("down payment"),Keys.TAB,Keys.TAB);
        Select loanTerm = new Select(affordabiltyCalculatorPage.loanTerms);
        loanTerm.selectByValue("15");

    }
    @Then("I click on Calculate button on affordability calculator tab")
    public void i_click_on_calculate_button_on_affordability_calculator_tab() {
        AffordabiltyCalculatorPage affordabiltyCalculatorPage = new AffordabiltyCalculatorPage();
        affordabiltyCalculatorPage.affordabilityCalculateButton.click();
    }

    @Then("I should be able to calculate mortgage affordability ratio")
    public void i_should_be_able_to_calculate_mortgage_affordability_ratio() {
        AffordabiltyCalculatorPage affordabiltyCalculatorPage = new AffordabiltyCalculatorPage();
        String expected = "TOTAL HOME COST";
        String actual = affordabiltyCalculatorPage.resultVerifyingTitle.getText();
        Assert.assertEquals(expected,actual);
    }

//    @When("I Go to Affordability Calculator")
//    public void i_go_to_affordability_calculator() {
//        AffordabiltyCalculatorPage affordabiltyCalculatorPage = new AffordabiltyCalculatorPage();
//        affordabiltyCalculatorPage.affordabilityTab.click();

//    }
    @Then("I fill in the required fields, but leave annual income space empty")
    public void i_fill_in_the_required_fields_but_leave_annual_income_space_empty(List<Map<String, String>> data) {
        AffordabiltyCalculatorPage affordabiltyCalculatorPage = new AffordabiltyCalculatorPage();
        affordabiltyCalculatorPage.annualIncome.clear();
        affordabiltyCalculatorPage.annualIncome.sendKeys(Keys.TAB,Keys.TAB);
        affordabiltyCalculatorPage.monthlyDebts.sendKeys(Keys.BACK_SPACE,data.get(0).get("debt"),Keys.TAB);
        affordabiltyCalculatorPage.downPayment.sendKeys(Keys.BACK_SPACE,data.get(0).get("down payment"),Keys.TAB,Keys.TAB);
        Select loanTerm = new Select(affordabiltyCalculatorPage.loanTerms);
        loanTerm.selectByValue("15");

    }
//    @Then("I click on Calculate button on affordability calculator tab")
//    public void i_click_on_calculate_button_on_affordability_calculator_tab() {
//
//    }
    @Then("System should give me error on Annual Income space")
    public void system_should_give_me_error_on_annual_income_space() {
        AffordabiltyCalculatorPage affordabiltyCalculatorPage = new AffordabiltyCalculatorPage();
        String expectedErrorColorCode = "#C41C30";
        String colorValue = affordabiltyCalculatorPage.annualIncomeLabel.getCssValue("color");
        String actualErrorColor = Color.fromString(colorValue).asHex();
        Assert.assertEquals(expectedErrorColorCode,actualErrorColor);

    }

//    @When("I go to Affordability Calculator")
//    public void i_go_to_affordability_calculator() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("I fill in the required fields")
//    public void i_fill_in_the_required_fields(io.cucumber.datatable.DataTable dataTable) {
//        // Write code here that turns the phrase above into concrete actions
//        // For automatic transformation, change DataTable to one of
//        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//        // Double, Byte, Short, Long, BigInteger or BigDecimal.
//        //
//        // For other transformations you can register a DataTableType.
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("I click on Calculate button on affordability calculator tab")
//    public void i_click_on_calculate_button_on_affordability_calculator_tab() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("I will get the result")
//    public void i_will_get_the_result() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("I move Ratio Slider to Left to see the changes in my mortgage affordability ratio")
//    public void i_move_ratio_slider_to_left_to_see_the_changes_in_my_mortgage_affordability_ratio() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("I should be able to see new Total Home Cost")
//    public void i_should_be_able_to_see_new_total_home_cost() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @When("I go to Affordability Calculator")
//    public void i_go_to_affordability_calculator() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("I fill in the required fields")
//    public void i_fill_in_the_required_fields(io.cucumber.datatable.DataTable dataTable) {
//        // Write code here that turns the phrase above into concrete actions
//        // For automatic transformation, change DataTable to one of
//        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//        // Double, Byte, Short, Long, BigInteger or BigDecimal.
//        //
//        // For other transformations you can register a DataTableType.
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("I click on Calculate button on affordability calculator tab")
//    public void i_click_on_calculate_button_on_affordability_calculator_tab() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("I will get the result")
//    public void i_will_get_the_result() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("I move Ratio Slider to Right to see the changes in my mortgage affordability ratio")
//    public void i_move_ratio_slider_to_right_to_see_the_changes_in_my_mortgage_affordability_ratio() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("I should be able to see new Total Home Cost")
//    public void i_should_be_able_to_see_new_total_home_cost() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }





}
