package pages;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinition.PurchaseAlertsStepDef;
import utilities.Driver;

public class PurchaseAlertsPage {

    public PurchaseAlertsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-di-id='di-id-57dc8879-133be3b9']")
    public WebElement purchaseAlerts;

}
