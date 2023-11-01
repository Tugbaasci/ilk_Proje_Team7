package tests.eyyup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.List;

public class US_20 extends TestBaseRapor {
  /*  Browser'a gidilir
    Tarayici URL sekmesine https://qa.smartcardlink.com/ adresini yazip enter tusuna basar
    Sign in butonuna basar
    admin bilgilrini doldurur
    Login butonuna bastiktan sonra ana sayfaya gidin
    Kullanicilara tiklar
    kayitli kullanicilarin hesap durumunu goruntuler*/

    @Test
    public void TC_01() {

        AdminDashboard adminDashboard = new AdminDashboard();
        extentTest = extentReports.createTest("Kullanicilarin abonelik durumlarini goruntuleyebilme",
                "admin bilgileri ile admin  anasayfasina gidilerek test yapilir");


        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("admin bilgileri ile https://qa.smartcardlink.com anasayfasina gidilir");

        adminDashboard.ilkSignInButton.click();
        extentTest.info("sign in butonuna tiklanir");


        adminDashboard.adminEmailButton.sendKeys(ConfigReader.getProperty("adminEmail"));
        adminDashboard.adminPasswordButton.sendKeys(ConfigReader.getProperty("adminPassword"));
        adminDashboard.adminLoginButton.click();
        extentTest.info("admin bilgileri doldurulup, click yapildiktan sonra anasayfaya gidilir");

        adminDashboard.UsersButton.click();
        extentTest.info("users (kullanicilar) menusune tiklar");


        List<WebElement> kullaniciAbonelikDurumlari = Driver.getDriver().findElements(By.xpath("//td[@class='text-center']"));
        extentTest.info("kullanicilarin hesap durumunu     gosterir");

        for (WebElement each : kullaniciAbonelikDurumlari
        ) {

            Assert.assertTrue(each.isDisplayed());
            extentTest.pass("kullanici bilgileri goruntulenir");


        }
        Driver.closeDriver();
        extentTest.info("web sayfasini kapatir");


    }

    @Test
    public void TC_02() {


      /*  Browser'a gidilir
        Tarayici URL sekmesine https://qa.smartcardlink.com/ adresini yazip enter tusuna basar
        Sign in butonuna basar
        admin bilgilrini doldurup login butonuna bastiktan sonra ana sayfaya gider
        Kullanicilara tiklar
        Herhangi bir kullanici hesabina gider
        Admin hesabina geri donuldugunu dogrular*/

        AdminDashboard adminDashboard = new AdminDashboard();
        extentTest = extentReports.createTest("kullanicinin hesabina gittikten sonra admin hesabina geri donebilme",
                "admin bilgileri ile admin  anasayfasina gidilerek test yapilir");


        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("admin bilgileri ile https://qa.smartcardlink.com anasayfasina gidilir");

        adminDashboard.ilkSignInButton.click();
        extentTest.info("sign in butonuna tiklanir");


        adminDashboard.adminEmailButton.sendKeys(ConfigReader.getProperty("adminEmail"));
        adminDashboard.adminPasswordButton.sendKeys(ConfigReader.getProperty("adminPassword"));
        adminDashboard.adminLoginButton.click();
        extentTest.info("admin bilgileri doldurulup, click yapildiktan sonra anasayfaya gidilir");

        adminDashboard.UsersButton.click();
        extentTest.info("users (kullanicilar) menusune tiklar");

        adminDashboard.impersonateButton.click();
        extentTest.info("impersonete butonuna tiklayarak kullanici sayfasina giris yapar");
        Assert.assertTrue(adminDashboard.userkart.isDisplayed());
        extentTest.pass("kullanici kartlarini goruntuleyerek kullanici sayfasinda oldugunu dogrular");
        ReusableMethods.wait(2);
        adminDashboard.adminLogo.click();
        extentTest.info("kullanici sayfasindaki admin logosuna tiklayarak admin sayfasina geri doner");
        Assert.assertTrue(adminDashboard.adminMenuDrop.isDisplayed());
        extentTest.pass("admin sayfasina geri dondugu dorulanir");

        Driver.closeDriver();
        extentTest.info("web sayfasini kapatir");


    }
}
