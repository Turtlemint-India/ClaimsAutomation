package TestCase15to19;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.TestCase15to19Page.TrackFunctionalityPage;
import com.qa.turtlemint.pages.login.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TrackFunctionalityTest extends TestBase {

    public TrackFunctionalityTest(){
        super();
    }



    LoginPage Loginpage;
    TrackFunctionalityPage Track;

    @BeforeMethod()
    public void start() throws Exception {
        initialization();
        Loginpage = new LoginPage();
        Loginpage.ninja_Claims();
        Track = new TrackFunctionalityPage();
    }

    @Test
    public void Track(){

        Track.DropDown();

    }


}
