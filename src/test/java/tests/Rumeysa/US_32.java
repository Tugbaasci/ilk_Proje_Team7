package tests.Rumeysa;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_32 extends TestBaseRapor {


    @Test
    public void createCouponCodeTest() {
        extentTest = extentReports.createTest("TestCase32_1:  createCouponCodeTest",
                "As an admin I can create coupon code," +
                        "As an admin I can active,edit and delete coupon code,");

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Admin navigate to the smartcardlink home webpage");
        HomePage homePage = new HomePage();

        Driver.getDriver ().navigate ().refresh ();
        ReusableMethods.wait (3);
        homePage.signinButton.click();

        LoginPage loginPage = new LoginPage();
        ReusableMethods.wait (3);
       // loginPage.emailBox.click();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("admin_username"));
        extentTest.info("Admin types a valid username to the email box");

        //loginPage.passwordBox.click();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].value='" + ConfigReader.getProperty("admin_Password") + "';", loginPage.passwordBox);
        extentTest.info("Admin types a valid password to the password box using JavaScript");

       // loginPage.passwordBox.sendKeys(ConfigReader.getProperty("admin_password"));
      // extentTest.info("Admin types a valid password to the password box");

        loginPage.loginBox.click();
        extentTest.info("Admin clicks the login button");

        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.couponCodesButton.click();
        extentTest.info("Admin clicks the Coupon Code Button");

        adminDashboard.addCouponCodeButton.click();
        extentTest.info("Admin clicks the Add Coupon Code Button");

        adminDashboard.couponeNameBox.click();
        adminDashboard.couponeNameBox.sendKeys(ConfigReader.getProperty("couponName"));
        extentTest.info("Admin types a name  to the coupon name box ");

        adminDashboard.radioButtonFixedType.click();
        extentTest.info("Admin clicks fixed type button ");
        //   adminDashboard.percentage.click();

        adminDashboard.couponDiscountBox.click();
        adminDashboard.couponDiscountBox.sendKeys(ConfigReader.getProperty("couponDiscount"));
        extentTest.info("Admin types a number to the discount box");

        adminDashboard.couponExpireBox.click();
        extentTest.info("Admin cliks the expire box ");
        ReusableMethods.wait(2);
        adminDashboard.dropDownMonthsYear.click();
        Select select = new Select(adminDashboard.dropDownMonthsYear);
        select.selectByVisibleText("December");
        adminDashboard.boxday2.click();
        extentTest.info("Admin clikcs the date");

        adminDashboard.couponStatus.click();
        extentTest.info("Admin clicks the status box");

        adminDashboard.saveButton.click();
        extentTest.info("Admin clicks the save button");

        ReusableMethods.wait(2);

        Assert.assertTrue(adminDashboard.editButton.isDisplayed());
        extentTest.info("Admin validates to selected edit button ");
        Assert.assertTrue(adminDashboard.deleteButton.isDisplayed());
        extentTest.info("Admin validates to selected delete button");
        Assert.assertTrue(adminDashboard.couponcodesText.isDisplayed());
        extentTest.info("Admin validates to access to the coupon codes page");
        Assert.assertTrue(adminDashboard.rowFirst.isDisplayed());
        extentTest.info("Admin validates to access to the first row ");
        Assert.assertTrue(adminDashboard.changeCouponStatusButton.isDisplayed());
        extentTest.info("Admin validates to selected to the status button");
        Driver.closeDriver();
        extentTest.info("Admin closes the driver");


        System.out.println("*********************************");

    }
}
