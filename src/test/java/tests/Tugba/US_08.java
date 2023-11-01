package tests.Tugba;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_08 extends TestBaseRapor {
    HomePage homePage;
    UserDashboard userDashboard;
    @Test
    public void TC_01Login(){
        extentTest= extentReports.createTest("US_0801_Login test",
                "A registered user should succesfully log in");
    //anasayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("User navigates to smartcardlink homepage");
    //Sign in olalim
        homePage = new HomePage();
        homePage.signinButton.click();
        extentTest.info("User signs in");
    //Login yapalim
        LoginPage loginPage = new LoginPage();
        loginPage.emailBox.sendKeys("semasozeri@gmail.com");
        extentTest.info("User writes his email");
        loginPage.passwordBox.sendKeys("semasozeri&123");
        extentTest.info("User writes his password");
        loginPage.loginBox.click();
        extentTest.info("User clicks login button");
        userDashboard = new UserDashboard();
        Assert.assertTrue(userDashboard.headerDashboard.isDisplayed());
        extentTest.pass("User sees Dashboard on his own page");
        Driver.closeDriver();
    }
    @Test
    public void TC_02PersonalAccountTest(){
        extentTest= extentReports.createTest("US_0802_Directed to own site test",
                "A registered user should be succesfully directed to his own account");
        //anasayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("User navigates to smartcardlink homepage");
        //Sign in olalim
        homePage = new HomePage();
        homePage.signinButton.click();
        extentTest.info("User signs in");
        //Login yapalim
        LoginPage loginPage = new LoginPage();
        loginPage.emailBox.sendKeys("semasozeri@gmail.com");
        extentTest.info("User writes his email");
        loginPage.passwordBox.sendKeys("semasozeri&123");
        extentTest.info("User writes his password");
        loginPage.loginBox.click();
        extentTest.info("User clicks login button");
        userDashboard = new UserDashboard();
        Assert.assertTrue(userDashboard.kisiselIsimAcilirMenu.isDisplayed());
        extentTest.pass("User validates access personal account page");
        Driver.closeDriver();
    }
    @Test
    public void TC_03CreateVCard(){
        extentTest= extentReports.createTest("US_0803 registered user can create his own vcard test",
                "A registered user should succesfully create his own vcard");
        //anasayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("User navigates to smartcardlink homepage");
        //Sign in olalim
        homePage = new HomePage();
        homePage.signinButton.click();
        extentTest.info("User signs in");
        //Login yapalim
        LoginPage loginPage = new LoginPage();
        loginPage.emailBox.sendKeys("semasozeri@gmail.com");
        extentTest.info("User writes his email");
        loginPage.passwordBox.sendKeys("semasozeri&123");
        extentTest.info("User writes his password");
        loginPage.loginBox.click();
        extentTest.info("User clicks login button");
        userDashboard = new UserDashboard();

    }
}
