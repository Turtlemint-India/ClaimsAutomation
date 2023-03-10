package TrackFuction;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.IncidentDetail_Customer.IncidentDetail;
import com.qa.turtlemint.pages.TestCase15to19Page.TrackFunctionalityPage;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.mis.MIS;
import com.qa.turtlemint.util.RetryAnalyser;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.iTestListener;


@Listeners(iTestListener.class)
@Test(groups = {"Track", "ClaimsFull"})

public class TrackFunctionalityTest extends TestBase {

    public TrackFunctionalityTest() {
        super();
    }

    LoginPage Loginpage;
    TrackFunctionalityPage Track;
    IncidentDetail ID;
    MIS mis;
    public String misPolicy;

    @BeforeMethod()
    public void start() throws Exception {
        initialization();
        Loginpage = new LoginPage();
        Track = new TrackFunctionalityPage();
        mis = new MIS();
        ID = new IncidentDetail();


    }

    @Test( retryAnalyzer = RetryAnalyser.class)
    public void Track() throws Exception {

        Loginpage.NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
        Loginpage.ninja_MIS();

        misPolicy = mis.MISPolicyNumber();
        System.out.println(misPolicy);
        mis.BackTo_Claims();
        ID.MIS_Policy_Fetch(misPolicy);
        Track.DropDownHOLD_PENDING(misPolicy);
        Track.DropDownClosed();
        Track.ViewClaim();
    }
}
