package Claim_deatails;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.claimDetails.Incident_Details_Page;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.mis.MIS;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(groups = {"RaisedClaim", "ClaimsFull"})
public class Incident_Details_Test extends TestBase {


    com.qa.turtlemint.pages.claimDetails.Incident_Details_Page Incident_Details_Page;
    public Incident_Details_Test() {
        super();
    }

    LoginPage Loginpage;
    MIS mis;
    public String misPolicy;

    @BeforeMethod()
    public void start() throws Exception {
        initialization();
        Loginpage = new LoginPage();
        Incident_Details_Page = new Incident_Details_Page();
        mis = new MIS();

        Loginpage.NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
        Loginpage.ninja_MIS();
        mis.MISPolicyNumber();
        misPolicy = mis.policyNumber();
        System.out.println(misPolicy);
        mis.BackTo_Claims();
    }

    @Test
    public void Incident_Details_ClaimsNo() throws Exception {
        Incident_Details_Page.incidentDetails_raised_claimNO(misPolicy);
    }

    @Test
    public void Incident_Details_ClaimsYes() throws Exception {

        Incident_Details_Page.incidentDetails_raised_claimYes(misPolicy);
    }

    @AfterMethod
    public void Close() {
        driver.quit();
    }

}