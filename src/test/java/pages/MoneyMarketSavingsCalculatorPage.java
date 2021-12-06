package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MoneyMarketSavingsCalculatorPage {
    public MoneyMarketSavingsCalculatorPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='https://www.penfed.org/calculators/money-market-savings-calculator']")
    public WebElement moneyMarketSavingsCalculatorTab;

    @FindBy(xpath = "//div[@class='di']//input[@placeholder='5000']")
    public WebElement initialAmount;

    @FindBy(xpath = "//input[@id='#ct1_795946835_calcMMSA_txtAdditions']")
    public WebElement monthlyAdditions;

    @FindBy(xpath = "//input[@id='#ct1_795946835_calcMMSA_txtYears']")
    public WebElement numberOfYears;

    @FindBy(xpath = "//a[@type='button']")
    public WebElement calculateButton;
}
