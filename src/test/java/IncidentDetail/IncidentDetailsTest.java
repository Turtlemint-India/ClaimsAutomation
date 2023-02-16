package IncidentDetail;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.IncidentDetail.IncidentDetail;
import com.qa.turtlemint.pages.login.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
        ID.CostomerContactNo();
    }

    @Test
    public void CostomerPineCode_Test() {
        ID.CostomerPineCode();
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
}