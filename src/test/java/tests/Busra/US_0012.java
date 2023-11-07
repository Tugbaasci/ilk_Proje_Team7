package tests.Busra;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_0012 extends TestBaseRapor {
    /*12- Kayıtlı kullaıcı olarak ayarlar kısmında kimlik bilgileri bölümünü görüntüleyebildiğimi,
     ayarları güncelleyebildiğimi doğrulayabimeliyim

   */




        @Test
        public void test01() {
            extentTest = extentReports.createTest("TestCase012_1: Successful Login Test",
                    "As an user I should be able to login");
            Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
            extentTest.info("User navigate to the smartcardlink home webpage");
            Faker faker =new Faker();

            LoginPage loginPage = new LoginPage();

            loginPage.signinButton.click();


            loginPage.emailBox.sendKeys(ConfigReader.getProperty("username"));
            extentTest.info("User types a valid email adress to the email box");

            loginPage.passwordBox.sendKeys(ConfigReader.getProperty("userpassword"));
            extentTest.info("User types a valid password to the password box");


            loginPage.loginBox.click();
            extentTest.info("User clicks the login button");


            loginPage.settingsButton.click();
            loginPage.stripeKeyFill.click();
            loginPage.stripeKeyFill.sendKeys(faker.internet().password());

            loginPage.saveButton.click();

            ReusableMethods.wait(2);
            String expectedMessage = "Settings updated successfully.";
            extentTest.info("User updated settings page");

            String actualMessage = loginPage.UpdatedConfirmation.getText();
            Assert.assertTrue(actualMessage.contains(expectedMessage));
            extentTest.pass("User validates to access to the settings page");

            Driver.closeDriver();


        }}
