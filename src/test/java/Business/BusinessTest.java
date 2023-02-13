package Business;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.pages.business.InsuranceSales;
import com.qa.turtlemint.pages.business.InsuranceSales;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.sell.GrowPageSellButton;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.iTestListener;

@Listeners(iTestListener.class)
@Test(groups = {"business","mintpro"})
public class BusinessTest extends TestBase {

    LoginPage loginpage;
    InsuranceSales insuranceSales;

    @BeforeMethod()
    public void start() throws InterruptedException {
        initialization();
        loginpage = new LoginPage();
        insuranceSales = new InsuranceSales();
        //mutualFundSalesFlow = new MutualFundSalesFlow();
        loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
        WebCommands.staticSleep(2000);
    }


    @Test
    public void BusinessTester() throws InterruptedException{
        insuranceSales.InsurnaceSalesFlow();
        insuranceSales.MutualFundSalesFlow();
        insuranceSales.ActivityPointFlow();
        insuranceSales.PerformanceReport();
        insuranceSales.RenewalBusiness();
    }

    @AfterMethod
    public void Close() {
        driver.quit();
    }


}