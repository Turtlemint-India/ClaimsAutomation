package com.qa.turtlemint.pages.MedWorkINIT;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Workshop extends TestBase
{
    public Workshop() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//p[text()='Claim Details /Workshop Selection']//following::p[text()='Workshop Selection']")
    WebElement WorkshopVerify;

    @FindBy(xpath = "//p[text()='Claim Details /Workshop Selection']//following::span[text()='Select if workshop city is same as emergency city']")
    WebElement WorkshopChkBox;

    @FindBy(xpath = "//input[@id=':r13:']")
    WebElement WorkshopCity;

    @FindBy(xpath = "//input[@id=':r3l:']")
    WebElement WorkshopName;

    @FindBy(xpath = "//input[@id=':r3m:']")
    WebElement WorkShopAddress;

    @FindBy(xpath = "//p[text()='Workshop Selection- Roadside Assistance']//following::input[@value='yes'][1]")
    WebElement WorkshopCashLessYes;

    @FindBy(xpath = "//p[text()='Workshop Selection- Roadside Assistance']//following::input[@value='yes'][2]")
    WebElement RentalCarServiceYes;

    @FindBy(xpath = "//div[@class='MuiInputAdornment-root MuiInputAdornment-positionEnd MuiInputAdornment-outlined MuiInputAdornment-sizeMedium css-3rd0pq']")
    WebElement select ;
    @FindBy(xpath = "//p[text()='No workshops available for this City and Insurer.']")
    WebElement NoWorkshopVerify;

    @FindBy(xpath = "//button[text()='Save & Proceed']")
    WebElement SaveAndProceed;

    public void WorkshopPageVerify()
    {
        TestUtil.waitUntilVisibilityOfElement(WorkshopVerify);
      //  TestUtil.IsDisplayed(WorkshopVerify,"WorkshopPage is displayed");
        String Original=WorkshopVerify.getText();
        String Expected="Workshop Selection";
        Assert.assertEquals(Original,Expected);
        LogUtils.info("WorkshopVerify page tab with text properly displayed");
    }

    public void CheckboxFunctionality()
    {
        String ActualCityName=WorkshopCity.getAttribute("value");
        String ExpectedCityName="Borivali";
        Assert.assertEquals(ActualCityName,ExpectedCityName);
        LogUtils.info("City name is equal at Workshop and Medical Page");
    }
    public void WorkShopSelection()
    {
        Actions Ac=new Actions(driver);
        Ac.moveToElement(WorkshopChkBox).click().build().perform();
        LogUtils.info("Workshopchkbox radio button is clicked");
        TestUtil.sendKeys(WorkshopName,"Punjabi Garage","WorkshopName is Entered");
        TestUtil.sendKeys(WorkShopAddress,"Barbie Road Kurla","WorkShopAddress is Entered");
        driver.navigate().refresh();
    }

    public void SaveAndProceedVerify()
    {
        Actions Ac=new Actions(driver);
        Ac.moveToElement(WorkshopChkBox).click().build().perform();
        LogUtils.info("Workshopchkbox radio button is clicked");
        // city is getting auto fetched
        TestUtil.sendKeys(WorkshopName,"Punjabi Garage","WorkshopName is Entered");
        TestUtil.sendKeys(WorkShopAddress,"Barbie Road Kurla","WorkShopAddress is Entered");
        TestUtil.click(WorkshopCashLessYes,"Clicked on WorkshopCashLessYes Radio button");
        TestUtil.click(RentalCarServiceYes,"Clicked on RentalCarServiceYes Radio button");
        if(SaveAndProceed.isEnabled()&&SaveAndProceed.isDisplayed())
        {
            LogUtils.info("SaveAndProceed button is Enabled and Displayed");
        }
        else
        {
            LogUtils.info("SaveAndProceed button is Not Enabled and Displayed");
        }

       // Assert.assertEquals();
    }
    public void WorkShopPageFill()
    {
        Actions Ac=new Actions(driver);
        Ac.moveToElement(WorkshopChkBox).click().build().perform();
        LogUtils.info("WorkshopChkbox radio button is clicked");
        TestUtil.sendKeys(WorkshopName,"Punjabi Garage","WorkshopName is Entered");
        TestUtil.sendKeys(WorkShopAddress,"Barbie Road Kurla","WorkShopAddress is Entered");
        TestUtil.click(WorkshopCashLessYes,"Clicked on WorkshopCashLessYes Radio button");
        TestUtil.click(RentalCarServiceYes,"Clicked on RentalCarServiceYes Radio button");
        TestUtil.click(SaveAndProceed,"Clicked on Save And Proceed");
    }

}
