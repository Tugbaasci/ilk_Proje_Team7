package tests.Busra;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_0006 extends TestBaseRapor {

      //6- Bir ziyaretçi olarak Sign In butonu ile login sayfasına ulaşıp
      // sadece doğru kullanıcı bilgileri ile giriş yapabildiğimi doğrulayabilmeliyim


      @Test
            public void test01Positive() {
            extentTest = extentReports.createTest("TestCase006_1: Successful Visitor Login Test",
                    "As a Visitor I should be able to login");
            Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
            extentTest.info("Visitor navigate to the smartcardlink home webpage");

            LoginPage loginPage = new LoginPage();

            loginPage.signinButton.click();




            loginPage.emailBox.sendKeys(ConfigReader.getProperty("username"));
            loginPage.passwordBox.sendKeys(ConfigReader.getProperty("userpassword"));
            loginPage.loginBox.click();

            ReusableMethods.wait(4);
              
            String expectedresult = "Settings";
            String actualresult = loginPage.succesfulEntranceElement.getText();
            Assert.assertTrue(actualresult.contains(expectedresult));

           

            Driver.closeDriver(); }
     @Test
           public void test02Negative() {
           Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));

           LoginPage loginPage = new LoginPage();

           loginPage.signinButton.click();


           loginPage.emailBox.sendKeys(ConfigReader.getProperty("usernameNegative"));
           loginPage.passwordBox.sendKeys(ConfigReader.getProperty("userpaswordNegative"));
           loginPage.loginBox.click();

           ReusableMethods.wait(1);
           Assert.assertTrue(loginPage.errorMessage.isDisplayed());

           Driver.closeDriver();
    }
   }

