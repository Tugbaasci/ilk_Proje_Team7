package tests.samet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.List;

public class US_01 extends TestBaseRapor {

    // As a visitor, I should be able to confirm that I can access the website to use the site.

WebDriver driver;

    @Test
    public void websiteRedirectionTest() {
        extentTest= extentReports.createTest("TestCase01_01: Website Redirection Test",
                "As a visitor, I should be able to confirm that I can access the website to use the site.");

        //    1- Launch browser
        //WebDriver driver= new ChromeDriver();
        //    2- Navigate to url 'https://qa.smartcardlink.com'
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));

        //    3- Verify that homepage title is visible successfully
        HomePage homePage =new HomePage();

        homePage.actualLogoElement.click();
        extentTest.info("Clicked logo on the homepage");
        homePage.actualLogoElement.isDisplayed();
        extentTest.info("Logo is displayed");
        ReusableMethods.wait(2);
        List<WebElement> logoHomePage = Driver.getDriver().findElements(By.xpath("//img[@class='img-fluid navbar-logo']"));
        for (WebElement each : logoHomePage
        ) {
            Assert.assertTrue(each.isDisplayed());
           extentTest.pass("Homepage title is visible successfully");
            //    4- Close the page
            Driver.closeDriver();
        }
    }
    @Test
    public void homepageTest() {

        //    1- Open the web browser
        // WebDriver driver = new ChromeDriver();

        //    2- Navigate to url 'https://qa.smartcardlink.com'
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));

        //    3- Verify that home page is visible successfully
        HomePage homePage = new HomePage();
        homePage.actualLogoElement.click();
        Assert.assertTrue(homePage.actualLogoElement.isDisplayed(), "Homepage is visible");
        ReusableMethods.wait(2);

        //extentTest.info("Homepage is visible");
        ReusableMethods.wait(2);

        //    4- Click 'Contact' tab is displayed on the homepage
        homePage.ContactTabElementi.click();
        ReusableMethods.wait(2);

        //    5-Confirm that you have accessed the relevant tab on the page by clicking the Contact tab
        ReusableMethods.wait(2);
        List<WebElement> ContactUS = Driver.getDriver().findElements(By.xpath("//h2[@class='heading text-success text-center margin-b-80px mb-5']"));
        for (WebElement each : ContactUS
        ) {
            Assert.assertTrue(each.isDisplayed());
           // extentTest.info("ContactUS section is visible on the homePage");

            //    6- Close the page
            Driver.closeDriver();
            Driver.quitDriver();

        }
    }
    }

