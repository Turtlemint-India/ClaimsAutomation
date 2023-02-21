package com.qa.turtlemint.pages.TestCase15to19Page;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrackFunctionalityPage extends TestBase{


    public TrackFunctionalityPage(){

        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//div[@class='MuiBox-root css-1d6k1hz']//div[1]//div[6]//img[1]")
    WebElement SelectClaim;
    @FindBy(xpath = "//p[text()='Claim Details /Incident Details']//parent::div//div//div//p")
    WebElement SelectClaimDropDown;
    @FindBy(xpath = "//p[normalize-space()='Pending']")
    WebElement SelectPending;
    @FindBy(xpath = "//input[@value=\"Pending from Insurer\"]//parent::span")
    WebElement SelectPendingFromInsurer;
    @FindBy(xpath = "//label[text()='Enter Comment']//parent::div//textarea")
    WebElement EnterText;
    @FindBy(xpath = "//button[text()='Mark Status ']")
    WebElement ClickOnmarkStatusPending;
    @FindBy(xpath = "//p[normalize-space()='On Hold']")
    WebElement SelectOnHold;
    @FindBy(xpath = "//button[normalize-space()='Mark Status On Hold']")
    WebElement MarkStatusOnHold;


    JavascriptExecutor js = (JavascriptExecutor) driver;


    public void DropDown(){
        TestUtil.click(SelectClaim,"Select Any Claim");
       // js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
        WebCommands.staticSleep(3000);
        TestUtil.click(SelectClaimDropDown,"Select Claim Drop Down");
        LogUtils.info("Observed the DropDown");
        TestUtil.click(SelectPending,"Select Pending From DropDown");
        TestUtil.click(SelectPendingFromInsurer,"Select Pending From Insurer");
        TestUtil.sendKeys(EnterText,"Pending","Pending From Insurer");
        WebCommands.staticSleep(3000);
        TestUtil.click(ClickOnmarkStatusPending,"Click on Mark Status Pending button");
        WebCommands.staticSleep(3000);
        TestUtil.click(SelectClaimDropDown,"Select Claim Drop Down");
        TestUtil.click(SelectOnHold," Select on Hold From Drop Down");
        TestUtil.sendKeys(EnterText,"On Hold","Mark Status On Hold");
        WebCommands.staticSleep(3000);
        TestUtil.click(MarkStatusOnHold,"Mark Status On Hold");





    }



}
