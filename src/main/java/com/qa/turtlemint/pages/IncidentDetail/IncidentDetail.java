package com.qa.turtlemint.pages.IncidentDetail;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    WebElement OwnDamage ;

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

    @FindBy(xpath = "//button[text()='OK']")
    WebElement Ok;

    @FindBy(xpath = "//label[text()='Registration Number']")
    WebElement RegNo;

    @FindBy(xpath = "//label[text()='Policy Number']")
    WebElement PolicyNo;

    @FindBy(xpath = "//button[text()='Save as Draft']")
    WebElement SaveasDraft;

    @FindBy(xpath = "//*[@aria-label=\"Copied\"]")
    WebElement TM_MIS_ID;

    @FindBy(xpath = "(//*[@aria-label=\"Copied\"])[2]")
    WebElement Claim_ID;

    @FindBy(xpath = "//p[text()='List of Claims']//parent::div//parent::div//button[@type=\"button\"]")
    WebElement KababMenu;

    @FindBy(xpath = "//*[text()=\"Delete Claims\"]")
    WebElement deleteClaims;

    @FindBy(xpath = "//input[@type=\"checkbox\"]")
    WebElement CheckBox;

    @FindBy(xpath = "(//input[@type=\"checkbox\"])[1]")
    WebElement CheckBox2;

    @FindBy(xpath = "//button[text()='Delete Claims']")
    WebElement DeleteClaimsButton;

    @FindBy(xpath = "//button[text()='Delete']")
    WebElement Delete;

    @FindBy(xpath = "//button[text()='Cancel']")
    WebElement Cancel;



    public void CostomerContactNo() {

        TestUtil.click(AddANewClaim, "Add a New Claim Button");
        TestUtil.click(Motor, "Motor Button Clicked");
        TestUtil.click(Car, "Car Button Clicked");
//        TestUtil.click(Bike,"Bike Button Clicked");
//        TestUtil.click(CV,"CV Button Clicked");
        TestUtil.sendKeys(ZendeskID, "Test1234", "Zendesk ID ");
        TestUtil.sendKeys(CustomerName, "Testing Test", "Customer Name Enter");
        TestUtil.sendKeys(CustomerContactNumber, "a", "alphabets Enter");
        WebCommands.staticSleep(1000);
        TestUtil.Assertchk("Please Enter Number Only",errorPleaseEnterNumberOnly,"Error msg shown for alphabets");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(CustomerContactNumber, "1122", "Customer Contact Number Enter");
        WebCommands.staticSleep(1000);
        TestUtil.Assertchk("Please enter valid Mobile Number.",errorPleaseentervalidMobileNumber,"Error msg shown for 12345 numbers");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(CustomerContactNumber, "6999912345", "Customer Contact Number Enter");

    }
    public void CostomerPineCode() {

        TestUtil.click(AddANewClaim, "Add a New Claim Button");
        TestUtil.click(Motor, "Motor Button Clicked");
        TestUtil.click(Car, "Car Button Clicked");
//        TestUtil.click(Bike,"Bike Button Clicked");
//        TestUtil.click(CV,"CV Button Clicked");
        TestUtil.sendKeys(ZendeskID, "Test1234", "Zendesk ID ");
        TestUtil.sendKeys(CustomerName, "Testing Test", "Customer Name Enter");
        TestUtil.sendKeys(CustomerContactNumber, "6999912345", "Customer Contact Number Enter");
        TestUtil.sendKeys(EnterDescriptionOfIncident, "Automation Testing", "Enter Description Of Incident Enter");
        TestUtil.click(ClaimRequester, "Claim Requester Button Clicked");
        TestUtil.click(Partner, "Partner Selected");
        TestUtil.sendKeys(PineCode, "411001", "Pine Code Enter");
//        TestUtil.sendKeys(Citywhereaccidenthappened, "Pune", "City where accident happened enter");
//        TestUtil.click(Accident, "Partner Selected");
//        TestUtil.click(OwnDamage, "Own Damage Selected");
//        TestUtil.click(No, "No Selected");
//        TestUtil.click(DateAndTimeForIncident, "Date And Time For Incident Clicked");
    }

    public void MultipleSelectionForDeleteClaims() {

        TestUtil.click(KababMenu, "Kabab Menu Button clicked");
        TestUtil.click(deleteClaims, "Delete Button Clicked");
        TestUtil.click(CheckBox, "Check Box Button Clicked");
        TestUtil.click(CheckBox2, "Check Box 2 Button Clicked");
        LogUtils.info("Multiple selections");

    }
    public void DeleteClaims() {
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
}
