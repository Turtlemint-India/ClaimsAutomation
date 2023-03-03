package TrackFuction;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.IncidentDetail_Customer.IncidentDetail;
import com.qa.turtlemint.pages.TestCase15to19Page.TrackFunctionalityPage;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.mis.MIS;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


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

        Loginpage.NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
        Loginpage.ninja_MIS();
        mis.MISPolicyNumber();
        misPolicy = mis.policyNumber();
        System.out.println(misPolicy);
        mis.BackTo_Claims();
        ID.MIS_Policy_Fetch(misPolicy);

    }

    @Test
    public void Track() throws Exception {
        Track.DropDownHOLD_PENDING(misPolicy);
        Track.DropDownClosed();
        Track.ViewClaim();
    }
}
