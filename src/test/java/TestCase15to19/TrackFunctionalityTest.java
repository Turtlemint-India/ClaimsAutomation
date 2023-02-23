package TestCase15to19;

import Login.MIS_Login;
import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.TestCase15to19Page.TrackFunctionalityPage;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.mis.MIS;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TrackFunctionalityTest extends TestBase {

    public TrackFunctionalityTest(){
        super();
    }



    LoginPage Loginpage;
    TrackFunctionalityPage Track;
   // MIS_Login mis;
    MIS mis;
    public String misPolicy;
    @BeforeMethod()
    public void start() throws Exception {
        initialization();
        Loginpage = new LoginPage();
        Track = new TrackFunctionalityPage();
       // mislogin = new MIS_Login();
        mis = new MIS();


    }

    @Test
    public void Track() throws Exception {
        //mis.loginTest_MIS();

       Loginpage.NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
        Loginpage.ninja_MIS();
        mis.MISPolicyNumber();
        misPolicy = mis.policyNumber();
        Loginpage.ninja_Claims();
        Track.DropDownHOLD_PENDING();
        Track.DropDownClosed();
        Track.ViewClaim();

    }


}
