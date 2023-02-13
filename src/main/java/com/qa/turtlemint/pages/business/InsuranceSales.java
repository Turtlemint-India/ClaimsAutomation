package com.qa.turtlemint.pages.business;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class InsuranceSales extends TestBase {

    public InsuranceSales() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Grow']")
    WebElement Grow;

    @FindBy(xpath = "//span[normalize-space()='Business']")
    WebElement Business;

    @FindBy(xpath = "//span[contains(text(),'Insurance Sales')]")
    WebElement InsuranceSales;

    @FindBy(xpath = "//div[@class=\"style__PolicyDetailsContainer-sc-3x9aob-0 cnRqYF\"]")
    WebElement ClickOn1stLead;

    @FindBy(xpath = "//*[text()=\"View Policy\"]")
    WebElement ViewPolicyButton;

    @FindBy(xpath = "//*[text()=\"Share Policy\"]")
    WebElement SharePolicyButton;

    @FindBy(xpath = "//*[text()=\"Send\"]")
    WebElement SendButton;

    @FindBy(xpath = "//span[normalize-space()='Business']")
    WebElement Business1;

    @FindBy(xpath = "//span[contains(text(),'Mutual Fund Sales')]")
    WebElement MutualFundSaleButton;

    @FindBy(xpath = "//img[@class=\"back-mintpro\"]")
    WebElement BacktoMintpro;

    @FindBy(xpath = "//span[normalize-space()='Business']")
    WebElement Business2;

    @FindBy(xpath = "//span[contains(text(),'Activity Points')]")
    WebElement ActvityPointsButton;

    @FindBy(xpath = "//*[text()=\"Download Statement\"]")
    WebElement DownloadStatementButton;

    @FindBy(xpath = "(//label[@class=\"customChkRadioBtn\"])[1]")
    WebElement ClickonMonths;

    @FindBy(xpath = "(//label[@class=\"customChkRadioBtn\"])[2]")
    WebElement ClickonMonth1;

    @FindBy(xpath = "(//label[@class=\"customChkRadioBtn\"])[3]")
    WebElement ClickonMonths2;

    @FindBy(xpath = "(//label[@class=\"customChkRadioBtn\"])[4]")
    WebElement ClickonMonths3;

    @FindBy(xpath = "(//label[@class=\"customChkRadioBtn\"])[5]")
    WebElement ClickonMonths4;

    @FindBy(xpath = "(//label[@class=\"customChkRadioBtn\"])[6]")
    WebElement ClickonMonths5;

    @FindBy(xpath = "//span[contains(text(),'Performance Report')]")
    WebElement PerformanceReportButton;

    @FindBy(xpath = "//span[text()='Renewal Business']")
    WebElement RenewalBusinessButton;

    public void InsurnaceSalesFlow() {
        TestUtil.click(Grow, "grow button");
        WebCommands.staticSleep(5000);
        TestUtil.click(Business, "Click on Business button");
        WebCommands.staticSleep(2000);
        TestUtil.click(InsuranceSales, "Click on Insurance Sale DropDown");
        WebCommands.staticSleep(2000);
        try {
            TestUtil.click(ClickOn1stLead, "Click on 1st Lead");
            WebCommands.staticSleep(2000);
            TestUtil.click(ViewPolicyButton, "Click on View Policy Button");
            WebCommands.staticSleep(2000);
            String url = driver.getCurrentUrl();
            driver.switchTo().newWindow(WindowType.TAB);
            WebCommands.staticSleep(5000);
            driver.get(url);
            WebCommands.staticSleep(5000);
            TestUtil.click(ClickOn1stLead, "Click on 1st Lead");
            WebCommands.staticSleep(2000);
            TestUtil.click(SharePolicyButton, "Click on Share policy Button");
            WebCommands.staticSleep(3000);
            TestUtil.click(SendButton, "Click on send Button");
            WebCommands.staticSleep(3000);
            TestUtil.getScreenShot();
            Assert.assertEquals("Policy Sent", "Policy Sent");
            WebCommands.staticSleep(3000);
            TestUtil.getScreenShot();
        } catch (Exception e) {
            System.out.println("Lead not found" + e);
        }
    }

    public void MutualFundSalesFlow() throws InterruptedException {
        try {
            TestUtil.click(Business, "click On Buisness Button");
            TestUtil.click(MutualFundSaleButton, "Click on Mutual Fund Sales button");
            WebCommands.staticSleep(2000);
            TestUtil.click(BacktoMintpro, "Back to Mintpro Home Page");
            WebCommands.staticSleep(2000);
            TestUtil.getScreenShot();
        } catch (Exception e) {
            System.out.println("Lead not found" + e);
        }
    }

    public void ActivityPointFlow() throws InterruptedException {
        try {
            TestUtil.click(Business2, "click On Buisness Button");
            TestUtil.click(ActvityPointsButton, "Click on Activity Points Button");
            TestUtil.click(DownloadStatementButton, "Download Statement");
            TestUtil.click(ClickonMonths, "Check months");
            WebCommands.staticSleep(1000);
            TestUtil.getScreenShot();
            TestUtil.click(ClickonMonth1, "Check months");
            WebCommands.staticSleep(1000);
            TestUtil.getScreenShot();
            TestUtil.click(ClickonMonths2, "Check months");
            WebCommands.staticSleep(1000);
            TestUtil.getScreenShot();
            TestUtil.click(ClickonMonths3, "Check months");
            WebCommands.staticSleep(1000);
            TestUtil.getScreenShot();
            TestUtil.click(ClickonMonths4, "Check months");
            WebCommands.staticSleep(1000);
            TestUtil.getScreenShot();
            TestUtil.click(ClickonMonths5, "Check months");
            WebCommands.staticSleep(1000);
            TestUtil.getScreenShot();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void PerformanceReport() throws InterruptedException {
        try {
            TestUtil.click(Business, "Click on Business button");
            WebCommands.staticSleep(2000);
            TestUtil.getScreenShot();
            TestUtil.click(PerformanceReportButton, "Click on Performance report");
            WebCommands.staticSleep(2000);
            TestUtil.getScreenShot();
        } catch (Exception e) {
            System.out.println("User not verified" + e);
        }

    }
    public void RenewalBusiness() throws InterruptedException {
        try {
            TestUtil.click(Business, "Click on Business button");
            WebCommands.staticSleep(2000);
            RenewalBusinessButton.isDisplayed();
            TestUtil.getScreenShot();
            TestUtil.click(RenewalBusinessButton, "Click on Renewal Business report");
            WebCommands.staticSleep(2000);
            TestUtil.getScreenShot();
            System.out.println("Business Flow completed");
        } catch (Exception e) {
            System.out.println("Unable to Find Renewal business in business tab" + e);
        }
    }

}