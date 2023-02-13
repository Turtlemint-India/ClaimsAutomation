package Grow;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.grow.GrowPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.RetryAnalyser;
import util.iTestListener;

@Listeners(iTestListener.class)
@Test(groups = {"grow","mintpro"})
public class GrowPageTest extends TestBase {
    LoginPage Loginpage;
    GrowPage Growpage;

    public GrowPageTest() {super();}

    @BeforeMethod()
    public void start() throws InterruptedException {
        initialization();

        Loginpage = new LoginPage();
        Growpage = new GrowPage();
        Loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void growPageTest(){
        Growpage.quickLinks();
        Growpage.allSeemore();
        //Growpage.Renewals();
    }

    @AfterMethod
    public void Close() {
        driver.quit();
    }

}
