package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PenFedTitlePage {

    public PenFedTitlePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath="//span[@data-id='Mortgages']")
    public WebElement MortgageAndHomeEquity;

    @FindBy(xpath = "//a[@data-clickid='PF-BTN-CLK-MORTGAGES-PENFED_TITLE']")
    public WebElement PenFedTittleLLC;

    @FindBy(xpath = "//a[@id='continue']")
    public WebElement continueButton;



    public void navigateToMortgageCalculators(){
        MortgageAndHomeEquity.click();
        PenFedTittleLLC.click();
    }


}
