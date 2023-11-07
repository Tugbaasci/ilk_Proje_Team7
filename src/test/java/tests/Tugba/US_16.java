package tests.Tugba;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_16 extends TestBaseRapor {
    HomePage homePage;
    UserDashboard userDashboard;
    Faker faker;
    LoginPage loginPage;

    @Test
    public void TC_06BuyUnlimitedPlan(){
        extentTest= extentReports.createTest("US1606 buying unlimited plan test",
                "An unlimited registered user should be able to buy an unlimited plan");
        //anasayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("User navigates to smartcardlink homepage");
        //Sign in olalim
        homePage = new HomePage();
        homePage.signinButton.click();
        extentTest.info("User signs in");
        //Login yapalim
        loginPage = new LoginPage();
        //yeni hesap olusturalim
        loginPage.createAnaccountLink.click();
        extentTest.info("creates a new account");
        faker=new Faker();
        loginPage.firstnameTextBox.sendKeys(faker.name().firstName());
        extentTest.info("writes his name");
        loginPage.lastnameTextBox.sendKeys(faker.name().lastName());
        extentTest.info("writes his lastname");
        String emailAdress1=faker.internet().emailAddress();
        loginPage.emailBox.sendKeys(emailAdress1);
        extentTest.info("writes his email address");
        String password1=faker.bothify("???#???")+"&";
        loginPage.passwordBox.sendKeys(password1);
        extentTest.info("User writes his password");
        //password 'u dogrulayalim
        loginPage.confirmPassword.sendKeys(password1);
        extentTest.info("writes his password again");
        //sozlesme okundu tik koyalim
        loginPage.policyAgreementCheckBox.click();
        extentTest.info("signs up the policy agreement");
        loginPage.submitButton.click();
        extentTest.info("submits");
        ReusableMethods.wait(1);
        //kaydettigimiz bilgilerle sayfaya giris yapalim
        loginPage.emailBox.sendKeys(emailAdress1);
        extentTest.info("writes his email address");
        loginPage.passwordBox.sendKeys(password1);
        extentTest.info("writes his password");
        loginPage.loginBox.click();
        ReusableMethods.wait(4);
        userDashboard = new UserDashboard();
        userDashboard.kisiselIsimAcilirMenu.click();
        extentTest.info("clicks on the drop down menu");
        ReusableMethods.wait(1);
        extentTest.info("click to the username text");
        //manage subscription tiklanir
        userDashboard.manageSubscriptionOption.click();
        extentTest.info("click to the manage subscription");
        //upgrade plan tiklanir
        userDashboard.upGradeButton.click();
        extentTest.info("click to the upgrade plan button");
        Actions actions = new Actions(Driver.getDriver());
        //unlimited tiklanir
        userDashboard.unlimitedLabel.click();
        extentTest.info("click to the unlimited plan button");
        //unlimited switch butonu tiklanir
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(5);
        userDashboard.unlimitedSwitchButton.click();
        extentTest.info("click to the switch plan");
        //select payment tiklanir
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        userDashboard.selectPaymentElementi.click();
        extentTest.info("click select payment");
        //stripe secenegi secilir
        userDashboard.stripePaymentElementi.click();
        extentTest.info("select the kind of payment");
        //select payment altindaki switch plan tiklanir
        ReusableMethods.wait(2);
        userDashboard.switchButtonUnderSelect.click();
        extentTest.info("click to the switch button");
        //kredi karti numarasi girilir
        userDashboard.creditCardNumber.sendKeys("4242424242424242");
        extentTest.info("enter the credit number");
        //kredi karti kullanim suresi girilir
        userDashboard.cardDate.sendKeys("1234");
        extentTest.info("enter the date of the credit card");
        //kredi karti CVC numarasi girilir
        userDashboard.cardCVCnumber.sendKeys("567");
        extentTest.info("enter the CVC of the card");
        //kredi kart sahibi kutusu
        userDashboard.cardHolderName.sendKeys(faker.name().fullName());
        extentTest.info("enter the name of the card holder");
        //odeme butonu tklanir
        userDashboard.creditCardPay.click();
        extentTest.info("click to the pay button");
        //back to subscription tiklanir userdashboard'a geri donulur
        userDashboard.backToSubscription.click();
        extentTest.info("back to the user homepage");
        //userdashboard'dan vcards linkine tiklanir
        userDashboard.vcardLink.click();
        extentTest.info("click to the vcard link");
        Assert.assertTrue(userDashboard.AffiliationsLink.isEnabled());
        extentTest.pass("verify that unlimited plan is bought");

    }
    @Test
    public void TC_07AccessAppointments(){
        extentTest= extentReports.createTest("US1607 access appointments link test",
                "An unlimited registered user should be able to access appointments page");
        //anasayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("User navigates to smartcardlink homepage");
        //Sign in olalim
        homePage = new HomePage();
        homePage.signinButton.click();
        extentTest.info("User signs in");
        //Login yapalim
        loginPage = new LoginPage();
        //yeni hesap olusturalim
        loginPage.createAnaccountLink.click();
        extentTest.info("creates a new account");
        faker=new Faker();
        loginPage.firstnameTextBox.sendKeys(faker.name().firstName());
        extentTest.info("writes his name");
        loginPage.lastnameTextBox.sendKeys(faker.name().lastName());
        extentTest.info("writes his lastname");
        String emailAdress1=faker.internet().emailAddress();
        loginPage.emailBox.sendKeys(emailAdress1);
        extentTest.info("writes his email address");
        String password1=faker.bothify("???#???")+"&";
        loginPage.passwordBox.sendKeys(password1);
        extentTest.info("User writes his password");
        //password 'u dogrulayalim
        loginPage.confirmPassword.sendKeys(password1);
        extentTest.info("writes his password again");
        //sozlesme okundu tik koyalim
        loginPage.policyAgreementCheckBox.click();
        extentTest.info("signs up the policy agreement");
        loginPage.submitButton.click();
        extentTest.info("submits");
        ReusableMethods.wait(1);
        //kaydettigimiz bilgilerle sayfaya giris yapalim
        loginPage.emailBox.sendKeys(emailAdress1);
        extentTest.info("writes his email address");
        loginPage.passwordBox.sendKeys(password1);
        extentTest.info("writes his password");
        loginPage.loginBox.click();
        ReusableMethods.wait(4);
        userDashboard = new UserDashboard();
        userDashboard.kisiselIsimAcilirMenu.click();
        extentTest.info("clicks on the drop down menu");
        ReusableMethods.wait(1);
        extentTest.info("click on the username text");
        //manage subscription tiklanir
        userDashboard.manageSubscriptionOption.click();
        extentTest.info("click on the manage subscription");
        //upgrade plan tiklanir
        userDashboard.upGradeButton.click();
        extentTest.info("click on the upgrade plan button");
        Actions actions = new Actions(Driver.getDriver());
        //unlimited tiklanir
        userDashboard.unlimitedLabel.click();
        extentTest.info("click on the unlimited plan button");
        //unlimited switch butonu tiklanir
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(2);
        userDashboard.unlimitedSwitchButton.click();
        extentTest.info("click on the switch plan");
        //select payment tiklanir
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        userDashboard.selectPaymentElementi.click();
        extentTest.info("click on select payment");
        //stripe secenegi secilir
        userDashboard.stripePaymentElementi.click();
        extentTest.info("select the kind of payment");
        //select payment altindaki switch plan tiklanir
        ReusableMethods.wait(5);
        userDashboard.switchButtonUnderSelect.click();
        extentTest.info("click on the switch button");
        //kredi karti numarasi girilir
        userDashboard.creditCardNumber.sendKeys("4242424242424242");
        extentTest.info("enter the credit number");
        //kredi karti kullanim suresi girilir
        userDashboard.cardDate.sendKeys("1234");
        extentTest.info("enter the date of the credit card");
        //kredi karti CVC numarasi girilir
        userDashboard.cardCVCnumber.sendKeys("567");
        extentTest.info("enter the CVC of the card");
        //kredi kart sahibi kutusu
        userDashboard.cardHolderName.sendKeys(faker.name().fullName());
        extentTest.info("enter the name of the card holder");
        //odeme butonu tklanir
        userDashboard.creditCardPay.click();
        extentTest.info("clicks on the pay button");
        //back to subscription tiklanir userdashboard'a geri donulur
        userDashboard.backToSubscription.click();
        extentTest.info("back to the user homepage");
        //userdashboard'da appointments linki goruntulenir
        Assert.assertTrue(userDashboard.appointmentsLinkLeft.isDisplayed());
        extentTest.pass("Appointments link is visible");
        //userdashboard'dan Appointments linkine tiklanir
        userDashboard.appointmentsLinkLeft.click();
        extentTest.info("clicks on the appointments link");
    }
    @Test
    public void TC_08ViewAppointments(){
        extentTest= extentReports.createTest("US1608 view appointments test",
                "A registered user should be able to view his own appointments");
        //anasayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("User navigates to smartcardlink homepage");
        //Sign in olalim
        homePage = new HomePage();
        homePage.signinButton.click();
        extentTest.info("User signs in");
        //Login yapalim
        loginPage = new LoginPage();
        //yeni hesap olusturalim
        loginPage.createAnaccountLink.click();
        extentTest.info("creates a new account");
        faker=new Faker();
        loginPage.firstnameTextBox.sendKeys(faker.name().firstName());
        extentTest.info("writes his name");
        loginPage.lastnameTextBox.sendKeys(faker.name().lastName());
        extentTest.info("writes his lastname");
        String emailAdress1=faker.internet().emailAddress();
        loginPage.emailBox.sendKeys(emailAdress1);
        extentTest.info("writes his email address");
        String password1=faker.bothify("???#???")+"&";
        loginPage.passwordBox.sendKeys(password1);
        extentTest.info("User writes his password");
        //password 'u dogrulayalim
        loginPage.confirmPassword.sendKeys(password1);
        extentTest.info("writes his password again");
        //sozlesme okundu tik koyalim
        loginPage.policyAgreementCheckBox.click();
        extentTest.info("signs up the policy agreement");
        loginPage.submitButton.click();
        extentTest.info("submits");
        ReusableMethods.wait(1);
        //kaydettigimiz bilgilerle sayfaya giris yapalim
        loginPage.emailBox.sendKeys(emailAdress1);
        extentTest.info("writes his email address");
        loginPage.passwordBox.sendKeys(password1);
        extentTest.info("writes his password");
        loginPage.loginBox.click();
        ReusableMethods.wait(4);
        userDashboard = new UserDashboard();
        userDashboard.kisiselIsimAcilirMenu.click();
        extentTest.info("clicks on the drop down menu");
        ReusableMethods.wait(1);
        extentTest.info("click on the username text");
        //manage subscription tiklanir
        userDashboard.manageSubscriptionOption.click();
        extentTest.info("click on the manage subscription");
        //upgrade plan tiklanir
        userDashboard.upGradeButton.click();
        extentTest.info("click on the upgrade plan button");
        Actions actions = new Actions(Driver.getDriver());
        //unlimited tiklanir
        userDashboard.unlimitedLabel.click();
        extentTest.info("click on the unlimited plan button");
        //unlimited switch butonu tiklanir
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(2);
        userDashboard.unlimitedSwitchButton.click();
        extentTest.info("click on the switch plan");
        //select payment tiklanir
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        userDashboard.selectPaymentElementi.click();
        extentTest.info("click on select payment");
        //stripe secenegi secilir
        userDashboard.stripePaymentElementi.click();
        extentTest.info("select the kind of payment");
        //select payment altindaki switch plan tiklanir
        ReusableMethods.wait(5);
        userDashboard.switchButtonUnderSelect.click();
        extentTest.info("click on the switch button");
        //kredi karti numarasi girilir
        userDashboard.creditCardNumber.sendKeys("4242424242424242");
        extentTest.info("enter the credit number");
        //kredi karti kullanim suresi girilir
        userDashboard.cardDate.sendKeys("1234");
        extentTest.info("enter the date of the credit card");
        //kredi karti CVC numarasi girilir
        userDashboard.cardCVCnumber.sendKeys("567");
        extentTest.info("enter the CVC of the card");
        //kredi kart sahibi kutusu
        userDashboard.cardHolderName.sendKeys(faker.name().fullName());
        extentTest.info("enter the name of the card holder");
        //odeme butonu tklanir
        userDashboard.creditCardPay.click();
        extentTest.info("clicks on the pay button");
        //back to subscription tiklanir userdashboard'a geri donulur
        userDashboard.backToSubscription.click();
        extentTest.info("back to the user homepage");
        //userdashboard'dan Appointments linkine tiklanir
        userDashboard.appointmentsLinkLeft.click();
        extentTest.info("clicks on the appointments link");
        //Appointments tablosunun goruntulendigi dogrulanir
        Assert.assertTrue(userDashboard.appointmentsTable.isDisplayed());
        extentTest.pass("verify that appointments information is visible");
    }
}
