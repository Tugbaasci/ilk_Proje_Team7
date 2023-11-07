package tests.Tugba;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class withdrawParaKazan extends TestBaseRapor {
    HomePage homePage;
    Faker faker;
    LoginPage loginPage;
    UserDashboard userDashboard;
    @Test
    public void test(){
        extentTest = extentReports.createTest("para kzan","semanin hesabina para gonder");
        homePage = new HomePage();
        Driver.getDriver().get(ConfigReader.getProperty("semaninCopyLink"));
        faker = new Faker();
        loginPage = new LoginPage();
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
        userDashboard.kisiselIsimAcilirMenu.click();
        userDashboard.signOutElementi.click();

    }
}
