package Login;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.util.TestUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.iTestListener;

import java.io.IOException;

@Listeners(iTestListener.class)
@Test(groups = {"login","mintpro"})
public class MintproLoginTest extends TestBase {

    LoginPage Loginpage;

    public MintproLoginTest() {
        super();
    }

    @BeforeMethod()
    public void start() throws InterruptedException {
        initialization();
        Loginpage = new LoginPage();
    }

    @Test(enabled = true)
    public void loginTest() throws InterruptedException {
        Loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
    }

    @Test(enabled = true)
    public void invalidLoginTest() throws InterruptedException, IOException {
        Loginpage.InvalidLoginPage(TestUtil.getRandomPhoneNumber(),TestUtil.getRandomOtp());
    }

    @Test(enabled = true)
    public void lockIncorrectOtpTest() throws InterruptedException {
        Loginpage.lockWrongOtp(TestUtil.getRandomPhoneNumber(),TestUtil.getRandomOtp());
    }

    @Test(enabled = true)
    public void resendOtp() throws InterruptedException {
        Loginpage.resendOtp(TestUtil.getRandomPhoneNumber());
    }

    @AfterMethod
    public void Close() {
        driver.quit();
    }


}


