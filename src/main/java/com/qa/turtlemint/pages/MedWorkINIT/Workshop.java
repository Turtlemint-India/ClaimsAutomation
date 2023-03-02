package com.qa.turtlemint.pages.MedWorkINIT;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Workshop extends TestBase
{
    public Workshop() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//p[text()='Claim Details /Workshop Selection']//following::p[text()='Workshop Selection']")
    WebElement WorkshopVerify;

    @FindBy(xpath = "//p[text()='Claim Details /Workshop Selection']//following::span[text()='Select if workshop city is same as emergency city']")
    WebElement WorkshopChkBox;

    @FindBy(xpath = "//input[@class='MuiInputBase-input MuiOutlinedInput-input Mui-disabled css-1x5jdmq']")
    WebElement WorkshopCity;

    @FindBy(xpath = "//p[text()='Workshop Selection- Roadside Assistance']//following::div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl css-1v4ccyo'][2]")
    WebElement WorkshopNameTap;

    @FindBy(xpath = "//p[text()='Workshop Selection- Roadside Assistance']//following::input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'][2]")
    WebElement WorkshopName;

    @FindBy(xpath = "//p[text()='Workshop Selection- Roadside Assistance']//following::div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl css-1v4ccyo'][3]")
    WebElement WorkShopAddressTap;

    @FindBy(xpath = "//p[text()='Workshop Selection- Roadside Assistance']//following::input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'][3]")
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

    @FindBy(xpath = "//div[@class='MuiInputAdornment-root MuiInputAdornment-positionEnd MuiInputAdornment-outlined MuiInputAdornment-sizeMedium css-3rd0pq']")
    WebElement SelectWorkShop;

    @FindBy(xpath = "//p[text()='Claim Details /Intimate Insurer']//following::p[text()='Intimate Insurer'][2]")
    WebElement IntimateInsurerVerify;

    @FindBy(xpath = "//*[local-name()='svg' and @data-testid='CloseIcon']/*[local-name()='path']")
    WebElement CancelIcon;



    public void WorkshopPageVerify()throws Exception
    {
        Thread.sleep(2500);
      //  TestUtil.waitUntilVisibilityOfElement(WorkshopVerify);
      //  TestUtil.IsDisplayed(WorkshopVerify,"WorkshopPage is displayed");
        String Original=WorkshopVerify.getText();
        String Expected="Workshop Selection";
        Assert.assertEquals(Original,Expected);
        LogUtils.info("WorkshopVerify page tab with text properly displayed");
    }

    public void CheckboxFunctionality()
    {
        TestUtil.click(WorkshopChkBox,"Clicked on WorkshopChkBox");
        LogUtils.info("Workshopchkbox radio button is clicked");
        String ActualCityName=WorkshopCity.getAttribute("value");
        String ExpectedCityName="Borivali";
        SoftAssert ac=new SoftAssert();
        ac.assertEquals(ActualCityName,ExpectedCityName);
        LogUtils.info("City name is equal at Workshop and Medical Page");
    }
    public void WorkShopSelection()throws Exception
    {

        TestUtil.click(SelectWorkShop,"Clicked on SelectWorkShop");
        if(NoWorkshopVerify.isEnabled())
        {
            LogUtils.info("No workshop is available for this city,so adding manually");
            Actions ac=new Actions(driver);
            ac.moveToElement(CancelIcon).click().build().perform();
            Thread.sleep(1500);
            TestUtil.click(WorkshopNameTap,"Clicked on WorkshopNameBox");
            TestUtil.sendKeys(WorkshopName,"Punjabi Garage","WorkshopName is Entered");
        }
        else
        {
            LogUtils.info("Selection from list");
        }
        WorkshopName.sendKeys(Keys.TAB);
     //   TestUtil.click(WorkShopAddressTap,"Clicked on WorkShopAddressBox");
        TestUtil.sendKeys(WorkShopAddress,"Barbie Road Kurla","WorkShopAddress is Entered");

    }

    public void SaveAndProceedVerify()
    {
        Actions ac=new Actions(driver);
        ac.moveToElement(WorkshopCashLessYes).click().build().perform();
        Actions ac1=new Actions(driver);
        ac1.moveToElement(RentalCarServiceYes).click().build().perform();
        if(SaveAndProceed.isEnabled()&&SaveAndProceed.isDisplayed())
        {
            LogUtils.info("SaveAndProceed button is Enabled and Displayed");
        }
        else
        {
            LogUtils.info("SaveAndProceed button is Not Enabled and Displayed");
        }

    }
    public void WorkShopPageFill()throws Exception
    {
        TestUtil.click(WorkshopChkBox,"Clicked on WorkshopChkBox");
        LogUtils.info("Workshopchkbox radio button is clicked");
        TestUtil.click(SelectWorkShop,"Clicked on SelectWorkShop");
        if(NoWorkshopVerify.isEnabled())
        {
            LogUtils.info("No workshop is available for this city,so adding manually");
            Actions ac=new Actions(driver);
            ac.moveToElement(CancelIcon).click().build().perform();
            Thread.sleep(1500);
            TestUtil.click(WorkshopNameTap,"Clicked on WorkshopNameBox");
            TestUtil.sendKeys(WorkshopName,"Punjabi Garage","WorkshopName is Entered");
        }
        else
        {
            LogUtils.info("Selection from list");
        }
        WorkshopName.sendKeys(Keys.TAB);
        LogUtils.info("Clicked on Workshop Box");
        TestUtil.sendKeys(WorkShopAddress,"Barbie Road Kurla","WorkShopAddress is Entered");
        Actions ac=new Actions(driver);
        ac.moveToElement(WorkshopCashLessYes).click().build().perform();
        Actions ac1=new Actions(driver);
        ac1.moveToElement(RentalCarServiceYes).click().build().perform();
        TestUtil.click(SaveAndProceed,"Clicked on SaveAndProceed Button");
        Thread.sleep(3500);
    }

}
