package Claim_deatails;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.claimDetails.Incident_Details_Page;
import com.qa.turtlemint.pages.login.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Incident_Details_Test extends TestBase {

    LoginPage Loginpage;
    com.qa.turtlemint.pages.claimDetails.Incident_Details_Page Incident_Details_Page;
    public Incident_Details_Test() {
        super();
    }

    @BeforeMethod()
    public void start() throws InterruptedException {
        initialization();
        Loginpage = new LoginPage();
        Incident_Details_Page = new Incident_Details_Page();
    }

    @Test
    public void Incident_Details_ClaimsNo() throws Exception {
        Loginpage.ninja_Claims();
        Incident_Details_Page.incidentDetails_raised_claimNO();
    }

    @Test
    public void Incident_Details_ClaimsYes() throws Exception {
        Loginpage.ninja_Claims();
        Incident_Details_Page.incidentDetails_raised_claimYes();
    }


    @AfterMethod
    public void Close() {
        driver.quit();
    }

}