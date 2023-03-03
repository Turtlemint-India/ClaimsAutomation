package Login;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.IncidentDetail_Customer.IncidentDetail;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.mis.MIS;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MIS_Login extends TestBase {

    public String misPolicy;
    LoginPage Loginpage;
    MIS mis;

    IncidentDetail ID;

    public MIS_Login() {
        super();
    }

    @BeforeMethod()
    public void start() throws InterruptedException {
        initialization();
        Loginpage = new LoginPage();
        mis = new MIS();
        ID = new IncidentDetail();


    }

    @Test
    public void loginTest_MIS() throws Exception {
      //  Loginpage.NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
        Loginpage.ninja_MIS();
        mis.MISPolicyNumber();
        misPolicy = mis.policyNumber();
        System.out.println(misPolicy);
        mis.BackTo_Claims();

        ID.MIS_Policy_Fetch(misPolicy);
    }

    @AfterMethod
    public void Close() {
        driver.quit();
    }
}
