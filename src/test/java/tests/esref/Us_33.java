package tests.esref;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class Us_33 extends TestBaseRapor {

    @Test
    public void frontCmsTesti(){
        extentTest = extentReports.createTest("Front Cms testi ",
                "Admin panelde Front Cms sekmesinin goruntulenmesini test eder ");

        //  //"1-  Browser acilir
        //2-   Adres cubuguna : https://www.qa.smartcardlink.com yazilir
        //3-   Enter tusuna tiklanir.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Url ile smartCardLink adresine gider");

        //4-   Acilan ekranda “Sing In” bolumune tiklanir
        HomePage homePage = new HomePage();
        homePage.signinButton.click();
        //5-   Email cubuguna “admin21@smartcardlink.com “ yazilir
        LoginPage loginPage=new LoginPage();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("admin_username2"));
        //6-   Sifre cubuguna “123123123” yazilir
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("admin_Password2"));
        //7-   Logine bir kere tiklanir
        loginPage.loginBox.click();
        extentTest.info("Admin bilgileri ile siteye gider ");

        //8-Acilan sayfada admin panelde “Front Cms” tiklanir
        AdminDashboard adminDashboard=new AdminDashboard();
        adminDashboard.frontCmsElementi.click();
        extentTest.info("Admin paneldeki Front Cms'ye tiklanir");

        //9-Sayfanin acildigi dogrulanir
        Assert.assertTrue(adminDashboard.frontCmsElementi.isDisplayed());
        extentTest.pass("Sayfanin gorundugu test eder");
        //10-Sayfa kapatilir.
        Driver.closeDriver();
        extentTest.info("Sayfa kapatilir");
    }
    @Test
    public void frontCmsSekmeleriTesti(){
        extentTest = extentReports.createTest("Front Cms testi ",
                "Admin panelde Front Cms sekmesinin goruntulenmesini test eder ");

        //"1-Browser acilir
        //2-Adres cubuguna : https://www.qa.smartcardlink.com yazilir
        //3-Enter tusuna tiklanir.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Url ile smartCardLink adresine gider");

        //4-   Acilan ekranda “Sing In” bolumune tiklanir
        HomePage homePage = new HomePage();
        homePage.signinButton.click();
        //5-   Email cubuguna “admin21@smartcardlink.com “ yazilir
        LoginPage loginPage=new LoginPage();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("admin_username2"));
        //6-   Sifre cubuguna “123123123” yazilir
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("admin_Password2"));
        //7-   Logine bir kere tiklanir
        loginPage.loginBox.click();
        extentTest.info("Admin bilgileri ile siteye gider ");

        //8-Acilan sayfada admin panelde “Front Cms” tiklanir
        AdminDashboard adminDashboard=new AdminDashboard();
        adminDashboard.frontCmsElementi.click();
        extentTest.info("Admin paneldeki Front Cms'ye tiklanir");

        ReusableMethods.wait(2);
        //10-Acilan sayfada “About Us ve Features” metinleri goruntulenlenmeli
        Assert.assertTrue(adminDashboard.featuresElement.isDisplayed());
        Assert.assertTrue(adminDashboard.aboutUsElement.isDisplayed());
        extentTest.pass("Acilan sayfada About us ve Features basliklari test eder");

        //11-Sayfa kapatilir.
        Driver.closeDriver();
        extentTest.info("Sayfa kapatilir");
    }

    @Test
    public void aboutUsFeaturesTesti(){
        extentTest = extentReports.createTest("About Us ve Features testi ",
                "Front Cms sayfasindaki abaout us ve features  sekmelerinin metinlerini test eder ");

        //"1-Browser acilir
        //2-Adres cubuguna : https://www.qa.smartcardlink.com yazilir
        //3-Enter tusuna tiklanir.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Url ile smartCardLink adresine gider");

        //4-   Acilan ekranda “Sing In” bolumune tiklanir
        HomePage homePage = new HomePage();
        homePage.signinButton.click();
        //5-   Email cubuguna “admin21@smartcardlink.com “ yazilir
        LoginPage loginPage=new LoginPage();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("admin_username2"));
        //6-   Sifre cubuguna “123123123” yazilir
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("admin_Password2"));
        //7-   Logine bir kere tiklanir
        loginPage.loginBox.click();
        extentTest.info("Admin bilgileri ile siteye gider ");

        //8-Acilan sayfada admin panelde “Front Cms” tiklanir
        AdminDashboard adminDashboard=new AdminDashboard();
        adminDashboard.frontCmsElementi.click();
        ReusableMethods.wait(2);
        extentTest.info("Admin paneldeki Front Cms'ye tiklanir");

        //9-Ustteki “About Us” yazilan sekme tiklanir
        adminDashboard.aboutUsElement.click();
        ReusableMethods.wait(1);
        extentTest.info("About us sekmesi tiklanir");

        //10-Acilan sayfanin metinleri goruntulenmeli
        String aboutUsText=adminDashboard.aboutUsElement.getText();
        System.out.println("About Us Metni: " + aboutUsText);
        ReusableMethods.wait(1);
        extentTest.pass("About us metninin testi getirilir");

        //11-Sonra ustteki “Features” sekmesi tiklanir
        adminDashboard.featuresElement.click();
        ReusableMethods.wait(2);
        extentTest.info("Features sekmesi tiklanir");

        //12-Acilan sayfanin metinleri goruntulenebilmeli
        String featuresText=adminDashboard.featuresElement.getText();
        System.out.println("Features Metni : " + featuresText);
        ReusableMethods.wait(1);
        extentTest.pass("Features metninin metni getirilir");

        //13-sayfa kapatilir.
        Driver.closeDriver();
        extentTest.info("Sayfa kapatilir");
    }

}
