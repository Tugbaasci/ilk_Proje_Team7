package tests.Busra;

import com.beust.ah.A;
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

    1-	Kayitli bir kullanici olarak “ayarlar” bölümüne erişim sağlayabilmeliyim.
    2-	Ayarlar kismindaki kimlik bilgileri bolumunu goruntuleyebilmeliyim
    3-	Ayarlar kisminda guncelleme yapabilmeliyim.
    4-	Guncellemeyi yapabildigimi dogrulayabilmeliyim */



        @Test
        public void test01() {
            extentTest = extentReports.createTest("TestCase012_1: Successful Login Test",
                    "As an user I should be able to login");
            Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
            extentTest.info("User navigate to the smartcardlink home webpage");
            Faker faker =new Faker();

            LoginPage loginPage = new LoginPage();
            loginPage.signinbutton.click();


            loginPage.emailBox.sendKeys(ConfigReader.getProperty("username"));
            extentTest.info("User types a valid email adress to the email box");

            loginPage.passwordBox.sendKeys(ConfigReader.getProperty("userpassword"));
            extentTest.info("User types a valid password to the password box");


            loginPage.loginBox.click();
            extentTest.info("User clicks the login button");

            loginPage.ayarlarButonu.click();
            loginPage.stripeKeyBoslugu.click();
            loginPage.stripeKeyBoslugu.sendKeys(faker.internet().password());

            loginPage.saveButonu.click();
            ReusableMethods.wait(2);
            String expectedMessage = "Settings updated successfully.";
            extentTest.info("User updated settings page");

            String actualMessage = loginPage.UpdatedConfirmation.getText();
            Assert.assertTrue(actualMessage.contains(expectedMessage));
            extentTest.pass("User validates to access to the settings page");

            Driver.closeDriver();


        }}
