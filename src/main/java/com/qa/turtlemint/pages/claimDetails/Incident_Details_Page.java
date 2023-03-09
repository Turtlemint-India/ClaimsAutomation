package com.qa.turtlemint.pages.claimDetails;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Set;

public class Incident_Details_Page extends TestBase {
    public Incident_Details_Page() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='MuiButton-startIcon MuiButton-iconSizeMedium css-1l6c7y9']")
    WebElement AddNewClaims;

    @FindBy(xpath = "//p[text()='Motor']")
    WebElement Motor;

    @FindBy(xpath = "//p[text()='Car']")
    WebElement Car;

    @FindBy(xpath = "//input[@id=':r0:']")
    WebElement ZendeskId;

    @FindBy(xpath = "//input[@id=':r1:']")
    WebElement customerName;

    @FindBy(xpath = "//input[@id=':r2:']")
    WebElement CustomerContactNo;

    @FindBy(xpath = "//textarea[@id=':r3:']")
    WebElement DiscriptionOfIncident;

    @FindBy(xpath = "//div[@id='demo-simple-select-autowidth']")
    WebElement ClaimRequester;

    @FindBy(xpath = "//li[text()='Insured']")
    WebElement InsuredSlt;

    @FindBy(xpath = "//input[@id=':r4:']")
    WebElement AccidentCity;

    @FindBy(xpath = "//input[@id=':r5:']")
    WebElement Pincode;

    @FindBy(xpath = "//button[text()='Accident']")
    WebElement NatureOfIncidence;

    @FindBy(xpath = "//button[text()='Own Damage']")
    WebElement NatureOfLoss;

    @FindBy(xpath = "//p[text()='Have you already raised a claim?']//following::input[@value='no']")
    WebElement ClaimRadioNo;

    @FindBy(xpath = "//p[text()='Have you already raised a claim?']//following::input[@value='yes']")
    WebElement ClaimRadioYes;

    @FindBy(xpath = "//input[@aria-label='Choose date']")
    WebElement DateAndTimeBox;

    @FindBy(xpath = "//input[@placeholder='dd/mm/yyyy']")
    WebElement DateAndTime;

    @FindBy(xpath = "//span[text()='2023']//following::span[@aria-label='2 hours']")
    WebElement Timeselector;

    @FindBy(xpath = "//input[@aria-label='Choose date']")
    WebElement Date_and_Timeselector;

    @FindBy(xpath = "//span[@class='MuiTouchRipple-root css-w0pj6f']//following::button[text()='OK']")
    WebElement OkTime;

    @FindBy(xpath = "//button[@class=\"MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin MuiPickersDay-today css-wed0tz\"]")
    WebElement DateSelect;

    @FindBy(xpath = "//label[text()='Policy Number']//parent::div//input")
    WebElement PolicyNo;

    @FindBy(xpath = "//label[text()='Policy Number']//parent::div//button[text()='Fetch details']")
    WebElement FetchDetail;

    @FindBy(xpath = "//p[text()='Are you injured?']//following::input[@value='yes']")
    WebElement AreYouInjYes;

    @FindBy(xpath = "//p[text()='Do you need ambulance or other help to get to a hospital or doctor?']")
    WebElement need_ambulance_question;

    @FindBy(xpath = "//p[text()='Are you injured?']//following::input[@value='no']")
    WebElement AreYouInjNo;
    @FindBy(xpath = "//p[text()='Is your vehicle in a condition where you can drive it to the nearest workshop?']")
    WebElement vehicale_in_condition_question;

    @FindBy(xpath = "//p[text()='Is your vehicle in a condition where you can drive it to the nearest workshop?']//following::input[@value='yes']")
    WebElement vehicale_in_condition_yes;

    @FindBy(xpath = "//p[text()='Is your vehicle in a condition where you can drive it to the nearest workshop?']//following::input[@value='no'][@name=':re:']")
    WebElement vehicale_in_condition_no;

    @FindBy(xpath = "//p[text()='We can arrange towing of the vehicle to the nearest workshop. Should we?']//following::span[text()='Yes']")
    WebElement WorkshopYes;
    @FindBy(xpath = "//p[text()='We can arrange towing of the vehicle to the nearest workshop. Should we?']//following::span[text()='No']")
    WebElement WorkshopNO;

    @FindBy(xpath = "//button[text()='Save as Draft']")
    WebElement Save_draft;

    @FindBy(xpath = "//p[text()='Have you taken it to the workshop?']//following::span[text()='Yes']")
    WebElement taken_WorkshopYes;

    @FindBy(xpath = "//p[text()='Have you taken it to the workshop?']//following::span[text()='No']")
    WebElement taken_WorkshopNO;
    @FindBy(xpath = "//input[@aria-invalid='false'][@id=':rf:']")
    WebElement claimno;

    @FindBy(xpath = "//div[@role='button'][@id='demo-mutiple-checkbox']")
    WebElement select_cust_query;

    @FindBy(xpath = "//span[text()='Document Verification failed']")
    WebElement select_doc_failed;

    @FindBy(xpath = "//button[@role='option'][@aria-readonly='true']")
    WebElement continuebtn;

    @FindBy(xpath = "//textarea[@id=':rg:'][@rows='4']")
    WebElement add_query_request;

    @FindBy(xpath = "//div[text()='Details Saved successfully']")
    WebElement details_saved_popup;

    Actions Act = new Actions(driver);

    public void AddClaim() throws Exception {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        TestUtil.click(AddNewClaims, "Clicked on Claims button");
        Thread.sleep(3000);
    }

    public void MotorTap() throws Exception {
        TestUtil.click(Motor, "Clicked on Motor");
        Thread.sleep(1000);
    }

    public void CarSelct() throws Exception {
        TestUtil.click(Car, "Clicked on Car");
        Thread.sleep(1000);
    }

    public void incidentDetails_raised_claimNO(String PolicyNumber) throws Exception {
        AddClaim();
        MotorTap();
        CarSelct();
        Thread.sleep(1500);
        TestUtil.sendKeys(ZendeskId, "8888888888", "ZENDESK ID IS ENTERED");
        TestUtil.sendKeys(customerName, "TestAutomationClaims", "Customer name is Entered");
        TestUtil.sendKeys(CustomerContactNo, "7200243562", "CutomerContactNo is Entered");
        TestUtil.sendKeys(DiscriptionOfIncident, "We are Doing Automation of claims automationn platform", "Description og Incident is sended");
        TestUtil.click(ClaimRequester, "Clicked on ClaimRequestorDropdown");
        TestUtil.click(InsuredSlt, "Select Insure from dropdownlist");
        Thread.sleep(2000);
        TestUtil.sendKeys(AccidentCity, "Borivali City", "Accident city is enter");
        Thread.sleep(1500);
        TestUtil.sendKeys(Pincode, "401203", "PinCode is Entered");
        Thread.sleep(1500);
        TestUtil.click(NatureOfIncidence, "Nature of Incidence is selected");
        Thread.sleep(2000);
        TestUtil.click(NatureOfLoss, "Click on Nature of loss");
        Act.moveToElement(ClaimRadioNo).click().build().perform();
        Thread.sleep(1500);
        TestUtil.click(DateAndTimeBox, "Clicked on date and time box");
        Thread.sleep(1500);
        TestUtil.click(DateSelect, "Clicked on date");
        Thread.sleep(2000);
        Act.moveToElement(Timeselector).click().build().perform();
        Thread.sleep(2500);
        TestUtil.click(OkTime, "Clicked on date and time ");
        Thread.sleep(4500);
        //   TestUtil.sendKeys(RegistrationNo, "MH03RR3333", "Registration Number is entered");
        TestUtil.sendKeys(PolicyNo,PolicyNumber , "Registration Number is entered");
      //  TestUtil.sendKeys(PolicyNo, "Dfsf123", "Registration Number is entered");
        Thread.sleep(2000);
        TestUtil.click(FetchDetail, "Fetching started");
        Thread.sleep(2000);
        Act.moveToElement(AreYouInjYes).click().build().perform();
        Thread.sleep(2000);
        TestUtil.IsDisplayed(need_ambulance_question, "need ambulance question is displayed");
        Thread.sleep(2000);
        Act.moveToElement(AreYouInjNo).click().build().perform();
        Thread.sleep(1500);
        TestUtil.IsDisplayed(vehicale_in_condition_question, "vehicale_in_condition_question is displayed ");
        Thread.sleep(1500);
        Act.moveToElement(vehicale_in_condition_yes).click().build().perform();
        Thread.sleep(1500);
        TestUtil.IsDisplayed(Save_draft, "continue to workshop selection displayed");
        Thread.sleep(2000);
        Act.moveToElement(vehicale_in_condition_no).click().build().perform();
        Thread.sleep(1500);
        Act.moveToElement(WorkshopYes).click().build().perform();
        Thread.sleep(1500);
        Thread.sleep(1500);
        Act.moveToElement(WorkshopNO).click().build().perform();
        Thread.sleep(1500);
        TestUtil.click(Save_draft, "Clicked on continue to workshop selection");
        TestUtil.IsDisplayed(details_saved_popup, "details saved flash displayed ");
    }

    public void incidentDetails_raised_claimYes(String PolicyNumber) throws Exception {
        AddClaim();
        MotorTap();
        CarSelct();
        Thread.sleep(2500);
        TestUtil.sendKeys(ZendeskId, "8888888888", "ZENDESK ID IS ENTERED");
        TestUtil.sendKeys(customerName, "TestAutomationClaims", "Customer name is Entered");
        TestUtil.sendKeys(CustomerContactNo, "7200243562", "CutomerContactNo is Entered");
        TestUtil.sendKeys(DiscriptionOfIncident, "We are Doing Automation of claims automationn platform", "Description og Incident is sended");
        TestUtil.click(ClaimRequester, "Clicked on ClaimRequestorDropdown");
        TestUtil.click(InsuredSlt, "Select Insure from dropdownlist");
        Thread.sleep(3000);
        TestUtil.sendKeys(AccidentCity, "Borivali City", "Accident city is enter");
        Thread.sleep(1500);
        TestUtil.sendKeys(Pincode, "401203", "PinCode is Entered");
        Thread.sleep(1500);
        TestUtil.click(NatureOfIncidence, "Nature of Incidence is selected");
        Thread.sleep(2000);
        TestUtil.click(NatureOfLoss, "Click on Nature of loss");
        Act.moveToElement(ClaimRadioYes).click().build().perform();
        Thread.sleep(1500);
        TestUtil.click(DateAndTime, "Clicked on date and time box");
        Thread.sleep(1500);
        TestUtil.click(DateSelect, "Clicked on date");
        Thread.sleep(3000);
        Act.moveToElement(Date_and_Timeselector).click().build().perform();
        Thread.sleep(2500);
        Act.moveToElement(DateSelect).click().build().perform();
        Thread.sleep(2500);
        TestUtil.click(OkTime, "Clicked on date and time ");
        Thread.sleep(2000);
        TestUtil.sendKeys(PolicyNo,PolicyNumber , "Registration Number is entered");
       // TestUtil.sendKeys(PolicyNo, "Dfsf123", "Registration Number is entered");
        Thread.sleep(1500);
        TestUtil.click(FetchDetail, "Fetching started");
        Thread.sleep(1000);
        Act.moveToElement(taken_WorkshopYes).click().build().perform();
        Thread.sleep(2000);
        Act.moveToElement(taken_WorkshopNO).click().build().perform();
        TestUtil.sendKeys(claimno, "87654256", "claim no entered");
        TestUtil.click(select_cust_query, "query dropdown click");
        Thread.sleep(4000);
        TestUtil.click(select_doc_failed, "doc failed query selected");
        Thread.sleep(3000);
        TestUtil.click(continuebtn, "continue btn click");
        Thread.sleep(3000);
        TestUtil.sendKeys(add_query_request, "automation claim query", "claim no entered");
        Thread.sleep(3000);
        TestUtil.click(Save_draft, "Clicked on save draft");
        TestUtil.IsDisplayed(details_saved_popup, "details saved flash displayed ");
    }
}