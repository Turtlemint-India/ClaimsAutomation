package Raised_Claim;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.claimDetails.Incident_Details_Page;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.mis.MIS;
import com.qa.turtlemint.util.RetryAnalyser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.iTestListener;

@Listeners(iTestListener.class)
@Test(groups = {"RaisedClaim", "ClaimsFull"},retryAnalyzer = RetryAnalyser.class)

public class Raised_Claim_test extends TestBase {


    com.qa.turtlemint.pages.claimDetails.Incident_Details_Page Incident_Details_Page;
    public Raised_Claim_test() {
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
        misPolicy = mis.MISPolicyNumber();
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