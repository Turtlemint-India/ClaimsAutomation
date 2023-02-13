package SellPage;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.sell.GrowPageSellButton;
import com.qa.turtlemint.pages.sell.SellPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.iTestListener;

@Listeners(iTestListener.class)
@Test(groups = {"sell","mintpro"})
public class SellPageTestforVerifiedUser extends TestBase {

    LoginPage Loginpage;
    SellPage sell;
    GrowPageSellButton sellButton;


    public SellPageTestforVerifiedUser() {
        super();
    }

    @BeforeMethod()
    public void start() throws InterruptedException {
        initialization();
        Loginpage = new LoginPage();
        sellButton = new GrowPageSellButton();
        sell = new SellPage();
        Loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
        sellButton.ValidateSellButton();

    }

    @Test
    public void validateFWMotorTest() throws InterruptedException {
        sell.validateFWMotorClick();
    }

    @Test
    public void validateTWMotorTest() throws InterruptedException {
        sell.validateTWMotorClick();
    }

    @Test
    public void validateCVMotorTest() throws InterruptedException {
        sell.validateCVMotorClick();
    }

    @Test
    public void validateHealthTest() throws InterruptedException {
        sell.validateHealthClick();
    }

    @Test
    public void validatePersonalAccidentTest() throws InterruptedException {
        sell.validatePersonalAccidentClick();
    }

    @Test
    public void validateTermLifeTest() throws InterruptedException {
        sell.validateTermLifeClick();
    }

    @Test
    public void validateMFTest() throws InterruptedException {
        sell.validateMFClick();
    }

    @Test
    public void ValidateLifeInvestmentTest() throws InterruptedException {
        sell.ValidateLifeInvestmentClick();
    }

    @Test
    public void ValidateMobileTest() throws InterruptedException {
        sell.ValidateMobileClick();
    }
    @AfterMethod
    public void Close() {
        driver.quit();
    }
}
