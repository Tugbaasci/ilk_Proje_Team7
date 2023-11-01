package tests.bulent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.Set;

public class US_04_02 extends TestBaseRapor {



    @Test   // TC_09
    public void facebookAktiveTest09(){

        //1- Browser'a https://qa.smartcardlink.com/ yazilir.
        //2- Acilan sayfanin footer bölümüne sayfa kaydirilir.
        //3- Facebook logosuna tiklanir.
        //4- Facebook sayfasinin acildigi dogrulanir.
        extentTest= extentReports.createTest("Facebook icon Aktif Test","Ziyaretci footer bölümünde Facebook iconunun aktif oldugunu görür.");
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
        extentTest.info(("Sayfanin footer bölümün gidilir ve Facebook iconuna bakilir."));
        Assert.assertTrue(homePage.footerFacebookIcon.isDisplayed());
        extentTest.pass(expectedUrl + "sayfasina footer bölümünde Facebook ikonunun görüldügü dogrulanir.");
        // https://qa.smartcardlink.com/
        // Window Handle Value
        String firstPageWHV = Driver.getDriver().getWindowHandle();

        homePage.footerFacebookIcon.click();
        extentTest.info(("Sayfanin footer bölümüne gidilir ve Facebook iconuna tiklanir."));
        String secondPageWHV = "";
        Set<String> windowHalesValues = Driver.getDriver().getWindowHandles();
        for (String each: windowHalesValues
        ) {
            if(!each.equals(firstPageWHV)){
                secondPageWHV = each;
            }
        }
        ReusableMethods.waitFor(2);
        // ikinci sayfaya (facebook) gecti
        Driver.getDriver().switchTo().window(secondPageWHV);
        // simdi bu sayfanin facebook olup olmadi kontrol edilecek
        String actualFaceBookUrl = Driver.getDriver().getCurrentUrl();
        String exceptedFacebookUrl = ConfigReader.getProperty("facebookURL");

        Assert.assertEquals(actualFaceBookUrl,exceptedFacebookUrl);
        extentTest.pass("Sayfa sonunda Facebook sayfasinin acildigi ve ikonun Aktif oldugu test edilir.");

        Driver.quitDriver();


    }
    @Test   //TC_10

    public void xActiveTest10(){
        //1- Browser'a https://qa.smartcardlink.com/ yazilir
        //2- Acilan sayfanin footer bölümüne sayfa kaydirilir.
        //3- X logosuna tiklanir.
        //4- X sayfasinin acildigi dogrulanir.
        extentTest= extentReports.createTest("X icon Aktif Test","Ziyaretci footer bölümünde X iconunun aktif oldugunu görür.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrls"));
        extentTest.info("Ziyaretci "+ ConfigReader.getProperty("smartCardLinkUrls")+ " sayfasina gider.");
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
        extentTest.pass(expectedUrl + "sayfasina gidildigi dogrulanir.");
        // https://qa.smartcardlink.com/
        // Window Handle Value
        String firstPageWHV = Driver.getDriver().getWindowHandle();

        homePage.footerXIcon.click();
        extentTest.info(("Sayfanin footer bölümüne gidilir ve X iconuna tiklanir."));
        String secondPageWHV = "";
        Set<String> windowHalesValues = Driver.getDriver().getWindowHandles();
        for (String each: windowHalesValues
        ) {
            if(!each.equals(firstPageWHV)){
                secondPageWHV = each;
            }
        }
        ReusableMethods.waitFor(2);
        // ikinci sayfaya (facebook) gecti
        Driver.getDriver().switchTo().window(secondPageWHV);
        // simdi bu sayfanin facebook olup olmadi kontrol edilecek
        String actualXUrl = Driver.getDriver().getCurrentUrl();
        String exceptedXUrl = ConfigReader.getProperty("xURL");

        Assert.assertEquals(actualXUrl,exceptedXUrl);
        extentTest.pass("Sayfa sonunda X sayfasinin acildigi ve ikonun Aktif  oldugu test edilir.");
        // Expected :https://twitter.com/
        // Actual   :https://www.pinterest.com/
        Driver.quitDriver();
    }
    @Test   // TC_11
    public void instagramAktiveTest10(){
        //1- Browser'a https://qa.smartcardlink.com/ yazilir
        //2- Acilan sayfanin footer bölümüne sayfa kaydirilir.
        //3- Instagram logosuna tiklanir.
        //4- Instagram sayfasinin acildigi dogrulanir.
        extentTest= extentReports.createTest("Instagram icon Aktif Test","Ziyaretci footer bölümünde Instagram iconunun aktif oldugunu görür.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrls"));
        extentTest.info("Ziyaretci "+ ConfigReader.getProperty("smartCardLinkUrls")+ " sayfasina gider.");
        String expectedUrl = ConfigReader.getProperty("smartCardLinkUrls");
        String actualUrl = Driver.getDriver().getCurrentUrl();   // https://qa.smartcardlink.com/
        Assert.assertEquals(actualUrl,expectedUrl);
        extentTest.pass(expectedUrl + "sayfasina gidildigi dogrulanir.");
        // sayfayi kaydir
        HomePage homePage = new HomePage();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",homePage.footerInstagramIcon);
        ReusableMethods.waitFor(2);
        extentTest.info(("Sayfanin footer bölümüne gidilir ve Instagram iconuna bakilir."));
        Assert.assertTrue(homePage.footerInstagramIcon.isDisplayed());
        extentTest.pass(expectedUrl + "sayfasina gidildigi dogrulanir.");
        // https://qa.smartcardlink.com/
        // Window Handle Value
        String firstPageWHV = Driver.getDriver().getWindowHandle();

        homePage.footerInstagramIcon.click();
        extentTest.info(("Sayfanin footer bölümüne gidilir ve Instagram iconuna tiklanir."));
        String secondPageWHV = "";
        Set<String> windowHalesValues = Driver.getDriver().getWindowHandles();
        for (String each: windowHalesValues
        ) {
            if(!each.equals(firstPageWHV)){
                secondPageWHV = each;
            }
        }
        ReusableMethods.waitFor(2);
        // ikinci sayfaya (facebook) gecti
        Driver.getDriver().switchTo().window(secondPageWHV);
        // simdi bu sayfanin facebook olup olmadi kontrol edilecek
        String actualInstagramUrl = Driver.getDriver().getCurrentUrl();
        String exceptedInstagramUrl = ConfigReader.getProperty("instagramUrl");

        Assert.assertEquals(actualInstagramUrl,exceptedInstagramUrl);
        extentTest.pass("Sayfa sonunda Instagram sayfasinin acildigi ve ikonun Aktif oldugu test edilir.");
        Driver.quitDriver();
    }
    @Test   // TC_12
    public void linkedInActiveTest12(){
        //1- Browser'a https://qa.smartcardlink.com/ yazilir
        //2- Acilan sayfanin footer bölümüne sayfa kaydirilir.
        //3- Linkedin logosuna tiklanir.
        //4- Linkedin sayfasinin acildigi dogrulanir.
        extentTest= extentReports.createTest("Linkedin icon Aktif Test","Ziyaretci footer bölümünde Linkedin iconunun aktif oldugunu görür.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrls"));
        extentTest.info("Ziyaretci "+ ConfigReader.getProperty("smartCardLinkUrls")+ " sayfasina gider.");
        String expectedUrl = ConfigReader.getProperty("smartCardLinkUrls");
        String actualUrl = Driver.getDriver().getCurrentUrl();   // https://qa.smartcardlink.com/
        Assert.assertEquals(actualUrl,expectedUrl);
        extentTest.pass(expectedUrl + "sayfasina gidildigi dogrulanir.");
        // sayfayi kaydir
        HomePage homePage = new HomePage();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",homePage.footerLinkedInIcon);
        ReusableMethods.waitFor(2);

        Assert.assertTrue(homePage.footerLinkedInIcon.isDisplayed());

        // https://qa.smartcardlink.com/
        // Window Handle Value
        String firstPageWHV = Driver.getDriver().getWindowHandle();

        homePage.footerLinkedInIcon.click();

        String secondPageWHV = "";
        Set<String> windowHalesValues = Driver.getDriver().getWindowHandles();
        for (String each: windowHalesValues
        ) {
            if(!each.equals(firstPageWHV)){
                secondPageWHV = each;
            }
        }
        ReusableMethods.waitFor(2);
        // ikinci sayfaya (facebook) gecti
        Driver.getDriver().switchTo().window(secondPageWHV);
        // simdi bu sayfanin facebook olup olmadi kontrol edilecek
        String actualLinkedinUrl = Driver.getDriver().getCurrentUrl();
        String exceptedLinkedinUrl = ConfigReader.getProperty("linkedinUrl");
        Assert.assertEquals(actualLinkedinUrl,exceptedLinkedinUrl);
        extentTest.pass("Sayfa sonunda Linkedin sayfasinin acildigi ve ikonun Aktif oldugu test edilir.");
        // Driver.closeDriver();
        Driver.quitDriver();
    }

    @Test  // TC_13
    public void pinterestActiveTest13(){
        // 1- Browser'a https://qa.smartcardlink.com/ yazilir
        //2- Acilan sayfanin footer bölümüne sayfa kaydirilir.
        //3- Pinterest logosuna tiklanir.
        //4- Pinterest sayfasinin acildigi dogrulanir.
        extentTest= extentReports.createTest("Pinterest icon Aktif Test","Ziyaretci footer bölümünde Pinterest iconunun aktif oldugunu görür.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrls"));
        extentTest.info("Ziyaretci "+ ConfigReader.getProperty("smartCardLinkUrls")+ " sayfasina gider.");
        String expectedUrl = ConfigReader.getProperty("smartCardLinkUrls");
        String actualUrl = Driver.getDriver().getCurrentUrl();   // https://qa.smartcardlink.com/
        Assert.assertEquals(actualUrl,expectedUrl);
        extentTest.pass(expectedUrl + "sayfasina gidildigi dogrulanir.");
        // sayfayi kaydir
        HomePage homePage = new HomePage();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",homePage.footerPinterestIcon);
        ReusableMethods.waitFor(2);

        Assert.assertTrue(homePage.footerPinterestIcon.isDisplayed());

        // https://qa.smartcardlink.com/
        // Window Handle Value
        String firstPageWHV = Driver.getDriver().getWindowHandle();

        homePage.footerPinterestIcon.click();

        String secondPageWHV = "";
        Set<String> windowHalesValues = Driver.getDriver().getWindowHandles();
        for (String each: windowHalesValues
        ) {
            if(!each.equals(firstPageWHV)){
                secondPageWHV = each;
            }
        }
        ReusableMethods.waitFor(2);
        // ikinci sayfaya (facebook) gecti
        Driver.getDriver().switchTo().window(secondPageWHV);
        // simdi bu sayfanin facebook olup olmadi kontrol edilecek
        String actualPinterestUrl = Driver.getDriver().getCurrentUrl();
        String exceptedPinterestUrl = ConfigReader.getProperty("pinterestUrl");
        Assert.assertEquals(actualPinterestUrl,exceptedPinterestUrl);
        extentTest.pass("Sayfa sonunda Pinterest sayfasinin acildigi ve ikonun Aktif oldugu test edilir.");
        // Driver.closeDriver();
        Driver.quitDriver();
    }
    @Test   //TC_14
    public void termsConditionsActiveTest14(){
        //1- Browser'a https://qa.smartcardlink.com/ yazilir
        //2- Acilan sayfanin footer bölümüne sayfa kaydirilir.
        //3- Terms & Conditions linkine tiklanir.
        //4- Terms & Conditions sayfasinin acildigi dogrulanir.
        extentTest= extentReports.createTest("Terms & Conditions link Aktif Test","Ziyaretci footer bölümünde Terms & Conditions linkinin aktif oldugunu görür.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrls"));
        extentTest.info("Ziyaretci "+ ConfigReader.getProperty("smartCardLinkUrls")+ " sayfasina gider.");
        String expectedUrl = ConfigReader.getProperty("smartCardLinkUrls");
        String actualUrl = Driver.getDriver().getCurrentUrl();   // https://qa.smartcardlink.com/
        Assert.assertEquals(actualUrl,expectedUrl);
        extentTest.pass(expectedUrl + "sayfasina gidildigi dogrulanir.");

        // sayfayi kaydir
        HomePage homePage = new HomePage();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",homePage.footerTermsConditions);
        ReusableMethods.waitFor(2);

        Assert.assertTrue(homePage.footerTermsConditions.isDisplayed());

        // https://qa.smartcardlink.com/
        // Window Handle Value
        String firstPageWHV = Driver.getDriver().getWindowHandle();

        homePage.footerTermsConditions.click();

        String secondPageWHV = "";
        Set<String> windowHalesValues = Driver.getDriver().getWindowHandles();
        for (String each: windowHalesValues
        ) {
            if(!each.equals(firstPageWHV)){
                secondPageWHV = each;
            }
        }
        ReusableMethods.waitFor(2);
        // ikinci sayfaya (facebook) gecti
        Driver.getDriver().switchTo().window(secondPageWHV);
        // simdi bu sayfanin facebook olup olmadi kontrol edilecek
        String actualText = homePage.termsConditionsWE.getText();
        String exceptedText  = "Terms & Conditions";
        Assert.assertEquals(actualText,exceptedText);
        extentTest.pass("Sayfa sonunda Terms & Conditions sayfasinin acildigi ve linkin Aktif oldugu test edilir.");
        // Driver.closeDriver();
        Driver.quitDriver();
    }
    @Test   // TC_15
    public void privacyPolicyActiveTest15(){
        //1- Browser'a https://qa.smartcardlink.com/ yazilir
        //2- Acilan sayfanin footer bölümüne sayfa kaydirilir.
        //3- Privacy Policy linkine tiklanir.
        //4- Privacy Policy sayfasinin acildigi dogrulanir.
        extentTest= extentReports.createTest("Privacy Policy link Aktif Test","Ziyaretci footer bölümünde Privacy Policy linkinin aktif oldugunu görür.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrls"));
        extentTest.info("Ziyaretci "+ ConfigReader.getProperty("smartCardLinkUrls")+ " sayfasina gider.");
        String expectedUrl = ConfigReader.getProperty("smartCardLinkUrls");
        String actualUrl = Driver.getDriver().getCurrentUrl();   // https://qa.smartcardlink.com/
        Assert.assertEquals(actualUrl,expectedUrl);
        extentTest.pass(expectedUrl + "sayfasina gidildigi dogrulanir.");
        // sayfayi kaydir
        HomePage homePage = new HomePage();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",homePage.footerPrivacyPolicy);
        ReusableMethods.waitFor(1);

        Assert.assertTrue(homePage.footerPrivacyPolicy.isDisplayed());

        // https://qa.smartcardlink.com/
        // Window Handle Value
        String firstPageWHV = Driver.getDriver().getWindowHandle();

        homePage.footerPrivacyPolicy.click();

        String secondPageWHV = "";
        Set<String> windowHalesValues = Driver.getDriver().getWindowHandles();
        for (String each: windowHalesValues
        ) {
            if(!each.equals(firstPageWHV)){
                secondPageWHV = each;
            }
        }
        ReusableMethods.waitFor(1);
        // ikinci sayfaya (facebook) gecti
        Driver.getDriver().switchTo().window(secondPageWHV);
        // simdi bu sayfanin facebook olup olmadi kontrol edilecek
        String actualText = homePage.privacyPolicyWE.getText();
        String exceptedText  = "Privacy Policy";
        Assert.assertEquals(actualText,exceptedText);
        extentTest.pass("Sayfa sonunda Privacy Policy sayfasinin acildigi ve linkin Aktif oldugu test edilir.");
        // Driver.closeDriver();
        Driver.quitDriver();
    }
    @Test       //TC_16
    public void faqActiveTest16(){
        //1- Browser'a https://qa.smartcardlink.com/ yazilir
        //2- Acilan sayfanin footer bölümüne sayfa kaydirilir.
        //3- FAQ linkine tiklanir.
        //4- FAQ sayfasinin acildigi dogrulanir.
        extentTest= extentReports.createTest("FAQ link Aktif Test","Ziyaretci footer bölümünde FAQ linkinin aktif oldugunu görür.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrls"));
        extentTest.info("Ziyaretci "+ ConfigReader.getProperty("smartCardLinkUrls")+ " sayfasina gider.");
        String expectedUrl = ConfigReader.getProperty("smartCardLinkUrls");
        String actualUrl = Driver.getDriver().getCurrentUrl();   // https://qa.smartcardlink.com/
        Assert.assertEquals(actualUrl,expectedUrl);
        extentTest.pass(expectedUrl + "sayfasina gidildigi dogrulanir.");
        // sayfayi kaydir
        HomePage homePage = new HomePage();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",homePage.footerFAQ);
        ReusableMethods.waitFor(2);

        Assert.assertTrue(homePage.footerFAQ.isDisplayed());

        // https://qa.smartcardlink.com/
        // Window Handle Value
        String firstPageWHV = Driver.getDriver().getWindowHandle();

        homePage.footerFAQ.click();

        String secondPageWHV = "";
        Set<String> windowHalesValues = Driver.getDriver().getWindowHandles();
        for (String each: windowHalesValues
        ) {
            if(!each.equals(firstPageWHV)){
                secondPageWHV = each;
            }
        }
        ReusableMethods.waitFor(1);
        // ikinci sayfaya (facebook) gecti
        Driver.getDriver().switchTo().window(secondPageWHV);
        // simdi bu sayfanin facebook olup olmadi kontrol edilecek
        String actualText = homePage.faqWE.getText();
        String exceptedText  = "Frequently Asked Questions (FAQ)";
        Assert.assertEquals(actualText,exceptedText);
        extentTest.pass("Sayfa sonunda FAQ sayfasinin acildigi ve linkin Aktif oldugu test edilir.");
        // Driver.closeDriver();
        Driver.quitDriver();
    }

}

