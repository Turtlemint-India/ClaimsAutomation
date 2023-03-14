package com.qa.turtlemint.pages.IncidentDetail_Customer;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class IncidentDetail extends TestBase {

    public IncidentDetail() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[text()='Add A New Claim']")
    WebElement AddANewClaim;

    @FindBy(xpath = "//p[text()='Motor']")
    WebElement Motor;

    @FindBy(xpath = "//p[text()='Car']")
    WebElement Car;

    @FindBy(xpath = "//p[text()='Bike']")
    WebElement Bike;

    @FindBy(xpath = "//p[text()='CV']")
    WebElement CV;

    @FindBy(xpath = "//label[text()='Zendesk ID']//parent::div//input")
    WebElement ZendeskID;

    @FindBy(xpath = "//label[text()='Customer Name']//parent::div//input")
    WebElement CustomerName;

    @FindBy(xpath = "//label[text()='Customer Contact Number']//parent::div//input")
    WebElement CustomerContactNumber;

    @FindBy(xpath = "//p[text()='Please Enter Number Only']")
    WebElement errorPleaseEnterNumberOnly;

    @FindBy(xpath = "//p[text()='Please enter valid  Mobile Number.']")
    WebElement errorPleaseentervalidMobileNumber;

    @FindBy(xpath = "//div[text()='Please enter correct details!']\n")
    WebElement errorPolicy;

    @FindBy(xpath = "//label[text()='Enter Description Of Incident']//parent::div//textarea")
    WebElement EnterDescriptionOfIncident;

    @FindBy(xpath = "//label[text()='Claim Requester']//parent::div")
    WebElement ClaimRequester;

    @FindBy(xpath = "//li[text()='Partner']")
    WebElement Partner;

    @FindBy(xpath = "//label[text()='Pincode']//parent::div//input")
    WebElement PineCode;

    @FindBy(xpath = "//label[text()='City where accident happened']//parent::div//input")
    WebElement Citywhereaccidenthappened;

    @FindBy(xpath = "//button[text()='Accident']")
    WebElement Accident;

    @FindBy(xpath = "//button[text()='Fire']")
    WebElement Fire;

    @FindBy(xpath = "//button[text()='Own Damage']")
    WebElement OwnDamage;

    @FindBy(xpath = "//button[text()='Third Party']")
    WebElement ThirdParty;

    @FindBy(xpath = "//span[text()='Yes']")
    WebElement Yes;

    @FindBy(xpath = "//span[text()='No']")
    WebElement No;

    @FindBy(xpath = "//input[@aria-label=\"Choose date\"]")
    WebElement DateAndTimeForIncident;

    @FindBy(xpath = "//button[@aria-label=\"text input view is open, go to calendar view\"]")
    WebElement calandericon;

    @FindBy(xpath = "//button[@class=\"MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin MuiPickersDay-today css-wed0tz\"]")
    WebElement TodayDateSelect;

    @FindBy(xpath = "//button[@class=\"MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin MuiPickersDay-today css-wed0tz\"]//parent::div//parent::div//div")
    WebElement TwoDayBeforedate;

    @FindBy(xpath = "//p[text()='The delta for raising this claim is 2 days, please specify the reason for the delay.']")
    WebElement DeltaMsg;

    @FindBy(xpath = "//label[text()='Reason for delay']//parent::div//input")
    WebElement Reasonfordelay;

    @FindBy(xpath = "//button[text()='OK']")
    WebElement Ok;

    @FindBy(xpath = "//label[text()='Registration Number']//parent::div//input")
    WebElement RegNo;

    @FindBy(xpath = "//label[text()='Policy Number']//parent::div//input")
    WebElement PolicyNo;

    @FindBy(xpath = "//label[text()='Policy Number']//parent::div//button[text()='Fetch details']")
    WebElement FetchDetails;

    @FindBy(xpath = "//button[text()='Save as Draft']")
    WebElement SaveDraft;

    @FindBy(xpath = "//*[@aria-label=\"Copied\"]")
    WebElement TM_MIS_ID;

    @FindBy(xpath = "(//*[@aria-label=\"Copied\"])[2]")
    WebElement Claim_ID;

    @FindBy(xpath = "//p[text()='List of Claims']//parent::div//parent::div//button[@type=\"button\"]")
    WebElement KababMenu;

    @FindBy(xpath = "//*[text()=\"Delete Claims\"]")
    WebElement deleteClaims;

    @FindBy(xpath = "//p[text()='Automation Testing']//parent::em//parent::div//parent::div//parent::div//span//input[@type=\"checkbox\"]")
    WebElement CheckBox;

    @FindBy(xpath = "(//p[text()='Automation Testing']//parent::em//parent::div//parent::div//parent::div//span//input[@type=\"checkbox\"])[2]")
    WebElement CheckBox2;

    @FindBy(xpath = "//button[text()='Delete Claims']")
    WebElement DeleteClaimsButton;

    @FindBy(xpath = "//button[text()='Delete']")
    WebElement Delete;

    @FindBy(xpath = "//button[text()='Cancel']")
    WebElement Cancel;

    @FindBy(xpath = "//p[text()='Claim Details /Incident Details']//parent::div//div//div//p")
    WebElement statusdropdown;

    @FindBy(xpath = "//p[text()='Closed']")
    WebElement Closed;

    @FindBy(xpath = "//button[text()='Paid']")
    WebElement Paid;

    @FindBy(xpath = "//span[text()='Cashless']")
    WebElement Cashless;

    @FindBy(xpath = "//span[text()='Reimbursement']")
    WebElement Reimbursement;

    @FindBy(xpath = "//label[text()='Enter Settled Amount']//parent::div//input")
    WebElement EnterSettledAmount;

    @FindBy(xpath = "//label[text()='Settlement Date']//parent::div//input")
    WebElement settlmentDate;

    @FindBy(xpath = "//button[@class=\"MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin MuiPickersDay-today css-wed0tz\"]")
    WebElement TodayDateSettlment;

    @FindBy(xpath = "//span[text()=\"Insured\"]")
    WebElement Insured;

    @FindBy(xpath = "//button[text()=\"Mark Status Closed\"]")
    WebElement MarkAsClosed;

    @FindBy(xpath = "//button[normalize-space()='View Claims']")
    WebElement ClickOnViewClaims;

    @FindBy(xpath = "//button[text()='Closed']")
    WebElement Closedbtn;

    @FindBy(xpath = "//button[text()='Repudation']")
    WebElement Repudation;

    @FindBy(xpath = "//p[text()='Pending']")
    WebElement Pending;

    @FindBy(xpath = "//p[text()='On Hold']")
    WebElement OnHold;

    @FindBy(xpath = "//*[text()='Add Status']")
    WebElement AddStatus;

    JavascriptExecutor js = (JavascriptExecutor) driver;


    public void CustomerContactNo() {

        TestUtil.click(AddANewClaim, "Add a New Claim Button");
        TestUtil.click(Motor, "Motor Button Clicked");
        TestUtil.click(Car, "Car Button Clicked");
//        TestUtil.click(Bike,"Bike Button Clicked");
//        TestUtil.click(CV,"CV Button Clicked");
        TestUtil.sendKeys(ZendeskID, "Test1234", "Zendesk ID ");
        TestUtil.sendKeys(CustomerName, "Mobile number Testing", "Customer Name Enter");
        TestUtil.sendKeys(CustomerContactNumber, "a", "alphabets Enter");
        WebCommands.staticSleep(1000);
        TestUtil.Assertchk("Please Enter Number Only", errorPleaseEnterNumberOnly, "Error msg shown for alphabets");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(CustomerContactNumber, "1122", "Customer Contact Number Enter");
        WebCommands.staticSleep(1000);
        TestUtil.Assertchk("Please enter valid Mobile Number.", errorPleaseentervalidMobileNumber, "Error msg shown for 12345 numbers");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(CustomerContactNumber, "6999912345", "Customer Contact Number Enter");

    }

    public void CustomerPinCode() {

        TestUtil.click(AddANewClaim, "Add a New Claim Button");
        TestUtil.click(Motor, "Motor Button Clicked");
        TestUtil.click(Car, "Car Button Clicked");
//        TestUtil.click(Bike,"Bike Button Clicked");
//        TestUtil.click(CV,"CV Button Clicked");
        TestUtil.sendKeys(ZendeskID, "Test1234", "Zendesk ID ");
        TestUtil.sendKeys(CustomerName, "Pin Code Testing", "Customer Name Enter");
        TestUtil.sendKeys(CustomerContactNumber, "6999912345", "Customer Contact Number Enter");
        TestUtil.sendKeys(EnterDescriptionOfIncident, "Customer Pin Code Test Testing", "Enter Description Of Incident Enter");
        TestUtil.click(ClaimRequester, "Claim Requester Button Clicked");
        TestUtil.click(Partner, "Partner Selected");
        TestUtil.sendKeys(PineCode, "411001", "Pine Code Enter");
        TestUtil.click(SaveDraft, "Save Draft clicked");
        WebCommands.staticSleep(3000);
    }

    public void PolicyNoWrong() throws IOException {

        TestUtil.click(AddANewClaim, "Add a New Claim Button");
        TestUtil.click(Motor, "Motor Button Clicked");
        TestUtil.click(Car, "Car Button Clicked");
//        TestUtil.click(Bike,"Bike Button Clicked");
//        TestUtil.click(CV,"CV Button Clicked");
        TestUtil.sendKeys(ZendeskID, "Test1234", "Zendesk ID ");
        TestUtil.sendKeys(CustomerName, "Pin Code Testing", "Customer Name Enter");
        TestUtil.sendKeys(CustomerContactNumber, "6999912345", "Customer Contact Number Enter");
        TestUtil.sendKeys(EnterDescriptionOfIncident, "Customer Pin Code Test Testing", "Enter Description Of Incident Enter");
        TestUtil.click(ClaimRequester, "Claim Requester Button Clicked");
        TestUtil.click(Partner, "Partner Selected");
        TestUtil.sendKeys(PineCode, "411001", "Pine Code Enter");
        TestUtil.sendKeys(Citywhereaccidenthappened, "Pune", "City where accident happened enter");
        TestUtil.click(Accident, "Partner Selected");
        TestUtil.click(OwnDamage, "Own Damage Selected");
        TestUtil.click(No, "No Selected");
        TestUtil.click(DateAndTimeForIncident, "Date And Time For Incident Clicked");
        TestUtil.click(TodayDateSelect, "Today Date Select");
        TestUtil.click(Ok, "Ok clicked");
        TestUtil.click(Ok, "Ok clicked");
        TestUtil.sendKeys(PolicyNo, "12345688557", "Reg No enter");
        TestUtil.click(FetchDetails, "Fetch Details Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        TestUtil.Assertchk("Please enter correct details!", errorPolicy, "Error msg shown for policy number");
        WebCommands.staticSleep(3000);
        TestUtil.click(SaveDraft, "Save Draft clicked");
        WebCommands.staticSleep(3000);
    }

    public void MultipleSelectionForDeleteClaims() {

        TestUtil.click(KababMenu, "Kabab Menu Button clicked");
        TestUtil.click(deleteClaims, "Delete Button Clicked");
        TestUtil.click(CheckBox, "Check Box Button Clicked");
        TestUtil.click(CheckBox2, "Check Box 2 Button Clicked");
        LogUtils.info("Multiple selections");

    }

    public void DeleteClaims() {
        TestUtil.click(ClickOnViewClaims,"view on claims selected");
        TestUtil.click(KababMenu, "Kabab Menu Button clicked");
        TestUtil.click(deleteClaims, "Delete Button Clicked");
        TestUtil.click(CheckBox, "Check Box Button Clicked");
        LogUtils.info("Multiple selections");
        TestUtil.click(DeleteClaimsButton, "Delete Claims Button Clicked");
        TestUtil.click(Delete, "Delete Button Clicked");
    }

    public void DeleteClaimsCancel() {
        TestUtil.click(KababMenu, "Kabab Menu Button clicked");
        TestUtil.click(deleteClaims, "Delete Button Clicked");
        TestUtil.click(CheckBox, "Check Box Button Clicked");
        LogUtils.info("Multiple selections");
        TestUtil.click(DeleteClaimsButton, "Delete Claims Button Clicked");
        TestUtil.click(Cancel, "Cancel Button Clicked");
    }

    public void StatusClosed() throws IOException {

        TestUtil.click(AddANewClaim, "Add a New Claim Button");
        TestUtil.click(Motor, "Motor Button Clicked");
        TestUtil.click(Car, "Car Button Clicked");
//        TestUtil.click(Bike,"Bike Button Clicked");
//        TestUtil.click(CV,"CV Button Clicked");
        TestUtil.sendKeys(ZendeskID, "TestClosed1234", "Zendesk ID ");
        TestUtil.sendKeys(CustomerName, "Closed Status Test", "Customer Name Enter");
        TestUtil.sendKeys(CustomerContactNumber, "6999912345", "Customer Contact Number Enter");
        TestUtil.sendKeys(EnterDescriptionOfIncident, "Automation Testing Closed Status Checking", "Enter Description Of Incident Enter");
        TestUtil.click(ClaimRequester, "Claim Requester Button Clicked");
        TestUtil.click(Partner, "Partner Selected");
        TestUtil.sendKeys(PineCode, "411001", "Pine Code Enter");
        TestUtil.sendKeys(Citywhereaccidenthappened, "Pune", "City where accident happened enter");
        TestUtil.click(Accident, "Partner Selected");
        TestUtil.click(OwnDamage, "Own Damage Selected");
        TestUtil.click(No, "No Selected");
        TestUtil.click(DateAndTimeForIncident, "Date And Time For Incident Clicked");
        TestUtil.click(TodayDateSelect, "Today Date Select");
        TestUtil.click(Ok, "Ok clicked");
        TestUtil.click(Ok, "Ok clicked");
        TestUtil.sendKeys(PolicyNo, "12345656", "Plocy No enter");
        WebCommands.staticSleep(1000);
        TestUtil.click(SaveDraft, "Save Draft clicked");
        WebCommands.staticSleep(6000);
        js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
        WebCommands.staticSleep(4000);
        TestUtil.click(statusdropdown, "Dropdown open");
        TestUtil.click(Closed, "Closed status clicked ");
        TestUtil.click(Paid, "Paid clicked ");
        TestUtil.click(Cashless, "Cashless clicked ");
        TestUtil.sendKeys(EnterSettledAmount, "1000", "Enter Settled Amount ");
        TestUtil.click(settlmentDate, "");
        TestUtil.click(TodayDateSettlment, "Settlement date select");
        TestUtil.click(Insured, "Insured clicked ");
        TestUtil.click(MarkAsClosed, "Mark As Closed clicked ");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
    }

    public void TwoDayBeforDate() {

        TestUtil.click(AddANewClaim, "Add a New Claim Button");
        TestUtil.click(Motor, "Motor Button Clicked");
        TestUtil.click(Car, "Car Button Clicked");
//        TestUtil.click(Bike,"Bike Button Clicked");
//        TestUtil.click(CV,"CV Button Clicked");
        TestUtil.sendKeys(ZendeskID, "Test1234", "Zendesk ID ");
        TestUtil.sendKeys(CustomerName, "Closed Status Test", "Customer Name Enter");
        TestUtil.sendKeys(CustomerContactNumber, "6999912345", "Customer Contact Number Enter");
        TestUtil.sendKeys(EnterDescriptionOfIncident, "Automation Testing Closed Status Checking", "Enter Description Of Incident Enter");
        TestUtil.click(ClaimRequester, "Claim Requester Button Clicked");
        TestUtil.click(Partner, "Partner Selected");
        TestUtil.sendKeys(PineCode, "411001", "Pine Code Enter");
        TestUtil.sendKeys(Citywhereaccidenthappened, "Pune", "City where accident happened enter");
        TestUtil.click(Accident, "Partner Selected");
        TestUtil.click(OwnDamage, "Own Damage Selected");
        TestUtil.click(No, "No Selected");
        TestUtil.click(DateAndTimeForIncident, "Date And Time For Incident Clicked");
        TestUtil.click(TwoDayBeforedate, "Today Date Select");
        TestUtil.click(Ok, "Ok clicked");
        TestUtil.click(Ok, "Ok clicked");
        WebCommands.staticSleep(2000);
        TestUtil.Assertchk("The delta for raising this claim is 2 days, please specify the reason for the delay.", DeltaMsg, "The delta msg print");
        TestUtil.sendKeys(Reasonfordelay, "Two Day before Date enter Testing", "Reason entered for Delay");
        TestUtil.click(SaveDraft, "Save Draft clicked");
    }

    public void MIS_Policy_Fetch(String policyNumber) {

        TestUtil.click(AddANewClaim, "Add a New Claim Button");
        TestUtil.click(Motor, "Motor Button Clicked");
        TestUtil.click(Car, "Car Button Clicked");
//        TestUtil.click(Bike,"Bike Button Clicked");
//        TestUtil.click(CV,"CV Button Clicked");
        TestUtil.sendKeys(ZendeskID, "Test1234", "Zendesk ID ");
        TestUtil.sendKeys(CustomerName, "Auto Test Tester", "Customer Name Enter");
        TestUtil.sendKeys(CustomerContactNumber, "6999912345", "Customer Contact Number Enter");
        TestUtil.sendKeys(EnterDescriptionOfIncident, "Automation Testing Closed Status Checking", "Enter Description Of Incident Enter");
        TestUtil.click(ClaimRequester, "Claim Requester Button Clicked");
        TestUtil.click(Partner, "Partner Selected");
        TestUtil.sendKeys(PineCode, "411001", "Pine Code Enter");
        TestUtil.sendKeys(Citywhereaccidenthappened, "Pune", "City where accident happened enter");
        TestUtil.click(Accident, "Partner Selected");
        TestUtil.click(OwnDamage, "Own Damage Selected");
        TestUtil.click(No, "No Selected");
        TestUtil.click(DateAndTimeForIncident, "Date And Time For Incident Clicked");
        TestUtil.click(TodayDateSelect, "Today Date Select");
        TestUtil.click(Ok, "Ok clicked");
        TestUtil.click(Ok, "Ok clicked");
        TestUtil.sendKeys(PolicyNo, policyNumber, "Reg No enter");
        WebCommands.staticSleep(2000);
        TestUtil.click(FetchDetails, "Fetch Details Clicked");
        WebCommands.staticSleep(3000);
        TestUtil.click(SaveDraft, "Save Draft clicked");
        LogUtils.info("Fetching policy number in Claims Successfully done");
    }
}
