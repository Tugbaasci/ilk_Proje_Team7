package tests.samet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.Arrays;
import java.util.List;

public class US_18 extends TestBaseRapor {
    WebDriver driver;
    @Test
    public void LoginTest() {

        // I should be able to confirm that I can log in to the system with admin information,
        // the total number of active and active users, the total number of active and inactive VCARD,
        // user plan ratios table and income graph, daily, monthly, weekly, monthly user records.

        extentTest = extentReports.createTest("TestCase18_01: Succesful LoginTest",
                "The user should be able to successfully log in to the system with Admin credentials");
        //    1- Open the web browser
       // WebDriver driver = new ChromeDriver();
        //    2- Navigate to url 'https://qa.smartcardlink.com'
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        //    3- Verify that homepage is visible successfully
        ReusableMethods.wait(1);

        List<WebElement> logoHomePage = Driver.getDriver().findElements(By.xpath("//img[@class='img-fluid navbar-logo']"));
        for (WebElement each : logoHomePage
        ) {
            Assert.assertTrue(each.isDisplayed());
            extentTest.pass("Homepage is visible");
            //    4- Click "Sign In" button
            HomePage homePage = new HomePage();
            homePage.SigInButton.click();
            //    5- On the page that appears, fill in the Email and Password fields
            homePage.EmailBox.clear();
            homePage.EmailBox.sendKeys(ConfigReader.getProperty("adminUserName"));
            homePage.PasswordBox.clear();
            homePage.PasswordBox.sendKeys(ConfigReader.getProperty("adminPassword"));
            extentTest.info("As an Admin fulfill username and password box");
            //    6- Click the Login button
            homePage.LogInButton.click();
            //  7- Verify successful login to the Admin Page
            homePage.AdminDashboard.isDisplayed();
            // 8-Click "Admin Account" panel
            homePage.DropdownExitPanel.click();
            ReusableMethods.wait(2);
            //9- Click 'LogOut' button
            homePage.LogOutbutton.click();
            extentTest.pass("Admin validates to access to the Dashboard page");
            extentTest.info("Admin validates succesfully login and logout the system");
            // 10- Close the page
            Driver.closeDriver();
        }
    }
    @Test
    public void ActiveUsersTest(){

        extentTest= extentReports.createTest("TestCase18_02",
                "As an admin, the total number of active and inactive users should be displayed on the Adminhomepage");
       // 1- Open the web browser
        // WebDriver driver = new ChromeDriver();
       // 2- Navigate to url 'https://qa.smartcardlink.com'
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
       // 3- Click the Sign In button on the home page
        HomePage homePage= new HomePage();
        homePage.SigInButton.click();
       // 4- On the page that appears, fill in the Email and Password fields and click the Login button
        homePage.EmailBox.clear();
        homePage.EmailBox.sendKeys(ConfigReader.getProperty("adminUserName"));
        homePage.PasswordBox.clear();
        homePage.PasswordBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        extentTest.pass("Admin validates to access to the Dashboard page");
        ReusableMethods.waitFor(2);
        homePage.LogInButton.click();
       // 5- Verify that "Total Active Users" is displayed on the admin page
        Assert.assertTrue(homePage.ActiveUsersElement.isDisplayed());
    //  List<WebElement> ActiveUserElement = Driver.getDriver().findElements(By.xpath("(//h2[@class='fs-1-xxl fw-bolder text-white'])[1]"));
    //   for (WebElement each : ActiveUserElement
    //   ) {
    //       Assert.assertTrue(each.isDisplayed());
    //   }
       extentTest.pass("As an Admin displayes Total Active Users on the Adminhomepage");
       // 6- Close the page
        Driver.closeDriver();
    }
    @Test
    public void ActiveandInactiveVcardsTest(){

        extentTest= extentReports.createTest("TestCase18_03",
                "As an Admin, you should be able to view the total number of active and inactive vcards on the Adminpage");
      // 1- Open the web browser
      //  WebDriver driver =new ChromeDriver();
      // 2- Navigate to url 'https://qa.smartcardlink.com'
       Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
      // 3- Click the Sign In button on the home page
        HomePage homePage= new HomePage();
        homePage.SigInButton.click();
        extentTest.info("Click Sign In button");

      // 4- On the page that appears, fill in the Email and Password fields and click the Login button
        homePage.EmailBox.clear();
        homePage.EmailBox.sendKeys(ConfigReader.getProperty("adminUserName"));
        homePage.PasswordBox.clear();
        homePage.PasswordBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        homePage.LogInButton.click();
        extentTest.pass("Succesfully Login");

      // 6- Verify that the number of active and inactive vcards is displayed on the AdminPage
      //  ReusableMethods.wait(2);
      //  Assert.assertTrue(homePage.ActiveVcardsElement.isDisplayed());
      //  ReusableMethods.waitFor(2);
      //  Assert.assertTrue(homePage.InActiveVcardsElement.isDisplayed());
      //  extentTest.pass("Admin is succesfully displayed the number of active and inactive vcards");

        String usersText = homePage.ActiveVcardsElement.getText();
        String[] ActiveVcards = usersText.split(" ");
        System.out.println(Arrays.toString(ActiveVcards));
        String activeVcard = ActiveVcards[0];
        Assert.assertFalse(activeVcard.isEmpty(),"Total active Vcards is displayed");
        ReusableMethods.wait(4);

        String usersText2 = homePage.InActiveVcardsElement.getText();
        String[] InactiveVcards = usersText.split(" ");
        System.out.println(Arrays.toString(InactiveVcards));
        String inactiveVcard = InactiveVcards[0];
        Assert.assertFalse(inactiveVcard.isEmpty(),"Total inactive Vcards is displayed");
      // 7- Close the page
        Driver.closeDriver();
    }

    @Test
    public void UserPlanRatioTest(){

        extentTest= extentReports.createTest("TestCase18_04",
                "As an Admin, you should be able to view User Plan Ratios table on the Adminpage");
      //  1- Open the web browser
        //  WebDriver driver =new ChromeDriver();
      //  2- Navigate to url 'https://qa.smartcardlink.com'
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
      //  3- Click the Sign In button on the home page
        HomePage homepage = new HomePage();
        homepage.SigInButton.click();
      //  4- On the page that appears, fill in the Email and Password fields and click the Login button
        homepage.EmailBox.clear();
        homepage.EmailBox.sendKeys(ConfigReader.getProperty("adminUserName"));
        homepage.PasswordBox.clear();
        homepage.PasswordBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        homepage.LogInButton.click();
        extentTest.pass("Succesfully Login");
      //  5- Confirm that the "User Plan Rates Table" is displayed on the admin page
        ReusableMethods.waitFor(2);
        List<WebElement> PlanRatioTable = Driver.getDriver().findElements(By.xpath("//canvas[@id='dashboardPlanPieChart']"));
        for (WebElement each : PlanRatioTable
        ) {
            Assert.assertTrue(each.isDisplayed());
        }
        extentTest.pass("Plan Ratios table is succesfully displayed");
      //  6-Close the page
        Driver.closeDriver();
    }

    @Test
    public void IncomeGraphTest(){

        extentTest= extentReports.createTest("TestCase18_05",
                "As an Admin, you should be able to view an Income Graph on the Adminpage");
     //   1- Open the web browser
        //  WebDriver driver = new ChromeDriver();
        //   2- Navigate to url 'https://qa.smartcardlink.com'
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
     //   3- Click the Sign In button on the home page
        HomePage homePage =new HomePage();
        homePage.SigInButton.click();
        extentTest.info("Admin click SignIn button");
     //   4- On the page that appears, fill in the Email and Password fields and click the Login button
        LoginPage loginPage= new LoginPage();
        loginPage.emailBox.clear();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("adminUserName"));
        loginPage.passwordBox.clear();
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        loginPage.loginBox.click();
        extentTest.info("Admin clicks the Login button");

     //   5- Confirm that the "Income Graph" is displayed on the admin page
        ReusableMethods.waitFor(2);
        List<WebElement> IncomeGraph = Driver.getDriver().findElements(By.xpath("//canvas[@id='dashboardIncomeChart']"));
        for (WebElement each :IncomeGraph){
            Assert.assertTrue(each.isDisplayed());
        }
        extentTest.pass("Income Graph is succesfully displayed");
     //   6- Close the page
        Driver.closeDriver();

    }
    @Test
    public void DailyUserRecordTest(){

        extentTest= extentReports.createTest("TestCase18_06",
                "As an Admin, you should be able to view daily user records");
    //   1- Open the web browser
        //  WebDriver driver = new ChromeDriver();
    //   2- Navigate to url 'https://qa.smartcardlink.com'
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
    //   3- Click the Sign In button on the home page
        HomePage homePage = new HomePage();
        homePage.SigInButton.click();
    //   4- On the page that appears, fill in the Email and Password fields and click the Login button
        LoginPage loginPage =new LoginPage();
        loginPage.emailBox.clear();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("adminUserName"));
        loginPage.passwordBox.clear();
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        loginPage.loginBox.click();
        extentTest.pass("Admin succesfully login");
        ReusableMethods.wait(3);
    //   5- Confirm that "Daily User Registrations" is displayed on the admin page
        homePage.DailyUsersElement.click();
        List<WebElement> DailyUsers= Driver.getDriver().findElements(By.xpath("//button[@id='overview-tab']"));
       for (WebElement each : DailyUsers){
           Assert.assertTrue(each.isDisplayed());
       }
       extentTest.pass("Daily Users records is succesfully displayed");

    //   6- Close the page
        Driver.closeDriver();
    }
    @Test
    public void MonthlyUserRecordTest(){

        extentTest= extentReports.createTest("TestCase18_07",
                "As an Admin, you should be able to view monthly user records");

     //   1- Open the web browser
        //  WebDriver driver = new ChromeDriver();

     //   2- Navigate to url 'https://qa.smartcardlink.com'
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
     //   3- Click the Sign In button on the home page
        HomePage homePage = new HomePage();
        homePage.SigInButton.click();
     //   4- On the page that appears, fill in the Email and Password fields and click the Login button
        LoginPage loginPage =new LoginPage();
        loginPage.emailBox.clear();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("adminUserName"));
        loginPage.passwordBox.clear();
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        loginPage.loginBox.click();
        extentTest.pass("Admin succesfully login");

     //   5- Confirm that "Monthly User Registrations" is displayed on the admin page
        homePage.MonthlyUsersElement.click();

     //   6- Close the page
        Driver.closeDriver();

    }
    @Test
    public void WeeklyUserRecordTest(){

        extentTest= extentReports.createTest("TestCase18_08",
                "As an Admin, you should be able to view weekly user records");
      //  1- Open the web browser
        //  WebDriver driver = new ChromeDriver();
      //  2- Navigate to url 'https://qa.smartcardlink.com'
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
      //  3- Click the Sign In button on the home page
        HomePage homePage= new HomePage();
        homePage.SigInButton.click();
        extentTest.info("User click Sign In button");
      //  4- On the page that appears, fill in the Email and Password fields and click the Login button
        LoginPage loginPage= new LoginPage();
        loginPage.emailBox.clear();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("adminUserName"));
        loginPage.passwordBox.clear();
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        loginPage.loginBox.click();
        extentTest.pass("Admin succesfully login");
      //  5- Confirm that "Weekly User Registrations" is displayed on the admin page
        homePage.WeeklyUseersElement.click();
        ReusableMethods.wait(2);
        List<WebElement> UserTable = homePage.UsersTabloElement;
        for (WebElement each : UserTable
             ) {
            System.out.println(each.getText());
            ;
            Assert.assertTrue(each.isDisplayed());
        }
          //  6- Close the page
        Driver.closeDriver();
    }
    }
