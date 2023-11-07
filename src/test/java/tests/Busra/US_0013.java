package tests.Busra;


import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_0013 extends TestBaseRapor {


    //13- Kayıtlı kullanıcı olarak giriş yaptıktan sonra
    // hesap ayarlarında profil bilgilerini görüntüleyip
    // değiştirebildiğini doğrulayabilmeliyim


    @Test
    public void Test01() {
        extentTest = extentReports.createTest("UserStory13_tc01: Account Settings "
                , "As a user I shuold able to reach the Account Settings page and that the user's profile on the page are displayable");
        UserDashboard userDashboard = new UserDashboard();
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("User navigate to the smartcardlink home webpage");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "smartcard";
        Assert.assertTrue(actualUrl.contains(expectedUrl));
        extentTest.pass("User validates to access to the ");
        userDashboard.signInButton.click();
        extentTest.info("User clicks the signin button");
        userDashboard.emailButton.sendKeys(ConfigReader.getProperty("user_username"));
        extentTest.info("User types a valid e-mail to the e-mail box");
        userDashboard.passwordButton.sendKeys(ConfigReader.getProperty("user_userPassword"));
        extentTest.info("User types a valid password to the password box");
        userDashboard.loginButton.click();
        extentTest.info("User clicks the login button");
        userDashboard.userNameButton.click();
        userDashboard.accountSettingsElement.click();
        ReusableMethods.wait(2);
        extentTest.info("User clicks the account settings button");
        Assert.assertTrue(userDashboard.profileDetailsElement.isEnabled());
        extentTest.pass("User validates to access to the Profile Details Element");

    }

    @Test
    public void test02() {

        Faker faker = new Faker();
        extentTest.info("Faker for change settings name");


        UserDashboard userDashboard = new UserDashboard();
        userDashboard.settingsNameElement.click();
        extentTest.info("User clicks the login button");
        userDashboard.settingsNameElement.sendKeys(faker.internet().domainName());
        extentTest.info("User changed name his name from the settings fill");
        userDashboard.settingsSaveElement.click();

        Assert.assertTrue(userDashboard.settingsSaveElement.isDisplayed());
        extentTest.pass("User successfully changed the name");


        Driver.closeDriver();
        extentTest.info("User closes the browser");




    }

}



