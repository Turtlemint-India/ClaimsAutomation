package IncidentDetail_Customer;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.IncidentDetail_Customer.IncidentDetail;
import com.qa.turtlemint.pages.login.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(groups = {"CustomerIncident", "ClaimsFull"})

public class IncidentDetailsTest extends TestBase {
    public IncidentDetailsTest() {
        super();
    }

    LoginPage Loginpage;
    IncidentDetail ID;

    @BeforeMethod()
    public void start() throws Exception {
        initialization();
        Loginpage = new LoginPage();
        ID = new IncidentDetail();
        Loginpage.ninja_Claims();
    }

    @Test
    public void CostomerContactNo_Test() {
        ID.CustomerContactNo();
    }

    @Test
    public void CustomerPineCode_Test() {
        ID.CustomerPinCode();
    }

    @Test
    public void MultipleSelection_Test() {
        ID.MultipleSelectionForDeleteClaims();
    }

    @Test
    public void DeleteClaims_Test() {
        ID.DeleteClaims();
    }

    @Test
    public void DeleteClaimsCancel_Test() {
        ID.DeleteClaimsCancel();
    }

    @Test
    public void StatusClosed_Test() {
        ID.StatusClosed();
    }

    @Test
    public void TwoDayBeforDate_Test() {
        ID.TwoDayBeforDate();
    }



    @AfterMethod
    public void Close() {
        driver.quit();
    }
}