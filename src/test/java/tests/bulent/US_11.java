package tests.bulent;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;


public class US_11 extends TestBaseRapor {

    @Test // TC_24
    public void virtualBackgroundPageVisible_Test24() {
        // 1- Kayitli kullanici hesabi ile
        // Add Virtual Background sayfasinin acildigi dogrulanmalidir.

        // 1- Browser'a https://qa.smartcardlink.com/ yazilir.
        extentTest = extentReports.createTest("Add Virtual Background görünürlük Test","Kayitli kullanici Add Virtual Backgroud sayfasini görür.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrls"));

        //2- Acilan sayfanin Sign In butonuna tiklanir.
        HomePage homePage = new HomePage();
        homePage.signinButton.click();

        //3- Username ve password girilir.
        LoginPage loginPage = new LoginPage();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("usernameBulent"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("passwordBulent"));

        //4- Login buttonuna tiklanir.
        loginPage.loginBox.click();
        extentTest.info("Login butonuna tiklanir.");
        //5- Acilan sayfadan Virtual-Backgrounds linkine tiklanir.
        UserDashboard userDashboard = new UserDashboard();
        userDashboard.linkVirtualBackgroundWE.click();
        extentTest.info("Virual Backgrounds linkine tiklanir.");
        ReusableMethods.wait(4);
        // 6- Acilan sayfada cikan arka plan resimlerinden ilkine tiklanir.
        userDashboard.imageFirstCardWE.click();
        extentTest.info("Virual Backgrounds sayfasindaki ilk image'a tiklanir.");
        // 7- Add Virtual Background sayfasinin acildigi dogrulanir.

        System.out.println(userDashboard.labelAddVirtualBackgroundWE.getText());
        Assert.assertTrue(userDashboard.labelAddVirtualBackgroundWE.isDisplayed());
        extentTest.pass("Add Virtual Background sayfasinin acilgidi dogrulanir.");
        Driver.closeDriver();
    }



    @Test // TC_25
    public void virtualBackgroundPageSave_Test25() throws AWTException, IOException {
        // 2- Kayitli kullanici hesabi ile Add Virtual Background
        // sayfasindan kart bilgilerinin girilip kaydedildigi dogrulanmalidir.

        // 1- Browser'a https://qa.smartcardlink.com/ yazilir.
        extentTest = extentReports.createTest("Kart Kayit Test","Kayitli kullanici Add Virtual Backgroud sayfasindan kayit yapabilir.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrls"));
        String expectedUrl = ConfigReader.getProperty("smartCardLinkUrls");
        String actualUrl = Driver.getDriver().getCurrentUrl();   // https://qa.smartcardlink.com/
        //Assert.assertEquals(actualUrl,expectedUrl);

        //2- Acilan sayfanin Sign In butonuna tiklanir.
        HomePage homePage = new HomePage();
        homePage.signinButton.click();

        //3- Username ve password girilir.
        LoginPage loginPage = new LoginPage();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("usernameBulent"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("passwordBulent"));

        //4- Login buttonuna tiklanir.
        loginPage.loginBox.click();
        extentTest.info("Login butonuna tiklanir.");
        //5- Acilan sayfadan Virtual-Backgrounds linkine tiklanir.
        UserDashboard userDashboard = new UserDashboard();
        userDashboard.linkVirtualBackgroundWE.click();
        extentTest.info("Virual Backgrounds linkine tiklanir.");
        ReusableMethods.wait(4);
        // 6- Acilan sayfada cikan arka plan resimlerinden ilkine tiklanir.
        userDashboard.imageFirstCardWE.click();
        extentTest.info("Virual Backgrounds sayfasindaki ilk image'a tiklanir.");
        ReusableMethods.wait(2);
        //7- VCard Name comboBox'tan Vcard secilir.
        userDashboard.comboBoxVCardNameWE.click();
        ReusableMethods.wait(2);

////////////////////////////////////////////////////////////////////////////////


        userDashboard.comboBoxVCardNameWE.click(); // click

        // Combobox liste elementini bul ve tikla


        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

        WebElement comboBox = Driver.getDriver().findElement(By.xpath("//span[@id='select2-e-vcard-id-container']"));
        comboBox.click();
        int indexToSelect = 0;
        WebElement dropdown = Driver.getDriver().findElement(By.id("select2-e-vcard-id-results"));
        WebElement option = dropdown.findElements(By.tagName("li")).get(indexToSelect);
        option.click();
/*   listenin tamami
        List<WebElement> options = dropdown.findElements(By.tagName("li"));
        for (WebElement opt : options) {
            System.out.println(opt.getText());
        }
*/
    //////////////////////////////////////////////////////


        //8- Bos olan textBox var ise otomatik doldurulur.
        Faker faker = new Faker();
       //  Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        ReusableMethods.wait(5);


        if(userDashboard.textBoxFirstNameWE.getAttribute("value").isEmpty())
             userDashboard.textBoxFirstNameWE.sendKeys(faker.name().firstName());

       if(userDashboard.textBoxLastNameWE.getAttribute("value").isEmpty())
            userDashboard.textBoxLastNameWE.sendKeys(faker.name().lastName());
        if(userDashboard.textBoxEmailWE.getAttribute("value").isEmpty())
            userDashboard.textBoxEmailWE.sendKeys(faker.internet().emailAddress());
        if(userDashboard.textBoxOccupationWE.getAttribute("value").isEmpty())
            userDashboard.textBoxOccupationWE.sendKeys(faker.job().title());
        if(userDashboard.textBoxLocationWE.getAttribute("value").isEmpty())
            userDashboard.textBoxLocationWE.sendKeys(faker.address().cityName());
        if(userDashboard.textBoxPhoneNumberWE.getAttribute("value").isEmpty())
            userDashboard.textBoxPhoneNumberWE.sendKeys(faker.phoneNumber().phoneNumber());
        if(userDashboard.textBoxWebsiteWE.getAttribute("value").isEmpty())
            userDashboard.textBoxWebsiteWE.sendKeys(faker.internet().domainName());




        //9- Add E-card basligindaki Change Profile dügmesine tiklanir.
        userDashboard.iconChangeProfileImageWE.click();
        extentTest.info("Add Virtual Background sayfasinin eksik bilgiler doldurulur ve profil resmi eklenir.");
        //10- Acilan pencereden resim secilir ve open dügmesine tiklanir.

        String filePath = "C:\\Users\\bulen\\IdeaProjects\\Ilk_Proje_Team7\\resources\\img\\image-150x150.jpg";
        // userDashboard.iconChangeProfileImageWE.sendKeys(filePath);
        Robot robot = new Robot();
       ReusableMethods.wait(3);

        StringSelection stringSelection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        ReusableMethods.wait(3);

        //11- Save dügmesine tiklanarak kayitin tamamlandigi dogrulanir.
        userDashboard.buttonSaveWE.click();
        // bu islem karti dosya olarak bilgisayara indiriyor
        // dolayisiyla indirilen dosyayi kontrol edecegim
        String downloadPath = "C:\\Users\\bulen\\Downloads\\virtual-backgrounds.zip";
        ReusableMethods.wait(3);
        Assert.assertTrue(Files.exists(Paths.get(downloadPath)));
        extentTest.pass("Kart kaydinin yapildigi dogrulanir.");
        ReusableMethods.wait(3);
        // tekrar calistirirken hata olmamamasi icin indirilen dosyayi simdilik 3 saniye sonra siliyorum.
        Files.delete(Paths.get(downloadPath));

        Driver.closeDriver();


  }
}
