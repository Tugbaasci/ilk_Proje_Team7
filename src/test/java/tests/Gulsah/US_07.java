package tests.Gulsah;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_07 extends TestBaseRapor {

    @Test
    public void US07_TC01() {
        extentTest = extentReports.createTest("UserStory07_TestCase1:Dashboard and dashboard panel items test ",
                "As a user I shuold able to reach the dashboard page and that the items on the page are displayable");

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("User navigate to the smartcardlink home webpage");
        UserDashboard userDashboard=new UserDashboard();
        userDashboard.signInButton.click();
        extentTest.info("User clicks the signin button");
        userDashboard.emailButton.sendKeys(ConfigReader.getProperty("user_username") );
        extentTest.info("User types a valid email adress to the email box");
        userDashboard.passwordButton.sendKeys(ConfigReader.getProperty("user_userPassword"));
        extentTest.info("User types a valid password to the password box");
        userDashboard.loginButton.click();
        extentTest.info("User clicks the login button");
        ReusableMethods.wait(2);
        Assert.assertTrue(userDashboard.dashboardElement.isDisplayed());
        extentTest.pass("User validates to access to the Dashboard page");
        Assert.assertTrue(userDashboard.vcardsElement.isEnabled());
        extentTest.pass("User validates to access to the Vcards Element ");
        Assert.assertTrue(userDashboard.enquiriesElement.isEnabled());
        extentTest.pass("User validates to access to the Enquiries Element");
        Assert.assertTrue(userDashboard.appointmentsElement.isEnabled());
        extentTest.pass("User validates to access to the Appointment Element");
        Assert.assertTrue(userDashboard.virtualBackroundsElement.isEnabled());
        extentTest.pass("User validates to access to the Virtual Backrounds Element");
        Assert.assertTrue(userDashboard.settingsElement.isEnabled());
        Driver.closeDriver();
        extentTest.info("User closes the browser");

    }
}