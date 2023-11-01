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

import java.util.List;

public class US002_HeaderButtonsActivity extends TestBaseRapor {


    @Test
    public void smartCardIslevTc08(){
        extentTest = extentReports.createTest("TC08 "," Sing In butonunun calistigini gorulmeli");
        SmartCardPage smartCardPage = new SmartCardPage();
        //Sayfadaki header bölümündeki "Sing In" butonunun aktif oldugunu dogrulayin.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardUrl"));
        extentTest.pass("Drivere sayfa adresi girilip enter'a basilir ve ana sayfa acilir ");

        smartCardPage.ilkSingnInButonu.click();
        extentTest.pass("Butona basilir. ");

        Assert.assertTrue(smartCardPage.dilSecimMenusu.isDisplayed(),"Dil secim menüsü gürüntülenemedi.");
        ReusableMethods.wait(1);
        extentTest.pass("Sing In sayfası acildigini test eder");
        Driver.closeDriver();
    }


    @Test
    public void smartCardIslevTc09(){
        extentTest = extentReports.createTest("Tc09","Contact botunun aktif oldugu dogrulanmalidir");
        SmartCardPage smartCardPage = new SmartCardPage();

        //Sayfadaki header bölümündeki "Contact" butonunun aktif oldugunu dogrulayin.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardUrl"));
        extentTest.pass("Drivere sayfa adresi girilip enter'a basilir ve ana sayfa acilir ");

        smartCardPage.contactButonu.click();
        extentTest.pass("Butona basilir. ");
        Assert.assertTrue(smartCardPage.mesajgondermeButonu.isDisplayed());
        ReusableMethods.wait(1);
        extentTest.pass("Contact bolumu acildigini test eder");
        Driver.closeDriver();

    }

    @Test
    public void smartCardIslevTc10(){
        extentTest = extentReports.createTest("Tc10"," Pricing botunun aktif oldugu dogrulanmalidir");

        SmartCardPage smartCardPage = new SmartCardPage();
      //  Sayfadaki header bölümündeki "Pricing" butonunun aktif oldugunu dogrulayin.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardUrl"));
        extentTest.pass("Drivere sayfa adresi girilip enter'a basilir ve ana sayfa acilir ");

        smartCardPage.pricingButonu.click();
        extentTest.pass("Butona basilir. ");

        Assert.assertTrue(smartCardPage.tarifeIleriTusu.isDisplayed());
        ReusableMethods.wait(1);
        extentTest.pass("Tarifeler bolumu acildigini test eder");

        Driver.closeDriver();

    }
    @Test
    public void smartCardIslevTc11(){
        extentTest = extentReports.createTest("Tc11"," About botunun aktif oldugu dogrulanmalidir");

        SmartCardPage smartCardPage = new SmartCardPage();
        //Sayfadaki header bölümündeki "About" butonunun aktif oldugunu dogrulayin.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardUrl"));
        extentTest.pass("Drivere sayfa adresi girilip enter'a basilir ve ana sayfa acilir ");

        smartCardPage.aboutButonu.click();
        extentTest.pass("Butona basilir. ");

        Assert.assertTrue(smartCardPage.aboutButonuAktifElementi.isDisplayed());
        ReusableMethods.wait(1);
        extentTest.pass("About smartCard bolumu acildigini test eder");

        Driver.closeDriver();

    }
    @Test
    public void smartCardIslevTc12(){
        extentTest = extentReports.createTest("Tc12"," Features botunun aktif oldugu dogrulanmalidir");
        SmartCardPage smartCardPage = new SmartCardPage();
        //Sayfadaki header bölümündeki "Features" butonunun aktif oldugunu dogrulayin.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardUrl"));
        extentTest.pass("Drivere sayfa adresi girilip enter'a basilir ve ana sayfa acilir ");

        smartCardPage.featuresButonu.click();
        extentTest.pass("Butona basilir. ");

        Assert.assertTrue(smartCardPage.featuresButonuAktifElementi.isDisplayed());
        ReusableMethods.wait(1);
        extentTest.pass("Features bolumu acildigini test eder");
        Driver.closeDriver();

    }
    @Test
    public void smartCardIslevTc13() {
        extentTest = extentReports.createTest("Tc13"," Home botunun aktif oldugu dogrulanmalidir");

        SmartCardPage smartCardPage = new SmartCardPage();
        //Sayfadaki header bölümündeki "Home" butonunun aktif oldugunu dogrulayin.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardUrl"));
        extentTest.pass("Drivere sayfa adresi girilip enter'a basilir ve ana sayfa acilir ");

        smartCardPage.homeButonu.click();
        extentTest.pass("Butona basilir. ");

        ReusableMethods.wait(1);
        //frontHomeTab
        String expectedTitle = "https://qa.smartcardlink.com/#frontHomeTab";
        String actualTitle = Driver.getDriver().getTitle();


        //  Assert.assertTrue(actualTitle.contains(expectedTitle));

        List<WebElement> kullaniciAbonelikBilgileri = Driver.getDriver().findElements(By.xpath("//span[@class='badge bg-light-success']"));
        for (WebElement each : kullaniciAbonelikBilgileri
        ) {
            Assert.assertTrue(each.isDisplayed());




        }
        extentTest.pass("Home butonunun calistigini test eder");

        Driver.closeDriver();


    }}
