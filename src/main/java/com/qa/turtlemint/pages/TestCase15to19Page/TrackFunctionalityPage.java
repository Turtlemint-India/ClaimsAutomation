package com.qa.turtlemint.pages.TestCase15to19Page;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrackFunctionalityPage extends TestBase{


    public TrackFunctionalityPage(){

        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//img[@class=\"MuiBox-root css-4g6ai3\"]")
    WebElement SelectClaim;
    @FindBy(xpath = "//div[@class=\"MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary  css-xzjwhy\"]")
    WebElement SelectClaimDropDown;
    @FindBy(xpath = "//p[normalize-space()='Pending']")
    WebElement SelectPending;
    @FindBy(xpath = "//input[@value=\"Pending from Insurer\"]")
    WebElement SelectPendingFromInsurer;
    @FindBy(xpath = "//textarea[@id=':r35:']")
    WebElement EnterText;


    public void DropDown(){
        TestUtil.click(SelectClaim,"Select Any Claim");
        TestUtil.click(SelectClaimDropDown,"Select Claim Drop Down");
        LogUtils.info("Observed the DropDown");
        TestUtil.click(SelectPending,"Select Pending From DropDown");
        TestUtil.click(SelectPendingFromInsurer,"Select Pending From Insurer");
        TestUtil.sendKeys(EnterText,"Pending","Pending From Insurer");




    }



}
