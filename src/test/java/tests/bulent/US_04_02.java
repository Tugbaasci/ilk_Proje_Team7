package tests.bulent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class US_04_02 {



    @Test   // TC_09
    public void facebookAktiveTest09(){

        //1- Browser'a https://qa.smartcardlink.com/ yazilir.
        //2- Acilan sayfanin footer bölümüne sayfa kaydirilir.
        //3- Facebook logosuna tiklanir.
        //4- Facebook sayfasinin acildigi dogrulanir.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrls"));
        String expectedUrl = ConfigReader.getProperty("smartCardLinkUrls");
        String actualUrl = Driver.getDriver().getCurrentUrl();   // https://qa.smartcardlink.com/
        Assert.assertEquals(actualUrl,expectedUrl);

        // sayfayi kaydir
        HomePage homePage = new HomePage();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",homePage.footerFacebookIcon);
        ReusableMethods.waitFor(2);
        Assert.assertTrue(homePage.footerFacebookIcon.isDisplayed());

        // https://qa.smartcardlink.com/
        // Window Handle Value
        String firstPageWHV = Driver.getDriver().getWindowHandle();

        homePage.footerFacebookIcon.click();

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

        Driver.quitDriver();


    }
    @Test   //TC_10

    public void xActiveTest10(){
        //1- Browser'a https://qa.smartcardlink.com/ yazilir
        //2- Acilan sayfanin footer bölümüne sayfa kaydirilir.
        //3- X logosuna tiklanir.
        //4- X sayfasinin acildigi dogrulanir.
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
        // https://qa.smartcardlink.com/
        // Window Handle Value
        String firstPageWHV = Driver.getDriver().getWindowHandle();

        homePage.footerXIcon.click();

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
        // https://qa.smartcardlink.com/
        // Window Handle Value
        String firstPageWHV = Driver.getDriver().getWindowHandle();

        homePage.footerInstagramIcon.click();

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

        Driver.quitDriver();
    }
    @Test   // TC_12
    public void linkedInActiveTest12(){
        //1- Browser'a https://qa.smartcardlink.com/ yazilir
        //2- Acilan sayfanin footer bölümüne sayfa kaydirilir.
        //3- Linkedin logosuna tiklanir.
        //4- Linkedin sayfasinin acildigi dogrulanir.
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

        // Driver.closeDriver();
        Driver.quitDriver();
    }

    @Test  // TC_13
    public void pinterestActiveTest13(){
        // 1- Browser'a https://qa.smartcardlink.com/ yazilir
        //2- Acilan sayfanin footer bölümüne sayfa kaydirilir.
        //3- Pinterest logosuna tiklanir.
        //4- Pinterest sayfasinin acildigi dogrulanir.
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

        // Driver.closeDriver();
        Driver.quitDriver();
    }
    @Test   //TC_14
    public void termsConditionsActiveTest14(){
        //1- Browser'a https://qa.smartcardlink.com/ yazilir
        //2- Acilan sayfanin footer bölümüne sayfa kaydirilir.
        //3- Terms & Conditions linkine tiklanir.
        //4- Terms & Conditions sayfasinin acildigi dogrulanir.
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

        // Driver.closeDriver();
        Driver.quitDriver();
    }
    @Test   // TC_15
    public void privacyPolicyActiveTest15(){
        //1- Browser'a https://qa.smartcardlink.com/ yazilir
        //2- Acilan sayfanin footer bölümüne sayfa kaydirilir.
        //3- Privacy Policy linkine tiklanir.
        //4- Privacy Policy sayfasinin acildigi dogrulanir.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrls"));
        String expectedUrl = ConfigReader.getProperty("smartCardLinkUrls");
        String actualUrl = Driver.getDriver().getCurrentUrl();   // https://qa.smartcardlink.com/
        Assert.assertEquals(actualUrl,expectedUrl);

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

        // Driver.closeDriver();
        Driver.quitDriver();
    }
    @Test       //TC_16
    public void faqActiveTest16(){
        //1- Browser'a https://qa.smartcardlink.com/ yazilir
        //2- Acilan sayfanin footer bölümüne sayfa kaydirilir.
        //3- FAQ linkine tiklanir.
        //4- FAQ sayfasinin acildigi dogrulanir.
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

        // Driver.closeDriver();
        Driver.quitDriver();
    }

}

