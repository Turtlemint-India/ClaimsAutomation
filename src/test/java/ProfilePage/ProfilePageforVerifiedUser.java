package ProfilePage;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.profile.ProfilePage;
import com.qa.turtlemint.pages.login.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.iTestListener;

@Listeners(iTestListener.class)
@Test(groups = {"profile","mintpro"})
public class ProfilePageforVerifiedUser extends TestBase {

    LoginPage Loginpage;
    ProfilePage profile;


    public ProfilePageforVerifiedUser() {
        super();
    }

    @BeforeMethod()
    public void start() {
        initialization();
        Loginpage = new LoginPage();
        profile = new ProfilePage();

        Loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
        profile.setProfileButton();
    }

    @Test
    public void relatonshipManager(){
        profile.relatonshipManager();
    }

    @Test
    public void myAccountDetails(){
        profile.myAcc();
        profile.myAccDetails();
        profile.setHelpCenterForNonVerified();
    }

    @Test()
    public void trainingButton() {
        profile.training();
    }

    @Test()
    public void logOut() {profile.LogOut();
    }

    @Test()
    public void editBrand() {
        profile.editPersonalBrand();
    }

    @AfterMethod
    public void Close() {
        driver.quit();
    }
}
