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
    WebElement ZendeskId ;

    @FindBy(xpath = "//input[@id=':r1:']")
    WebElement customerName ;

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

    @FindBy(xpath = "//p[text()='Have you already raised a claim?']//following::input[@value='yes'][1]")
    WebElement ClaimRadioYes;

    @FindBy(xpath = "//input[@id=':r7:']")
    WebElement DateAndTimeBox;

    @FindBy(xpath = "//input[@id=':r9:']")
    WebElement DateAndTime;

    @FindBy(xpath = "//span[text()='2023']//following::span[@aria-label='2 hours']")
    WebElement Timeselector;

    @FindBy(xpath = "//input[@aria-label='Choose date']")
    WebElement Date_and_Timeselector;

    @FindBy(xpath = "//button[@aria-label='Feb 21, 2023']")
    WebElement DateSelectyes;

    @FindBy(xpath = "(//button[@type='button'][@tabindex='0'])[18]")
    WebElement OkTime1;
    @FindBy(xpath = "(//button[@type='button'][@tabindex='0'])[19]")
    WebElement OkTime;

    @FindBy(xpath = "//button[@aria-label='Feb 7, 2023']")
    WebElement DateSelect;

    @FindBy(xpath = "//input[@id=':ra:']")
    WebElement RegistrationNo;

    @FindBy(xpath = "//input[@id=':rb:']")
    WebElement RegistrationNoYes;
    @FindBy(xpath = "//input[@id=':ra:']//following::button[text()='Fetch details'][1]")
    WebElement FetchDetail;
    @FindBy(xpath = "(//button[@type='button'][@tabindex='0'])[9]")
    WebElement FetchDetailyes;
    @FindBy(xpath = "//p[text()='Are you injured?']//following::input[@value='yes'][1]")
    WebElement AreYouInjYes;

    @FindBy(xpath = "//p[text()='Do you need ambulance or other help to get to a hospital or doctor?']")
    WebElement need_ambulance_question;

    @FindBy(xpath = "//input[@name=':rc:'][@value='no']")
    WebElement AreYouInjNo;

    @FindBy(xpath = "//p[text()='Are you injured?']//following::input[@value='no'][1]")
    WebElement AreYouInjNo1;
    @FindBy(xpath = "//p[text()='Is your vehicle in a condition where you can drive it to the nearest workshop?']")
    WebElement vehicale_in_condition_question;

    @FindBy(xpath = "(//span[text()='Yes'])[3]")
    WebElement vehicale_in_condition_yes;

    @FindBy(xpath = "(//span[text()='No'])[3]")
    WebElement vehicale_in_condition_no;

    @FindBy(xpath = "//p[text()='Are you injured?']//following::input[@value='yes'][2]")
    WebElement AmbulanceYes;

    @FindBy(xpath = "//p[text()='Are you injured?']//following::input[@value='yes'][3]")
    WebElement WorkshopYes;
    @FindBy(xpath = "//p[text()='Are you injured?']//following::input[@value='no'][3]")
    WebElement WorkshopNO;

    @FindBy(xpath = "(//input[@class='PrivateSwitchBase-input css-1m9pwf3'][@name=':r10:'])[1]")
    WebElement towing_to_nearest_workshop_yes;

    @FindBy(xpath = "")
    WebElement towing_to_nearest_workshop_NO;
    @FindBy(xpath = "//button[text()='Save as Draft']")
    WebElement Save_draft;

    @FindBy(xpath = "(//span[text()='Yes'])[2]")
    WebElement taken_WorkshopYes;

    @FindBy(xpath = "(//span[text()='No'])[2]")
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
    public void AddClaim() throws Exception
    {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        TestUtil.click(AddNewClaims,"Clicked on Claims button");
        Thread.sleep(3000);
            }
    public void MotorTap() throws Exception
    {
        TestUtil.click(Motor,"Clicked on Motor");
        Thread.sleep(1000);
    }

    public void CarSelct() throws Exception
    {
        TestUtil.click(Car,"Clicked on Car");
        Thread.sleep(1000);
    }

    public void incidentDetails_raised_claimNO() throws Exception {
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
            Thread.sleep(4500);
            TestUtil.sendKeys(AccidentCity, "Borivali City", "Accident city is enter");
            Thread.sleep(1500);
            TestUtil.sendKeys(Pincode, "401203", "PinCode is Entered");
            Thread.sleep(1500);
            TestUtil.click(NatureOfIncidence, "Nature of Incidence is selected");
            Thread.sleep(6500);
            TestUtil.click(NatureOfLoss, "Click on Nature of loss");
            Actions Ac = new Actions(driver);
            Ac.moveToElement(ClaimRadioNo).click().build().perform();
            Thread.sleep(1500);
            TestUtil.click(DateAndTimeBox, "Clicked on date and time box");
            Thread.sleep(1500);
            TestUtil.click(DateSelect, "Clicked on date");
            Thread.sleep(4500);
            Actions ac2 = new Actions(driver);
            ac2.moveToElement(Timeselector).click().build().perform();
            Thread.sleep(2500);
            TestUtil.click(OkTime1, "Clicked on date and time ");
            Thread.sleep(4500);
       //   TestUtil.sendKeys(RegistrationNo, "MH03RR3333", "Registration Number is entered");
            TestUtil.sendKeys(RegistrationNo, "Dfsf123", "Registration Number is entered");
            Thread.sleep(1500);
            TestUtil.click(FetchDetail, "Fetching started");
            Thread.sleep(9500);
            Actions ac22 = new Actions(driver);
            ac22.moveToElement(AreYouInjYes).click().build().perform();
            Thread.sleep(9500);
            TestUtil.IsDisplayed(need_ambulance_question,"need ambulance question is displayed");
            Thread.sleep(4000);
            Actions ac3 = new Actions(driver);
            ac3.moveToElement(AreYouInjNo1).click().build().perform();
            Thread.sleep(1500);
            TestUtil.IsDisplayed(vehicale_in_condition_question,"vehicale_in_condition_question is displayed ");
            Thread.sleep(1500);
            Actions ac41 = new Actions(driver);
            ac41.moveToElement(vehicale_in_condition_yes).click().build().perform();
            Thread.sleep(1500);
            TestUtil.IsDisplayed(Save_draft,"continue to workshop election");
            Thread.sleep(1500);
            Actions ac42 = new Actions(driver);
            ac42.moveToElement(vehicale_in_condition_no).click().build().perform();
            Thread.sleep(1500);
            Actions ac5 = new Actions(driver);
            ac5.moveToElement(WorkshopYes).click().build().perform();
            Thread.sleep(1500);
            Thread.sleep(1500);
            Actions ac6 = new Actions(driver);
            ac6.moveToElement(WorkshopNO).click().build().perform();
            Thread.sleep(1500);
            TestUtil.click(Save_draft, "Clicked on continue to workshop selection");
            TestUtil.IsDisplayed(details_saved_popup,"details saved flash displayed ");
        }
    public void incidentDetails_raised_claimYes() throws Exception {
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
        Thread.sleep(4500);
        TestUtil.sendKeys(AccidentCity, "Borivali City", "Accident city is enter");
        Thread.sleep(1500);
        TestUtil.sendKeys(Pincode, "401203", "PinCode is Entered");
        Thread.sleep(1500);
        TestUtil.click(NatureOfIncidence, "Nature of Incidence is selected");
        Thread.sleep(6500);
        TestUtil.click(NatureOfLoss, "Click on Nature of loss");
        Actions Ac = new Actions(driver);
        Ac.moveToElement(ClaimRadioYes).click().build().perform();
        Thread.sleep(1500);
        TestUtil.click(DateAndTimeBox, "Clicked on date and time box");
        Thread.sleep(1500);
        TestUtil.click(DateSelect, "Clicked on date");
        Thread.sleep(4500);
        Actions ac2 = new Actions(driver);
        ac2.moveToElement(Date_and_Timeselector).click().build().perform();
        Thread.sleep(2500);
        Actions ac20 = new Actions(driver);
        ac20.moveToElement(DateSelectyes).click().build().perform();
        Thread.sleep(2500);
        TestUtil.click(OkTime, "Clicked on date and time ");
        Thread.sleep(4500);
 //     TestUtil.sendKeys(RegistrationNoYes, "MH03RR3333", "Registration Number is entered");
        TestUtil.sendKeys(RegistrationNoYes, "Dfsf123", "Registration Number is entered");
        Thread.sleep(1500);
        TestUtil.click(FetchDetailyes, "Fetching started");
        Thread.sleep(10000);
        Actions ac22 = new Actions(driver);
        ac22.moveToElement(taken_WorkshopYes).click().build().perform();
        Thread.sleep(9500);
        Actions ac23 = new Actions(driver);
        ac23.moveToElement(taken_WorkshopNO).click().build().perform();
        TestUtil.sendKeys(claimno,"87654256","claim no entered");
        TestUtil.click(select_cust_query, "query dropdown click");
        Thread.sleep(9500);
        TestUtil.click(select_doc_failed, "doc failed query selected");
        Thread.sleep(9500);
        TestUtil.click(continuebtn, "continue btn click");
        Thread.sleep(9500);
        TestUtil.sendKeys(add_query_request,"automation claim query","claim no entered");
        Thread.sleep(9500);
        TestUtil.click(Save_draft, "Clicked on save draft");
        TestUtil.IsDisplayed(details_saved_popup,"details saved flash displayed ");
    }
    }