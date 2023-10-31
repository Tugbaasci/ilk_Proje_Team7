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

public class US_27 extends TestBaseRapor {

    @Test
    public void loginTestCase01(){
        extentTest = extentReports.createTest("TestCase27_1: Successful Login Test",
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
        extentTest = extentReports.createTest("TestCase27_2:  Affiliation Transactions  Test",
                "As an admin I should see partnership transactions section,          \n" +
                        "  As an admin partnership users,       \n" +
                        "      As an admin  partnership amounts,\n" +
                        " As an admin approval status,\n" +
                        " As an admin partnership date, \n" +
                        "and As an admin partnership information");
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
        adminDashboard.affiliationTransactionsElement.click();
        extentTest.info("Admin clicks the Affiliation Transactions button");
        Assert.assertTrue(adminDashboard.affiliationTransactionsText.isDisplayed());
        extentTest.pass("Admin validates to access to the Affiliations Transactions page");

        List<WebElement> userTransactionsList=adminDashboard.userTransactionsListElement;
        Assert.assertTrue(userTransactionsList.size()>0);
        extentTest.pass("Admin validates to existence of the  User information on the Affiliation Transactions page");

        List<WebElement> amountTransactionsList=adminDashboard.amountListElement;
        Assert.assertTrue(amountTransactionsList.size()>0);
        extentTest.pass("Admin validates to existence of the Amount information on the Affiliation Transactions page");

        List<WebElement> approvalStatusTransactionsList=adminDashboard.approvelStatusTransactionsListElement;
        Assert.assertTrue(approvalStatusTransactionsList.size()>0);
        extentTest.pass("Admin validates to existence of the Approval Status information on the Affiliation Transactions page");

        List<WebElement> dateTransactionsList=adminDashboard.dateListElement;
        Assert.assertTrue(dateTransactionsList.size()>0);
        extentTest.pass("Admin validates to existence of the date information on the Affiliation Transactions page");

        List<WebElement> actionTransactionsList=adminDashboard.actionTransactionsListElement;
        Assert.assertTrue(actionTransactionsList.size()>0);
        extentTest.pass("Admin validates to existence of theAction information on the Affiliation Transactions page");

        Driver.closeDriver();
        extentTest.info("Admin closes the browser");

    }
}
