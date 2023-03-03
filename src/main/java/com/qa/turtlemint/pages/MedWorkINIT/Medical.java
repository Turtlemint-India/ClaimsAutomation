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

public class Medical extends TestBase
{
    public Medical() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//label[text()='Emergency location ']//following::div//textarea[1]")
    WebElement EmergencyLocation;

    @FindBy(xpath = "//p[text()='Medical Assistance']//following::textarea[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMultiline MuiInputBase-inputAdornedEnd css-v59wfm'][1]")
    WebElement EmergencyLctSend;

    @FindBy(xpath = "//span[text()='Near Emergency Location']")
    WebElement NearEmergencyLocation;

    @FindBy(xpath = "//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']")
    WebElement CustomerPinCode;

 //   @FindBy(xpath = "//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl css-1v4ccyo']")
 //   WebElement CustomerPinCodeTap;

    @FindBy(xpath = "//p[text()='Select Hospital']//following::div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl css-1v4ccyo'][1]")
    WebElement CustomerPinCodeTap;


    @FindBy(xpath = "//p[text()='Select Hospital']//following::div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl css-1v4ccyo'][2]")
    WebElement HospitalNameTap;


    @FindBy(xpath = "//p[text()='Medical Assistance']//following::input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'][2]")
    WebElement HospitalName;
    @FindBy(xpath = "//label[text()='Enter Hospital Address']//following::div//textarea[1]")
    WebElement HospitalAddressTap;
    @FindBy(xpath = "//p[text()='Medical Assistance']//following::textarea[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMultiline MuiInputBase-inputAdornedEnd css-v59wfm'][3]")
    WebElement HospitalAddress;

    @FindBy(xpath = "//p[text()='Medical Assistance']//following::input[@value='yes'][2]")
    WebElement PickupYes;

    @FindBy(xpath = "//button[text()='Continue to Workshop Selection']")
    WebElement WorkshopSelection;

    @FindBy(xpath = "//p[text()='Incident Details']//following::p[text()='Medical Assistance'][1]")
    WebElement Assert1test;

    @FindBy(xpath = "//button[text()='Continue to Workshop Selection']")
    WebElement WorkShop;



    @FindBy(xpath = "")
    WebElement a5;

    @FindBy(xpath = "")
    WebElement a6;


    public void MedicalAsitancePageNavigation()
    {
        String Original=Assert1test.getText();
        String Expected="Medical Assistance";
        Assert.assertEquals(Original,Expected);
        LogUtils.info("TC1:-Assertion Passed for Medical Assitance Page display");
    }

    public void MoveForwardTest() throws Exception
    {
        Thread.sleep(4500);
     //   TestUtil.IsDisplayed(EmergencyLocation,"EmergencyLocation field is displayed");
        TestUtil.click(EmergencyLocation,"Clicked on EmergencyLocation tab");
        TestUtil.sendKeys(EmergencyLctSend,"Mumbai","EmergencyLocation is Entered");
        TestUtil.waitUntilVisibilityOfElement(NearEmergencyLocation);
        LogUtils.info("NearEmergencyLocation is visible");
        TestUtil.click(NearEmergencyLocation,"Clicked on NearEmergencyLocation Radio button");
        TestUtil.click(CustomerPinCodeTap,"Clicked on CustomerPinCodebox");
        TestUtil.sendKeys(CustomerPinCode,"401209","CustomerPinCode is Entered");
        Thread.sleep(1500);
        CustomerPinCode.sendKeys(Keys.TAB);
        TestUtil.sendKeys(HospitalName,"Tata Hospital","HospitalName is Entered");
        TestUtil.click(HospitalAddressTap,"Clicked on HospitalAddress");
        TestUtil.sendKeys(HospitalAddress," Sv Road ,Tutu Road","HospitalAddress is Entered");
     //   TestUtil.waitUntilVisibilityOfElement(PickupYes);
     //   TestUtil.IsDisplayed(PickupYes,"PickupYes is displayed ");
        Thread.sleep(1500);
     //   TestUtil.click(PickupYes,"Clicked on Pickup--->Yes Radio button");
        Actions ac=new Actions(driver);
        ac.moveToElement(PickupYes).click().build().perform();
        LogUtils.info("Have Successfully filled all the detail with Move-forward approach ");
    }

    public void VerifyWorkShopButton()
    {
        TestUtil.IsDisplayed(WorkshopSelection,"WorkshopSelection button is displayed");
        if(WorkshopSelection.isEnabled())
        {
            LogUtils.info("WorkshopSelection button is visible");
        }
        else
        {
            LogUtils.info("WorkshopSelection button is not visible");
        }
    }

    public void MedicalAsitancePage()throws Exception
    {
        Thread.sleep(1500);
        //   TestUtil.IsDisplayed(EmergencyLocation,"EmergencyLocation field is displayed");
        TestUtil.click(EmergencyLocation,"Clicked on EmergencyLocation tab");
        TestUtil.sendKeys(EmergencyLctSend,"Mumbai","EmergencyLocation is Entered");
        TestUtil.waitUntilVisibilityOfElement(NearEmergencyLocation);
        LogUtils.info("NearEmergencyLocation is visible");
        TestUtil.click(NearEmergencyLocation,"Clicked on NearEmergencyLocation Radio button");
        TestUtil.click(CustomerPinCodeTap,"Clicked on CustomerPinCodebox");
        TestUtil.sendKeys(CustomerPinCode,"401209","CustomerPinCode is Entered");
        Thread.sleep(1500);
        CustomerPinCode.sendKeys(Keys.TAB);
        TestUtil.sendKeys(HospitalName,"Tata Hospital","HospitalName is Entered");
        TestUtil.click(HospitalAddressTap,"Clicked on HospitalAddress");
        TestUtil.sendKeys(HospitalAddress," Sv Road ,Tutu Road","HospitalAddress is Entered");
        Thread.sleep(1500);
        Actions ac=new Actions(driver);
        LogUtils.info("Clicked on Pickup--->Yes Radio button");
        ac.moveToElement(PickupYes).click().build().perform();
        TestUtil.click(WorkshopSelection,"Clicked on WorkshopSelection Button");
        Thread.sleep(2500);

    }

    public void WorkShop()
    {
        TestUtil.click(WorkshopSelection, "Clicked on Workshop selection button");
    }
}
