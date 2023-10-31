package tests.Gulsah;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class UserStory07_tc01 {

    @Test
    public void US07_TC01() {
        /*
         1-Go to 1-https://qa.smartcardlink.com/
         2-Click the "sign in" button in the header section.
         3-Enter valid e-mail and valid password.
         4-Click on the "log in" button.
         5-Confirm that the "Dashboard" section is visible on the page that opens.
         6-"VCards", "Enguiries", "Appointments", "Virtual Backrounds", "Settings" are confirmed to be visible.
         7-Close the page
         */

        //1-Go to 1-https://qa.smartcardlink.com/
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        UserDashboard userDashboard=new UserDashboard();

        //2-Header kismindaki sign in butonuna tiklanir.
        userDashboard.SignInButton.click();

        //3-Gecerli e-mail ve gecerli password girilir.
        ReusableMethods.wait(2);

        userDashboard.EmailButton.sendKeys(ConfigReader.getProperty("user_username") );
        userDashboard.PasswordButton.sendKeys(ConfigReader.getProperty("user_userPassword"));
        ReusableMethods.wait(2);

        //4-Login butonuna tiklanir.
        userDashboard.LoginButton.click();
        ReusableMethods.wait(2);

        //5-Acilan sayfada dashboard bolumunun goruntulenebilir oldugu dogrulanir.
        Assert.assertTrue(userDashboard.DashboardElement.isDisplayed());

        //6-VCards,Enguiries,Appointments,Vitual Backrounds,Settings ogelerinin ulasilabilir oldugu dogrulanir ve test edilir.
         Assert.assertTrue(userDashboard.VcardsElement.isEnabled());
         Assert.assertTrue(userDashboard.EnquiriesElement.isEnabled());
         Assert.assertTrue(userDashboard.AppointmentsElement.isEnabled());
         Assert.assertTrue(userDashboard.VirtualBackroundsElement.isEnabled());
         Assert.assertTrue(userDashboard.SettingsElement.isEnabled());

         //7-Sayfa kapatilir
        Driver.closeDriver();
    }
}