package tests.samet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.List;

public class US_01 extends TestBaseRapor {

    //As a visitor, I should be able to confirm that I can access the website to use the site.

    @Test
    public void websiteRedirectionTest() {
        extentTest= extentReports.createTest("TestCase01_01: Website Redirection Test",
                "As a visitor, I should be able to confirm that I can access the website to use the site.");

        //    1- Launch browser
        WebDriver driver= new ChromeDriver();
        //    2- Navigate to url 'https://qa.smartcardlink.com'
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));

        //    3- Verify that homepage title is visible successfully
        HomePage homePage =new HomePage();

        //   homePage.actualLogoElement.click();
        //    Assert.assertTrue(homePage.actualLogoElement.isDisplayed(),"Homepage is visible");
        ReusableMethods.wait(2);

        List<WebElement> logoHomePage = Driver.getDriver().findElements(By.xpath("//img[@class='img-fluid navbar-logo']"));
        for (WebElement each : logoHomePage
        ) {
            Assert.assertTrue(each.isDisplayed());

            extentTest.pass("homepage title is visible successfully");
            //    4- Close the page

            Driver.closeDriver();
            driver.quit();


        }

    }
    @Test
    public void homepageTest(){

        //    1- Open the web browser
        WebDriver driver =new ChromeDriver();

        //    2- Navigate to url 'https://qa.smartcardlink.com'
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));

        //    3- Verify that home page is visible successfully
        HomePage homePage =new HomePage();
        homePage.actualLogoElement.click();
        Assert.assertTrue(homePage.actualLogoElement.isDisplayed(),"Homepage is visible");
        ReusableMethods.wait(2);


        //    4- Click 'Contact' tab is displayed on the homepage

        homePage.ContactTabElementi.click();
        ReusableMethods.wait(2);

        //    5-Confirm that you have accessed the relevant tab on the page by clicking the Contact tab
        Assert.assertTrue(homePage.ContactTabElementi.isDisplayed());

        //    6- Close the page

        Driver.closeDriver();
        driver.quit();
    }
    @Test
    public void BrowserTest() {
        //   1- Open the Chrome browser.
        WebDriver driver = new ChromeDriver();
        //   2- Navigate to url 'https://qa.smartcardlink.com'
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        //   3- Wait for the website to load completely.
        ReusableMethods.wait(2);
        //   4- Check the appearance and functionality of the website.

        //   5-Close the scanner.
        Driver.closeDriver();

        //   6- Open the Firefox browser.
        WebDriver driver1 = new FirefoxDriver();
        //   7- Navigate to url 'https://qa.smartcardlink.com'
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));

        //   8-Wait for the website to load completely.
        ReusableMethods.wait(2);
        //   9-Check the appearance and functionality of the website.
        //   10-Close the scanner.
        Driver.closeDriver();
        //   6- Open the Safari browser.

        //   7- Navigate to url 'https://qa.smartcardlink.com'
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        //   8-Wait for the website to load completely.
        ReusableMethods.wait(2);
        //   9-Check the appearance and functionality of the website.
        //   10-Close the scanner.
        Driver.closeDriver();

    }

    }
