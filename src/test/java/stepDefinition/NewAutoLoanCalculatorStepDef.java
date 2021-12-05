package stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import pages.HomePage;


public class NewAutoLoanCalculatorStepDef {
    HomePage homePage=new HomePage();


    @Then("I choose Auto")
    public void i_choose_auto() {


    }
    @Then("I choose Auto Loan Application")
    public void i_choose_auto_loan_application() {

    }
    @Then("I should be able to fill out all information")
    public void i_should_be_able_to_fill_out_all_information(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }
    @Then("I click on calculate button")
    public void i_click_on_calculate_button() {

    }
    @Then("I should be able to see estimated monthly payments")
    public void i_should_be_able_to_see_estimated_monthly_payments() {

    }
}
