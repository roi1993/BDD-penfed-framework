package stepDefinition;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.HomePage;
import utilities.Driver;

import java.security.Key;

public class SearchBoxStepDef {

    HomePage homePage=new HomePage();

    @Then("I click on search box")
    public void i_click_on_search_box() {
        homePage.SearchBox.click();

    }
    @Then("I enter {string}")
    public void i_enter(String Search) {
        homePage.SearchInput.sendKeys(Search+ Keys.ENTER);

    }
    @Then("I should be able to see all my options")
    public void i_should_be_able_to_see_all_my_options() throws InterruptedException {
        Thread.sleep(1000);
        //String actual= Driver.getDriver().findElement(By.id("searchTitle")).getText();
        String actual= Driver.getDriver().getTitle();
        String expected="Search PenFed.org";
        Assert.assertEquals(expected,actual);
    }



}
