package tests.eyyup;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.Arrays;
import java.util.List;

public class US_19 extends TestBaseRapor {

    @Test
    public void TC_01() {
//Browser'a gidilir
// sign in butonuna tiklanir
//Tarayici URL sekmesine https://qa.smartcardlink.com/ adresini yazip enter tusuna basar
//Admin bilgileri doldurulur
// login butonuna bastiktan sonra ana sayfaya gider
// Siteyi kapatir.


        AdminDashboard adminDashboard = new AdminDashboard();

        extentTest = extentReports.createTest("admin bilgileri ile giris yapabilme", "admin bilgileri ile admin  anasayfasina gidilir");


        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("admin bilgileri ile https://qa.smartcardlink.com anasayfasina gidilirerek test yapilir");
        adminDashboard.ilkSignInButton.click();
        extentTest.info("sign in butonuna tiklanir");
        adminDashboard.adminEmailButton.sendKeys(ConfigReader.getProperty("adminEmail"));
        adminDashboard.adminPasswordButton.sendKeys(ConfigReader.getProperty("adminPassword"));
        adminDashboard.adminLoginButton.click();
        extentTest.info("admin bilgileri doldurulup, click yapildiktan sonra anasayfaya gidilir");
        Assert.assertTrue(adminDashboard.adminMenuDrop.isDisplayed(), "admin kullanici ismi goruluyor");
        extentTest.pass("admin kullanici ismini gorunurlugu test edilerek admin sayfasinda oldugu dogrulanir.");

        Driver.closeDriver();
        extentTest.info("web sayfasi kapatilir");


    }


   /* Browser'a gidilir
   Sign in butonuna basilir.
    Tarayici URL sekmesine https://qa.smartcardlink.com/ adresini yazip enter tusuna basar
    Admin bilgilerini doldurulur
    Login butonuna bastiktan sonra ana sayfaya gidilir.
    Kullanicilara tiklar
    kayitli kullanicalari goruntuler
    toplam kullanici sayisini goruntuler
    Sayfayi kapatir.
    */

    @Test
    public void TC_02() {
        AdminDashboard adminDashboard = new AdminDashboard();


        extentTest = extentReports.createTest("Kayitli kullanicilari goruntuleyebilme ve toplam kullanici sayisini alma",
                "admin bilgileri ile admin  anasayfasina gidilerek test yapilir");


        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("admin bilgileri ile https://qa.smartcardlink.com anasayfasina gidilir");

        adminDashboard.ilkSignInButton.click();
        extentTest.info("sign in butonuna tiklanir");


        adminDashboard.adminEmailButton.sendKeys(ConfigReader.getProperty("adminEmail"));
        adminDashboard.adminPasswordButton.sendKeys(ConfigReader.getProperty("adminPassword"));
        adminDashboard.adminLoginButton.click();
        extentTest.info("admin bilgileri doldurulup, click yapildiktan sonra anasayfaya gidilir");

        adminDashboard.UsersButton.click();
        extentTest.info("users (kullanicilar) menusune tiklar");

        Assert.assertTrue(adminDashboard.kayitliKullanicilar.isDisplayed());
        extentTest.pass("Kullanicilarin gorunurlurlugu test edilir");

        String usersText = adminDashboard.kullaniciSayisi.getText();
        String[] kullaniciSayisiMetni = usersText.split(" ");
        System.out.println(Arrays.toString(kullaniciSayisiMetni));
        String kullaniciSayisi = kullaniciSayisiMetni[5];
        Assert.assertFalse(kullaniciSayisi.isEmpty(), "kullanici sayisi gozukmuyor");

        Driver.closeDriver();
        extentTest.info("web sayfasini kapatir");



    }

    /* Browser'a gidilir
    Tarayici URL sekmesine https://qa.smartcardlink.com/ adresini yazip enter tusuna basar
    Sign in butonuna tiklar
    Admin bilgilrini doldurulur
    Login butonuna bastiktan sonra ana sayfaya gider
    Kullanicilara tiklar.
    Kullanici aktiflik durumunu goruntuler.
    Kullanici abonelik bilgilerini goruntuler
    Sayfayi kapatir.
     */


    @Test
    public void TC_03() {

        AdminDashboard adminDashboard = new AdminDashboard();

        // ExtentReports extentReports = new ExtentReports();
        extentTest = extentReports.createTest("Kullanicalrin aktiflik durumu ve kullanici bilgilerini goruntuleme",
                "admin bilgileri ile admin  anasayfasina gidilirek test yapilir ");


        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("admin bilgileri ile https://qa.smartcardlink.com anasayfasina gidilir");

        adminDashboard.ilkSignInButton.click();
        extentTest.info("sign in butonuna tiklanir");


        adminDashboard.adminEmailButton.sendKeys(ConfigReader.getProperty("adminEmail"));
        adminDashboard.adminPasswordButton.sendKeys(ConfigReader.getProperty("adminPassword"));
        adminDashboard.adminLoginButton.click();
        extentTest.info("admin bilgileri doldurulup, click yapildiktan sonra anasayfaya gidilir");

        adminDashboard.UsersButton.click();
        extentTest.info("users (kullanicilar) menusune tiklar");

        List<WebElement> aktiflikDurumu = Driver.getDriver().findElements(By.xpath("//input[@name='is_active']"));

        for (WebElement each : aktiflikDurumu
        ) {


            Assert.assertTrue(each.isDisplayed());
            extentTest.pass("Sayfadaki kullanicilarin aktiflik durumunu goruntuler.");


        }

        List<WebElement> kullaniciBilgileri = Driver.getDriver().findElements(By.xpath("//div[@class='d-flex flex-column']"));

        for (WebElement each : kullaniciBilgileri
        ) {

            Assert.assertTrue(each.isDisplayed());
            extentTest.pass("kullanici bilgileri goruntulenir");

        }
        Driver.closeDriver();
        extentTest.info("web sitesi kapatilir");

    }

   /* Browser'a gidilir
    Tarayici URL sekmesine https://qa.smartcardlink.com/ adresini yazip enter tusuna basar
    Sign in menusune tiklanir
    admin bilgilrini doldurur
    Login butonuna bastiktan sonra ana sayfaya gider
    Kullanicilara tiklar
    Herhangi bir kullancinin bilgilerini duzenler
    Herhangi bir kullanicinin sifresini degistirir
    Web sitesi kapatilir.



    */


    @Test
    public void TC_04() {


        AdminDashboard adminDashboard = new AdminDashboard();


        extentTest = extentReports.createTest("Kullanicalrin  bilgilerini  ve sifresini degistirebilme.",
                "admin bilgileri ile admin  anasayfasina gidilirek test yapilir ");


        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("admin bilgileri ile https://qa.smartcardlink.com anasayfasina gidilir");

        adminDashboard.ilkSignInButton.click();
        extentTest.info("sign in butonuna tiklanir");


        adminDashboard.adminEmailButton.sendKeys(ConfigReader.getProperty("adminEmail"));
        adminDashboard.adminPasswordButton.sendKeys(ConfigReader.getProperty("adminPassword"));
        adminDashboard.adminLoginButton.click();
        extentTest.info("admin bilgileri doldurulup, click yapildiktan sonra anasayfaya gidilir");

        adminDashboard.UsersButton.click();
        extentTest.info("users (kullanicilar) menusune tiklar");

        adminDashboard.editButton.click();
        extentTest.info("edit butonuna basilir");
        adminDashboard.editFirstName.clear();
        adminDashboard.editFirstName.sendKeys(ConfigReader.getProperty("editFirstName"));
        extentTest.info("edit yapilmak istenen firstname'e yeni isim yazilir");
        adminDashboard.editLastName.clear();
        adminDashboard.editLastName.sendKeys(ConfigReader.getProperty("editLastName"));
        extentTest.info("edit yapilmak istenen lastname'e yeni soyisim yazilir");

        adminDashboard.editSaveButton.click();
        extentTest.info("edit yapmak icin save butonuna tiklanir");
        Assert.assertTrue(adminDashboard.changeTest.isDisplayed());
        extentTest.pass("kullanici bilgilerinin basarili bir sekilde degistigi dogrulanir.");

        Faker faker = new Faker();

        adminDashboard.changePassword.click();
        extentTest.info("sifresini degistirmek istedigi kullanicin karsisindaki key butonuna basar");
        adminDashboard.newPasswordBox1.sendKeys("123456789");
        adminDashboard.newPasswordBox2.sendKeys("123456789");
        extentTest.info("yeni paswoord bilgileri girilir");
        adminDashboard.changePasswordSavebutton.click();
        Assert.assertTrue(adminDashboard.newPasswordSuccessButton.isDisplayed());
        extentTest.pass("sifrenin basariyla degistirildigi gorulur");


        Driver.closeDriver();
        extentTest.info("web sayfasini kapatir");


    }

    /*Browser'a gidilir
    Tarayici URL sekmesine https://qa.smartcardlink.com/ adresini yazip enter tusuna basar
    Sign in butonuna basar
    Admin bilgilrini doldurur
    Login butonuna bastiktan sonra ana sayfaya gider
    Kullanicilara tiklar
    Add user butonuna tiklar.
    yeni bir hesap ekler
    Herhangi bir kullaniciyi siler*/

    @Test
    public void TC05(){

        AdminDashboard adminDashboard = new AdminDashboard();


        extentTest = extentReports.createTest("Kayitli kullanicilari goruntuleyebilme ve toplam kullanici sayisini alma",
                "admin bilgileri ile admin  anasayfasina gidilerek test yapilir");


        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("admin bilgileri ile https://qa.smartcardlink.com anasayfasina gidilir");

        adminDashboard.ilkSignInButton.click();
        extentTest.info("sign in butonuna tiklanir");


        adminDashboard.adminEmailButton.sendKeys(ConfigReader.getProperty("adminEmail"));
        adminDashboard.adminPasswordButton.sendKeys(ConfigReader.getProperty("adminPassword"));
        adminDashboard.adminLoginButton.click();
        extentTest.info("admin bilgileri doldurulup, click yapildiktan sonra anasayfaya gidilir");
        adminDashboard.UsersButton.click();
        extentTest.info("users (kullanicilar) menusune tiklar");


        Faker faker = new Faker();


        adminDashboard.adUsserButton.click();
        adminDashboard.addUsserFirstName.sendKeys("eyyup");
        adminDashboard.addUsserlastname.sendKeys("yilmaz");
        adminDashboard.addUsserEmail.sendKeys(faker.internet().emailAddress());
        adminDashboard.addUssserphone.sendKeys("9874561036");
        adminDashboard.addUsserPassword.sendKeys("123456.a");
        adminDashboard.adUsserConfirmPassword.sendKeys("123456.a");
        adminDashboard.addUsserSave.click();

        Assert.assertTrue(adminDashboard.addUsserSuccess.isDisplayed());



        adminDashboard.deleteButton.click();
        extentTest.info("herhangi bir kullanicinin bilgilerini silmek icin delete imgesine basar.");
        ReusableMethods.wait(2);
        adminDashboard.yesDeleteButton.click();
        extentTest.info("silme isleminini onaylamak icin yes delete butonuna tiklar");
        ReusableMethods.wait(1);
        Assert.assertTrue(adminDashboard.deleteIsSuccess.isDisplayed());
        extentTest.pass("silme isleminin basarili oldugunu onaylar");

        Driver.closeDriver();
        extentTest.info("web sayfasini kapatir");

        Driver.closeDriver();
        extentTest.info("web sayfasini kapatir");

    }

}

