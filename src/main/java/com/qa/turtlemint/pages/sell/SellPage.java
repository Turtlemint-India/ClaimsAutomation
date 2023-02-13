package com.qa.turtlemint.pages.sell;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SellPage extends TestBase {

    @FindBy(xpath = "//span[text()='Car']")
    WebElement fw;

    @FindBy(xpath = "//div[text()='Four Wheelers']")
    WebElement displayFourWheelers;

    @FindBy(xpath = "//span[text()='Bike']")
    WebElement tw;

    @FindBy(xpath = "//div[text()='Two Wheelers']")
    WebElement displayTwoWheelers;

    @FindBy(xpath = "//span[text()='Commercial Vehicle']")
    WebElement cv;

    @FindBy(xpath = "//div[text()='Commercial Vehicle']")
    WebElement displayCV;

    @FindBy(xpath = "//span[text()='Health']")
    WebElement health;

    @FindBy(xpath = "//div[text()='Health Insurance']")
    WebElement displayHealthInsurance;

    @FindBy(xpath = "//div[text()='Super Top-up']")
    WebElement displaySuperTopUp;

    @FindBy(xpath = "//div[text()='Personal Accident']")
    WebElement displayPersonalAccident;

    @FindBy(xpath = "//span[text()='Personal Accident']")
    WebElement personalAccident;

    @FindBy(xpath = "//button[@aria-label='Close']")
    WebElement xButton;

    @FindBy(xpath = "//span[text()='PA Covers These Types Of Accidents']")
    WebElement displayPA;

    @FindBy(xpath = "//span[text()='Term Life']")
    WebElement termLife;

    @FindBy(xpath = "//div[text()='Term Life']")
    WebElement displayTermLife;

    @FindBy(xpath = "//div[text()='Investment']")
    WebElement displayInvestment;

    @FindBy(xpath = "//div[text()='Child Saving']")
    WebElement displayChildSaving;

    @FindBy(xpath = "//div[text()='Retirement']")
    WebElement displayRetirement;

    @FindBy(xpath = "//div[text()='PoS Product']")
    WebElement displayPosProduct;

    @FindBy(xpath = "//span[text()='Mutual Funds']")
    WebElement mf;

    @FindBy(xpath = "//img[@alt='Turtlemint Money Logo']")
    WebElement displayMF;

    @FindBy(xpath = "//span[text()='Life - Investment']")
    WebElement life_investment;

    @FindBy(xpath = "//span[text()='Mobile']")
    WebElement mobile;

    @FindBy(xpath = "//h1[contains(text(),'Safeguard your phone with')]")
    WebElement displayTrinng;

    public SellPage() {
        PageFactory.initElements(driver, this);
    }

    public void validateFWMotorClick() {
        TestUtil.click(fw,"Four Wheeler Clicked");
        WebCommands.staticSleep(7000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(displayFourWheelers,"Checking if Four Wheeler Page is Opened");
    }

    public void validateTWMotorClick() {
        TestUtil.click(tw,"Two Wheeler Clicked");
        WebCommands.staticSleep(7000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(displayTwoWheelers,"Checking if Two Wheeler Page is Opened");
    }

    public void validateCVMotorClick() {
        TestUtil.click(cv,"Commercial Vehicle Clicked");
        WebCommands.staticSleep(7000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(displayCV,"Checking if CV Page is Opened");
    }

    public void validateHealthClick() {
        TestUtil.click(health,"Health Vertical Clicked");
        WebCommands.staticSleep(7000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(displayHealthInsurance,"Checking if Health Insurance Card is Present");
        TestUtil.IsDisplayed(displaySuperTopUp,"Checking if Super Top Up Card is Present");
        TestUtil.IsDisplayed(displayPersonalAccident,"Checking if Personal Accident Card is Present");
    }

    public void validatePersonalAccidentClick() {
        TestUtil.click(personalAccident,"Personal Accident Clicked");
        TestUtil.getScreenShot();
        TestUtil.click(xButton,"Closed Banner");
        TestUtil.IsDisplayed(displayPA,"Checking if Personal Accident Page is Opened");
    }

    public void validateTermLifeClick() {
        TestUtil.click(termLife,"Term Life Clicked");
        WebCommands.staticSleep(7000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(displayTermLife,"Checking if Term Life Card is Present");
        TestUtil.IsDisplayed(displayInvestment,"Checking if Investment Card is Present");
        TestUtil.IsDisplayed(displayChildSaving,"Checking if Child Saving Card is Present");
        TestUtil.IsDisplayed(displayRetirement,"Checking if Retirement Card is Present");
        TestUtil.IsDisplayed(displayPosProduct,"Checking if Pos Product card is Present");
    }

    public void validateMFClick() {
        TestUtil.click(mf,"Mutual Fund Clicked");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(displayMF,"Checking if Mutual Fund Page is Opened");
    }

    public void ValidateLifeInvestmentClick() {
        TestUtil.click(life_investment,"Life_Investment Clicked");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(displayTermLife,"Checking if Term Life Card is Present");
        TestUtil.IsDisplayed(displayInvestment,"Checking if Investment Card is Present");
        TestUtil.IsDisplayed(displayChildSaving,"Checking if Child Saving Card is Present");
        TestUtil.IsDisplayed(displayRetirement,"Checking if Retirement Card is Present");
        TestUtil.IsDisplayed(displayPosProduct,"Checking if Pos Product card is Present");
    }

    public void ValidateMobileClick() {
        TestUtil.click(mobile,"Mobile Clicked");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(displayTrinng,"Checking if Mobile Page is Opened");
    }

    public void unverifiedUserSellPage(){
        try{
            TestUtil.click(mobile,"Mobile Clicked");
            WebCommands.staticSleep(1000);
            TestUtil.getScreenShot();
        }
        catch(Exception e){
            System.out.println("Since it is a Non-Verified user, Mobile Button will not be Visible");
        }
    }

}