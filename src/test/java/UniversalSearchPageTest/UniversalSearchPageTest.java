package UniversalSearchPageTest;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.sell.GrowPageSellButton;
import com.qa.turtlemint.pages.sell.SellPage;
import com.qa.turtlemint.pages.universal_search.universalSearchPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.RetryAnalyser;
import util.iTestListener;

@Listeners(iTestListener.class)
@Test(groups = {"universalSearch","mintpro"})
public class UniversalSearchPageTest extends TestBase {

    LoginPage Loginpage;
    SellPage sell;
    GrowPageSellButton sellButton;
    universalSearchPage usp;


    public UniversalSearchPageTest() {
        super();
    }

    @BeforeMethod()
    public void start() throws InterruptedException {
        initialization();
        Loginpage = new LoginPage();
        sellButton = new GrowPageSellButton();
        sell = new SellPage();
        usp = new universalSearchPage();

        Loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void testUniversalSearchOnAllPages(){
        usp.navigatingDifferentPagesOfMintpro();
    }

    @Test()
    public void testUniversalSearch(){
        usp.autoCompleteSearch();
    }

    @Test()
    public void checkIfAllTabsAreDisplayed(){
        usp.allTabsDisplayed();
    }

    @Test()
    public void checkIfSearchedLeadIsPresent(){
        usp.checkMyLeadsPresent();
    }

    @Test()
    public void checkTrySomethingNew(){
        usp.checkTrySomethingNewMessage();
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void queryUniversalSearch(){
        usp.queryPageChips();
    }

    @Test()
    public void PopularandrecentSearch(){
        usp.recentAndPopularSearch();
    }

    @Test()
    public void FeatureSearches(){usp.suggestedFeatures();}

    @AfterMethod
    public void end(){
        driver.quit();
    }
}