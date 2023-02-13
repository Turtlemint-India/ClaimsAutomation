package Leads;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.Leads.Leads;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.sell.GrowPageSellButton;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.RetryAnalyser;
import util.iTestListener;

@Listeners(iTestListener.class)
@Test(groups = {"leads","mintpro"})
public class MintproFlowForExistingUserTest extends TestBase {

    public LoginPage Loginpage;
    GrowPageSellButton growPage;
    Leads lead;

    public MintproFlowForExistingUserTest() {
        super();
    }

    @BeforeMethod()
    public void start()
    {
        initialization();
        Loginpage = new LoginPage();
        growPage = new GrowPageSellButton();
        lead = new Leads();

        Loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
    }

    @Test(description = "Lead redirection from dashboard")
    public void VerifyLeadRedirection() {
        lead.VerifyLeadsChips();
        lead.VerifyLeadOnDashboard();
        lead.VerticalRedirection();
    }

    @Test(description = "Mark Lead Won" ,retryAnalyzer = RetryAnalyser.class)
    public void MarkLeadWon() {lead.MarkLeadWon();}

    @Test(description = "Mark Lead Lost")
    public void MarkLeadLost()
    {
        lead.MarkLeadLost();
    }

    @Test(description = "Delete Lead")
    public void DeleteLead()
    {
        lead.DeleteLead();
    }

    @Test(description = "Help and support should display for all leads except TW lead")
    public void VerifyHelpAndSupportOption() { lead.HelpSection(); }

    @Test(description = "Help and support option from dashboard")
    public void HelpOptionDashboard()
    {
        lead.HelpSectionOnDashboard();
    }

    @Test(description = "Add reminder", retryAnalyzer = RetryAnalyser.class)
    public void AddReminder() throws InterruptedException {lead.AddReminder();}

    @Test(description = "Check unread lead and take screenshot")
    public void UnreadLeads()
    {
        lead.UnreadLead();
    }

    @Test(description = "Check Redirection from Explore more option" ,retryAnalyzer = RetryAnalyser.class)
    public void ExploreMoreOptions() {lead.ExploreMoreOption();}

    @Test(description = "Check Redirection from Renewal Now Banner more option")
    public void RenewalLeads() {lead.RenewalNowFloatingBanner();}

    @Test(description = "Check show all chip Contains All leads in Customer Generated Leads,Unreds,Remainders,Closed")
    public void LeadsAllChipsValidation() {lead.CustomerGeneratedAndShowAllValidation();}

    @AfterMethod()
    public void Close()
    {
        driver.quit();
    }
}
