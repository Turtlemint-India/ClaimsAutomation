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
    @FindBy(xpath = "//p[normalize-space()='Open']")
    WebElement SelectOpen;
    @FindBy(xpath = "//p[normalize-space()='Closed']")
    WebElement SelectClosed;
    @FindBy(xpath = "//button[normalize-space()='Paid']")
    WebElement SelectPaid;
    @FindBy(xpath = "//div[@role='presentation']//div[@role='radiogroup']//label[1]")
    WebElement SelectCashless;
    @FindBy(xpath = "//label[text()='Enter Settled Amount']//parent::div//input")
    WebElement EnterAmount;
    @FindBy(xpath = "//label[text()='Settlement Date']//parent::div//input")
    WebElement SettlementDate;
    @FindBy(xpath = "//input[@value=\"Insured\"]//parent::span")
    WebElement SelectInsured;
    @FindBy(xpath = "//button[normalize-space()='Mark Status Closed']")
    WebElement StatusClosed;
    @FindBy(xpath = "//button[normalize-space()='Closed']")
    WebElement SelectClosedbutton;
    @FindBy(xpath = "//input[@type=\"checkbox\"]//parent::span")
    WebElement ReasonforClosure;
    @FindBy(xpath = "//textarea[@placeholder=\"Reason text goes here\"]")
    WebElement SelectReasonforClosure;
    @FindBy(xpath = "//button[normalize-space()='Repudation']")
    WebElement SelectRepudation;
    @FindBy(xpath = "//button[normalize-space()='View Claims']")
    WebElement ClickOnViewClaims;
    @FindBy(xpath = "//div[@class=\"MuiInputBase-root MuiInputBase-colorPrimary css-1xw94na\"]//input")
    WebElement ClickonSearch;
    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeLarge css-1h0u48']//*[name()='svg']")
    WebElement EnterSearchButton;
    @FindBy(xpath = "//p[@class=\"MuiTypography-root MuiTypography-body1 css-vy40xg\"]")
    WebElement ClickonNewAssignee;
    @FindBy(xpath = "//input[@class=\"PrivateSwitchBase-input css-1m9pwf3\"]//parent::span")
    WebElement Selectassignee;

    JavascriptExecutor js = (JavascriptExecutor) driver;



    public void DropDownHOLD_PENDING(){

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
        WebCommands.staticSleep(3000);



    }

       public void DropDownClosed(){

        TestUtil.click(SelectClaimDropDown,"Select Claim Drop Down");
           TestUtil.click(SelectOpen,"Select OPen");
           TestUtil.click(SelectClaimDropDown,"Select Claim Drop Down");
           TestUtil.click(SelectClosed,"Select Closed DropDown");
           WebCommands.staticSleep(3000);
           TestUtil.click(SelectPaid,"Select Paid");
           TestUtil.click(SelectCashless,"Select Cashless");
           TestUtil.sendKeys(EnterAmount,"200","Enter Amount");
           WebCommands.staticSleep(3000);
           TestUtil.sendKeys(SettlementDate,TestUtil.PresentDate(),"Send Date");
           WebCommands.staticSleep(3000);
           TestUtil.click(SelectInsured,"Select Insured");
           TestUtil.click(StatusClosed,"Status Closed");
           WebCommands.staticSleep(3000);
           TestUtil.click(SelectClaimDropDown,"Select Claim Drop Down");
           TestUtil.click(SelectOpen,"Select OPen");
           TestUtil.click(SelectClaimDropDown,"Select Claim Drop Down");
           TestUtil.click(SelectClosed,"Select Closed DropDown");
           TestUtil.click(SelectClosedbutton,"Select Closed Button");
           TestUtil.click(ReasonforClosure,"Reason For closure");
           TestUtil.sendKeys(SelectReasonforClosure,"Status Mark as closed","Closing the request");
           TestUtil.click(StatusClosed,"Status Closed");
           WebCommands.staticSleep(3000);
           TestUtil.click(SelectClaimDropDown,"Select Claim Drop Down");
           TestUtil.click(SelectOpen,"Select OPen");
           TestUtil.click(SelectClaimDropDown,"Select Claim Drop Down");
           TestUtil.click(SelectClosed,"Select Closed DropDown");
           TestUtil.click(SelectRepudation,"Select Repudation");
           TestUtil.click(ReasonforClosure,"Reason For closure");
           TestUtil.sendKeys(SelectReasonforClosure,"Status Mark as closed","Closing the request");
           TestUtil.click(StatusClosed,"Status Closed");
           WebCommands.staticSleep(3000);

       }


       public void ViewClaim(){

           TestUtil.click(ClickOnViewClaims,"Click on View Cliams Button");
           TestUtil.getScreenShot();
           WebCommands.staticSleep(4000);
           TestUtil.sendKeys(ClickonSearch,"dfsf123","Search using policy Number");
           TestUtil.click(EnterSearchButton,"Enter Search Button");
           TestUtil.getScreenShot();
           WebCommands.staticSleep(4000);
           TestUtil.click(ClickonNewAssignee,"Click on Assignee");
           WebCommands.staticSleep(2000);
           TestUtil.click(Selectassignee,"Select New Assignee");
           WebCommands.staticSleep(2000);
           LogUtils.info("New assinee assigned");







       }




}
