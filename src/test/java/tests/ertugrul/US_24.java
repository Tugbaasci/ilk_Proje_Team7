package tests.ertugrul;

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

public class US_24 extends TestBaseRapor {


    @Test
    public void Test01() {
        extentTest = extentReports.createTest("TestCase24_01: O\"User name\",\"Plan Name\", \"Start Date\" ve \"End Date\" barlarinin altindaki kullanici bilgerinin goruntulenebildigi dogrulanir",
                "Admin olarak istedigim bilgileri gorebilmeliyim.");

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        AdminDashboard adminDashboard = new AdminDashboard();
        homePage.signinButton.click();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("admin_username"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("admin_Password"));
        loginPage.loginBox.click();
        extentTest.info("Admin olarak giris yapilir");
        adminDashboard.UserPlanElement.click();
        List<WebElement> subscribedUserInfo = adminDashboard.userPlanListElement;
        extentTest.info("Kullanici planlari listesi list olrak kaydedilir.");
        Assert.assertFalse(subscribedUserInfo.isEmpty());
        extentTest.pass("Admin olarak kullanici bilgerinin goruntulenebildigi dogrulanir");
    }

    @Test
    public void Test02() {
        extentTest = extentReports.createTest("TestCase24_02: User Plan Details'deki bilgileri goruntulendigini dogrula", "Admin olarak odeme sayilarini gorebilmeliyim.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        AdminDashboard adminDashboard = new AdminDashboard();

        homePage.signinButton.click();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("admin_username"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("admin_Password"));
        loginPage.loginBox.click();
        extentTest.info("Admin olarak giris yapilir");
        adminDashboard.UserPlanElement.click();

        adminDashboard.viewButtonElement.click();
        extentTest.info("View butonuna tiklanir.");
        ReusableMethods.wait(2);
        List<WebElement> elements = adminDashboard.userPlanDetailsListElement;
        extentTest.info("User Plan Details'deki bilgiler List e kaydedilir.");

        for (WebElement each : elements) {
            System.out.println(each.getText());
        }
        Assert.assertFalse(adminDashboard.userPlanDetailsListElement.isEmpty());
        extentTest.pass("Plan detayalari goruntulendiginin dogrulanmasi");
    }

    @Test
    public void Test03() {
        extentTest = extentReports.createTest("TestCase24_03: Kullanicinin son kullanma tarihini degistirebildigimi dogrulamaliyim", "Admin olarak kullanici bilgilerini degistirebilmeliyim.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        AdminDashboard adminDashboard = new AdminDashboard();
        homePage.signinButton.click();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("admin_username"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("admin_Password"));
        loginPage.loginBox.click();
        extentTest.info("Admin olarak giris yapilir");
        adminDashboard.UserPlanElement.click();
        extentTest.info("Admin olarak Plan'a tiklanir");
        adminDashboard.usersEditButtonElement.click();
        extentTest.info("Edit buttonuna tiklanir.");
        ReusableMethods.wait(1);
        adminDashboard.editDateBoxElement.click();
        ReusableMethods.wait(1);
        adminDashboard.changeDateBoxElement.click();
        ReusableMethods.wait(1);
        adminDashboard.saveButtonElement.click();
        extentTest.info("Save butonuna tiklanir.");

        Assert.assertTrue(adminDashboard.succesTextElement.isDisplayed(), "Succes yazisinin goruntulendigi dogrulanamadi");

        extentTest.pass("Kullanicinin son kullanma tarihini degistirebildigi dogrulandi");
    }


}
