package com.qa.turtlemint.pages.IncidentDetail;

import com.qa.turtlemint.base.TestBase;
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

    @FindBy(xpath = "//span[text()='Zendesk ID']")
    WebElement ZendeskID;

    @FindBy(xpath = "//span[text()='Customer Name']")
    WebElement CustomerName;

    @FindBy(xpath = "//span[text()='Customer Contact Number']")
    WebElement CustomerContactNumber;

    @FindBy(xpath = "//span[text()='Enter Description Of Incident']")
    WebElement EnterDescriptionOfIncident;

    @FindBy(xpath = "//label[text()='Claim Requester']")
    WebElement ClaimRequester;

    @FindBy(xpath = "//li[text()='Partner']")
    WebElement Partner;

    @FindBy(xpath = "//span[text()='Pincode']")
    WebElement PineCode;

    @FindBy(xpath = "//label[text()='City where accident happened']")
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

    public void CostomerContactNo() {

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
        TestUtil.sendKeys(Citywhereaccidenthappened, "Pune", "City where accident happened enter");
        TestUtil.click(Accident, "Partner Selected");
        TestUtil.click(OwnDamage, "Own Damage Selected");
        TestUtil.click(No, "No Selected");
        TestUtil.click(DateAndTimeForIncident, "Date And Time For Incident Clicked");

    }

}
