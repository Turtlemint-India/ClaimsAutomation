package ProfilePage;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.profile.ProfilePage;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.util.TestUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.RetryAnalyser;
import util.iTestListener;

@Listeners(iTestListener.class)
@Test(groups = {"profile","mintpro"})
public class ProfilePageforNonVerifiedUser extends TestBase {

    LoginPage Loginpage;
    ProfilePage profile;


    public ProfilePageforNonVerifiedUser() {
        super();
    }

    @BeforeMethod()
    public void start() {
        initialization();
        Loginpage = new LoginPage();

        Loginpage.ValidateLogin("6888812345", "1234");
        profile = new ProfilePage();
        profile.setProfileButton();
    }

    @Test
    public void relatonshipManagerforNonverified(){
        profile.relatonshipManagerforNonverified();
    }

    @Test(retryAnalyzer = RetryAnalyser.class)
    public void myAccountDetails(){
        profile.myAcc();
        profile.uploadDeleteFile();
        profile.setHelpCenterForNonVerified();
    }

    @Test()
    public void trainingButtonforNonverified() {
        profile.trainingforNonverified();
    }

    @Test()
    public void editBrandforNonVerified() {
        profile.editPersonalBrandforNonVerifiedUser();
    }

    @AfterMethod
    public void Close() {
        driver.quit();
    }
}

