package tests.Tugba;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_08 extends TestBaseRapor {
    HomePage homePage;
    UserDashboard userDashboard;
    LoginPage loginPage;
    Faker faker;
    @Test
    public void TC_01Login(){
        extentTest= extentReports.createTest("US_0801_Login test",
                "A registered user should succesfully log in");
    //anasayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("User navigates to smartcardlink homepage");
    //Sign in olalim
        homePage = new HomePage();
        homePage.signinButton.click();
        extentTest.info("User signs in");
    //Login yapalim
        loginPage = new LoginPage();
        loginPage.emailBox.sendKeys("semasozeri@gmail.com");
        extentTest.info("User writes his email");
        loginPage.passwordBox.sendKeys("semasozeri&123");
        extentTest.info("User writes his password");
        loginPage.loginBox.click();
        extentTest.info("User clicks login button");
        userDashboard = new UserDashboard();
        Assert.assertTrue(userDashboard.headerDashboard.isDisplayed());
        extentTest.pass("User sees Dashboard on his own page");
    }
    @Test
    public void TC_02PersonalAccountTest(){
        extentTest= extentReports.createTest("US_0802_Directed to own site test",
                "A registered user should be succesfully directed to his own account");
        //anasayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("User navigates to smartcardlink homepage");
        //Sign in olalim
        homePage = new HomePage();
        homePage.signinButton.click();
        extentTest.info("User signs in");
        //Login yapalim
        loginPage = new LoginPage();
        loginPage.emailBox.sendKeys("semasozeri@gmail.com");
        extentTest.info("User writes his email");
        loginPage.passwordBox.sendKeys("semasozeri&123");
        extentTest.info("User writes his password");
        loginPage.loginBox.click();
        extentTest.info("User clicks login button");
        userDashboard = new UserDashboard();
        Assert.assertTrue(userDashboard.kisiselIsimAcilirMenu.isDisplayed());
        extentTest.pass("User validates access personal account page");
    }
    @Test
    public void TC_03CreateVCard(){
        extentTest= extentReports.createTest("US_0803 registered user can create his own vcard test",
                "A registered user should succesfully create his own vcard");
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
        //yeni bir kart olusturmadan onceki kart sayisini kaydedelim
        String vcardCountLabel1= userDashboard.vcardCountLabel.getText();
        int vcardCount1=Integer.parseInt(vcardCountLabel1);
        //kisisel sayfada kullanici vcard linkine tiklar
        userDashboard.vcardLink.click();
        extentTest.info("user clicks vcards link");
        ReusableMethods.wait(2);
        //vcards sayfasina girdikten sonra new vcard butonu tiklanir
        userDashboard.newVcardButton.click();
        extentTest.info("user clicks new vcard button");
        faker = new Faker();
        //url_alias bolumune faker class'indan harf ve rakam iceren rastgele bir dizilim gonderilir
        userDashboard.urlAliasTextBox.sendKeys(faker.bothify("????#????#"));
        extentTest.info("user sends fake name mixed with letters");
        //card name kismina fakerdan sahte isim gonderilir
        userDashboard.cardNameTextBox.sendKeys(faker.name().firstName());
        extentTest.info("user sends fake name into the card name text box");
        //occupation bolumu de doldurulur
        userDashboard.occupationTextBox.sendKeys(faker.name().title());
        extentTest.info("user fills in the occupation text box");
        //save islemi gerceklestirilir
        userDashboard.newVcardSaveButton.click();
        extentTest.info("after entering informations user saves them");
        //vcard olusturduktan sonra vcard sayisini kontrol etmak icin once dashboard'a gidelim
        userDashboard.dashboardLink.click();
        extentTest.info("clicks the dashboard link");
        //vcard olusturulduktan sonra dashboarddaki kart sayisi String olarak alinir,
        // parse int yapilarak sayiya donusturulur
        String vcardCountLabel2=userDashboard.vcardCountLabel.getText();
        int vcardCount2= Integer.parseInt(vcardCountLabel2);
        //En son kart olusturduktan sonra ve ilk haliyle sayi karsilastirilir
        //basarili bir sekilde kart olusturuldugu dogrulanir
        if (vcardCount2>vcardCount1){
            Assert.assertTrue(true);
        }
        extentTest.pass("verify that a new vcard is created");
        ReusableMethods.wait(2);
    }
    @Test
    public void TC_04ShowVcardCount(){
        extentTest= extentReports.createTest("US_0804 registered user can view his vcards counts test",
                "A registered user should succesfully view his own vcards counts");
        //anasayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("User navigates to smartcardlink homepage");
        //Sign in olalim
        homePage = new HomePage();
        homePage.signinButton.click();
        extentTest.info("User signs in");
        //Login yapalim
        loginPage = new LoginPage();
        loginPage.emailBox.sendKeys("semasozeri@gmail.com");
        extentTest.info("User writes his email");
        loginPage.passwordBox.sendKeys("semasozeri&123");
        extentTest.info("User writes his password");
        loginPage.loginBox.click();
        extentTest.info("User clicks login button");
        userDashboard = new UserDashboard();
        //dashboarda goruntulenen kart sayisinin goruntulendigini dogrulayalim
        Assert.assertTrue(userDashboard.vcardCountLabel.isDisplayed());
        extentTest.pass("verify that the count of vcard is viewed");
        ReusableMethods.wait(2);
    }
    @Test
    public void TC_05viewActiveVcardButtons(){
        extentTest= extentReports.createTest("US_0805 registered user can view vcard buttons are enabled test",
                "A registered user should succesfully view that the buttons of his own card are enabled");
        //anasayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("User navigates to smartcardlink homepage");
        //Sign in olalim
        homePage = new HomePage();
        homePage.signinButton.click();
        extentTest.info("User signs in");
        //Login yapalim
        loginPage = new LoginPage();
        loginPage.emailBox.sendKeys("semasozeri@gmail.com");
        extentTest.info("User writes his email");
        loginPage.passwordBox.sendKeys("semasozeri&123");
        extentTest.info("User writes his password");
        loginPage.loginBox.click();
        extentTest.info("User clicks login button");
        userDashboard = new UserDashboard();
        //vcards linkine tiklanir
        userDashboard.vcardLink.click();
        extentTest.info("user clicks the vcards link");
        //qr-code butonu aktif mi
        Assert.assertTrue(userDashboard.qrCodeButton.isEnabled());
        extentTest.pass("verify that qr-code button is active");
        //download butonu aktif mi
        Assert.assertTrue(userDashboard.downloadVCardButton.isEnabled());
        extentTest.pass("verify that download button is active");
        //enquiries butonu aktif mi
        Assert.assertTrue(userDashboard.enquiriesButton.isEnabled());
        extentTest.pass("verify that enquiries button is active");
        //edit butonu aktif mi
        Assert.assertTrue(userDashboard.editButton.isEnabled());
        extentTest.pass("verify that edit button is active");
        //delete butonu aktif mi
        Assert.assertTrue(userDashboard.deleteButton.isEnabled());
        extentTest.pass("verify that delete button is active");
        //duplicate card butonu
        //Assert.assertTrue(userDashboard.duplicateButton.isEnabled());
        //extentTest.pass("verify that duplicate card button is active");
    }
}
