package com.qa.turtlemint.pages.login;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends TestBase {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public String SolvedID;
    public String SolvedOrderID;


    @FindBy(xpath = "//span/a[@id='google-signin-button']")
    WebElement SignInbtn;

    @FindBy(xpath = "//input[@type='email']")
    WebElement Email;

    @FindBy(xpath = "//span[text()='Next']")
    WebElement Nextbtn1;

    @FindBy(xpath = "//div[@id='password']/div/div/div/input[@type='password']")
    WebElement Password;

    @FindBy(xpath = "//div[@id='passwordNext']")
    WebElement Nextbtn2;

    @FindBy(xpath = "//a[@data-auto=\"mis-module\"]")
    WebElement MIS;

    @FindBy(xpath = "//a[@data-auto=\"lifeOps-module\"]//following::a[@data-auto=\"claims-module\"]")
    WebElement Claims;


    public void NinjaLogin(String NinjaEmail, String NinjaPassword) throws Exception {

     //   driver.get(prop.getProperty("localninjaurl"));
        WebCommands.staticSleep(4000);
        LogUtils.info("Ninja Website Opened");
        String strUrl = driver.getCurrentUrl();
        LogUtils.info("Opened Website: " + strUrl);
        String parent = driver.getWindowHandle();
        SignInbtn.click();
        LogUtils.info("Clicked on Sign In with Google Button");
        WebCommands.staticSleep(4000);
        driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
        LogUtils.info("Switched to child window");
        WebCommands.staticSleep(4000);
        Email.sendKeys(NinjaEmail);
        LogUtils.info("Email Entered");
        Nextbtn1.click();
        LogUtils.info("Clicked on Next button");
        Password.sendKeys(NinjaPassword);
        LogUtils.info("Password entered");
        Nextbtn2.click();
        LogUtils.info("Clicked on Next button after password");

        driver.switchTo().window(parent);

        LogUtils.info("Switched Back to Parent window");
        WebCommands.staticSleep(3000);
        TestUtil.getScreenShot();
    }


    public void ninja_MIS() throws Exception {
//        driver.switchTo().newWindow(WindowType.WINDOW);
//        NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
//        WebCommands.staticSleep(14000);
//        TestUtil.getScreenShot();
        TestUtil.click(MIS, "MIS Selected");
        WebCommands.staticSleep(2000);
    }

    public void ninja_MIS_claims() throws Exception {
//        driver.switchTo().newWindow(WindowType.WINDOW);
//        NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
//        WebCommands.staticSleep(14000);
//        TestUtil.getScreenShot();
        TestUtil.click(Claims, "Claims Selected");
        WebCommands.staticSleep(2000);
        driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
    }
    public void ninja_Claims() throws Exception {
        NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
        WebCommands.staticSleep(24000);
        TestUtil.getScreenShot();
        TestUtil.click(Claims, "Clicked on Claims");
        WebCommands.staticSleep(5000);
        driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));

    }

    public void assertSolved(String uID) throws InterruptedException {
        SolvedID = driver.getCurrentUrl();
        String[] result = SolvedID.split("result/");
        System.out.println("Solved ID = " + result[1]);
        SolvedOrderID = result[1];
        WebCommands.staticSleep(1000);
        Assert.assertEquals(SolvedOrderID, uID);
    }
}