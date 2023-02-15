package Login;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.mis.MIS;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.qa.turtlemint.base.TestBase.initialization;

public class MIS_Login extends TestBase {

    LoginPage Loginpage;
    MIS mis;

    public MIS_Login() {
        super();
    }

    @BeforeMethod()
    public void start() throws InterruptedException {
        initialization();
        Loginpage = new LoginPage();
        mis = new MIS();
    }

    @Test
    public void loginTest_MIS() throws Exception {
        Loginpage.NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
        Loginpage.ninja_MIS();
        mis.MISPolicyNumber();
    }


    @AfterMethod
    public void Close() {
        driver.quit();
    }

}


