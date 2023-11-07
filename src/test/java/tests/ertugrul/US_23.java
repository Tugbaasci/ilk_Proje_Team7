package tests.ertugrul;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.io.IOException;
import java.util.List;

public class US_23 extends TestBaseRapor {

    AdminDashboard adminDashboard = new AdminDashboard();
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void TC_01() {
        extentTest = extentReports.createTest("TestCase23_01: Plan Price'in altindaki manuel odemelerin gorunurlugu",
                "Admin olarak kullanicilarin odemelerini gormeliyim");

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));

        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        AdminDashboard adminDashboard = new AdminDashboard();

        homePage.signinButton.click();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("admin_username"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("admin_Password"));
        loginPage.loginBox.click();
        extentTest.info("Admin olarak giris yapilir");
        adminDashboard.cashPaymentsElement.click();
        extentTest.info("\"Cash Payments\" 'a click yapilir.");

        List<WebElement> planPriceElementDisplayed = adminDashboard.planPriceElement;
        extentTest.info("Tum odemeler List'e atanir, bir dongu icinde getirilir ve ayni zamanda Assert ile test edilir.");
        int num = 0;
        for (WebElement each : planPriceElementDisplayed) {
            if (num % 2 == 0) {

                System.out.println(num + ". indexteki element =" + each.getText());
                Assert.assertTrue(each.isDisplayed());
            }
            num = num + 1;
        }



        extentTest.pass("Plan price altindaki odemelerin gorunur oldugu dogrulanir");
        Driver.closeDriver();
    }

    //1.https://www.qa.smartcardlink.com adresine girilir.
//2.admin20@smartcardlink.com username
//3."123123123" password
//4."Cash Payments" 'a click yapilir.
//5."Showing....result" locate'indeki sayi kaydedilir.
//6.Odeme sayilarinin gorunur oldugu dogrulanir.
    @Test
    public void TC_02() throws IOException {
        extentTest = extentReports.createTest("TestCase23_02: Odeme sayilarinin gorunurlugunu dogrulama", "Admin olarak odeme sayilarini gorebilmeliyim.");

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        AdminDashboard adminDashboard = new AdminDashboard();

        homePage.signinButton.click();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("admin_username"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("admin_Password"));

        loginPage.loginBox.click();
        extentTest.info("Admin olarak giris yapilir");
        adminDashboard.cashPaymentsElement.click();
        extentTest.info("\"Cash Payments\" 'a click yapilir.");

        String sonucSayiYazisi = adminDashboard.showingResultElement.getText();
        extentTest.info("Showing....result\" locate'indeki sayi kaydedilir.");
        sonucSayiYazisi = sonucSayiYazisi.substring(19, 23);
        WebElement sonucSayiYazisiElementi = adminDashboard.showingResultElement;

        Assert.assertTrue(sonucSayiYazisiElementi.isDisplayed());
        System.out.println(sonucSayiYazisi);

        extentTest.pass("Odeme sayilarinin gorunur oldugu dogrulanir.");
        Driver.closeDriver();
    }
}
