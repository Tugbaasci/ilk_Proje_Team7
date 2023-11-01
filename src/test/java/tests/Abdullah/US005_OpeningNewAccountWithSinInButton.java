package tests.Abdullah;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SmartCardPage;
import utilities.*;

public class US005_OpeningNewAccountWithSinInButton extends TestBaseRapor {
    //Bir ziyaretçi olarak Sign In butonu ile login sayfasına ulaşabildiğimi
    // ve yeni hesap açabildiğimi doğrulayabilmeliyim

    SmartCardPage smartCardPage =new SmartCardPage();
    Faker faker = new Faker();

    @Test
    public void smartCardTc35(){
        extentTest = extentReports.createTest("TC35 https://qa.smartcardlink.com/ ziyaretçi olarak yeni hesap açma",
                " yeni hesap açılabilirligi test edilir. ");

        Driver.getDriver().get(ConfigReader.getProperty("smartCardUrl"));
        extentTest.pass("Home sayfasinin acildigi görülür.");

        smartCardPage.ilkSingnInButonu.click();
        extentTest.pass("Sing In butonu tiklanir.");

        smartCardPage.createAnAccoutYaziElementi.click();
        smartCardPage.firstNameBox.sendKeys("Ali");
        smartCardPage.lastNameBox.sendKeys("Vali");
        smartCardPage.createAccoutEmailBox.sendKeys(faker.internet().emailAddress());
        smartCardPage.createAccoutPasswordBox.sendKeys("123456A*");
        smartCardPage.createAccoutpassword_confirmationBox.sendKeys("123456A*");
        extentTest.pass("İsim, soyisim, mail adresi ve password girilir ");

        smartCardPage.boxPrivacyPolicyCheck.click();
        extentTest.pass("Güvenlik politikalar kabul kutusu tiklenir.");

        smartCardPage.buttonSubmit.click();
        extentTest.pass("Submit butonuna tiklanir.");
        ReusableMethods.wait(2);

        Assert.assertTrue(smartCardPage.dilSecimMenusu.isDisplayed());
        extentTest.pass("yeni açılan sayfada Dil menünüsü görüntülenir ve Yeni hesap olusturulduğu onaylanir.");

        DriverCross.quitDriver();



    }

}
