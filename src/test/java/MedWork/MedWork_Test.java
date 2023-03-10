package MedWork;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.MedWorkINIT.ClaimsHomePG;
import com.qa.turtlemint.pages.MedWorkINIT.Initiimate;
import com.qa.turtlemint.pages.MedWorkINIT.Medical;
import com.qa.turtlemint.pages.MedWorkINIT.Workshop;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.mis.MIS;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.iTestListener;

@Listeners(iTestListener.class)
@Test(groups = {"Medwork", "ClaimsFull"})

public class MedWork_Test extends TestBase {
    LoginPage Loginpage;
    ClaimsHomePG ClaimHm;
    Medical Med;
    Workshop Wrk;
    Initiimate INIT;
    MIS mis;
    public String misPolicy;

    @BeforeMethod()
    public void start() throws Exception {
        initialization();
        Loginpage = new LoginPage();
        ClaimHm = new ClaimsHomePG();
        INIT = new Initiimate();
        Med = new Medical();
        Wrk = new Workshop();
        mis = new MIS();


        Loginpage.NinjaLogin(prop.getProperty("ninjaemail"), prop.getProperty("ninjapass"));
        Loginpage.ninja_MIS();
        mis.MISPolicyNumber();
        misPolicy = mis.policyNumber();
        System.out.println(misPolicy);
        mis.BackTo_Claims();
    }


    @Test(enabled = true)
    public void MedicalAssistanceTest() throws Exception {
        ClaimHm.SetupIncidentDetailPage(misPolicy);
        Med.MedicalAsitancePageNavigation();  // For TC1  Assertion Point
        Med.MoveForwardTest();  // For Tc2 Assertion Point
        Med.VerifyWorkShopButton(); // For Tc3 Assertion Point
    }

    @Test( enabled = true)
    public void WorkshopSelectionTest() throws Exception {

        ClaimHm.SetupIncidentDetailPage(misPolicy);
        Med.MedicalAsitancePage();
        Wrk.WorkshopPageVerify();// For TC1  Assertion Point.
        Wrk.CheckboxFunctionality();// For TC2 Assertion Point.
        Wrk.WorkShopSelection();// For Tc3 Assertion Point.
        Wrk.SaveAndProceedVerify();// For Tc4 Assertion Point.
    }

    @Test( enabled = true)
    public void IntiMateInsurerTest() throws Exception {

        ClaimHm.SetupIncidentDetailPage(misPolicy);
        Med.MedicalAsitancePage();
        Wrk.WorkShopPageFill();
        INIT.VerifyQuickPreviewPage();//Tc1 Assertion Point.
        INIT.VerifySubmitClaim();//Tc2 Assertion Point.
        INIT.SkipAndContinue();//Tc3 Assertion Point.
        INIT.SaveAndContinue();//Tc4 Assertion Point.
    }

    public void teardown() {
        driver.quit();
    }

}
