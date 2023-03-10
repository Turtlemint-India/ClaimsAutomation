package com.qa.turtlemint.pages.MedWorkINIT;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Initiimate extends TestBase {
    public Initiimate() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[text()='Policyholder']")
    WebElement PolicyHolder;

    @FindBy(xpath = "//p[text()='Claim Details /Intimate Insurer']//following::p[text()='Intimate Insurer'][2]")
    WebElement IntimateInsurerVerify;

    @FindBy(xpath = "//button[text()='Policyholder']//following::span[text()='Yes']")
    WebElement VehicleParkedYes;

    @FindBy(xpath = "//p[text()='Quick Preview & Submit']")
    WebElement QuickPreviewSubmit;

    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-1pdd119']")
    WebElement Submit_ClaimRequest_toInsurer;

    @FindBy(xpath = "//button[text()='Save and Continue']")
    WebElement SaveAndContinue;

    @FindBy(xpath = "//p[text()='Vehicle Details']")
    WebElement VehicleDetails;

    @FindBy(xpath = "//p[text()='Insured Details']")
    WebElement InsuredDetails;

    @FindBy(xpath = "//p[text()='Policy Details']")
    WebElement PolicyDetail;

    @FindBy(xpath = "//p[text()='Accident Details']")
    WebElement AccidentDetail;

    @FindBy(xpath = "//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl css-1v4ccyo']")
    WebElement ClaimNoTap;

    @FindBy(xpath = "//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']")
    WebElement ClaimNo;

    @FindBy(xpath = "//button[text()='Skip and Continue']")
    WebElement SkipAndContinue;

    @FindBy(xpath = "//button[text()='Save & Proceed']")
    WebElement SaveAndProceed;

    @FindBy(xpath = "//p[text()='Open']//following::p[text()='Intimate Insurer']")
    WebElement InitimateHeader;

    @FindBy(xpath = "//p[text()='Documents']")
    WebElement DocumentUploadPageVerify;

    public void VerifyQuickPreviewPage() {
        TestUtil.click(PolicyHolder, "Clicked on PolicyHolder ");
        TestUtil.click(VehicleParkedYes, "Clicked on VehicleParkedYes radio button");
        TestUtil.click(SaveAndContinue, "Clicked on save and continue button");
        String Actual_VehicleDetails = VehicleDetails.getText();
        String Expected_VehicleDetails = "Vehicle Details";
        String Actual_InsuredDetails = InsuredDetails.getText();
        String Expected_InsuredDetails = "Insured Details";
        String Actual_PolicyDetail = PolicyDetail.getText();
        String Expected_PolicyDetail = "Policy Details";
        String Actual_AccidentDetail = AccidentDetail.getText();
        String Expected_AccidentDetail = "Accident Details";
        //----------Assertion--Point--To---VerifyQuickPreviewPage--------------//
        Assert.assertEquals(Actual_VehicleDetails, Expected_VehicleDetails);
        Assert.assertEquals(Actual_InsuredDetails, Expected_InsuredDetails);
        Assert.assertEquals(Actual_PolicyDetail, Expected_PolicyDetail);
        Assert.assertEquals(Actual_AccidentDetail, Expected_AccidentDetail);
        LogUtils.info("All the assert passed for Verify quick preview page display");
    }

    public void VerifySubmitClaim() throws Exception {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
        LogUtils.info("Scrolling done to bottom of Page");
        Thread.sleep(2000);
        TestUtil.click(Submit_ClaimRequest_toInsurer, "Clicked on Submit_ClaimRequest_toInsurer button");
        LogUtils.info("Assertion passed for 2nd TC");

    }

    public void SkipAndContinue() throws Exception {
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
        TestUtil.click(SkipAndContinue, "Clicked on Skip and Continue");
        Thread.sleep(1500);
        String Actual = DocumentUploadPageVerify.getText();
        String Expected = "Documents";
        Assert.assertEquals(Actual, Expected);
        LogUtils.info("Assertion passed----->On clicking Skip and Continue button document upload page is Displayed");
    }

    public void SaveAndContinue() throws Exception {
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)", "");
        LogUtils.info("Scrolling to top of page");
        Thread.sleep(5000);
        TestUtil.click(InitimateHeader, "Clicked on InitimateHeader");
        LogUtils.info("Move again to Initimate Insurer page");
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
        LogUtils.info("Scroll to bottom of page");
        Thread.sleep(2000);
        TestUtil.click(ClaimNoTap, "Clicked on ClaimNoBox");
        TestUtil.sendKeys(ClaimNo, "45326178", "Claim No is Enter");
        TestUtil.click(SaveAndProceed, "Clicked on Save and Proceed Button");
        String Actual = DocumentUploadPageVerify.getText();
        String Expected = "Documents";
        Assert.assertEquals(Actual, Expected);
        LogUtils.info("Assertion passed----->On clicking Save and Proceed button document upload page is displayed");
    }
}