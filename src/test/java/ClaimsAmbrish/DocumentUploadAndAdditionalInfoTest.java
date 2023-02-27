package ClaimsAmbrish;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.ClaimsAmbrish.AdditionalInfoPage;
import com.qa.turtlemint.pages.ClaimsAmbrish.DocumentUploadPage;
import com.qa.turtlemint.pages.login.LoginPage;
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

    public DocumentUploadAndAdditionalInfoTest() {
        super();
    }

    @BeforeMethod()
    public void start() throws InterruptedException {
        initialization();
        Loginpage = new LoginPage();
        dup = new DocumentUploadPage();
        aip = new AdditionalInfoPage();
    }

    @Test
    public void AdditionalInfoPage() throws Exception {
        Loginpage.ninja_Claims();
        dup.Doc();
        aip.SurveyorDetails();
    }


    @AfterMethod
    public void Close() {
        driver.quit();
    }
}
