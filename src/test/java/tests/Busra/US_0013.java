package tests.Busra;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_0013 extends TestBaseRapor {}

    //13- Kayıtlı kullanıcı olarak giriş yaptıktan sonra
    // hesap ayarlarında profil bilgilerini görüntüleyip
    // değiştirebildiğini doğrulayabilmeliyim
/*
        @Test
        public void Test01 () {
            extentTest = extentReports.createTest("UserStory13_tc01: Account Settings "
                    ,"As a user I shuold able to reach the Account Settings page and that the user's profile on the page are displayable");
            UserDashboard userDashboard=new UserDashboard();
            Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
            extentTest.info("User navigate to the smartcardlink home webpage");
            String  actualUrl=Driver.getDriver().getCurrentUrl();
            String expectedUrl="smartcard";
            Assert.assertTrue(actualUrl.contains(expectedUrl));
            extentTest.pass("User validates to access to the ");
            userDashboard.signInButton.click();
            extentTest.info("User clicks the signin button");
            userDashboard.emailButton.sendKeys(ConfigReader.getProperty("user_username") );
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
            Driver.closeDriver();
            extentTest.info("User closes the browser");
        }
        @Test
        public void US13_TC02() {
            // 3-	I should have the ability to edit their profile information and save the changes.
            //  4-	I should be able to confirm that the changes made have been successfully saved.


        }



}
*/

 /* @Test
    public void Test01 () {
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        LoginPage loginPage = new LoginPage();
        loginPage.signinbutton.click();

        loginPage.emailBox.sendKeys(ConfigReader.getProperty("username"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("userpassword"));

        loginPage.loginBox.click();

    }
*/