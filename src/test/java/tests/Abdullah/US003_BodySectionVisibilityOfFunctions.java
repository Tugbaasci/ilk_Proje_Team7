package tests.Abdullah;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SmartCardPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US003_BodySectionVisibilityOfFunctions extends TestBaseRapor {
    //Ziyeretci olarak girilen Home Page sayfasinin "body" bölümündeki
    // fonksiyonlarin gorunur oldugu dogrulanmalidir.
    SmartCardPage smartCardPage = new SmartCardPage();


    @Test
    public void smarCardBodyTc14() {
        extentTest = extentReports.createTest("TC14 https://qa.smartcardlink.com/ body bölümü butonlari"," Get started butonunun görünür oldunu test eder");

        SmartCardPage smartCardPage = new SmartCardPage();
        //Ana sayfadaki "body" bölümündeki
        // "Get Started" butonunun görünür oldugunu dogrulayin.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardUrl"));
        extentTest.pass("Drivere sayfa adresi girilip enter'a basilir ve ana sayfa acilir ");

        Assert.assertTrue(smartCardPage.getStartedButonu.isDisplayed());
        ReusableMethods.wait(2);
        extentTest.pass("Get Started  butonunun görüntelebildigi test olur.");
        Driver.closeDriver();
    }

    @Test
    public void smartCardBodyTc15() {
        extentTest = extentReports.createTest("TC15 https://qa.smartcardlink.com/ body bölümü butonlari",
                " Send message butonunun görünür oldunu test eder");

        SmartCardPage smartCardPage = new SmartCardPage();
        //Ana sayfadaki "body" bölümündeki "Contact Us
        //" basligi altında bulunan "Send Message" butonunun görünür oldugunu dogrulayin.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardUrl"));
        extentTest.pass("Drivere sayfa adresi girilip enter'a basilir ve ana sayfa acilir ");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 4900);");
        ReusableMethods.wait(1);
        Assert.assertTrue(smartCardPage.mesajgondermeButonu.isDisplayed());
        ReusableMethods.wait(2);
        extentTest.pass("Send message butonunun görüntelebildigi test olur.");

        Driver.closeDriver();

    }

    @Test
    public void smartCardBodyTc16() {
        extentTest = extentReports.createTest("TC16 https://qa.smartcardlink.com/ body bölümü butonlari"," telefon numarasının görünür oldunu test eder");

        SmartCardPage smartCardPage = new SmartCardPage();
        //Ana sayfadaki "body" bölümündeki "Contact Us" basligi altindaki  "+1 987-654-3210
        //" telefon numarasinin görünür oldugunu dogrulayin.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardUrl"));
        extentTest.pass("Drivere sayfa adresi girilip enter'a basilir ve ana sayfa acilir ");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 4700);");
        ReusableMethods.wait(2);
        Assert.assertTrue(smartCardPage.telefonNumarasi.isDisplayed());
        extentTest.pass("Telefon numarasının görüntelebildigi test olur.");

        Driver.closeDriver();

    }

    @Test
    public void smartCardBodyTc17() {
        extentTest = extentReports.createTest("TC17 https://qa.smartcardlink.com/ butonlari",
                "mail adresinin görünür oldunu test eder");

        SmartCardPage smartCardPage = new SmartCardPage();
        //Ana sayfadaki "body" bölümündeki "Contact Us" basligi altindaki
        // "info@smartcardlink.com" mail adresinin görünür oldugunu dogrulayin.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardUrl"));
        extentTest.pass("Drivere sayfa adresi girilip enter'a basilir ve ana sayfa acilir ");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 4700);");
        ReusableMethods.wait(2);
        Assert.assertTrue(smartCardPage.contactEmailYaziElementi.isDisplayed());
        ReusableMethods.wait(1);
        extentTest.pass("Mail adresinin görüntelebildigi test olur.");

        Driver.closeDriver();

    }

    @Test
    public void smartCardBodyTc18() {
        extentTest = extentReports.createTest("TC18 https://qa.smartcardlink.com/ body bölümü butonlari",
                " Subsicribe butonunun görünür oldunu test eder");

        SmartCardPage smartCardPage = new SmartCardPage();
        //Ana sayfadaki "body" bölümündeki "Subscribe here" basligi altindaki
        // "subscribe" butonunun görünür oldugunu dogrulayin.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardUrl"));
        extentTest.pass("Drivere sayfa adresi girilip enter'a basilir ve ana sayfa acilir ");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 5100);");
        ReusableMethods.wait(2);
        Assert.assertTrue(smartCardPage.subscribeButonu.isDisplayed());
        ReusableMethods.wait(2);
        smartCardPage.subscribeButonu.submit();
        extentTest.pass("Subscribe butonunun görüntelebildigi test olur.");

        Driver.closeDriver();



    }

    @Test
    public void smartCardBodyTc19() {
        extentTest = extentReports.createTest("TC19 https://qa.smartcardlink.com/ body bölümü butonlari",
                " standard adli tarifenin görünür oldunu test eder");

        SmartCardPage smartCardPage = new SmartCardPage();
        //Ana sayfada "body" bölümündeki "Choose a plan that's right for you" basligi altindaki
        // "standard" adli tarifenin görünür oldugunu dogrulayin.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardUrl"));
        extentTest.pass("Drivere sayfa adresi girilip enter'a basilir ve ana sayfa acilir ");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 3200);");
        ReusableMethods.wait(1);
        Assert.assertTrue(smartCardPage.tarifeStandardElementi.isDisplayed());
        extentTest.pass("Tarifenin görüntelebildigi test olur.");

        Driver.closeDriver();

    }

    @Test
    public void smartCardBodyTc20() {
        extentTest = extentReports.createTest("TC20 https://qa.smartcardlink.com/ body bölümü butonlari",
                " tarifelerin görünür oldunu test eder");

        SmartCardPage smartCardPage = new SmartCardPage();
        //Ana sayfada "body" bölümündeki "Choose a plan that's right for you" basligi altindaki
        // "Silver" adli tarifenin görünür oldugunu dogrulayin.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardUrl"));
        extentTest.pass("Drivere sayfa adresi girilip enter'a basilir ve ana sayfa acilir ");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 3200);");
        ReusableMethods.wait(1);
        smartCardPage.tarifeIleriTusu.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(smartCardPage.tarifeSilverElementi.isDisplayed());
        ReusableMethods.wait(2);
        extentTest.pass("Tarifenin görüntelebildigi test olur.");

        Driver.closeDriver();


    }

    @Test
    public void smartCardBodyTc21() {
        extentTest = extentReports.createTest("TC21 https://qa.smartcardlink.com/ body bölümü butonlari",
                " tarifelerin görünür oldunu test eder");

        SmartCardPage smartCardPage = new SmartCardPage();
        //Ana sayfada "body" bölümündeki "Choose a plan that's right for you" basligi altindaki
        // "Gold" adli tarifenin görünür oldugunu dogrulayin.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardUrl"));
        extentTest.pass("Drivere sayfa adresi girilip enter'a basilir ve ana sayfa acilir ");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 3200);");
        ReusableMethods.wait(1);
        smartCardPage.tarifeIleriTusu.click();
        ReusableMethods.wait(1);
        smartCardPage.tarifeIleriTusu.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(smartCardPage.tarifeGoldElementi.isDisplayed());// = onay yapılamıyor
        extentTest.pass("Tarifenin görüntelebildigi test olur.");

        Driver.closeDriver();

    }

    @Test
    public void smartCardBodyTc22() {
        extentTest = extentReports.createTest("TC22 https://qa.smartcardlink.com/ body bölümü butonlari",
                " tarifelerin görünür oldunu test eder");
        SmartCardPage smartCardPage = new SmartCardPage();
        //Ana sayfada "body" bölümündeki "Choose a plan that's right for you" basligi altindaki
        // "Unlimited" adli tarifenin görünür oldugunu dogrulayin.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardUrl"));
        extentTest.pass("Drivere sayfa adresi girilip enter'a basilir ve ana sayfa acilir ");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 3200);");
        ReusableMethods.wait(1);
        smartCardPage.tarifeIleriTusu.click();
        ReusableMethods.wait(1);
        smartCardPage.tarifeIleriTusu.click();
        ReusableMethods.wait(2);
        smartCardPage.tarifeIleriTusu.click();
        Assert.assertTrue(smartCardPage.tarifeUnlimitedElement.isDisplayed());
        extentTest.pass("Tarifenin görüntelebildigi test olur.");

        // Driver.closeDriver();



    }

    @Test
    public void smartCardBodyTc23() {
        extentTest = extentReports.createTest("TC23 https://qa.smartcardlink.com/ body bölümü butonlari",
                " tarifelerin görünür oldunu test eder");
        SmartCardPage smartCardPage = new SmartCardPage();
        //Ana sayfada "body" bölümündeki "Choose a plan that's right for you" basligi altindaki
        // "Özgür Raşit" adli tarifenin görünür oldugunu dogrulayin.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardUrl"));
        extentTest.pass("Drivere sayfa adresi girilip enter'a basilir ve ana sayfa acilir ");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 3200);");
        ReusableMethods.wait(1);
        smartCardPage.tarifeIleriTusu.click();
        ReusableMethods.wait(1);
        smartCardPage.tarifeIleriTusu.click();
        ReusableMethods.wait(2);
        smartCardPage.tarifeIleriTusu.click();
        ReusableMethods.wait(1);
        smartCardPage.tarifeIleriTusu.click();
        Assert.assertTrue(smartCardPage.tarifOzgurrasitElement.isDisplayed());
        ReusableMethods.wait(2);
        extentTest.pass("Tarifenin görüntelebildigi test olur.");

        Driver.closeDriver();

    }


}