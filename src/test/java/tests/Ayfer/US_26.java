package tests.Ayfer;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.List;

public class US_26 extends TestBaseRapor {
    @Test
    public void loginTestCase01(){
        extentTest = extentReports.createTest("TestCase26_1: Successful Login Test",
                "As an admin I should be able to login");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Admin navigate to the smartcardlink home webpage");
        HomePage homePage=new HomePage();
        homePage.signinButton.click();
        extentTest.info("Admin clicks the signin button");

        LoginPage loginPage=new LoginPage();
        loginPage.emailBox.clear();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("admin_username"));
        extentTest.info("Admin types a valid email adress to the email box");
        loginPage.passwordBox.clear();
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("admin_Password"));
        extentTest.info("Admin types a valid password to the password box");
        loginPage.loginBox.click();
        extentTest.info("Admin clicks the login button");

        AdminDashboard adminDashboard=new AdminDashboard();
        Assert.assertTrue(adminDashboard.dashboardText.isDisplayed());
        extentTest.pass("Admin validates to access to the Dashboard page");
        Driver.closeDriver();
        extentTest.info("Admin closes the browser");

    }
    @Test
    public void tableElementIsDisplayTestCase02(){
        extentTest = extentReports.createTest("TestCase26_2:  Affiliate Users  Test",
                "As an admin I should see affiliated by,   As an admin I should see registered users," +
                        "As an admin I should see affiliation amount," +
                        "As an admin I should see the date of affiliation");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Admin navigate to the smartcardlink home webpage");
        HomePage homePage=new HomePage();
        homePage.signinButton.click();

        LoginPage loginPage=new LoginPage();
        loginPage.emailBox.clear();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("admin_username"));
        extentTest.info("Admin types a valid password to the password box");
        loginPage.passwordBox.clear();
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("admin_Password"));
        extentTest.info("Admin types a valid password to the password box");
        loginPage.loginBox.click();
        extentTest.info("Admin clicks the login button");

        AdminDashboard adminDashboard=new AdminDashboard();
        adminDashboard.affiliationUsersElement.click();
        extentTest.info("Admin clicks the Affiliation Users button");
        Assert.assertTrue(adminDashboard.affiliateUsersText.isDisplayed());
        extentTest.pass("Admin validates to access to the Affiliation Users page");

        List<WebElement> affiliatedByList=adminDashboard.affiliatedByListElement;
        Assert.assertTrue(affiliatedByList.size()>0);
        extentTest.pass("Admin validates to existence of the  Affiliated By information on the Affiliated Users page");
        List<WebElement> userList=adminDashboard.userListElement;
        Assert.assertTrue(userList.size()>0);
        extentTest.pass("Admin validates to existence of the  users information on the Affiliated Users page");
        List<WebElement> affiliationAmountList=adminDashboard.amountListElement;
        Assert.assertTrue(affiliationAmountList.size()>0);
        extentTest.pass("Admin validates to existence of the  Affiliation Amount information on the Affiliated Users page");
        List<WebElement> dateList=adminDashboard.dateListElement;
        Assert.assertTrue(dateList.size()>0);
        extentTest.pass("Admin validates to existence of the  date information on the Affiliated Users page");
        Driver.closeDriver();
        extentTest.info("Admin closes the browser");

    }

}
