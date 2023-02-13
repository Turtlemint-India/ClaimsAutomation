package com.qa.turtlemint.pages.profile;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends TestBase {

    @FindBy(xpath = "//span[text()='Profile']")
    WebElement profileButton;

    @FindBy(xpath = "//span[text()='Call Relationship Manager']")
    WebElement relatonshipManager;

    @FindBy(xpath = "//div[@role='presentation']")
    WebElement NoRelatonshipManager;


    @FindBy(xpath = "//*[text()='My Account']")
    WebElement myAcc;

    @FindBy(xpath = " //*[@class='removeButton']")
    WebElement removeutton;

    @FindBy(xpath = "//*[text()='Aadhaar Details']")
    WebElement adharUpload;

    @FindBy(xpath = "//*[text()='Bank Details']")
    WebElement bankDetails;

    @FindBy(xpath = "//*[text()='Discard']")
    WebElement discard;

    @FindBy(xpath = "//*[text()='Education Details']")
    WebElement EducationalDetails;

    @FindBy(xpath = "//*[text()='Personal Details']")
    WebElement personalDetails;

    @FindBy(xpath = "//*[text()='Need Help? Chat with us.']")
    WebElement helpCenter;

    @FindBy(xpath = "//*[@id=\"adhaarCardBackNumberFile\"]")
    WebElement UploadFile2;

    @FindBy(xpath = "//div[text()='Help Center']")
    WebElement helpCenterText;

    @FindBy(xpath = "//*[text()='Verified']")
    WebElement verified;

    @FindBy(xpath = "//span[normalize-space()='Get free certifications here']")
    WebElement trainButton;

    @FindBy(xpath = "//h4[text()='Why get PoSP Training?']")
    WebElement POSPTrainAssert;

    @FindBy(xpath = "//h2[text()='LI  POSP Certification Course']")
    WebElement LIPOSPAssert;

    @FindBy(xpath = "//h2[text()='GI POSP Certification Course']")
    WebElement GIPOSPAssert;

    @FindBy(xpath = "//div[@class='explorMintAccdemy']")
    WebElement explorMintAccdemy;

    @FindBy(xpath = "//a[normalize-space()='Training']")
    WebElement training;

    @FindBy(xpath = "//h4[text()='Get Certified for Free']")
    WebElement getCertifiedforFree;

    @FindBy(xpath = "//h5[text()='Settings']")
    WebElement Settings;

    @FindBy(xpath = "//span[text()='Log Out']")
    WebElement LogOut;

    @FindBy(xpath = "//span[text()='Create an account/ Sign in']")
    WebElement CreateAccount;

    @FindBy(xpath = "//h5[text()='Edit Personal Brand']")
    WebElement editBrand;

    @FindBy(id = "fname")
    WebElement fname;

    @FindBy(id = "mobile")
    WebElement mobile;

    @FindBy(id = "email")
    WebElement email;

    @FindBy(xpath = "//span[text()='Apply Everywhere & Go Back']")
    WebElement Apply;

    @FindBy(xpath = "(//span[text()='Logout'])[2]")
    WebElement finalLogOut;


    public ProfilePage() {
        PageFactory.initElements(driver, this);
    }

    public void setProfileButton() {
        TestUtil.click(profileButton, "click on profile button");
    }

    public void relatonshipManager() {

        TestUtil.IsDisplayed(relatonshipManager, "Checking if Relationship Manager is present");

    }

    public void relatonshipManagerforNonverified() {

        TestUtil.IsDisplayed(NoRelatonshipManager, "Checking if Health Insurance Card is Present"); //No Relationship Manager Assigned

    }

    public void myAcc(){

        WebCommands.staticSleep(2000);
        TestUtil.click(myAcc, "click on my acc");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
    }

    public void uploadDeleteFile(){
        WebCommands.staticSleep(3000);
        TestUtil.uploadFile("ubuntu");
        WebCommands.staticSleep(9000);
        TestUtil.click(removeutton , "remove uploaded file");
        TestUtil.click(adharUpload, "adhar");
        TestUtil.click(discard , "delete file");
        TestUtil.uploadFile( "ubuntu");
        WebCommands.staticSleep(3000);
        TestUtil.getScreenShot();
        TestUtil.uploadFile( "ubuntu");
       // UploadFile2.sendKeys("/Users/hemant/Downloads/dog.png");
        WebCommands.staticSleep(9000);
        TestUtil.getScreenShot();
        TestUtil.click(removeutton , "remove uploaded file");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.click(bankDetails, "adhar");
        TestUtil.click(discard , "delete file");
        TestUtil.uploadFile("ubuntu");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        WebCommands.staticSleep(9000);
        TestUtil.click(removeutton , "remove uploaded file");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.click(EducationalDetails , "click on Educational Details");
        TestUtil.click(discard , "delete file");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.uploadFile( "ubuntu");
        WebCommands.staticSleep(9000);
        TestUtil.click(removeutton , "remove uploaded file");
        TestUtil.click(personalDetails, "click on personal Details");
        TestUtil.click(discard , "delete file");
        TestUtil.uploadFile("ubuntu");
        WebCommands.staticSleep(9000);
        TestUtil.click(removeutton , "remove uploaded file");
    }

    public void setHelpCenter(){
        TestUtil.click(helpCenter,"click on help center");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(helpCenterText , "help Center is displayed");
    }

    public void setHelpCenterForNonVerified(){
        TestUtil.click(helpCenter,"click on help center");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(helpCenterText , "help Center is displayed");
    }

    public void myAccDetails(){
        TestUtil.IsDisplayed(verified , "Pan details verified");
        TestUtil.click(adharUpload, "Click on Adhar");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(verified , "adhar details verified");
        TestUtil.click(bankDetails, "click on bank ");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(verified , "bank details verified");
        TestUtil.click(EducationalDetails , "click on educational details ");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(verified , "eduactional details verified");
        TestUtil.click(personalDetails, "personal details ");
        TestUtil.IsDisplayed(verified , "personal details verified");
    }

    public void training() {
        TestUtil.click(trainButton, "Training Button clicked");
        WebCommands.staticSleep(4000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(POSPTrainAssert, "Why POSP training displayed");
        TestUtil.IsDisplayed(LIPOSPAssert, "LI POSP Certification displayed");
        TestUtil.IsDisplayed(GIPOSPAssert, "LI POSP Certification displayed");
        TestUtil.IsDisplayed(explorMintAccdemy, "LI POSP Certification displayed");
        TestUtil.IsDisplayed(training, "Training Page Displayed");
    }

    public void trainingforNonverified() {
        TestUtil.click(trainButton, "Training Button clicked");
        WebCommands.staticSleep(4000);
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(POSPTrainAssert, "Why POSP training displayed");
        TestUtil.IsDisplayed(explorMintAccdemy, "LI POSP Certification displayed");
        TestUtil.IsDisplayed(training, "Training Page Displayed");
        TestUtil.IsDisplayed(getCertifiedforFree,"Since its non-verified user we see Get Certified for Free");
    }

    public void LogOut() {
        TestUtil.click(Settings,"Settings clicked");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.click(LogOut,"LogOut clicked");
        WebCommands.staticSleep(3000);
        TestUtil.click(finalLogOut,"Logged Out Now");
        TestUtil.getScreenShot();
        TestUtil.IsDisplayed(CreateAccount,"Logged Out Successfully");
    }

    public void editPersonalBrand() {
        TestUtil.click(editBrand,"Edit Personal Brand Clicked");
        TestUtil.uploadFile("ubuntu");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.clear(fname,"fname cleared");
        TestUtil.sendKeys(fname,"Test","fname updated");
        WebCommands.staticSleep(1000);
        TestUtil.getScreenShot();
        TestUtil.clear(mobile,"Mobile Number cleared");
        TestUtil.sendKeys(mobile,"9999888812","fname updated");
        TestUtil.clear(email,"email cleared");
        TestUtil.sendKeys(email,"auto@rickshaw.com","fname updated");
        WebCommands.staticSleep(3000);
        TestUtil.getScreenShot();
        TestUtil.click(Apply,"Applied and Saved");
        WebCommands.staticSleep(5000);
        TestUtil.click(editBrand,"Edit Personal Brand Clicked");
        TestUtil.clear(fname,"fname cleared");
        TestUtil.sendKeys(fname,"automation","Reverted back to automation");
        TestUtil.clear(mobile,"Mobile Number cleared");
        TestUtil.sendKeys(mobile,"6999912345","Reverted back to default number");
        TestUtil.clear(email,"email cleared");
        TestUtil.sendKeys(email,"automationtesting@turtlemint.com","email reverted");
        WebCommands.staticSleep(3000);
        TestUtil.getScreenShot();
        TestUtil.click(Apply,"Applied and Saved");
    }

    public void editPersonalBrandforNonVerifiedUser() {
        TestUtil.click(editBrand,"Edit Personal Brand Clicked");
        TestUtil.uploadFile("ubuntu");
        TestUtil.clear(fname,"fname cleared");
        TestUtil.sendKeys(fname,"Test","fname updated");
        TestUtil.clear(mobile,"Mobile Number cleared");
        TestUtil.sendKeys(mobile,"9999888812","fname updated");
        TestUtil.clear(email,"email cleared");
        TestUtil.sendKeys(email,"auto@rickshaw.com","fname updated");
        WebCommands.staticSleep(3000);
        TestUtil.getScreenShot();
        TestUtil.click(Apply,"Applied and Saved");
        WebCommands.staticSleep(5000);
        TestUtil.click(editBrand,"Edit Personal Brand Clicked");
        TestUtil.clear(fname,"fname cleared");
        TestUtil.sendKeys(fname,"google play user","Reverted back to automation");
        TestUtil.clear(mobile,"Mobile Number cleared");
        TestUtil.sendKeys(mobile,"6888812345","Reverted back to default number");
        TestUtil.clear(email,"email cleared");
        TestUtil.sendKeys(email,"googleplayconsole@turtlemint.com","email reverted");
        WebCommands.staticSleep(3000);
        TestUtil.getScreenShot();
        TestUtil.click(Apply,"Applied and Saved");
    }

    }