package tests.Abdullah;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SmartCardPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US002_HeaderButtonsVisibility extends TestBaseRapor {

    @Test
    public void smartCardTestTc_01() {
        extentTest = extentReports.createTest("TC01 https://qa.smartcardlink.com/ header bölümü butonlari"," Sing In butonunun gorunur oldu test eder");

        SmartCardPage smartCardPage = new SmartCardPage();

        //TC_01 Sayfadaki header bölümündeki "Sing In" butonunun görünür oldugunu dogrulayin.
        // 1-  Browser'a https://qa.smartcardlink.com/ yazilip enter'a basilir.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardUrl"));
        extentTest.pass("Drivere sayfa adresi girilip enter'a basilir ve ana sayfa acilir ");


        //2- Acilan sayfanin header bölümüne "Sing In" yazisi gorunur oldugu dogrulanir
        // "Sign In" butonunu bul
        WebElement signInButton = Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']"));

        // "Sign In" butonunun görünür olduğunu doğrula
        Assert.assertTrue(smartCardPage.ilkSingnInButonu.isDisplayed(), "Sign In butonu gorunur degil");
        extentTest.pass("Test datası olarak belirlenen kelimeyi aratir");

        Driver.closeDriver();


    }

    @Test
    public void smartCardTc_02() {
        SmartCardPage smartCardPage = new SmartCardPage();
        extentTest = extentReports.createTest("TC02 https://qa.smartcardlink.com/ header bölümü butonlari"," Contact butonunun gorunur oldu test eder");
        //Sayfadaki header bölümündeki "Contact" butonunun görünür oldugunu dogrulayin.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardUrl"));
        extentTest.pass("Drivere sayfa adresi girilip enter'a basilir ve ana sayfa acilir ");

        Assert.assertTrue(smartCardPage.contactButonu.isDisplayed(), "Contact butonu gorunur degil");
        ReusableMethods.wait(1);
        extentTest.pass("Test datası olarak belirlenen kelimeyi aratir");

        Driver.closeDriver();
    }

    @Test
    public void smartCardTc_03() {
        SmartCardPage smartCardPage = new SmartCardPage();
        extentTest = extentReports.createTest("TC03 https://qa.smartcardlink.com/ header bölümü butonlari"," Pricing butonunun gorunur oldu test eder");

//Sayfadaki header bölümündeki  "Pricing" butonunun görünür oldugunu dogrulayin.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardUrl"));
        extentTest.pass("Drivere sayfa adresi girilip enter'a basilir ve ana sayfa acilir ");

        Assert.assertTrue(smartCardPage.pricingButonu.isDisplayed(), "Pricing butonu gorunur degil");
        ReusableMethods.wait(1);
        extentTest.pass("Test datası olarak belirlenen buton adini aratir");

        Driver.closeDriver();
    }

    @Test
    public void smartCardTc_04() {
        SmartCardPage smartCardPage = new SmartCardPage();
        extentTest = extentReports.createTest("TC04 https://qa.smartcardlink.com/ header bölümü butonlari"," About butonunun gorunur oldu test eder");
        //Sayfadaki header bölümündeki "About" butonunun  görünür oldugunu dogrulayin.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardUrl"));
        extentTest.pass("Drivere sayfa adresi girilip enter'a basilir ve ana sayfa acilir ");

        Assert.assertTrue(smartCardPage.aboutButonu.isDisplayed(), "About butonu gorunur degil");
        ReusableMethods.wait(1);
        extentTest.pass("Test datası olarak belirlenen kelimeyi aratir");

        Driver.closeDriver();
    }

    @Test
    public void smartCardTc_05() {
        SmartCardPage smartCardPage = new SmartCardPage();
        extentTest = extentReports.createTest("TC05 https://qa.smartcardlink.com/ header bölümü butonlari"," Features butonunun gorunur oldu test eder");

        //Sayfadaki header bölümündeki "Features" butonunun  görünür oldugunu dogrulayin.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardUrl"));
        extentTest.pass("Drivere sayfa adresi girilip enter'a basilir ve ana sayfa acilir ");

        Assert.assertTrue(smartCardPage.featuresButonu.isDisplayed(), "Features butonu gorunur degl");
        ReusableMethods.wait(1);
        extentTest.pass("Test datası olarak belirlenen kelimeyi aratir");

        Driver.closeDriver();
    }

    @Test
    public void smartCardTc_06() {
        SmartCardPage smartCardPage = new SmartCardPage();
        extentTest = extentReports.createTest("TC06 https://qa.smartcardlink.com/ header bölümü butonlari"," Home butonunun gorunur oldu test eder");


        //Sayfadaki header bölümündeki "Home" butonunun  görünür oldugunu dogrulayin.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardUrl"));
        extentTest.pass("Drivere sayfa adresi girilip enter'a basilir ve ana sayfa acilir ");

        Assert.assertTrue(smartCardPage.homeButonu.isDisplayed(), "Home butonu gorunur degil");
        ReusableMethods.wait(2);
        extentTest.pass("Test datası olarak belirlenen kelimeyi aratir");

        Driver.closeDriver();
    }

    @Test
    public void samartCardTc_07() {
        extentTest = extentReports.createTest("TC057 https://qa.smartcardlink.com/ header bölümü logo"," girilen site logosunun gorunur oldu test eder");
        SmartCardPage smartCardPage = new SmartCardPage();

        //Sayfadaki header bölümündeki "SmartCardLink" logosunun görünür oldugunu dogrulayin.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardUrl"));
        extentTest.pass("Drivere sayfa adresi girilip enter'a basilir ve ana sayfa acilir ");

        Assert.assertTrue(smartCardPage.smartCardLinkLogosu.isDisplayed(), "SmartCardLink logosu gorunur degil");
        ReusableMethods.wait(2);
        extentTest.pass("Test datası olarak belirlenen kelimeyi aratir");

        Driver.closeDriver();
    }


}
