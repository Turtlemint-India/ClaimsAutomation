package com.qa.turtlemint.pages.MedWorkINIT;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
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
    @FindBy(xpath = "//div[@class='MuiFormControl-root MuiTextField-root css-1e5j6jq']")
    WebElement EmergencyLocation;

    @FindBy(xpath = "//p[text()='Medical Assistance']//following::textarea[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMultiline MuiInputBase-inputAdornedEnd css-v59wfm'][1]")
    WebElement EmergencyLctSend;

    @FindBy(xpath = "//span[text()='Near Emergency Location']")
    WebElement NearEmergencyLocation;

    @FindBy(xpath = "//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']")
    WebElement CustomerPinCode;

    @FindBy(xpath = "//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl css-1v4ccyo']")
    WebElement CustomerPinCodeTap;
    @FindBy(xpath = "//p[text()='Medical Assistance']//following::div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl css-1v4ccyo'][2]")
    WebElement HospitalNameTap;

    @FindBy(xpath = "//p[text()='Medical Assistance']//following::input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'][2]")
    WebElement HospitalName;
    @FindBy(xpath = "//p[text()='Medical Assistance']//following::div[@class='MuiFormControl-root MuiTextField-root css-1e5j6jq'][4]")
    WebElement HospitalAddressTap;
    @FindBy(xpath = "//p[text()='Medical Assistance']//following::textarea[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMultiline MuiInputBase-inputAdornedEnd css-v59wfm'][3]")
    WebElement HospitalAddress;

    @FindBy(xpath = "//p[text()='Medical Assistance']//following::input[@value='yes'][2]")
    WebElement PickupYes;

    @FindBy(xpath = "//button[text()='Continue to Workshop Selection']")
    WebElement WorkshopSelection;

    @FindBy(xpath = "//p[text()='Incident Details']//following::p[text()='Medical Assistance'][1]")
    WebElement Assert1test;




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
        Thread.sleep(3500);
        TestUtil.sendKeys(EmergencyLctSend,"Mumbai","EmergencyLocation is Entered");
        TestUtil.waitUntilVisibilityOfElement(NearEmergencyLocation);
        LogUtils.info("NearEmergencyLocation is visible");
        TestUtil.click(NearEmergencyLocation,"Clicked on NearEmergencyLocation Radio button");
      //  TestUtil.waitUntilVisibilityOfElement(CustomerPinCode);
     //   TestUtil.IsDisplayed(CustomerPinCode,"CustomerPinCode is displayed");
        TestUtil.click(CustomerPinCodeTap,"Clicked on CustomerPinCodebox");
        TestUtil.sendKeys(CustomerPinCode,"401209","CustomerPinCode is Entered");
      //  TestUtil.waitUntilVisibilityOfElement(HospitalNameTap);
     //   TestUtil.IsDisplayed(HospitalName,"HospitalName is displayed ");
        Thread.sleep(1500);
        TestUtil.click(HospitalNameTap,"Clicked on HospitalNameBox");
        TestUtil.sendKeys(HospitalName,"Tata Hospital","HospitalName is Entered");
     //   TestUtil.waitUntilVisibilityOfElement(HospitalAddress);
     //   TestUtil.IsDisplayed(HospitalAddress,"HospitalAddress is displayed ");
        TestUtil.click(HospitalAddressTap,"Clicked on HospitalAddress");
        TestUtil.sendKeys(HospitalAddress," Sv Road ,Tutu Road","HospitalAddress is Entered");
        TestUtil.waitUntilVisibilityOfElement(PickupYes);
     //   TestUtil.IsDisplayed(PickupYes,"PickupYes is displayed ");
        TestUtil.click(PickupYes,"Clicked on Pickup--->Yes Radio button");
        LogUtils.info("Have Successfully filled all the detail with Move-forward approach ");
    }

    public void VerifyWorkShopButton()
    {
        TestUtil.waitUntilVisibilityOfElement(WorkshopSelection);
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
        TestUtil.IsDisplayed(EmergencyLocation,"EmergencyLocation field is displayed");
        TestUtil.sendKeys(EmergencyLocation,"Mumbai","EmergencyLocation is Entered");
        TestUtil.waitUntilVisibilityOfElement(NearEmergencyLocation);
        TestUtil.IsDisplayed(NearEmergencyLocation,"NearEmergencyLocation field is displayed");
        TestUtil.sendKeys(NearEmergencyLocation,"Borivali","NearEmergencyLocation is Entered");
        TestUtil.waitUntilVisibilityOfElement(CustomerPinCode);
        TestUtil.IsDisplayed(CustomerPinCode,"CustomerPinCode is displayed");
        TestUtil.sendKeys(CustomerPinCode,"401209","CustomerPinCode is Entered");
        TestUtil.waitUntilVisibilityOfElement(HospitalName);
        TestUtil.IsDisplayed(HospitalName,"HospitalName is displayed ");
        TestUtil.sendKeys(HospitalName,"Tata Hospital","HospitalName is Entered");
        TestUtil.waitUntilVisibilityOfElement(HospitalAddress);
        TestUtil.IsDisplayed(HospitalAddress,"HospitalAddress is displayed ");
        TestUtil.sendKeys(HospitalAddress," Sv Road ,Tutu Road","HospitalAddress is Entered");
        TestUtil.waitUntilVisibilityOfElement(PickupYes);
        TestUtil.IsDisplayed(PickupYes,"PickupYes is displayed ");
        TestUtil.click(PickupYes,"Clicked on Pickup--->Yes Radio button");
        TestUtil.waitUntilVisibilityOfElement(WorkshopSelection);
        TestUtil.IsDisplayed(WorkshopSelection,"WorkshopSelection button is displayed");
        TestUtil.click(WorkshopSelection,"Clicked on WorkshopSelection Button");
        Thread.sleep(2500);

    }
}
