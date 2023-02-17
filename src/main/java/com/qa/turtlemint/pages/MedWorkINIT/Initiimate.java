package com.qa.turtlemint.pages.MedWorkINIT;

import com.qa.turtlemint.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Initiimate extends TestBase
{
    public Initiimate() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//button[text()='Policyholder']")
    WebElement PolicyHolder;

    @FindBy(xpath = "//p[text()='Claim Details /Intimate Insurer']//following::p[text()='Intimate Insurer'][2]")
    WebElement IntimateInsurerVerify;
    @FindBy(xpath = "//button[text()='Policyholder']//following::span[text()='Yes']")
    WebElement VehicleParkedNo;

    @FindBy(xpath = "//p[text()='Quick Preview & Submit']")
    WebElement QuickPreviewSubmit;

    @FindBy(xpath = "//p[text()='Vehicle Details']")
    WebElement VehicleDetails;

    @FindBy(xpath = "//p[text()='Insured Details']")
    WebElement InsuredDetails;

    @FindBy(xpath = "//p[text()='Policy Details']")
    WebElement PolicyDetail;

    @FindBy(xpath = "//p[text()='Accident Details']")
    WebElement AccidentDetail;

    @FindBy(xpath = "//p[text()='Documents']")
    WebElement DocumentUploadPGVerify;



    public void VerifyQuickPreviewPage()
    {

    }

    public void VerifySubmitClaim()
    {

    }

    public void SkipAndContinue()
    {

    }

    public void SaveAndContinue()
    {

    }

}
