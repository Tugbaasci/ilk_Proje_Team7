package tests.Rumeysa;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_035 extends TestBaseRapor {

    @Test
    public void testimonialsAndEnquiriesTest() {


        extentTest = extentReports.createTest("TestCase35: testimonialsAndEnquiriesTest", "As an admin I should be able to  view opinions and questions"+
                "As an admin I can add new opinions"+
                "As an admin I can view the content of the opinions"+
                "As an admin I can edit and delete the content");

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Admin navigate to the smartcardlink home webpage");
        HomePage homePage = new HomePage();
        Driver.getDriver ().navigate ().refresh ();
        ReusableMethods.wait (3);


        homePage.signinButton.click();
       extentTest.info("Admin clicks the signin button");

        LoginPage loginPage = new LoginPage();
       // loginPage.emailBox.click();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("admin_username"));
        extentTest.info("Admin types a valid username to the email box");

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].value='" + ConfigReader.getProperty("admin_Password") + "';", loginPage.passwordBox);
        extentTest.info("Admin types a valid password to the password box using JavaScript");



       // loginPage.passwordBox.click();
       // loginPage.passwordBox.sendKeys(ConfigReader.getProperty("admin_password"));
       // extentTest.info("Admin types a valid password to the password box");

        loginPage.loginBox.click();
        extentTest.info("Admin clicks the login button");


        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.frontCMSButton.click();
        extentTest.info("Admin clicks the FRONT CMS button");
        ReusableMethods.wait(2);

        adminDashboard.testimonialsLink.click();
        Assert.assertTrue(adminDashboard.addTestimonialButton.isDisplayed());
        extentTest.info("Admin validates to access to the Testimonials page");
        adminDashboard.addTestimonialButton.click();
        adminDashboard.testimonialNameBox.click();
        adminDashboard.testimonialNameBox.sendKeys(ConfigReader.getProperty("testimonialName"));
        extentTest.info("Admin types a name to the name box");
        adminDashboard.testimonialDescriptionBox.click();
        adminDashboard.testimonialDescriptionBox.sendKeys(ConfigReader.getProperty("description"));
        extentTest.info("Admin writes a description to the description box");

        //    adminDashboard.testimonialsChangeImageIcon.click();

        //  extentTest.info("Admin upload a photo to tha image box");

        adminDashboard.testimonialsSaveButton.click();

        Assert.assertTrue(adminDashboard.testimonialsViewButton.isDisplayed());
        Assert.assertTrue(adminDashboard.testimonialsEditButton.isDisplayed());
        Assert.assertTrue(adminDashboard.testimonialsDeleteButton.isDisplayed());
    }
}
