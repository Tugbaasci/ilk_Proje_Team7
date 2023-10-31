package tests.Gulsah;

import org.testng.annotations.Test;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class UserStory14_tc01 {
    @Test
    public void US14_tc01() {
/*
1- Go to https://qa.smartcardlink.com/
2-Click the "sign in" button of the page that opens.
3-Enter valid e-mail and valid password.
4-Click on the "log in" button.
5-Clicks on the "user name" on the page that opens.
6-Clicks "Change Password" on the page that opens
7- Enter "Current Password", "New Password" and "Confirm Password" on the page that opens and confirm the password change by clicking the save button
8-Close the page.
 */

        //1-Go to 1-https://qa.smartcardlink.com/
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        UserDashboard userDashboard=new UserDashboard();

        //2-Header kismindaki sign in butonuna tiklanir.
        userDashboard.SignInButton.click();

        //3-Gecerli e-mail ve gecerli password girilir.
        ReusableMethods.wait(2);

        userDashboard.EmailButton.sendKeys(ConfigReader.getProperty("user_usernametest") );
        userDashboard.PasswordButton.sendKeys(ConfigReader.getProperty("user_userPasswordtest"));
        ReusableMethods.wait(2);

        //4-Login butonuna tiklanir.
        userDashboard.LoginButton.click();
        ReusableMethods.wait(2);

       // 5-Clicks on the "user name" on the page that opens.
        userDashboard.UserNameButton.click();

        //6-Clicks "Change Password" on the page that opens
        userDashboard.ChangePasswordButton.click();

        //7- Enter "Current Password", "New Password" and "Confirm Password" on the page that
        // opens and confirm the password change by clicking the save button
        userDashboard.CurrentPasswordButton.sendKeys(ConfigReader.getProperty("user_userPasswordtest"));
        userDashboard.NewPasswordButton.sendKeys(ConfigReader.getProperty("newPassword"));
        userDashboard.ConfirmPasswordButton.sendKeys(ConfigReader.getProperty("confirmPassword"));
        ReusableMethods.wait(2);
        userDashboard.SaveButton.click();
        //8-Close the page.
        Driver.closeDriver();








    }
}
