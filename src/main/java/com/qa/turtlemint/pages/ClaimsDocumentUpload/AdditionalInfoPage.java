package com.qa.turtlemint.pages.ClaimsDocumentUpload;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Ambrish Balde 29/06/2022
 * @author ambrish.balde
 * @Project Turtlemint Frontend Automation
 */
public class AdditionalInfoPage extends TestBase {

    public AdditionalInfoPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//label[text()='Enter Surveyor Name']//parent::div//input")
    WebElement SurveyorName;

    @FindBy(xpath = "//label[text()='Enter Surveyor Contact Number']//parent::div//input")
    WebElement SurveyorNumber;

    @FindBy(xpath = "//label[text()='Enter Surveyor Email ID']//parent::div//input")
    WebElement SurveyorEmail;

    @FindBy(xpath = "//label[text()='Enter Estimated Amount']//parent::div//input")
    WebElement WorkShopBill;

    @FindBy(xpath = "//label[text()='Enter Billed Amount']//parent::div//input")
    WebElement BillAmount;

    @FindBy(xpath = "//button[text()='Skip and Continue']")
    WebElement skip;

    @FindBy(xpath = "//p[text()= 'Claim intimated to the insurer'][1]")
    WebElement ClaimText;

    @FindBy(xpath = "//p[text()= 'Claim Reported']")
    WebElement ClaimReportedText;

    Date myDate;

    public void SurveyorDetails()
    {
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(SurveyorName, "Test Name", "Name is entered");
        TestUtil.sendKeys(SurveyorNumber, "6999912345", "Mobile number entered");
        TestUtil.sendKeys(SurveyorEmail, "test@example.com", "Email entered");
        driver.findElement(By.xpath("//label[text()='Surveyor Appointment Date']//parent::div//input")).sendKeys(TomorrowDate(1));
        TestUtil.sendKeys(WorkShopBill, "TR73819", "ShopBill entered");
        TestUtil.sendKeys(BillAmount, "2000", "Bill Amount entered");
        TestUtil.click(skip, "Clicked on Skip button");

        boolean result = driver.findElement(By.xpath("//button[text()='Add Status']")).isDisplayed();
        WebCommands.staticSleep(2000);
        Assert.assertEquals(result, true);

        String claim = ClaimText.getText();
        Assert.assertEquals(claim, "Claim intimated to the insurer" );

        String claimreported = ClaimReportedText.getText();
        Assert.assertEquals(claimreported, "Claim Reported");
        TestUtil.getScreenShot();

    }

    public String TomorrowDate(int no_of_days)
    {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        myDate = new Date(System.currentTimeMillis());
        Calendar cal = Calendar.getInstance();
        cal.setTime(myDate);
        cal.add(Calendar.DATE, +no_of_days);
        return (dateFormat.format(cal.getTime()));
    }
}
