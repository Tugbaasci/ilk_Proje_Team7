package tests.Rumeysa;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;


public class US_34 extends TestBaseRapor {

    @Test
    public void newsSubscribersViewAndDeleteTest(){

        extentTest = extentReports.createTest("TestCase34: newsSubscribersViewAndDeleteTest","As an admin I should be able to  view and delete news subscribers");

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Admin navigate to the smartcardlink home webpage");
        HomePage homePage = new HomePage();
        Driver.getDriver ().navigate ().refresh ();
        ReusableMethods.wait (3);

        homePage.signinButton.click();
        extentTest.info("Admin clicks the signin button");

        LoginPage loginPage = new LoginPage();
        //loginPage.emailBox.click();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("admin_username"));
        extentTest.info("Admin types a valid username to the email box");

       //loginPage.passwordBox.click();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].value='" + ConfigReader.getProperty("admin_Password") + "';", loginPage.passwordBox);
        extentTest.info("Admin types a valid password to the password box using JavaScript");




        //loginPage.passwordBox.click();
        //loginPage.passwordBox.sendKeys(ConfigReader.getProperty("admin_Password"));
        //extentTest.info("Admin types a valid password to the password box");

        loginPage.loginBox.click();
        extentTest.info("Admin clicks the login button");


        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.frontCMSButton.click();
        extentTest.info("Admin clicks the FRONT CMS button");
        ReusableMethods.wait(2);
        adminDashboard.subscribersLink.click();
        ReusableMethods.wait(2);
        extentTest.info("Admin clicks the Subscribers ");

        Assert.assertTrue(adminDashboard.subscribersResult.isDisplayed());
        extentTest.info("Admin validates to access to the Subscribers page");
        Driver.closeDriver();
        extentTest.info("Admin closes the browser");




    }
}
