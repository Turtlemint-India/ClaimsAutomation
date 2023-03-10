package ClaimsAmbrish;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.ClaimsAmbrish.AdditionalInfoPage;
import com.qa.turtlemint.pages.ClaimsAmbrish.DocumentUploadPage;
import com.qa.turtlemint.pages.MedWorkINIT.ClaimsHomePG;
import com.qa.turtlemint.pages.MedWorkINIT.Initiimate;
import com.qa.turtlemint.pages.MedWorkINIT.Medical;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.mis.MIS;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author Ambrish Balde 29/06/2022
 * @author ambrish.balde
 * @Project Turtlemint Frontend Automation
 */
public class DocumentUploadAndAdditionalInfoTest extends TestBase {

    LoginPage Loginpage;
    DocumentUploadPage dup;
    AdditionalInfoPage aip;

    ClaimsHomePG ClaimHm;
    Medical Med;
    MIS mis;
    public String misPolicy;

    public DocumentUploadAndAdditionalInfoTest() {
        super();
    }

    @BeforeMethod()
    public void start() throws Exception {
        initialization();
        Loginpage = new LoginPage();
        dup = new DocumentUploadPage();
        aip = new AdditionalInfoPage();
        ClaimHm = new ClaimsHomePG();
        Med = new Medical();
        mis = new MIS();
        Loginpage.NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
        Loginpage.ninja_MIS();
        mis.MISPolicyNumber();
        misPolicy = mis.policyNumber();
        System.out.println(misPolicy);
        mis.BackTo_Claims();

    }

    @Test
    public void AdditionalInfoPage() throws Exception {
        ClaimHm.SetupIncidentDetailPage(misPolicy);
        Med.MedicalAsitancePageNavigation();  // For TC1  Assertion Point
        Med.MoveForwardTest();  // For Tc2 Assertion Point
        Med.VerifyWorkShopButton(); // For Tc3 Assertion Point

        dup.Doc();
        aip.SurveyorDetails();
    }


    @AfterMethod
    public void Close() {
        driver.quit();
    }
}
