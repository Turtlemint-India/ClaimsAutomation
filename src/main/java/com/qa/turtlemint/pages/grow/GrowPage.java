package com.qa.turtlemint.pages.grow;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import com.qa.turtlemint.util.LogUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class GrowPage extends TestBase {

    @FindBy(xpath = "//span[text()='Grow']")
    WebElement growpage;

    @FindBy(xpath = "//span[text()='Lead Forms']//parent::div")
    WebElement leadform;

    @FindBy(xpath = "//span[text()='Website']//parent::div")
    WebElement mywebsite;

    @FindBy(xpath = "//span[text()='New Content']//parent::div")
    WebElement NewContent;

    @FindBy(xpath = "//span[text()='Brochures']//parent::div")
    WebElement brochures;

    @FindBy(xpath = "//span[text()='Academy']//parent::div")
    WebElement academy;

    @FindBy(xpath = "//span[text()='Posters']//parent::div")
    WebElement Posters;

    @FindBy(xpath = "//span[text()='Renewals']//parent::div")
    WebElement renewals;

    @FindBy(xpath = "//span[text()='Activity Points']//parent::div")
    WebElement activitypoint;

    @FindBy(xpath = "//div[text()='My Rewards']")
    WebElement myrewards;

    @FindBy(xpath = "//div[@id='flyy-close-image']")
    WebElement closereward;

    @FindBy(xpath = "//a[@href='/leadGenerationForms']")
    WebElement seemoreleadform;

    @FindBy(xpath = "//a[text()='Lead Forms']")
    WebElement leadformsassert;

    @FindBy(xpath = "//a[@class='seeMoreCard _recentPlanSeemore']")
    WebElement seemoreplan;

    @FindBy(xpath = "//a[text()='Plans']")
    WebElement plansassert;

    @FindBy(xpath = "//a[@href='/grow/Share_with_Clients']")
    WebElement seemoreshare;

    @FindBy(xpath = "//a[text()='Share with Clients']")
    WebElement shareassert;


    public GrowPage() {
        PageFactory.initElements(driver, this);
    }

    JavascriptExecutor js = (JavascriptExecutor) driver;

    Actions act =new Actions(driver);

    public void quickLinks(){
        TestUtil.click(mywebsite,"Clicked on mywebsite");
        WebCommands.staticSleep(5000);
        TestUtil.getScreenShot();
        driver.navigate().back();

//        TestUtil.click(plans,"Clicked on Plans");
//        WebCommands.staticSleep(5000);
//        TestUtil.getScreenShot();
//        driver.navigate().back();

        TestUtil.click(NewContent,"Clicked on New Content");
        WebCommands.staticSleep(5000);
        TestUtil.getScreenShot();
        driver.navigate().back();

        TestUtil.click(brochures,"Clicked on brochures");
        WebCommands.staticSleep(5000);
        TestUtil.getScreenShot();
        driver.navigate().back();

        //TestUtil.click(learningPath,"Clicked on Learning Path");
        //WebCommands.staticSleep(5000);
        //TestUtil.getScreenShot();
        driver.get(prop.getProperty("url"));

        TestUtil.click(Posters,"Clicked on Posters");
        WebCommands.staticSleep(5000);
        TestUtil.getScreenShot();
        driver.get(prop.getProperty("url"));

//        WebCommands.staticSleep(5000);
//        TestUtil.getScreenShot();
//        activitypoint.click();
//        TestUtil.click(activitypoint,"Clicked on activitypoints");
//        WebCommands.staticSleep(5000);
//        TestUtil.getScreenShot();
//        driver.navigate().back();

        TestUtil.click(academy,"Clicked on academy");
        WebCommands.staticSleep(5000);
        TestUtil.getScreenShot();
        driver.navigate().back();
        WebCommands.staticSleep(5000);
        TestUtil.getScreenShot();
    }

    public void allSeemore(){
        WebCommands.staticSleep(3000);
        js.executeScript("arguments[0].scrollIntoView(true)",seemoreleadform);
        WebCommands.staticSleep(5000);
    //    act.moveToElement(seemoreleadform).click(seemoreleadform);
       TestUtil.click(seemoreleadform,"Clicked on see more lead forms");
    //    seemoreleadform.click();
        WebCommands.staticSleep(5000);
        String expectedResult = leadformsassert.getText();
        String actualResult = "Lead Forms";
        Assert.assertEquals(expectedResult, actualResult);
        LogUtils.info("Verified: " + expectedResult);
        TestUtil.click(growpage,"Clicked on grow page");
        WebCommands.staticSleep(4000);

        js.executeScript("arguments[0].click();", seemoreplan);
        LogUtils.info("Clicked on Seemore Plan");
        String expectedResult1 = plansassert.getText();
        String actualResult1 = "Plans";
        Assert.assertEquals(expectedResult1, actualResult1);
        LogUtils.info("Verified: " + expectedResult1);
        WebCommands.staticSleep(5000);
        TestUtil.click(growpage,"Clicked on grow page");
        WebCommands.staticSleep(5000);

        js.executeScript("arguments[0].click();", seemoreshare);
        LogUtils.info("Clicked on Seemore Share with clients");
        String expectedResult2 = shareassert.getText();
        String actualResult2 = "Share with Clients";
        Assert.assertEquals(expectedResult2, actualResult2);
        LogUtils.info("Verified: " + expectedResult2);
        TestUtil.click(growpage,"Clicked on grow page");
        WebCommands.staticSleep(2000);

    }

    public void Renewals(){
        TestUtil.click(renewals,"Clicked on My Rewards");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
    }

}
