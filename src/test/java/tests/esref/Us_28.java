package tests.esref;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.List;

public class Us_28 extends TestBaseRapor {
    @Test
    public void withdrawTransactionsBasligiGoruntulemetesti(){
        extentTest = extentReports.createTest(" Withdraw Transactions Basligi Testi",
                "Withdraw Transactions basligi goruntulenebilmeli");
        //1-  Browser acilir
        //2-   Adres cubuguna : https://www.qa.smartcardlink.com yazilir
        //3-   Enter tusuna tiklanir.

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Kullanici anasayfaya gider");

        //4-    Acilan ekranda “Sing In” bolumune tiklanir
        //5-    Email cubuguna “admin21@smartcardlink.com “ yazilir
        //6-    Sifre cubuguna “123123123” yazilir
        //7-    Logine bir kere tiklanir
        HomePage homePage=new HomePage();
        homePage.signinButton.click();
        LoginPage loginPage=new LoginPage();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("admin_username2"));
       loginPage.passwordBox.sendKeys(ConfigReader.getProperty("admin_Password2"));
       loginPage.loginBox.click();
       extentTest.info("Admin bilgileri ile smartcardlink sayfasina gider");

        //8-   Acilan pencerede Withdraw "Transactions” bolumune ulasilabilmeli
           AdminDashboard adminDashboard=new AdminDashboard();
           Assert.assertTrue(adminDashboard.withdrawTransactionsElement.isDisplayed());
           extentTest.pass("Admin sayfasinda aranan Withdraw Transactions basligi icerdigini test eder");

        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }
    @Test
    public void  withdrawTransactionstekiTabloBilgileriTesti() {
        extentTest = extentReports.createTest(" Withdraw Transactions Taplo Bilgi Testi ",
                "Withdraw Transactions sayfasinda kullanici olarak kayit olan kullanicinin bilgileri ");
        //  //"1-  Browser acilir
        //2-   Adres cubuguna : https://www.qa.smartcardlink.com yazilir
        //3-   Enter tusuna tiklanir.

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("Kullanici anasayfaya gider");

        //4-   Acilan ekranda “Sing In” bolumune tiklanir
        HomePage homePage = new HomePage();
        homePage.signinButton.click();

        //5-   Email cubuguna “admin21@smartcardlink.com “ yazilir
        LoginPage loginPage=new LoginPage();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("admin_username2"));

        //6-   Sifre cubuguna “123123123” yazilir
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("admin_Password2"));
        //7-   Logine bir kere tiklanir
        loginPage.loginBox.click();
        extentTest.info("Kulalnici admin bilgileri ile smartcardlink sayfasina ulasir");

        //8-   Acilan pencerede “Withdraw Transactions” bolumune tiklanir
        AdminDashboard adminDashboard=new AdminDashboard();
        adminDashboard.withdrawTransactionsElement.click();
        extentTest.info("Kullanici admin panelde Withdraw Transactions bolumunu gider ");
        ReusableMethods.wait(1);

        //9-   Withdraw Transactions bolumunde odeme yapilan kullaniciya ait veriler
        //(odeme tutarı, odeme tipi ve odeme tarihi) sayfada goruntulenebir oldugu dogrulanir)

        List<WebElement> userElementList= adminDashboard.withdrawTransactionsUserElement;
        Assert.assertTrue(userElementList.size()>0);
        extentTest.pass("Kullaiciya ait veriler goruldugu test eder");
        ReusableMethods.wait(1);

        List<WebElement> amountElementList= adminDashboard.withdrawTransactionsAmountElement;
        Assert.assertTrue(amountElementList.size()>0);
        extentTest.pass("Kullaiciya ait amout verilerin goruldugu test eder");

        List<WebElement> paymentTypeElementList= adminDashboard.withdrawTransactionsPaymentTypeElement;
        Assert.assertTrue(paymentTypeElementList.size()>0);
        extentTest.pass("Kullaiciya ait payment type verilerin goruldugu test eder");
        ReusableMethods.wait(1);

        List<WebElement> dateElementList= adminDashboard.withdrawTransactionsDateElement;
        Assert.assertTrue(dateElementList.size()>0);
        extentTest.pass("Kullaiciya ait date verileri goruldugu test eder");

        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");
    }

}

