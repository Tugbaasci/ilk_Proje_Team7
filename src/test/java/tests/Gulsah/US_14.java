package tests.Gulsah;

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

public class US_14 extends TestBaseRapor {
    @BeforeMethod
    public void setUp(){
        extentTest = extentReports.createTest("UserStory_14: Before Test");
        ReusableMethods reusableMethods=new ReusableMethods();
        UserDashboard userDashboard=new UserDashboard();
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("User navigate to the smartcardlink home webpage");
        String  actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="smartcard";
        Assert.assertTrue(actualUrl.contains(expectedUrl));
        extentTest.pass("User validates to access to the ");
        userDashboard.signInButton.click();
        extentTest.info("User clicks the signin button");
        userDashboard.emailButton.sendKeys(ConfigReader.getProperty("user_usernametest") );
        extentTest.info("User types a valid e-mail to the e-mail box");
        userDashboard.passwordButton.sendKeys(ConfigReader.getProperty("user_userPasswordtest"));
        extentTest.info("User types a valid password to the password box");
        userDashboard.loginButton.click();
        extentTest.info("User clicks the login button");
        userDashboard.userNameButton.click();

    }
    @AfterMethod
    public void tearDown(){
        extentTest = extentReports.createTest("UserStory_14: After Test");
        Driver.closeDriver();
        extentTest.info("User closes the browser");
    }
    @Test
    public void TC01ChangePassword(){
        extentTest = extentReports.createTest("TestCase_01:Change Password test ",
                "As a user I shuold able to change the password");
        ReusableMethods reusableMethods=new ReusableMethods();
        UserDashboard userDashboard=new UserDashboard();
        userDashboard.changePasswordButton.click();
        extentTest.info("User clicks the change password button");
        userDashboard.currentPasswordButton.sendKeys(ConfigReader.getProperty("user_userPasswordtest"));
        extentTest.info("User enters current password");
        userDashboard.newPasswordButton.sendKeys(ConfigReader.getProperty("newPassword"));
        extentTest.info("User enters new password");
        userDashboard.confirmPasswordButton.sendKeys(ConfigReader.getProperty("confirmPassword"));
        extentTest.info("User enters new password again");
        userDashboard.changePasswordSaveButton.click();
        extentTest.info("User clicks save button");
        reusableMethods.warningMessagesCheck("Password updated successfully.",userDashboard.warningMessage.getText());
        extentTest.pass("User verifies successfully password change ");
    }
    @Test
    public void TC02ChangeLanguage(){
        extentTest = extentReports.createTest("TestCase_02:Change Language test ",
                "As a user I shuold able to change the language");
        ReusableMethods reusableMethods=new ReusableMethods();
        UserDashboard userDashboard=new UserDashboard();
        userDashboard.changeLanguageButton.click();
        extentTest.info("User clicks the change language button");
        Select select = new Select(userDashboard.selectlang);
        select.selectByVisibleText("English");
        extentTest.info("User selects new language");
        userDashboard.changeLanguageSaveButton.click();
        extentTest.info("User saves language change");
        reusableMethods.warningMessagesCheck("Language updated successfully.",userDashboard.warningMessage.getText());
        extentTest.pass("User verifies successfully language change ");
    }

    @Test
    public void TC03ChecksignOut(){
        extentTest = extentReports.createTest("TestCase_03:Sing Out Test ",
                "As a user I shuold able to sign out");
        ReusableMethods reusableMethods=new ReusableMethods();
        UserDashboard userDashboard=new UserDashboard();
        userDashboard.signOutButton.click();
        extentTest.info("User clicks the sign out button");
        Assert.assertTrue(userDashboard.successfulSignOutElement.isDisplayed());
        extentTest.pass("User verifies successfully sign out ");






    }
}
