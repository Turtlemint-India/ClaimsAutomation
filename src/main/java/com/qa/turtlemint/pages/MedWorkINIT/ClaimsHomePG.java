package com.qa.turtlemint.pages.MedWorkINIT;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClaimsHomePG extends TestBase
{
    public ClaimsHomePG() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//img[@class='MuiBox-root css-pnbw77']//following::button[@type='button'][1]")
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

    @FindBy(xpath = "//input[@id=':r7:']")
    WebElement DateAndTimeBox;

    @FindBy(xpath = "//input[@id=':r9:']")
    WebElement DateAndTime;

    @FindBy(xpath = "//span[text()='2023']//following::span[@aria-label='2 hours']")
    WebElement Timeselector;

    @FindBy(xpath = "//span[text()='2023']//following::button[text()='OK']")
    WebElement OkTime;

//    @FindBy(xpath = "//button[@aria-label='Feb 7, 2023']")
//    WebElement DateSelect;

    @FindBy(xpath = "//button[@class=\"MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin MuiPickersDay-today css-wed0tz\"]")
    WebElement DateSelect;

    @FindBy(xpath = "//input[@id=':ra:']")
    WebElement RegistrationNo;

    @FindBy(xpath = "//label[text()='Policy Number']//parent::div//button[text()='Fetch details']")
    WebElement FetchDetail;

    @FindBy(xpath = "//p[text()='Are you injured?']//following::input[@value='yes'][1]")
    WebElement AreYouInjYes;

    @FindBy(xpath = "//p[text()='Are you injured?']//following::input[@value='yes'][2]")
    WebElement AmbulanceYes;

    @FindBy(xpath = "//p[text()='Are you injured?']//following::input[@value='yes'][3]")
    WebElement WorkshopYes;


    @FindBy(xpath = "//label[text()='Policy Number']//parent::div//input")
    WebElement PolicyNo;



    @FindBy(xpath = "//button[text()='Continue to Medical Assistance']")
    WebElement MedicalAssitanceButton;



//    @FindBy(xpath = "")
//    WebElement ;
//
//    @FindBy(xpath = "")
//    WebElement ;




    public void AddClaim() throws Exception
    {
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

    public void SetupIncidentDetailPage(String PolicyNumber) throws Exception
    {
        AddClaim();
        MotorTap();
        CarSelct();
        Thread.sleep(2500);
        TestUtil.sendKeys(ZendeskId,"1234567890","ZENDESK ID IS ENTERED");
        TestUtil.sendKeys(customerName,"TestAutomationClaims","Customer name is Entered");
        TestUtil.sendKeys(CustomerContactNo,"7200243562","CutomerContactNo is Entered");
        TestUtil.sendKeys(DiscriptionOfIncident,"We are Doing Automation of claims automationn platform","Description og Incident is sended");
        TestUtil.click(ClaimRequester,"Clicked on ClaimRequestorDropdown");
        TestUtil.click(InsuredSlt,"Select Insure from dropdownlist");
        Thread.sleep(4500);
        TestUtil.sendKeys(AccidentCity,"Borivali City","Accident city is enter");
        Thread.sleep(1500);
        TestUtil.sendKeys(Pincode,"401203","PinCode is Entered");
        Thread.sleep(1500);
        TestUtil.click(NatureOfIncidence,"Nature of Incidence is selected");
        Thread.sleep(6500);
        TestUtil.click(NatureOfLoss,"Click on Nature of loss");
        Actions Ac=new Actions(driver);
        Ac.moveToElement(ClaimRadioNo).click().build().perform();
        Thread.sleep(1500);
        TestUtil.click(DateAndTimeBox,"Clicked on date and time box");
        Thread.sleep(1500);
        TestUtil.click(DateSelect,"Clicked on date");
        Thread.sleep(4500);
        Actions ac2=new Actions(driver);
        ac2.moveToElement(Timeselector).click().build().perform();
        Thread.sleep(2500);
        TestUtil.click(OkTime,"Clicked on date and time finally ");
        Thread.sleep(4500);
        TestUtil.sendKeys(PolicyNo,PolicyNumber,"Policy Number is entered");
        Thread.sleep(1500);
        TestUtil.click(FetchDetail,"Fetching started");
        Thread.sleep(9500);
      //  TestUtil.IsDisplayed(AreYouInjYes,"Radio button is displayed");
        Actions ac3=new Actions(driver);
     //   TestUtil.click(AreYouInjYes,"Clicked on Are you injured?");
        ac3.moveToElement(AreYouInjYes).click().build().perform();
        Thread.sleep(1500);
        Actions ac4=new Actions(driver);
        ac4.moveToElement(AmbulanceYes).click().build().perform();
        Thread.sleep(1500);
        Actions ac5=new Actions(driver);
        ac5.moveToElement(WorkshopYes).click().build().perform();
        Thread.sleep(1500);
        TestUtil.click(MedicalAssitanceButton,"Clicked on medical Assitance");

        Thread.sleep(9500);
    }
}
