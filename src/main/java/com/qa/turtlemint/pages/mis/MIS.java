package com.qa.turtlemint.pages.mis;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MIS extends TestBase {

    @FindBy(xpath = "//button[@aria-label='Add New Sale']")
    WebElement AddNewtASale;

    @FindBy(xpath = "//md-select[@id='$$vertical']")
    WebElement VerticlDropdown;


    //List Required in Function
    @FindBy(xpath = "//div[text()='Motor']")
    WebElement VerticalList;

    @FindBy(id = "policyStatus")
    WebElement PolicyStatusDropdown;

    @FindBy(xpath = "(//div[text()='Issued'])[2]")
    WebElement PolicyStatus;

    //List Required in Function
    @FindBy(xpath = "//div[@class='md-select-menu-container md-active md-clickable']/md-select-menu/md-content/md-option")
    WebElement PolicyStatusList;

    @FindBy(id = "insurer")
    WebElement InsurerDropdown;

    @FindBy(xpath = "//md-virtual-repeat-container[@role='presentation']//li[1]")
    WebElement InsurerList;

    @FindBy(xpath = "//button[contains(text(),'Create Sale')]")
    WebElement CreateSale;

    @FindBy(xpath = "//button[normalize-space()='Switch to Manual mode']")
    WebElement SwitchToManual;

    @FindBy(xpath = "//div[@class='md-container md-ink-ripple']")
    WebElement BrokerCheckBox;

    @FindBy(xpath = "//input[@id='policyNumber']")
    WebElement PolicyNo;

    @FindBy(xpath = "//md-select[@id='businessType']")
    WebElement BusinessType;

    @FindBy(xpath = "//div[text()='New']")
    WebElement BusinessTypeList;

    @FindBy(xpath = "//md-select[@id='channelType']")
    WebElement ChannelType;

    @FindBy(xpath = "//div[normalize-space()='Partner']")
    WebElement ChannelTypeList;

    @FindBy(xpath = "(//input[@class='md-datepicker-input'])[2]")
    WebElement PolicyIssuanceDate;

    @FindBy(xpath = "//md-select[@name='productName']")
    WebElement ProductNameDropDown;


    @FindBy(xpath = "//input[@id='registrationNo']")
    WebElement CarRegistrationNo;


    @FindBy(xpath = "//div[normalize-space()='Comprehensive']")
    WebElement ComprehensiveSelect;

    @FindBy(xpath = "//input[@id='intermediaryName']")
    WebElement DpName;

    @FindBy(xpath = "//td[@class=\"md-calendar-date md-calendar-date-today md-focus\"]")
    WebElement Today;

    @FindBy(xpath = "(//input[@class='md-datepicker-input'])[6]")
    WebElement SaleCloseDate;

    @FindBy(xpath = "//button[normalize-space()='Save Sale']")
    WebElement SaveMIS;

    @FindBy(xpath = "//md-select[@id='policyProposerTitle']")
    WebElement ProposerTitleDropDown;

    @FindBy(xpath = "//div[normalize-space()='Mr']")
    WebElement MrSelected;

    @FindBy(xpath = "//input[@id='policyProposerFName']")
    WebElement ProposerFName;

    @FindBy(xpath = "//input[@id='policyProposerLName']")
    WebElement ProposerLName;

    @FindBy(xpath = "(//input[@class='md-datepicker-input'])[9]")
    WebElement riskStartDate;

    @FindBy(xpath = "(//input[@class='md-datepicker-input'])[10]")
    WebElement riskEndDate;

    @FindBy(xpath = "//input[@id='ncb']")
    WebElement NCB;


    @FindBy(xpath = "//input[@id='netOdPremium']")
    WebElement TotalODPremium;

    @FindBy(xpath = "//input[@id='tpPremium']")
    WebElement TotalTpPremium;

    @FindBy(xpath = "//input[@id='netPremium']")
    WebElement NetPremium;

//    @FindBy(xpath = "//span[@data-auto='intermediaryName-mr automation test-autocomplete']")
//    WebElement DpNameSelect;

    @FindBy(xpath = "//span[@title=\"automation testing - [DP - 1585924]\"]")
    WebElement DpNameSelect;

    @FindBy(xpath = "//input[@id='intermediaryLoginId']")
    WebElement DPLoginID;

    @FindBy(xpath = "//input[@id='intermediaryInternalId']")
    WebElement DPNumber;

    @FindBy(xpath = "//span[@class='pageTitle ng-binding']")
    WebElement ReadPolicyNumber;

    @FindBy(xpath = "//button[@data-auto=\"goback-button\"]")
    WebElement gobackbutton;

    @FindBy(xpath = "//div[@data-auto=\"ham-menu\"]")
    WebElement menu;

    @FindBy(xpath = "//a[@data-auto=\"home-menu\"]")
    WebElement HomePageNinja;

    @FindBy(xpath = "//a[@data-auto=\"lifeOps-module\"]//following::a[@data-auto=\"claims-module\"]")
    WebElement Claims;


    public MIS() {
        PageFactory.initElements(driver, this);
    }

    public String randomPolicyNumber;
    public String RandomCarNumber;
    public String policyNo;
    TestUtil tl = new TestUtil();

    public void MISPolicyNumber() {
        TestUtil.click(AddNewtASale, "Plus Button clicked");
        VerticlDropdown.click();
        TestUtil.click(VerticalList, "");

        LogUtils.info("Product Category Selected");
        WebCommands.staticSleep(1000);

        vertical_list();

        PolicyStatusDropdown.click();
        PolicyStatusList.click();
        LogUtils.info(" Policy Status Selected");
        LogUtils.info("Now Waiting for a long time to select insurer");
        WebCommands.staticSleep(1000);
//        policy_issuance_status();
        WebCommands.staticSleep(1000);

        InsurerDropdown.click();
        TestUtil.click(InsurerList, "Insurer Button clicked");

        CreateSale.click();
        LogUtils.info("Create Sale Clicked");
        WebCommands.staticSleep(1000);
        TestUtil.click(SwitchToManual,"Switched to Manual Mode");
        WebCommands.staticSleep(2000);
        TestUtil.click(BrokerCheckBox, "Broker Checkbox Clicked");
        randomPolicyNumber = TestUtil.getRandomPhoneNumber();
        TestUtil.sendKeys(PolicyNo,randomPolicyNumber,"Random Policy Number Entered");
        BusinessType.click();
        BusinessTypeList.click();
        LogUtils.info("Business Type Clicked");
        ChannelType.click();
        WebCommands.staticSleep(1000);
        ChannelTypeList.click();
        LogUtils.info("Channel Type Clicked");
        WebCommands.staticSleep(2000);
        PolicyIssuanceDate.click();
        WebCommands.staticSleep(1000);
        PolicyIssuanceDate.sendKeys(Keys.ESCAPE);
        PolicyIssuanceDate.sendKeys(TestUtil.ninjaPastDate(2));
        WebCommands.staticSleep(1000);
        PolicyIssuanceDate.sendKeys(Keys.RETURN);
        WebCommands.staticSleep(1000);
        TestUtil.click(PolicyStatusDropdown,"Ploicy Type Drop Down");
        WebCommands.staticSleep(1000);
        PolicyStatus.click();
        WebCommands.staticSleep(1000);
        ProductNameDropDown.click();
        WebCommands.staticSleep(1000);
        ComprehensiveSelect.click();
        RandomCarNumber = tl.GenerateRegNo();
        TestUtil.sendKeys(CarRegistrationNo,RandomCarNumber,"Registration Number Entered");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(DpName,"automation test","DP Name entered");
        TestUtil.sendKeys(DPLoginID,"5c90df45e4b0f2135296ddd7","Dp Login ID Entered");
        TestUtil.sendKeys(DPNumber,"DP - 402392","DP Number entered");
        WebCommands.staticSleep(1000);
        SaleCloseDate.click();
        WebCommands.staticSleep(1000);
        SaleCloseDate.sendKeys(Keys.ESCAPE);
        SaleCloseDate.sendKeys(TestUtil.ninjaPastDate(2));
        WebCommands.staticSleep(1000);
        SaleCloseDate.sendKeys(Keys.RETURN);
        WebCommands.staticSleep(2000);
        TestUtil.click(ProposerTitleDropDown,"Drop Down Proposal Title");
        TestUtil.click(MrSelected,"Mr Selected");
        TestUtil.sendKeys(ProposerFName,"AutomationTest","Proposer First Name Entered");
        TestUtil.sendKeys(ProposerLName,"SixNineNine"," Proposer Last Name Entered");

//        TestUtil.click(riskStartDate, "");
//        WebCommands.staticSleep(2000);
//        TestUtil.click(Today, "Selected for risk start date");
//        WebCommands.staticSleep(3000);


        WebCommands.staticSleep(2000);
        riskStartDate.click();
        WebCommands.staticSleep(2000);
        riskStartDate.sendKeys(Keys.ESCAPE);
        riskStartDate.sendKeys(TestUtil.ninjaPastDate(1));
        WebCommands.staticSleep(2000);
        riskStartDate.sendKeys(Keys.RETURN);
        WebCommands.staticSleep(4000);

        riskEndDate.click();
        WebCommands.staticSleep(1000);
        riskEndDate.sendKeys(Keys.ESCAPE);
        riskEndDate.sendKeys(TestUtil.ninjaFutureDate(364));
        WebCommands.staticSleep(1000);
        riskEndDate.sendKeys(Keys.RETURN);
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(NCB,"20","NCB Entered");
        TestUtil.sendKeys(TotalODPremium,"1000","Total OD Premium Filled");
        TestUtil.sendKeys(TotalTpPremium,"1000","Total TP Premium Filled");
        TestUtil.sendKeys(NetPremium,"2000","Net Premium Filled");
        WebCommands.staticSleep(2000);
        SaveMIS.click();
        WebCommands.staticSleep(2000);
        DpName.click();
        WebCommands.staticSleep(3000);
        DpNameSelect.click();
        WebCommands.staticSleep(2000);
        SaveMIS.click();
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
    }

    public String policyNumber(){
        policyNo = ReadPolicyNumber.getText();
        return policyNo;
    }

    public void BackTo_Claims(){
        WebCommands.staticSleep(2000);
        TestUtil.click(gobackbutton,"goback-button Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.click(menu,"menu-button Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.click(HomePageNinja,"Home Page Ninja-button Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.click(Claims, "Claims Selected");
        WebCommands.staticSleep(2000);
        driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
    }

    public void vertical_list() {
        List<WebElement> vertical_menu = driver.findElements(By.xpath("//md-select-menu[contains(@class,'_md md-overflow')]//md-content//md-option"));
        System.out.println("Vertical Menu = " + vertical_menu.size());


        for (int i = 0; i < vertical_menu.size(); i++) {
            System.out.println(vertical_menu.get(i).getText());
            if (vertical_menu.get(i).getText().contains("Motor")) {
                vertical_menu.get(i).click();
                break;
            }
        }
    }
}