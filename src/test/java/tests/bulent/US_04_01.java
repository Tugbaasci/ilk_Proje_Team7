package tests.bulent;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_04_01  extends TestBaseRapor{
//Ziyeretci olarak girilen Home Page sayfasinin footer bölümündeki
// Facebook, X, Instagram, LinkedIn, Pinterest, Terms & Conditions, Privacy Policy, FAQ
// fonksiyonlarin aktif oldugu dogrulanmalidir.

    @Test   // TC_01
    public void facebookVisibleTest01(){
        // 1- Browser'a https://qa.smartcardlink.com/ yazilir
        // 2- Acilan sayfanin footer bölümüne sayfa kaydirilir.
        // 3- Facebook logosunun görünür oldugu dogrulanir.
        extentTest = extentReports.createTest("Facebook icon görünürlük Test","Ziyaretci footer bölümünde Facebook iconunu görür.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrls"));
        extentTest.info("Ziyaretci "+ ConfigReader.getProperty("smartCardLinkUrls")+ " sayfasina gider.");
        String expectedUrl = ConfigReader.getProperty("smartCardLinkUrls");
        String actualUrl = Driver.getDriver().getCurrentUrl();   // https://qa.smartcardlink.com/
        Assert.assertEquals(actualUrl,expectedUrl);
        extentTest.pass(expectedUrl + "sayfasina gidildigi dogrulanir.");

        // sayfayi kaydir
        HomePage homePage = new HomePage();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",homePage.footerFacebookIcon);
        ReusableMethods.waitFor(2);
       // homePage.footerFacebookIcon.click();
        extentTest.info(("Sayfanin footer bölümün gidilir ve Facebook iconuna bakilir."));
        Assert.assertTrue(homePage.footerFacebookIcon.isDisplayed());
        extentTest.pass("Sayfa sonunda Facebook iconu oldugu test edilir.");


        Driver.closeDriver();
    }
    @Test   //TC_02

    public void xVisibleTest02(){
        // 1- Browser'a https://qa.smartcardlink.com/ yazilir
        //2- Acilan sayfanin footer bölümüne sayfa kaydirilir.
        //3- X logosunun görünür oldugu dogrulanir.
        extentTest = extentReports.createTest("X icon Test","Ziyaretci footer bölümünde X logosunu görür.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrls"));
        extentTest.info("Ziyaretci "+ ConfigReader.getProperty("smartCardLinkUrls")+ " sayfasina gider");
        String expectedUrl = ConfigReader.getProperty("smartCardLinkUrls");
        String actualUrl = Driver.getDriver().getCurrentUrl();   // https://qa.smartcardlink.com/
        Assert.assertEquals(actualUrl,expectedUrl);
        extentTest.pass(expectedUrl + "sayfasina gidildigi dogrulanir.");

        // sayfayi kaydir
        HomePage homePage = new HomePage();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",homePage.footerXIcon);
        ReusableMethods.waitFor(2);
        extentTest.info(("Sayfanin footer bölümün gidilir ve X iconuna bakilir."));
        Assert.assertTrue(homePage.footerXIcon.isDisplayed());
        extentTest.pass("Sayfa sonunda X iconu oldugu test edilir.");
        Driver.closeDriver();
    }
    @Test   // TC_03
    public void instagramVisibleTest03(){
        // 1- Browser'a https://qa.smartcardlink.com/ yazilir
        //2- Acilan sayfanin footer bölümüne sayfa kaydirilir.
        //3- Instagram logosunun görünür oldugu dogrulanir.
        extentTest = extentReports.createTest("Instagram icon Test","Ziyaretci footer bölümünde Instagram logosunu görür.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrls"));
        extentTest.info("Ziyaretci "+ ConfigReader.getProperty("smartCardLinkUrls")+ " sayfasina gider");
        String expectedUrl = ConfigReader.getProperty("smartCardLinkUrls");
        String actualUrl = Driver.getDriver().getCurrentUrl();   // https://qa.smartcardlink.com/
        Assert.assertEquals(actualUrl,expectedUrl);
        extentTest.pass(expectedUrl + "sayfasina gidildigi dogrulanir.");
        // sayfayi kaydir
        HomePage homePage = new HomePage();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",homePage.footerInstagramIcon);
        ReusableMethods.waitFor(2);
        extentTest.info(("Sayfanin footer bölümün gidilir ve Instagram iconuna bakilir."));
        Assert.assertTrue(homePage.footerInstagramIcon.isDisplayed());
        extentTest.pass("Sayfa sonunda Instagram iconu oldugu test edilir.");
        Driver.closeDriver();
    }
    @Test   // TC_04
    public void linkedInVisibleTest04(){
        // 1- Browser'a https://qa.smartcardlink.com/ yazilir
        //2- Acilan sayfanin footer bölümüne sayfa kaydirilir.
        //3- Linkedin logosunun görünür oldugu dogrulanir.
        extentTest = extentReports.createTest("Linkedin icon Test","Ziyaretci footer bölümünde Linkedin logosunu görür.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrls"));
        extentTest.info("Ziyaretci "+ ConfigReader.getProperty("smartCardLinkUrls")+ " sayfasina gider");
        String expectedUrl = ConfigReader.getProperty("smartCardLinkUrls");
        String actualUrl = Driver.getDriver().getCurrentUrl();   // https://qa.smartcardlink.com/
        Assert.assertEquals(actualUrl,expectedUrl);
        extentTest.pass(expectedUrl + "sayfasina gidildigi dogrulanir.");
        // sayfayi kaydir
        HomePage homePage = new HomePage();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",homePage.footerLinkedInIcon);
        ReusableMethods.waitFor(2);
        extentTest.info(("Sayfanin footer bölümün gidilir ve Linkedin iconuna bakilir."));
        Assert.assertTrue(homePage.footerLinkedInIcon.isDisplayed());
        extentTest.pass("Sayfa sonunda Linkedin iconu oldugu test edilir.");
        Driver.closeDriver();
    }

    @Test  // TC_05
    public void pinterestVisibleTest05(){
        // 1- Browser'a https://qa.smartcardlink.com/ yazilir
        //2- Acilan sayfanin footer bölümüne sayfa kaydirilir.
        //3- Pinterest logosunun görünür oldugu dogrulanir.
        extentTest = extentReports.createTest("Pinterest icon Test","Ziyaretci footer bölümünde Pinterest logosunu görür.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrls"));
        extentTest.info("Ziyaretci "+ ConfigReader.getProperty("smartCardLinkUrls")+ " sayfasina gider");
        String expectedUrl = ConfigReader.getProperty("smartCardLinkUrls");
        String actualUrl = Driver.getDriver().getCurrentUrl();   // https://qa.smartcardlink.com/
        Assert.assertEquals(actualUrl,expectedUrl);
        extentTest.pass(expectedUrl + "sayfasina gidildigi dogrulanir.");
        // sayfayi kaydir
        HomePage homePage = new HomePage();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",homePage.footerPinterestIcon);
        ReusableMethods.waitFor(2);
        extentTest.info(("Sayfanin footer bölümün gidilir ve Pinterest iconuna bakilir."));
        Assert.assertTrue(homePage.footerPinterestIcon.isDisplayed());
        extentTest.pass("Sayfa sonunda Pinterest iconu oldugu test edilir.");
        Driver.closeDriver();

    }
    @Test   //TC_06
    public void termsConditionsVisibleTest06(){
        // 1- Browser'a https://qa.smartcardlink.com/ yazilir
        //2- Acilan sayfanin footer bölümüne sayfa kaydirilir.
        //3- Term&Conditions linkinin görünür oldugunu dogrulanir.
        extentTest = extentReports.createTest("Terms & Conditions link görünürlük Test","Ziyaretci footer bölümünde Terms & Conditions linkini görür.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrls"));
        extentTest.info("Ziyaretci "+ ConfigReader.getProperty("smartCardLinkUrls")+ " sayfasina gider");
        String expectedUrl = ConfigReader.getProperty("smartCardLinkUrls");
        String actualUrl = Driver.getDriver().getCurrentUrl();   // https://qa.smartcardlink.com/
        Assert.assertEquals(actualUrl,expectedUrl);
        extentTest.pass(expectedUrl + "sayfasina gidildigi dogrulanir.");
        // sayfayi kaydir
        HomePage homePage = new HomePage();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",homePage.footerTermsConditions);
        ReusableMethods.waitFor(2);
        extentTest.info(("Sayfanin footer bölümün gidilir ve Terms & Conditions linkine bakilir."));
        Assert.assertTrue(homePage.footerTermsConditions.isDisplayed());
        extentTest.pass("Sayfa sonunda Pinterest Terms & Conditions linkinin oldugu test edilir.");
        Driver.closeDriver();
    }
    @Test   // TC_07
    public void privacyPolicyVisibleTest07(){
        // 1- Browser'a https://qa.smartcardlink.com/ yazilir
        //2- Acilan sayfanin footer bölümüne sayfa kaydirilir.
        //3- Privacy Policy linkinin görünür oldugunu dogrulanir.
        extentTest = extentReports.createTest("Privacy Policy link görünürlük Test","Ziyaretci footer bölümünde Privacy Policy linkini görür.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrls"));
        extentTest.info("Ziyaretci "+ ConfigReader.getProperty("smartCardLinkUrls")+ " sayfasina gider");
        String expectedUrl = ConfigReader.getProperty("smartCardLinkUrls");
        String actualUrl = Driver.getDriver().getCurrentUrl();   // https://qa.smartcardlink.com/
        Assert.assertEquals(actualUrl,expectedUrl);
        extentTest.pass(expectedUrl + "sayfasina gidildigi dogrulanir.");
        // sayfayi kaydir
        HomePage homePage = new HomePage();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",homePage.footerPrivacyPolicy);
        ReusableMethods.waitFor(2);
        extentTest.info(("Sayfanin footer bölümün gidilir ve Privacy Policy linkine bakilir."));
        Assert.assertTrue(homePage.footerPrivacyPolicy.isDisplayed());
        extentTest.pass("Sayfa sonunda Pinterest Privacy Polic linkinin oldugu test edilir.");
        Driver.closeDriver();
    }
    @Test       //TC_08
    public void faqVisibleTest08(){
        // 1- Browser'a https://qa.smartcardlink.com/ yazilir
        //2- Acilan sayfanin footer bölümüne sayfa kaydirilir.
        //3- FAQ linkinin görünür oldugunu dogrulanir.
        extentTest = extentReports.createTest("FAQ link görünürlük Test","Ziyaretci footer bölümünde FAQ linkini görür.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrls"));
        extentTest.info("Ziyaretci "+ ConfigReader.getProperty("smartCardLinkUrls")+ " sayfasina gider");
        String expectedUrl = ConfigReader.getProperty("smartCardLinkUrls");
        String actualUrl = Driver.getDriver().getCurrentUrl();   // https://qa.smartcardlink.com/
        Assert.assertEquals(actualUrl,expectedUrl);
        extentTest.pass(expectedUrl + "sayfasina gidildigi dogrulanir.");
        // sayfayi kaydir
        HomePage homePage = new HomePage();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",homePage.footerFAQ);
        ReusableMethods.waitFor(2);
        extentTest.info(("Sayfanin footer bölümün gidilir ve FAQ linkine bakilir."));
        Assert.assertTrue(homePage.footerFAQ.isDisplayed());
        extentTest.pass("Sayfa sonunda Pinterest FAQ linkinin oldugu test edilir.");
        Driver.closeDriver();
    }
}
