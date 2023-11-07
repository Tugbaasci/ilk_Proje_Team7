package tests.Ayfer;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_29 extends TestBaseRapor {
    @Test
    public  void loginTestCase01(){
        extentTest = extentReports.createTest("TestCase29_1: Successful Login Test",
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
    public void numberOfCurrenciesTestCase02(){
        extentTest = extentReports.createTest("TestCase29_2:  Affiliation Transactions  Test",
                "As an admin I should see the number of currencies");
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
        adminDashboard.currenciesWebElement.click();
        Assert.assertTrue(adminDashboard.currenciesWebElement.isDisplayed());
        extentTest.pass("Admin validates to access to the Currencies page");

        String searchResult=adminDashboard.numberOfCurrenciesText.getText();
        String[] searchResultWords=searchResult.split(" ");
        int numberOfCurrencies=0;

        for (int i=0; i<=searchResultWords.length;i++){
            if(searchResultWords[i].equals("of")){
                numberOfCurrencies= Integer.parseInt((searchResultWords[i+1]));
                break;
            }
        }
        System.out.println(numberOfCurrencies);

        Assert.assertTrue(numberOfCurrencies>0);
        extentTest.pass("Admin validates to see the number of currencies in the  Currencies Page ");

        Driver.closeDriver();
        extentTest.info("Admin closes the browser");

    }

}

