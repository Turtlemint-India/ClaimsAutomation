package Login;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.login.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.qa.turtlemint.base.TestBase.initialization;

public class MIS_Login extends TestBase {

    LoginPage Loginpage;

    public MIS_Login() {
        super();
    }

    @BeforeMethod()
    public void start() throws InterruptedException {
        initialization();
        Loginpage = new LoginPage();
    }

    @Test
    public void loginTest_MIS() throws Exception {
        Loginpage.ninja_MIS();
    }


    @AfterMethod
    public void Close() {
        driver.quit();
    }

}


