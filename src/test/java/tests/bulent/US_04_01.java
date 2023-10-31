package tests.bulent;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_04_01 {
//Ziyeretci olarak girilen Home Page sayfasinin footer bölümündeki
// Facebook, X, Instagram, LinkedIn, Pinterest, Terms & Conditions, Privacy Policy, FAQ
// fonksiyonlarin aktif oldugu dogrulanmalidir.

    @Test   // TC_01
    public void facebookVisibleTest01(){
        // 1- Browser'a https://qa.smartcardlink.com/ yazilir
        // 2- Acilan sayfanin footer bölümüne sayfa kaydirilir.
        // 3- Facebook logosunun görünür oldugu dogrulanir.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrls"));
        String expectedUrl = ConfigReader.getProperty("smartCardLinkUrls");
        String actualUrl = Driver.getDriver().getCurrentUrl();   // https://qa.smartcardlink.com/
        Assert.assertEquals(actualUrl,expectedUrl);

        // sayfayi kaydir
        HomePage homePage = new HomePage();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",homePage.footerFacebookIcon);
        ReusableMethods.waitFor(2);
       // homePage.footerFacebookIcon.click();

        Assert.assertTrue(homePage.footerFacebookIcon.isDisplayed());


        Driver.closeDriver();
    }
    @Test   //TC_02

    public void xVisibleTest02(){
        // 1- Browser'a https://qa.smartcardlink.com/ yazilir
        //2- Acilan sayfanin footer bölümüne sayfa kaydirilir.
        //3- X logosunun görünür oldugu dogrulanir.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrls"));
        String expectedUrl = ConfigReader.getProperty("smartCardLinkUrls");
        String actualUrl = Driver.getDriver().getCurrentUrl();   // https://qa.smartcardlink.com/
        Assert.assertEquals(actualUrl,expectedUrl);

        // sayfayi kaydir
        HomePage homePage = new HomePage();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",homePage.footerXIcon);
        ReusableMethods.waitFor(2);

        Assert.assertTrue(homePage.footerXIcon.isDisplayed());
        Driver.closeDriver();
    }
    @Test   // TC_03
    public void instagramVisibleTest03(){
        // 1- Browser'a https://qa.smartcardlink.com/ yazilir
        //2- Acilan sayfanin footer bölümüne sayfa kaydirilir.
        //3- Instagram logosunun görünür oldugu dogrulanir.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrls"));
        String expectedUrl = ConfigReader.getProperty("smartCardLinkUrls");
        String actualUrl = Driver.getDriver().getCurrentUrl();   // https://qa.smartcardlink.com/
        Assert.assertEquals(actualUrl,expectedUrl);

        // sayfayi kaydir
        HomePage homePage = new HomePage();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",homePage.footerInstagramIcon);
        ReusableMethods.waitFor(2);

        Assert.assertTrue(homePage.footerInstagramIcon.isDisplayed());
        Driver.closeDriver();
    }
    @Test   // TC_04
    public void linkedInVisibleTest04(){
        // 1- Browser'a https://qa.smartcardlink.com/ yazilir
        //2- Acilan sayfanin footer bölümüne sayfa kaydirilir.
        //3- Linkedin logosunun görünür oldugu dogrulanir.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrls"));
        String expectedUrl = ConfigReader.getProperty("smartCardLinkUrls");
        String actualUrl = Driver.getDriver().getCurrentUrl();   // https://qa.smartcardlink.com/
        Assert.assertEquals(actualUrl,expectedUrl);

        // sayfayi kaydir
        HomePage homePage = new HomePage();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",homePage.footerLinkedInIcon);
        ReusableMethods.waitFor(2);

        Assert.assertTrue(homePage.footerLinkedInIcon.isDisplayed());
        Driver.closeDriver();
    }

    @Test  // TC_05
    public void pinterestVisibleTest05(){
        // 1- Browser'a https://qa.smartcardlink.com/ yazilir
        //2- Acilan sayfanin footer bölümüne sayfa kaydirilir.
        //3- Pinterest logosunun görünür oldugu dogrulanir.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrls"));
        String expectedUrl = ConfigReader.getProperty("smartCardLinkUrls");
        String actualUrl = Driver.getDriver().getCurrentUrl();   // https://qa.smartcardlink.com/
        Assert.assertEquals(actualUrl,expectedUrl);

        // sayfayi kaydir
        HomePage homePage = new HomePage();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",homePage.footerPinterestIcon);
        ReusableMethods.waitFor(2);

        Assert.assertTrue(homePage.footerPinterestIcon.isDisplayed());
        Driver.closeDriver();
    }
    @Test   //TC_06
    public void termsConditionsVisibleTest06(){
        // 1- Browser'a https://qa.smartcardlink.com/ yazilir
        //2- Acilan sayfanin footer bölümüne sayfa kaydirilir.
        //3- Term&Conditions linkinin görünür oldugunu dogrulanir.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrls"));
        String expectedUrl = ConfigReader.getProperty("smartCardLinkUrls");
        String actualUrl = Driver.getDriver().getCurrentUrl();   // https://qa.smartcardlink.com/
        Assert.assertEquals(actualUrl,expectedUrl);

        // sayfayi kaydir
        HomePage homePage = new HomePage();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",homePage.footerTermsConditions);
        ReusableMethods.waitFor(2);

        Assert.assertTrue(homePage.footerTermsConditions.isDisplayed());
        Driver.closeDriver();
    }
    @Test   // TC_07
    public void privacyPolicyVisibleTest07(){
        // 1- Browser'a https://qa.smartcardlink.com/ yazilir
        //2- Acilan sayfanin footer bölümüne sayfa kaydirilir.
        //3- Privacy Policy linkinin görünür oldugunu dogrulanir.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrls"));
        String expectedUrl = ConfigReader.getProperty("smartCardLinkUrls");
        String actualUrl = Driver.getDriver().getCurrentUrl();   // https://qa.smartcardlink.com/
        Assert.assertEquals(actualUrl,expectedUrl);

        // sayfayi kaydir
        HomePage homePage = new HomePage();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",homePage.footerPrivacyPolicy);
        ReusableMethods.waitFor(2);

        Assert.assertTrue(homePage.footerPrivacyPolicy.isDisplayed());
        Driver.closeDriver();
    }
    @Test       //TC_08
    public void faqVisibleTest08(){
        // 1- Browser'a https://qa.smartcardlink.com/ yazilir
        //2- Acilan sayfanin footer bölümüne sayfa kaydirilir.
        //3- FAQ linkinin görünür oldugunu dogrulanir.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrls"));
        String expectedUrl = ConfigReader.getProperty("smartCardLinkUrls");
        String actualUrl = Driver.getDriver().getCurrentUrl();   // https://qa.smartcardlink.com/
        Assert.assertEquals(actualUrl,expectedUrl);

        // sayfayi kaydir
        HomePage homePage = new HomePage();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",homePage.footerFAQ);
        ReusableMethods.waitFor(2);

        Assert.assertTrue(homePage.footerFAQ.isDisplayed());
        Driver.closeDriver();
    }
}
