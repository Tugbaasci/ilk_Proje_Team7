package tests.Gulsah;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_15 extends TestBaseRapor {

    @BeforeMethod
    public void setUp(){
        extentTest = extentReports.createTest("UserStory15: Before Method");
        ReusableMethods reusableMethods=new ReusableMethods();
        UserDashboard userDashboard=new UserDashboard();
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("User navigate to the smartcardlink home webpage");
        userDashboard.signInButton.click();
        extentTest.info("User clicks the signin button");
    }
    @AfterMethod
    public void tearDown(){extentTest = extentReports.createTest("UserStory15: After Method");
        Driver.closeDriver();
        extentTest.info("User closes the browser");
    }
    @Test
    public void TC01subscribtionsDislayed(){
        extentTest = extentReports.createTest("TestCase_01:Manage Subscribtions Test ",
                "As a user I shuold able to access to the Manage Subscibtions");
        ReusableMethods reusableMethods=new ReusableMethods();
        UserDashboard userDashboard=new UserDashboard();
        ReusableMethods.wait(2);
        userDashboard.emailButton.sendKeys(ConfigReader.getProperty("user_usernametest"));
        extentTest.info("User types a valid e-mail to the e-mail box");
        userDashboard.passwordButton.sendKeys(ConfigReader.getProperty("user_userPasswordtest"));
        extentTest.info("User types a valid password to the password box");
        ReusableMethods.wait(2);
        userDashboard.loginButton.click();
        extentTest.info("User clicks the login button");
        ReusableMethods.wait(2);
        userDashboard.userNameButton.click();
        userDashboard.manageSubscribtionButton.click();
        extentTest.info("User clicks the Manage Subscribtions button");
        Assert.assertTrue(userDashboard.manageSubscribtionPage.isDisplayed());
        extentTest.pass("User validates to access to the Manage Subscribtions");
    }
    @Test
    public void TC02upgradePlanWithCard() {
        extentTest = extentReports.createTest("TestCase02:Upgrade plan with Card ",
                "As a user I shuold able to upgrade plan with stripe");
        ReusableMethods reusableMethods = new ReusableMethods();
        UserDashboard userDashboard = new UserDashboard();
        userDashboard.emailButton.sendKeys(ConfigReader.getProperty("user_usernametest"));
        extentTest.info("User types a valid e-mail to the e-mail box");
        userDashboard.passwordButton.sendKeys(ConfigReader.getProperty("user_userPasswordtest"));
        extentTest.info("User types a valid password to the password box");
        userDashboard.loginButton.click();
        extentTest.info("User clicks the login button");
        userDashboard.userNameButton.click();
        userDashboard.manageSubscribtionButton.click();
        extentTest.info("User clicks the Manage Subscribtions button");
        userDashboard.upgradePlanButton.click();
        extentTest.info("User clicks the upgrade plan button");
        ReusableMethods.jsScrollBy(userDashboard.switchPlanButton);
        ReusableMethods.wait(3);
        userDashboard.switchPlanButton.click();
        extentTest.info("User clicks the switch plan button");
        String expectedYazi = "Payment";
        String actualYazi = userDashboard.paymentYazisi.getText();
        Assert.assertTrue(actualYazi.contains(expectedYazi));
        extentTest.pass("User confirms that the Payment text is visible ");
        ReusableMethods.wait(4);
        ReusableMethods.jsScrollBy(userDashboard.selectPaymentGateway);
        ReusableMethods.wait(4);
        Select select = new Select(userDashboard.selectPaymentGateway);
        select.selectByValue("1");
        extentTest.info("User selects Stripe ");
        userDashboard.paySwitchPlan.click();
        extentTest.info("User clicks the Pay/Switch plan button");
        Actions actions = new Actions(Driver.getDriver());
        actions.click(userDashboard.CardInformationButton)
                .sendKeys(ConfigReader.getProperty("cardNo"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("MM/YY"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("CVC"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("cardHolderName"))
                .sendKeys(Keys.TAB)
                .perform();
        extentTest.info("Payment enters payment details");
        Select countryName = new Select(userDashboard.countryName);
        countryName.selectByVisibleText("Turkey");
        userDashboard.payButton.click();
        extentTest.info("Payment clicks Pay button");
        String expectedText = "Payment Successful";
        String actualText = userDashboard.paymentSuccessful.getText();
        Assert.assertEquals(actualText, expectedText);
        extentTest.pass("User confirms that payment can be made with stripe");
    }
    @Test
    public void TC03upgradePlanWithManually(){
        extentTest = extentReports.createTest("TestCase02:Upgrade plan with Manually ",
                "As a user I shuold able to upgrade olan with manually");
        ReusableMethods reusableMethods=new ReusableMethods();
        UserDashboard userDashboard=new UserDashboard();
        userDashboard.emailButton.sendKeys(ConfigReader.getProperty("user_username"));
        extentTest.info("User types a valid e-mail to the e-mail box");
        userDashboard.passwordButton.sendKeys(ConfigReader.getProperty("user_userPassword"));
        extentTest.info("User types a valid password to the password box");
        userDashboard.loginButton.click();
        extentTest.info("User clicks the login button");
        userDashboard.userNameButton.click();
        userDashboard.manageSubscribtionButton.click();
        extentTest.info("User clicks the login button");
        userDashboard.upgradePlanButton.click();
        extentTest.info("User clicks the upgrade plan button");
        ReusableMethods.jsScrollBy(userDashboard.switchPlanButton);
        ReusableMethods.wait(3);
        userDashboard.switchPlanButton.click();
        extentTest.info("User clicks the switch plan button");
        String expectedYazi="Payment";
        String actualYazi=userDashboard.paymentYazisi.getText();
        Assert.assertTrue(actualYazi.contains(expectedYazi));
        extentTest.pass("User confirms that the Payment text is visible ");
        ReusableMethods.wait(4);
        ReusableMethods.jsScrollBy(userDashboard.selectPaymentGateway);
        ReusableMethods.wait(4);
        Select select = new Select(userDashboard.selectPaymentGateway);
        select.selectByVisibleText("Manually");
        extentTest.info("User selects Manually ");
        userDashboard.addYourNotes.sendKeys(ConfigReader.getProperty("addyourNotes"));
        extentTest.info("User sends notes ");
        userDashboard.cashPayButton.click();
        extentTest.info("User clicks  Cash pay button");
        // 11-Confirm that the name of the upgraded plan is displayed on the page that opens.


    }
}
