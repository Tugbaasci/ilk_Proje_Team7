package tests.Tugba;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.HomePage;
import pages.LoginPage;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_17 extends TestBaseRapor {
    HomePage homePage;
    LoginPage loginPage;
    Faker faker;
    UserDashboard userDashboard;
    AdminDashboard adminDashboard;
    @Test
    public void TC_08AccessAffiliationsLink(){
        extentTest=extentReports.createTest("US1708_access Affiliations test",
                "An unlimited registered user should be able to access Affiliations link");
        //anasayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("User navigates to smartcardlink homepage");
        //Sign in olalim
        homePage = new HomePage();
        homePage.signinButton.click();
        extentTest.info("User signs in");
        loginPage =new LoginPage();
        loginPage.createAnaccountLink.click();
        faker = new Faker();
        loginPage.firstnameTextBox.sendKeys(faker.name().firstName());
        loginPage.lastnameTextBox.sendKeys(faker.name().lastName());
        String email1=faker.internet().emailAddress();
        loginPage.emailBox.sendKeys(email1);
        String password1=faker.bothify("????#???");
        loginPage.passwordBox.sendKeys(password1+"&");
        loginPage.confirmPassword.sendKeys(password1+"&");
        loginPage.policyAgreementCheckBox.click();
        loginPage.submitButton.click();
        ReusableMethods.wait(2);
        loginPage.emailBox.sendKeys(email1);
        loginPage.passwordBox.sendKeys(password1+"&");
        loginPage.loginBox.click();
        userDashboard = new UserDashboard();
        userDashboard.kisiselIsimAcilirMenu.click();
        userDashboard.manageSubscriptionOption.click();
        userDashboard.upGradeButton.click();
        userDashboard.unlimitedLabel.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(2);
        userDashboard.unlimitedSwitchButton.click();
        userDashboard.selectPaymentElementi.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(4);
        userDashboard.stripePaymentElementi.click();
        userDashboard.switchButtonUnderSelect.click();
        userDashboard.creditCardNumber.sendKeys("4242424242424242");
        userDashboard.cardDate.sendKeys("1234");
        userDashboard.cardCVCnumber.sendKeys("567");
        userDashboard.cardHolderName.sendKeys(faker.name().fullName());
        userDashboard.creditCardPay.click();
        ReusableMethods.wait(4);
        userDashboard.backToSubscription.click();
        Assert.assertTrue(userDashboard.AffiliationsLink.isEnabled());

    }
    @Test
    public void TC_09ViewCount(){
        extentTest = extentReports.createTest("US1710_Total and current amount view test",
                "An unlimited registered user should be able to view total and current amount");
        //anasayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("User navigates to smartcardlink homepage");
        //Sign in olalim
        homePage = new HomePage();
        homePage.signinButton.click();
        extentTest.info("User signs in");
        loginPage =new LoginPage();
        loginPage.createAnaccountLink.click();
        faker = new Faker();
        loginPage.firstnameTextBox.sendKeys(faker.name().firstName());
        loginPage.lastnameTextBox.sendKeys(faker.name().lastName());
        String email1=faker.internet().emailAddress();
        loginPage.emailBox.sendKeys(email1);
        String password1=faker.bothify("????#???");
        loginPage.passwordBox.sendKeys(password1+"&");
        loginPage.confirmPassword.sendKeys(password1+"&");
        loginPage.policyAgreementCheckBox.click();
        loginPage.submitButton.click();
        ReusableMethods.wait(2);
        loginPage.emailBox.sendKeys(email1);
        loginPage.passwordBox.sendKeys(password1+"&");
        loginPage.loginBox.click();
        userDashboard = new UserDashboard();
        userDashboard.kisiselIsimAcilirMenu.click();
        userDashboard.manageSubscriptionOption.click();
        userDashboard.upGradeButton.click();
        userDashboard.unlimitedLabel.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(2);
        userDashboard.unlimitedSwitchButton.click();
        userDashboard.selectPaymentElementi.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(4);
        userDashboard.stripePaymentElementi.click();
        userDashboard.switchButtonUnderSelect.click();
        userDashboard.creditCardNumber.sendKeys("4242424242424242");
        userDashboard.cardDate.sendKeys("1234");
        userDashboard.cardCVCnumber.sendKeys("567");
        userDashboard.cardHolderName.sendKeys(faker.name().fullName());
        userDashboard.creditCardPay.click();
        ReusableMethods.wait(4);
        userDashboard.backToSubscription.click();
        userDashboard.AffiliationsLink.click();
        Assert.assertTrue(userDashboard.totalAmountCount.isDisplayed());
        Assert.assertTrue(userDashboard.currentAmountCount.isDisplayed());


    }

    @Test
    public void TC_10SendInvite(){
        extentTest= extentReports.createTest("US1711_Send invite test",
                "An unlimited registered user should be able to send invite");
        //anasayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("User navigates to smartcardlink homepage");
        //Sign in olalim
        homePage = new HomePage();
        homePage.signinButton.click();
        extentTest.info("User signs in");
        loginPage =new LoginPage();
        loginPage.createAnaccountLink.click();
        extentTest.info("creates a new account");
        faker = new Faker();
        loginPage.firstnameTextBox.sendKeys(faker.name().firstName());
        extentTest.info("enters his firstname");
        loginPage.lastnameTextBox.sendKeys(faker.name().lastName());
        extentTest.info("enters his lastname");
        String email1=faker.internet().emailAddress();
        loginPage.emailBox.sendKeys(email1);
        extentTest.info("enters email address");
        //verilen kriterlere uygun ?(harf),#(sayi)ve &(ozel karakter) password olusturalim
        //ve bunu kaydedelim
        String password1=faker.bothify("????#???")+"&";
        loginPage.passwordBox.sendKeys(password1);
        extentTest.info("writes his password");
        loginPage.confirmPassword.sendKeys(password1);
        extentTest.info("confirms password");
        loginPage.policyAgreementCheckBox.click();
        extentTest.info("signs up policy agreement");
        loginPage.submitButton.click();
        extentTest.info("submits");
        ReusableMethods.wait(2);
        loginPage.emailBox.sendKeys(email1);
        loginPage.passwordBox.sendKeys(password1);
        loginPage.loginBox.click();
        extentTest.info("logins in");
        userDashboard = new UserDashboard();
        userDashboard.kisiselIsimAcilirMenu.click();
        extentTest.info("clicks on the user dropdown menu");
        userDashboard.manageSubscriptionOption.click();
        extentTest.info("clicks on the manage subscription");
        userDashboard.upGradeButton.click();
        extentTest.info("clicks on the upgrade button");
        userDashboard.unlimitedLabel.click();
        extentTest.info("clicks on the unlimited");
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("goes down on the page");
        ReusableMethods.wait(2);
        userDashboard.unlimitedSwitchButton.click();
        extentTest.info("clicks on the switch/pay button");
        userDashboard.selectPaymentElementi.click();
        extentTest.info("selects the kind of payment");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(4);
        userDashboard.stripePaymentElementi.click();
        extentTest.info("selects the stripe option");
        userDashboard.switchButtonUnderSelect.click();
        extentTest.info("clicks on the switch/pay button");
        userDashboard.creditCardNumber.sendKeys("4242424242424242");
        userDashboard.cardDate.sendKeys("1234");
        userDashboard.cardCVCnumber.sendKeys("567");
        userDashboard.cardHolderName.sendKeys(faker.name().fullName());
        extentTest.info("enters the informations of the credit card");
        userDashboard.creditCardPay.click();
        extentTest.info("clicks on the pay button");
        ReusableMethods.wait(4);
        userDashboard.backToSubscription.click();
        extentTest.info("returns back to the user page");
        userDashboard.AffiliationsLink.click();
        extentTest.info("clicks on the affiliations link");
        ReusableMethods.wait(4);
        userDashboard.copyLinkButton.click();
        extentTest.info("clicks on the copy button");
        ReusableMethods.wait(4);
        userDashboard.sendInviteButton.click();

        extentTest.info("send an invite to someone by email");
        ReusableMethods.wait(4);
        userDashboard.sendInviteEmailTextBox.sendKeys(faker.internet().emailAddress());
        extentTest.info("enters an email");

        userDashboard.sendInviteSendEmailButton.click();
        extentTest.info("clicks on the send email button below");
        ReusableMethods.wait(7);
        Assert.assertTrue(userDashboard.AffiliationsLink.isDisplayed());
        extentTest.pass("user can returns his user page");
        ReusableMethods.wait(4);
    }

    @Test
    public void TC_11Withdrawal(){
        extentTest=extentReports.createTest("US1711_withdrawal test",
                "An unlimited registered user should be able to withdraw from his personal account");
        //anasayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("User navigates to smartcardlink homepage");
        //Sign in olalim
        homePage = new HomePage();
        homePage.signinButton.click();
        extentTest.info("User signs in");
        loginPage= new LoginPage();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("usernameTugba"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("userPasswordTugba"));
        loginPage.loginBox.click();
        userDashboard=new UserDashboard();
        ReusableMethods.wait(2);
        userDashboard.AffiliationsLink.click();
        userDashboard.withdrawalLink.click();
        ReusableMethods.wait(4);
        userDashboard.withdrawAmount.click();
        userDashboard.withdrawAmountEnter.sendKeys("10");
        userDashboard.paypalEmail.clear();
        userDashboard.paypalEmail.sendKeys(ConfigReader.getProperty("paypalEmail"));
        ReusableMethods.wait(3);
        userDashboard.withdrawSaveBtn.click();
        ReusableMethods.wait(10);
        userDashboard.kisiselIsimAcilirMenu.click();
        ReusableMethods.wait(3);
        userDashboard.signOutElementi.click();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("admin_username"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("admin_Password"));
        loginPage.loginBox.click();
        adminDashboard = new AdminDashboard();
        adminDashboard.AffiliationTransactionLink.click();
        adminDashboard.AffiliationApprovalStatus.click();
        adminDashboard.AffiliationsApprovalApprove.click();
        ReusableMethods.wait(1);
        adminDashboard.AffiliationsCashpaymentBox.click();
        adminDashboard.AffiliationsCashPaymentOption.click();
        ReusableMethods.wait(2);
        adminDashboard.AffiliationsPaymentSaveBtn.click();
        adminDashboard.AffiliationsSaveBtnClose.click();
        ReusableMethods.wait(15);
        adminDashboard.adminUserDropDown.click();
        adminDashboard.userMenuSignOut.click();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("usernameTugba"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("userPasswordTugba"));
        loginPage.loginBox.click();
        ReusableMethods.wait(2);
        userDashboard.AffiliationsLink.click();
        userDashboard.withdrawalLink.click();
        Assert.assertTrue(userDashboard.withdrawApprovedElement.isDisplayed());
    }

}
