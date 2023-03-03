package com.qa.turtlemint.pages.ClaimsDocumentUpload;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Ambrish Balde 29/06/2022
 * @author ambrish.balde
 * @Project Turtlemint Frontend Automation
 */
public class DocumentUploadPage extends TestBase {

    public DocumentUploadPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[text()='test a']//following::img[1]")
    WebElement ele;

    @FindBy(xpath = "//button[text()='Continue to Workshop Selection']")
    WebElement selectLoc;

    @FindBy(xpath = "//button[text()='Skip and Continue']")
    WebElement skip;

    @FindBy(xpath = "//button[text()='Policyholder']")
    WebElement policyholder;

    @FindBy(xpath = "//input[@value='no']")
    WebElement no;

    @FindBy(xpath = "//button[text()='Save and Continue']")
    WebElement save;

    @FindBy(xpath = "//button[text()='Save And Continue']")
    WebElement Continue;

    @FindBy(xpath = "//button[text()='Submit Claim Request to Insurer']")
    WebElement submitToInsurer;

    @FindBy(xpath = "//button[text()='Skip and Continue']")
    WebElement skipc;

    @FindBy(xpath = "//p[text()='Driving License']//following::input[@type='file'][1]")
    WebElement DLFileUpload;

    @FindBy(xpath = "//p[text()='Driving License']//following::p[text()='Add More'][1]")
    WebElement DLAddMore;

    @FindBy(xpath = "//p[text()='RC Copy']//following::input[@type='file'][1]")
    WebElement RCFileUpload;

    @FindBy(xpath = "//p[text()='RC Copy']//following::p[text()='Add More'][1]")
    WebElement RCAddMore;

    @FindBy(xpath = "//p[text()='Cancel Cheque of Insured']//following::input[@type='file'][1]")
    WebElement cancelcheque;

    @FindBy(xpath = "//p[text()='Cancel Cheque of Insured']//following::p[text()='Add More'][1]")
    WebElement cancelchequeAddMore;

    @FindBy(xpath = "//p[text()='FIR']//following::input[@type='file'][1]")
    WebElement FIR;

    @FindBy(xpath = "//p[text()='FIR']//following::p[text()='Add More'][1]")
    WebElement FIRAddMore;

    @FindBy(xpath = "//p[text()='PAN']//following::input[@type='file'][1]")
    WebElement PAN;

    @FindBy(xpath = "//p[text()='NTR']//following::input[@type='file'][1]")
    WebElement NTR;

    @FindBy(xpath = "//p[text()='PAN']//following::p[text()='Add More'][1]")
    WebElement PANAddMore;

    @FindBy(xpath = "//p[text()='Adhaar']//following::input[@type='file'][1]")
    WebElement Aadhaar;

    @FindBy(xpath = "//p[text()='Adhaar']//following::p[text()='Add More'][1]")
    WebElement AadhaarAddmore;

    @FindBy(xpath = "//p[text()='Upload Documents']")
    WebElement docupload;

    @FindBy(xpath = "//p[text()='saveimage.jpeg']")
    WebElement imageclick;

    @FindBy(xpath = "//div[@title='Close']")
    WebElement close;

    @FindBy(xpath = "//label[text()='Bank Name']//parent::div//input")
    WebElement BankName;

    @FindBy(xpath = "//label[text()='Bank Account Number']//parent::div//input")
    WebElement AccountNumber;

    @FindBy(xpath = "//label[text()='IFSC Code']//parent::div//input")
    WebElement IFSC;

    @FindBy(xpath = "//button[text()='Confirm']")
    WebElement confirm;

    public void DocUpload()
    {
        WebCommands.staticSleep(1000);
        DLFileUpload.sendKeys("/home/ubuntu/storage/DL.jpeg");
        WebCommands.staticSleep(1000);
        RCFileUpload.sendKeys("/home/ubuntu/storage/rc_copy.jpeg");
        cancelcheque.sendKeys("/home/ubuntu/storage/cancel_cheque.jpeg");
        FIR.sendKeys("/home/ubuntu/storage/dummy_fir.jpeg");
        PAN.sendKeys("/home/ubuntu/storage/dummy_pan.jpeg");
        WebCommands.staticSleep(2000);
        Aadhaar.sendKeys("/home/ubuntu/storage/dummy_aadhaar.jpeg");
        WebCommands.staticSleep(2000);
        TestUtil.IsDisplayed(RCAddMore, "ADD More for RC field displayed");
        TestUtil.IsDisplayed(DLAddMore, "Add more for DL field displayed");
        TestUtil.IsDisplayed(cancelchequeAddMore, "Add More for cancel field displayed");
        TestUtil.IsDisplayed(FIRAddMore, "Add More for FIR displayed");
        TestUtil.IsDisplayed(PANAddMore, "Add More For PAN card field displayed");
        TestUtil.IsDisplayed(AadhaarAddmore, "Add More for Aadhaar field displayed");

        driver.findElement(By.xpath("//*[@id=\"root\"]//p[text()='RC Copy']//following::img[1]")).click();
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        WebCommands.staticSleep(4000);
        TestUtil.click(close, "RC image is closed");
        WebCommands.staticSleep(1000);
        deleteDoc();

        driver.findElement(By.xpath("//*[@id=\"root\"]//p[text()='Driving License']//following::img[1]")).click();
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        WebCommands.staticSleep(3000);
        TestUtil.click(close, "DL image is closed");
        WebCommands.staticSleep(5000);
        deleteDoc();

        driver.findElement(By.xpath("//*[@id=\"root\"]//p[text()='FIR']//following::img[1]")).click();
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        WebCommands.staticSleep(3000);
        TestUtil.click(close, "FIR image is closed");
        WebCommands.staticSleep(1000);
        deleteDoc();

        driver.findElement(By.xpath("//*[@id=\"root\"]//p[text()='Cancel Cheque of Insured']//following::img[1]")).click();
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        WebCommands.staticSleep(3000);
        TestUtil.click(close, "Cancel Cheque image is closed");
        WebCommands.staticSleep(1000);
        deleteDoc();

        driver.findElement(By.xpath("//*[@id=\"root\"]//p[text()='PAN']//following::img[1]")).click();
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        WebCommands.staticSleep(3000);
        TestUtil.click(close, "PAN image is closed");
        WebCommands.staticSleep(5000);
        deleteDoc();

        driver.findElement(By.xpath("//*[@id=\"root\"]//p[text()='Adhaar']//following::img[1]")).click();
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        WebCommands.staticSleep(3000);
        TestUtil.click(close, "Aadhaar image is closed");
        WebCommands.staticSleep(1000);
        deleteDoc();
        TestUtil.getScreenShot();

        TestUtil.sendKeys(BankName, "Test Bank", "Bank Name is entered");
        TestUtil.sendKeys(AccountNumber, "12345678", "Account number is entered");
        TestUtil.sendKeys(IFSC, "UTIB000173", "IFSC code entered");
        TestUtil.click(Continue, "Save and Skip button is clicked");
    }

    public void deleteDoc()
    {
        WebCommands.staticSleep(3000);
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//p[text()='RC Copy']//following::img[1]"));
        WebCommands.staticSleep(3000);
        action.moveToElement(element).build().perform();
        WebCommands.staticSleep(1000);
        driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M19 6.41 1')]")).click();
        TestUtil.click(confirm, "Clicked on confirm to Delete the document");
        LogUtils.info("Documents deleted Successfully");
        WebCommands.staticSleep(3000);
    }
}
