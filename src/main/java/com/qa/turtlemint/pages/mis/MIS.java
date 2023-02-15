package com.qa.turtlemint.pages.mis;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
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


    //List Required in Function
    @FindBy(xpath = "//div[@class='md-select-menu-container md-active md-clickable']/md-select-menu/md-content/md-option")
    WebElement PolicyStatusList;

    @FindBy(id = "insurer")
    WebElement InsurerDropdown;

    @FindBy(xpath = "//md-virtual-repeat-container[@role='presentation']//li[1]")
    WebElement InsurerList;

    @FindBy(xpath = "//button[contains(text(),'Create Sale')]")
    WebElement CreateSale;

    @FindBy(xpath = "//div[@class='md-container md-ink-ripple']")
    WebElement BrokerCheckBox;

    @FindBy(xpath = "//md-select[@id='businessType']")
    WebElement BusinessType;

    @FindBy(xpath = "//div[text()='New']")
    WebElement BusinessTypeList;

    @FindBy(xpath = "//md-select[@id='channelType']")
    WebElement ChannelType;

    @FindBy(xpath = "//div[normalize-space()='Website']")
    WebElement ChannelTypeList;

    @FindBy(xpath = "//md-datepicker[@id='issuanceDate']//div[@class='md-datepicker-expand-triangle ng-scope']")
    WebElement DateDropDownList;

    @FindBy(xpath = "//td[@class=\"md-calendar-date md-calendar-date-today md-focus\"]")
    WebElement Today;

    @FindBy(xpath = "//md-datepicker[@id='saleClosedDate']//button[@aria-label='Open calendar']")
    WebElement SaleCloseDateDropDown;

    @FindBy(xpath = "//button[normalize-space()='Parse & Save Sale']")
    WebElement SaveMIS;

    public MIS() {
        PageFactory.initElements(driver, this);
    }

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
        LogUtils.info("Finally Create Sale Clicked");
        TestUtil.click(BrokerCheckBox, "Broker Checkbox Clicked");

        BusinessType.click();
        BusinessTypeList.click();
        LogUtils.info("Business Type Clicked");
        ChannelType.click();
        WebCommands.staticSleep(1000);
        ChannelTypeList.click();
        LogUtils.info("Channel Type Clicked");
        WebCommands.staticSleep(1000);
        DateDropDownList.click();
        WebCommands.staticSleep(1000);
        Today.click();
        WebCommands.staticSleep(1000);
        SaleCloseDateDropDown.click();
        WebCommands.staticSleep(1000);
        Today.click();
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        SaveMIS.click();
        LogUtils.info("Saved !!!");
        LogUtils.info("Test Case Successfully completed");

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