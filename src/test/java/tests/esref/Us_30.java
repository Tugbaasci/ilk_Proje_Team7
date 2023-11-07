package tests.esref;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class Us_30 extends TestBaseRapor {

    @Test
    public void ulkeSehirEyaletSayilariGoruntulenmesiTesti(){
        extentTest = extentReports.createTest(" Countries sayfasindaki bilgilerin goruntulenmesi testi ",
                "Sayfadaki ulke,eyalet ve sehir sayilarinin sonuclarini test eder ");

        //1-Browser acilir
        //2-Adres cubuguna : https://www.qa.smartcardlink.com yazilir
        //3-Enter tusuna tiklanir.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Kullanici url ile siteye girer");

        //4-    Acilan ekranda “Sing In” bolumune tiklanir
        HomePage homePage=new HomePage();
        homePage.signinButton.click();

        //5-    Email cubuguna “admin21@smartcardlink.com “ yazilir
        LoginPage loginPage=new LoginPage();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("admin_username2"));
        ReusableMethods.wait(1);
        //6-    Sifre cubuguna “123123123” yazilir
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("admin_Password2"));
        //7-    Logine bir kere tiklanir
        loginPage.loginBox.click();
        extentTest.info("Kullanici admin bilgileri ile siteye girer");

        //8-Admin panelde “Countries” sekmesi tiklanir
        AdminDashboard adminDashboard=new AdminDashboard();
        adminDashboard.countriesElement.click();
        ReusableMethods.wait(2);
        extentTest.info("Admin paneldeki countries sekmesi tiklanir");

        //9-Acilan pencerede “Countries” basligina tiklanir
        adminDashboard.sayfaninIcindekiCountriesElement.click();
        extentTest.info("Aciklan sayfada Countries sekmesi tiklanir");
        ReusableMethods.wait(2);

        //10-Yenilenen sayfada en alta sonuc kismininda yazilan sonuc sayilari goruntulenmeli
        System.out.println(adminDashboard.countriesSonucYaziElement.getText());
        extentTest.info("Acilan sayfadaki sonuc yazisi getirilir ");

        //11-Sayfada iken yukaridaki “States” sekmesi tiklanir
        adminDashboard.statesElement.click();
        extentTest.info("Sayfada iken states sekmesi tiklanir");
        ReusableMethods.wait(2);

        //12-Yenilenen sayfanin sol alttaki sonuc sayilari goruntulenmeli
        System.out.println(adminDashboard.statesSonucYaziElement.getText());
        ReusableMethods.wait(2);
        extentTest.info("Acilan sayfada tekar states sonuc yazisi alinir");

        //12- Sayfada iken “Cities”sekmesi tiklanir
        adminDashboard.citiesElement.click();

        //13- Yenilenen sayfanin sol alttaki sonuc sayilari goruntulenmeli
        System.out.println(adminDashboard.citiesSonucYaziElement.getText());
        ReusableMethods.wait(2);
        extentTest.info("Cities icin sayfa tiklanir ve sonuc yazisi getirilir");

        //14- Sayfa kapatilir
        Driver.closeDriver();
        extentTest.info("Sayfa kapatilir");
    }

    @Test
    public void countriesSayfasindaEklemeTesti(){
        extentTest = extentReports.createTest(" Countries sayfasina yeni bilgiler ekleme testi ",
                "Sayfadaki: Countries,States ve Cities sayfalarina ; ulke,eyalet ve sehir sayilarini eklemeyi test eder ");
        //1-Browser acilir
        //2-Adres cubuguna : https://www.qa.smartcardlink.com yazilir
        //3-Enter tusuna tiklanir.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Kullanici Url ile smartCardLink adresine gider");
        //4-    Acilan ekranda “Sing In” bolumune tiklanir

        HomePage homePage=new HomePage();
        homePage.signinButton.click();

        //5-    Email cubuguna “admin21@smartcardlink.com “ yazilir
        LoginPage loginPage=new LoginPage();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("admin_username2"));

        //6-    Sifre cubuguna “123123123” yazilir
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("admin_Password2"));

        //7-    Logine bir kere tiklanir
        loginPage.loginBox.click();
        extentTest.info("Kullanici admin bilgileri ile dashboard'a gider");

        //8-Admin panelde “Countries” sekmesi tiklanir
        AdminDashboard adminDashboard=new AdminDashboard();
        adminDashboard.countriesElement.click();
        extentTest.info("Admin panelde Countries sekmesi tiklanir");
        ReusableMethods.wait(2);

        //9-Acilan pencerede “Countries” basligina tiklanir
        adminDashboard.sayfaninIcindekiCountriesElement.click();
        extentTest.info("Sayfadaki Countries sekmesi tiklanir");
        ReusableMethods.wait(1);

        //10-Sag ustte “New Country” sekmesi tiklanir
        adminDashboard.newCountryElement.click();
        extentTest.info("Yeni ulke eklemek icin new Contry sekmesi tiklanir");
        ReusableMethods.wait(2);

        //11-Acilan sayfada yeni ulke eklemek icin istenen ulke isme,kisa kod ve yeni ulkenenin telefon kodu yazilir.

        adminDashboard.newCountryNameElement.sendKeys(ConfigReader.getProperty("countryName"));
        ReusableMethods.wait(2);
        extentTest.info("Acilan sayfada istenilen ulke ismi girilir");
        adminDashboard.newCountryShortCodeElement.sendKeys(ConfigReader.getProperty("shortCode"));
        extentTest.info("Acilan sayfada istenilen kisa ulke kodu girilir");
        ReusableMethods.wait(2);
        adminDashboard.newCountryPhoneCodeElement.sendKeys(ConfigReader.getProperty("phoneCode"));
        extentTest.info("Ulke telefon kodu girilir");

        ReusableMethods.wait(3);

        //12-Alttaki “Save” tiklanir.
        adminDashboard.newCountrySaveElement.click();
        extentTest.info("Sayfadaki Save tiklanir");
        ReusableMethods.wait(3);

        //13-Sayfada iken yeni bilgilerin eklendigi dogrulanir
        String actualUlkeEkleme=adminDashboard.newCountryEklemeElementi.getText();
        String expectedUlkeEkleme="Wisequarter";
        Assert.assertEquals(actualUlkeEkleme,expectedUlkeEkleme);
        extentTest.pass("Ulke eklendigi test eder");
        ReusableMethods.wait(4);

        //14-Sayfada iken sol ustteki States sekmesi tiklanir
        adminDashboard.statesElement.click();
        ReusableMethods.wait(2);
        extentTest.info("Sayfadaki States sekmesi tiklanir");
        ReusableMethods.wait(3);

        //15- Acilan sayfada New state uzerine tiklanir
        adminDashboard.newStateElement.click();
        ReusableMethods.wait(1);
        extentTest.info("Acilan sayfada yeni eyalet sekmesi tiklanir");
        ReusableMethods.wait(2);

        //16-Acilan sayfada yeni eyalet eklenir
        adminDashboard.newStateNameElement.sendKeys(ConfigReader.getProperty("stateName"));
        extentTest.info("Acilan sekmede yeni eyalet ismi yazilir");
        ReusableMethods.wait(3);

        //17-Sonra ulke secilir
        adminDashboard.selectCountryElement.click();
        ReusableMethods.wait(1);
        adminDashboard.selectSearchbox.click();
        ReusableMethods.wait(1);
        adminDashboard.selectSearchbox.sendKeys(ConfigReader.getProperty("countryName"));
        adminDashboard.selectSearchbox.sendKeys(Keys.ENTER);
        extentTest.info("Daha once girdigimiz veya yeni ulke adi bu sekmede secilir ");
        ReusableMethods.wait(4);

        //18- Alttaki “Save” tiklanir.
        adminDashboard.newStateSaveElement.click();
        extentTest.info("Sayfadaki Save tiklanir");
        ReusableMethods.wait(3);

        //19- Sayfada iken yeni bilgilerin eklendigi dogrulanir
        String actualEyaletEkleme=adminDashboard.newStateEklemeElement.getText();
        String expectedEyaletEkleme="T120";
        Assert.assertEquals(actualEyaletEkleme,expectedEyaletEkleme);
        extentTest.pass("Yeni eyalet eklendigi test eder");
        ReusableMethods.wait(3);

        //20-Sol ustteki sekmeden “Cities” sekmesi tiklanir
        adminDashboard.citiesElement.click();
        ReusableMethods.wait(1);
        extentTest.info("Sayfadaki Cities sekmesi tiklanir ");
        ReusableMethods.wait(3);

        //21- Acilan sayfadaki sag ustteki New Ctiy sekmesi tiklanir
        adminDashboard.newCitylement.click();
        ReusableMethods.wait(1);
        extentTest.info("Yeni sehir secmek icin new city sekmesine tiklanir");
        ReusableMethods.wait(3);

        //22- Istenilen yeni sehir eklenir
        adminDashboard.newCityNameElement.click();
        adminDashboard.newCityNameElement.sendKeys(ConfigReader.getProperty("newCity"));
        extentTest.info("Istenilen yeni sehir eklenir");
        ReusableMethods.wait(2);

        //23-Eyalet secilir
        adminDashboard.selectStateElement.click();
        ReusableMethods.wait(1);
        adminDashboard.selectStateBox.click();
        ReusableMethods.wait(1);
        adminDashboard.selectStateBox.sendKeys(ConfigReader.getProperty("stateName"));
        adminDashboard.selectSearchbox.sendKeys(Keys.ENTER);
        extentTest.info("Istenilen bir eyalet secilir");
        ReusableMethods.wait(4);

        //24- Alttaki “Save” tiklanir.
        adminDashboard.citySaveButton.click();
        extentTest.info("Kayit dugmesine tiklanir");
        ReusableMethods.wait(3);

        //25- Sayfada iken yeni bilgilerin eklendigi dogrulanir
        String actualCityEkleme=adminDashboard.newCityEklemeElement.getText();
        String expectedCityEkleme="QA Dunyasi";
        Assert.assertEquals(actualEyaletEkleme,expectedEyaletEkleme);
        extentTest.pass("Girilen yeni sehirin eklendigi test eder");
        ReusableMethods.wait(4);

        //26-Sayfada iken yeni girilen bilgileri sil
        adminDashboard.delete.click();
        adminDashboard.deleteYes.sendKeys(Keys.ENTER);
        ReusableMethods.wait(4);
        adminDashboard.statesElement.click();
        ReusableMethods.wait(1);
        adminDashboard.delete.click();
        ReusableMethods.wait(2);
        adminDashboard.deleteYes.sendKeys(Keys.ENTER);
        ReusableMethods.wait(4);
        adminDashboard.countriesElement.click();
        ReusableMethods.wait(1);
        adminDashboard.delete.click();
        ReusableMethods.wait(3);
        extentTest.info("Test yenilendiginde otomasyon bozulmamasi icin sirayla yeni girilen sehir,eyalet ve ulke silinir ");

        //27-Sayfa kapatilir.
        Driver.closeDriver();
        extentTest.info("Sayfa kapatilir");
    }
}

