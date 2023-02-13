package Login;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.login.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Claim_Login extends TestBase {

    LoginPage Loginpage;

    public Claim_Login() {
        super();
    }

    @BeforeMethod()
    public void start() throws InterruptedException {
        initialization();
        Loginpage = new LoginPage();
    }

    @Test
    public void loginTest_MIS() throws Exception {
        Loginpage.ninja_Claims();
    }


    @AfterMethod
    public void Close() {
        driver.quit();
    }

}


