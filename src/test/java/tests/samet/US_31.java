package tests.samet;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.Arrays;

public class US_31 extends TestBaseRapor {
WebDriver driver;
    // I should be able to confirm that I can view the number of languages
    // used on the site after logging in with admin scholar

    @Test
    public void AccesAdminTest() {
        extentTest = extentReports.createTest("TestCase31_1: Succesful LoginTest",
                "The user should be able to successfully log in to the system with Admin credentials");
        //    1- Open the web browser
       // WebDriver driver = new ChromeDriver();
        //    2- Navigate to url 'https://qa.smartcardlink.com'
            Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        //    3- Verify that home page is visible successfully
            ReusableMethods.wait(1);
            HomePage homePage= new HomePage();
            Assert.assertTrue(homePage.logoHomePage.isDisplayed());
            extentTest.pass("Admin login succesfully");
            //    4- Click "Sign In" button
            homePage.SigInButton.click();
            //    5- On the page that appears, fill in the Email and Password fields
            homePage.EmailBox.clear();
            homePage.EmailBox.sendKeys(ConfigReader.getProperty("adminUserName"));
            homePage.PasswordBox.clear();
            homePage.PasswordBox.sendKeys(ConfigReader.getProperty("adminPassword"));
            //    6- Click the Login button
            homePage.LogInButton.click();
            //  7- Verify successful login to the Admin Page
            homePage.AdminDashboard.isDisplayed();
            // 8-Click "Admin Account" panel
            homePage.DropdownExitPanel.click();
            ReusableMethods.wait(2);
            //9- Click 'Signout' tab
            homePage.LogOutbutton.click();
            extentTest.pass("Admin validates to access to the Dashboard page");
            extentTest.info("Admin succesfully Signout ");
            // 10- Close the page
            Driver.closeDriver();

        }

        @Test
        public void LanguagesButtonTest () {
        extentTest= extentReports.createTest("TestCase31_2: Languages Button",
                "The user should have access to an interface that can display the Languages button in the Admin panel");

            // 1- Open the web browser
           // WebDriver driver = new ChromeDriver();
            // 2- Navigate to url 'https://qa.smartcardlink.com'
            Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
            // 3- Click the Sign In button on the home page
            HomePage homePage = new HomePage();
            homePage.SigInButton.click();
            // 4- On the page that appears, fill in the Email and Password fields
            homePage.EmailBox.sendKeys(ConfigReader.getProperty("adminUserName"));
            homePage.PasswordBox.sendKeys(ConfigReader.getProperty("adminPassword"));
            // 5- Click the Login button
            homePage.LogInButton.click();
            // 6- Verify the "Languages" button on the admin page
            ReusableMethods.wait(2);
            Assert.assertTrue(homePage.LanguagesButton.isDisplayed());
            extentTest.info("Languges button is displayed");
            // 7- Click the "Languages" button
            homePage.LanguagesButton.click();
            ReusableMethods.wait(2);
            // 8- Confirm that you have successfully accessed the "Languages" page
            Assert.assertTrue(homePage.LanguagesButton.isDisplayed());
            extentTest.pass("Admin have accessed Languages page");
                // 9- Close the page
                Driver.closeDriver();
            }

        @Test
        public void NumberofLanguagesTest() {

        extentTest= extentReports.createTest("TestCase31_3: NumberofLanguagesTest",
                "As an admin should be able to successfully view the Number of Languages Used");

            //  1- Open the web browser
            //WebDriver driver = new ChromeDriver();
            //  2- Navigate to url 'https://qa.smartcardlink.com'
            Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
            //  3- Click the Sign In button on the home page
            HomePage homePage = new HomePage();
            homePage.SigInButton.click();
            //  4- On the page that appears, fill in the Email and Password fields
            homePage.EmailBox.sendKeys(ConfigReader.getProperty("adminUserName"));
            homePage.PasswordBox.sendKeys(ConfigReader.getProperty("adminPassword"));
            //  5- Click the Login button
            homePage.LogInButton.click();
            extentTest.info("Admin succesfully login");
            //  6- Verify the "Languages" button on the admin page
            homePage.LanguagesButton.isDisplayed();
            extentTest.info("Languges button is displayed");
            //  7- Click the "Languages" button
                ReusableMethods.wait(2);
                homePage.LanguagesButton.click();
                ReusableMethods.wait(2);
           //  8- Verify that the total number of languages can be visualized on the page that opens

            String Text = homePage.LanguagesResultElement.getText();
            String[] TotalNumberLanguages = Text.split(" ");
            System.out.println(Arrays.toString(TotalNumberLanguages));
            String languages = TotalNumberLanguages[2];
            Assert.assertFalse(languages.isEmpty(),"Total number of Languages is displayed");
            //  9- Close the page
                Driver.closeDriver();

            }
        }

