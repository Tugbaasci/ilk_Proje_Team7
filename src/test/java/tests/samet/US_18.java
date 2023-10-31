package tests.samet;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.List;

public class US_18 extends TestBaseRapor {
    @Test
    public void LoginTest() {

        //I should be able to confirm that I can log in to the system with admin information,
        // the total number of active and active users, the total number of active and inactive VCARD,
        // user plan ratios table and income graph, daily, monthly, weekly, monthly user records.


        extentTest = extentReports.createTest("TestCase18_1: Succesful LoginTest",
                "The user should be able to successfully log in to the system with Admin credentials");
        //    1- Open the web browser
        WebDriver driver = new ChromeDriver();
        //    2- Navigate to url 'https://qa.smartcardlink.com'
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        //    3- Verify that home page is visible successfully
        ReusableMethods.wait(1);

        List<WebElement> logoHomePage = Driver.getDriver().findElements(By.xpath("//img[@class='img-fluid navbar-logo']"));
        for (WebElement each : logoHomePage
        ) {
            Assert.assertTrue(each.isDisplayed());
            extentTest.pass("Admin login succesfully");

            //    4- Click "Sign In" button
            HomePage homePage = new HomePage();
            homePage.SigInButton.click();
            //    5- On the page that appears, fill in the Email and Password fields
            homePage.EmailBox.sendKeys(ConfigReader.getProperty("adminUserName"));
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
            // 10- Close the page
            Driver.closeDriver();
            driver.quit();

        }

    }
    @Test
    public void ActiveandInactiveUsersTest(){

        extentTest= extentReports.createTest("TestCase18_2",
                "As an admin, the total number of active and inactive users should be displayed on the homepage");
       // 1- Open the web browser
       // 2- Navigate to url 'https://qa.smartcardlink.com'
       // 3- Click the Sign In button on the home page
       // 4- On the page that appears, fill in the Email and Password fields and click the Login button
       // 5- Verify that "Total Active Users" is displayed on the admin page
       // 6- Close the page

    }
    @Test
    public void ActiveandInactiveVcardsTest(){

        extentTest= extentReports.createTest("TestCase18_3",
                "As an Admin, you should be able to view the total number of active and inactive vcards on the Adminpage");
      // 1- Open the web browser
      // 2- Navigate to url 'https://qa.smartcardlink.com'
      // 3- Click the Sign In button on the home page
      // 4- On the page that appears, fill in the Email and Password fields and click the Login button
      // 5- Click the "VCards" button on the admin page
      // 6- Verify that the number of active and inactive vcards is displayed on the page that appears
      // 7- Close the page
    }

    @Test
    public void UserPlanRatioTest(){

        extentTest= extentReports.createTest("TestCase18_4",
                "As an Admin, you should be able to view User Plan Ratios table on the Adminpage");
      //  1- Open the web browser
      //  2- Navigate to url 'https://qa.smartcardlink.com'
      //  3- Click the Sign In button on the home page
      //  4- On the page that appears, fill in the Email and Password fields and click the Login button
      //  5- Confirm that the "User Plan Rates Table" is displayed on the admin page
      //  6-Close the page


    }

    @Test
    public void IncomeGraphTest(){

        extentTest= extentReports.createTest("TestCase18_5",
                "As an Admin, you should be able to view an Income Graph on the Adminpage");
     //   1- Open the web browser
     //   2- Enter https://qa.smartcardlink.com/ in the URL bar and press ENTER
     //   3- Click the Sign In button on the home page
     //   4- On the page that appears, fill in the Email and Password fields and click the Login button
     //   5- Confirm that the "Revenue Graph" is displayed on the admin page
     //   6- Close the page

    }
    @Test
    public void DailyUserRecordTest(){

        extentTest= extentReports.createTest("TestCase18_6",
                "As an Admin, you should be able to view daily user records");
    //   1- Open the web browser
    //   2- Navigate to url 'https://qa.smartcardlink.com'
    //   3- Click the Sign In button on the home page
    //   4- On the page that appears, fill in the Email and Password fields and click the Login button
    //   5- Confirm that "Daily User Registrations" is displayed on the admin page
    //   6- Close the page


    }
    @Test
    public void MonthlyUserRecordTest(){

        extentTest= extentReports.createTest("TestCase18_6",
                "As an Admin,, you should be able to view monthly user records.");

     //   1- Open the web browser
     //   2- Navigate to url 'https://qa.smartcardlink.com'
     //   3- Click the Sign In button on the home page
     //   4- On the page that appears, fill in the Email and Password fields and click the Login button
     //   5- Confirm that "Monthly User Registrations" is displayed on the admin page
     //   6- Close the page

    }
    @Test
    public void WeeklyUserRecordTest(){

        extentTest= extentReports.createTest("TestCase18_7",
                "As an Admin,, they should be able to view weekly user records.");
      //  1- Open the web browser
      //  2- Navigate to url 'https://qa.smartcardlink.com'
      //  3- Click the Sign In button on the home page
      //  4- On the page that appears, fill in the Email and Password fields and click the Login button
      //  5- Confirm that "Weekly User Registrations" is displayed on the admin page
      //  6- Close the page
    }
    }
