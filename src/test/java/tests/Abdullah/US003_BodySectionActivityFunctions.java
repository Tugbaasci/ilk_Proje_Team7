package tests.Abdullah;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SmartCardPage;
import utilities.*;

public class US003_BodySectionActivityFunctions extends TestBaseRapor {
    //Ziyeretci olarak girilen Home Page sayfasinin "body" bölümündeki
    // fonksiyonlarin aktif oldugu dogrulanmalidir.
    Faker faker = new Faker();



    @Test
    public void smarCardTC_24(){
        extentTest = extentReports.createTest("TC24 https://qa.smartcardlink.com/ body bölümü butonlari"," Get started butonunun aktif oldunu test eder");

        SmartCardPage smartCardPage=new SmartCardPage();
        //Ana sayfadaki "body" bölümündeki "Get Started" butonunun aktif-calisir oldugunu dogrulayin.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardUrl"));
        extentTest.pass("Drivere sayfa adresi girilip enter'a basilir ve ana sayfa acilir ");


        smartCardPage.getStartedButonu.click();
        extentTest.pass("Butona basilir. ");

        Assert.assertTrue(smartCardPage.dilSecimMenusu.isDisplayed());
        ReusableMethods.wait(1);
        extentTest.pass("Giris sayfasi acildigi görülür.");

        Driver.closeDriver();
    }

    @Test
    public void smarCardTC_25(){
        extentTest = extentReports.createTest("TC25 https://qa.smartcardlink.com/ body bölümü butonlari"," send message butonunun aktif oldunu test eder");

        SmartCardPage smartCardPage=new SmartCardPage();
        //Ana sayfadaki "body" bölümündeki "Contact Us
        //" basligi altında bulunan "Send Message" butonunun Aktif- Calisir oldugunu dogrulayin
        Driver.getDriver().get(ConfigReader.getProperty("smartCardUrl"));
        extentTest.pass("Drivere sayfa adresi girilip enter'a basilir ve ana sayfa acilir ");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 4900);");
        extentTest.pass("Sayfa asagıya kaydirilir. ");

        ReusableMethods.wait(1);
        smartCardPage.contactNameBox.sendKeys("Ali");
        smartCardPage.contactEmailBox.sendKeys(faker.internet().emailAddress());
        smartCardPage.contactSubjectBox.sendKeys("uieau");
        smartCardPage.contactMessageBox.sendKeys("O lala ");
        extentTest.pass("Kutucuklara  İsim, mail adresi ve diger bilgiler  girilir ");
        smartCardPage.mesajgondermeButonu.click();
        extentTest.pass("Butona basilir. ");

        ReusableMethods.wait(1);
        Assert.assertTrue(smartCardPage.messageAlindiIletisiElementi.isDisplayed());
        ReusableMethods.wait(4);
        extentTest.pass("Message alindi uyari yazisi görüntülenir. ");

        DriverCross.quitDriver();

    }

    @Test
    public void smarCardTC_26(){
        extentTest = extentReports.createTest("TC26 https://qa.smartcardlink.com/ body bölümü butonlari"," subsicribe butonunun aktif oldunu test eder");

        SmartCardPage smartCardPage=new SmartCardPage();
        //Ana sayfadaki "body" bölümündeki "Subscribe here" basligi altindaki
        // "subscribe" butonunun Aktif-Calisir oldugunu dogrulayin.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardUrl"));
        extentTest.pass("Drivere sayfa adresi girilip enter'a basilir ve ana sayfa acilir ");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 5200);");
        extentTest.pass("Sayfa asagıya kaydirilir. ");
        smartCardPage.subscribeEmailBox.sendKeys(faker.internet().emailAddress());
        extentTest.pass("Mail box'a mail girilir ");
        smartCardPage.subscribeButonu.click();
        extentTest.pass("Butona basilir. ");

        ReusableMethods.wait(3);
        Assert.assertTrue(smartCardPage.messageAlindiIletisiElementi.isDisplayed());
        ReusableMethods.wait(2);
        extentTest.pass("Mesage alindi uyari yazisi gorunur. ");

        Driver.closeDriver();

    }

    @Test
    public void smarCardTC_27(){
        extentTest = extentReports.createTest("TC24 https://qa.smartcardlink.com/ body bölümü butonlari"," Tarife yön değistirir butonunun aktif oldunu test eder");

        SmartCardPage smartCardPage=new SmartCardPage();
        //Ana sayfada "body" bölümündeki "Choose a plan that's right for you" basligi altindaki
        // tarifelerin değistirme butonlarinin Aktif oldugunu dogrulayin.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardUrl"));
        extentTest.pass("Drivere sayfa adresi girilip enter'a basilir ve ana sayfa acilir ");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 3200);");
        extentTest.pass("Sayfa asagıya kaydirilir. ");

        ReusableMethods.wait(1);
        // smartCardPage.tarifeIleriTusu.click();
        ReusableMethods.wait(1);
        smartCardPage.tarifeIleriTusu.click();
        ReusableMethods.wait(1);
        smartCardPage.tarifeIleriTusu.click();
        ReusableMethods.wait(1);
        smartCardPage.tarifeIleriTusu.click();
        ReusableMethods.wait(1);
        smartCardPage.tarifeIleriTusu.click();
        ReusableMethods.wait(1);
        smartCardPage.tarifeIleriTusu.click();
        ReusableMethods.wait(1);
        smartCardPage.tarifeGeriTusu.click();
        ReusableMethods.wait(1);
        smartCardPage.tarifeIleriTusu.click();
        ReusableMethods.wait(1);
        smartCardPage.tarifeGeriTusu.click();
        ReusableMethods.wait(1);
        smartCardPage.tarifeGeriTusu.click();
        ReusableMethods.wait(1);
        smartCardPage.tarifeGeriTusu.click();
        ReusableMethods.wait(1);
        smartCardPage.tarifeIleriTusu.click();
        ReusableMethods.wait(1);
        smartCardPage.tarifeIleriTusu.click();
        ReusableMethods.wait(1);
        extentTest.pass("Sayfa değistirme tuslarina basilir. ");

        Assert.assertTrue(smartCardPage.tarifTest456Element.isDisplayed());
        ReusableMethods.wait(2);
        extentTest.pass("Tüm tarifelere geçis yapilir.");

        Driver.closeDriver();


    }



}
