package tests.bulent;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_10 extends TestBaseRapor {
    // Sayfadaki VCARD NAME sütunu altinda VCARD isimlerinin görüntülendigini dogrulayin.
    @Test // TC_17
    public void vCardNameVisible_Test17() {
        // 1- Browser'a https://qa.smartcardlink.com/ yazilir.
        extentTest = extentReports.createTest("VCARD NAME görünürlük Test","Ziyaretci VCARD NAME sütununda  VCARD NAME leri görür.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrls"));

        //2- Acilan sayfanin Sign In butonuna tiklanir.
        HomePage homePage = new HomePage();
        homePage.signinButton.click();

        //3- Username ve password girilir.
        LoginPage loginPage = new LoginPage();
        extentTest.info("Username ve password girilir.");
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("usernameBulent"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("passwordBulent"));

        //4- Login buttonuna tiklanir.
        loginPage.loginBox.click();
        extentTest.info("Login butonuna tiklanir.");
        //5- Acilan sayfadan Enquiries linkine tiklanir.
        UserDashboard userDashboard = new UserDashboard();
        userDashboard.enquiriesWE.click();
        extentTest.info("Enquiries sayfasina gecilir.");
        //"6- Acilan sayfada  VCARD NAME sütunu altinda VCARD isimlerinin
        // görüntülendigini dogrulanir."

        ReusableMethods.waitFor(3);


        if(userDashboard.columnVCardNameWE.getText()!= null)
            System.out.println(userDashboard.columnVCardNameWE.getText());

        Assert.assertTrue(userDashboard.columnVCardNameWE.getText()!= null);

        extentTest.pass( "Ilgili sütunda bilgilerin görüldügü dogrulanir.");

        Driver.closeDriver();

    }
    @Test // TC_18
    public void nameVisible_Test18() {
        // 1- Browser'a https://qa.smartcardlink.com/ yazilir.
        extentTest = extentReports.createTest("NAME görünürlük Test","Ziyaretci NAME sütununda  NAME leri görür.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrls"));


        //2- Acilan sayfanin Sign In butonuna tiklanir.
        HomePage homePage = new HomePage();
        homePage.signinButton.click();

        //3- Username ve password girilir.
        LoginPage loginPage = new LoginPage();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("usernameBulent"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("passwordBulent"));
        extentTest.info("Username ve password girilir.");

        //4- Login buttonuna tiklanir.
        loginPage.loginBox.click();
        extentTest.info("Login butonuna tiklanir.");
        //5- Acilan sayfadan Enquiries linkine tiklanir.
        UserDashboard userDashboard = new UserDashboard();
        userDashboard.enquiriesWE.click();
        extentTest.info("Enquiries sayfasina gecilir.");
        //"6- Acilan sayfada  VCARD NAME sütunu altinda VCARD isimlerinin
        // görüntülendigini dogrulanir."

        ReusableMethods.waitFor(3);


        if(userDashboard.columnVCardNameWE.getText()!= null)
            System.out.println(userDashboard.columnNameWE.getText());

        Assert.assertTrue(userDashboard.columnNameWE.getText()!= null);
        extentTest.pass( "Ilgili sütunda bilgilerin görüldügü dogrulanir.");


        Driver.closeDriver();

    }

    @Test // TC_19
    public void eMailVisible_Test19() {
        // 1- Browser'a https://qa.smartcardlink.com/ yazilir.
        extentTest = extentReports.createTest("EMAIL görünürlük Test","Ziyaretci EMAIL sütununda  Email leri görür.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrls"));


        //2- Acilan sayfanin Sign In butonuna tiklanir.
        HomePage homePage = new HomePage();
        homePage.signinButton.click();

        //3- Username ve password girilir.
        LoginPage loginPage = new LoginPage();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("usernameBulent"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("passwordBulent"));
        extentTest.info("Username ve password girilir.");
        //4- Login buttonuna tiklanir.
        loginPage.loginBox.click();
        extentTest.info("Login butonuna tiklanir.");
        //5- Acilan sayfadan Enquiries linkine tiklanir.
        UserDashboard userDashboard = new UserDashboard();
        userDashboard.enquiriesWE.click();
        extentTest.info("Enquiries sayfasina gecilir.");
        //"6- Acilan sayfada  VCARD NAME sütunu altinda VCARD isimlerinin
        // görüntülendigini dogrulanir."

        ReusableMethods.waitFor(3);

        if(userDashboard.columnEMailWE.getText()!= null)
            System.out.println(userDashboard.columnEMailWE.getText());

        Assert.assertTrue(userDashboard.columnNameWE.getText()!= null);
        extentTest.pass( "Ilgili sütunda bilgilerin görüldügü dogrulanir.");


        Driver.closeDriver();

    }
    @Test // TC_20
    public void ephoneVisible_Test20() {
        // 1- Browser'a https://qa.smartcardlink.com/ yazilir.
        extentTest = extentReports.createTest("PHONE görünürlük Test","Ziyaretci PHONE sütununda  PHONE numaralarini görür.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrls"));

        //2- Acilan sayfanin Sign In butonuna tiklanir.
        HomePage homePage = new HomePage();
        homePage.signinButton.click();

        //3- Username ve password girilir.
        LoginPage loginPage = new LoginPage();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("usernameBulent"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("passwordBulent"));
        extentTest.info("Username ve password girilir.");
        //4- Login buttonuna tiklanir.
        loginPage.loginBox.click();
        extentTest.info("Login butonuna tiklanir.");
        //5- Acilan sayfadan Enquiries linkine tiklanir.
        UserDashboard userDashboard = new UserDashboard();
        userDashboard.enquiriesWE.click();
        extentTest.info("Enquiries sayfasina gecilir.");
        //"6- Acilan sayfada  VCARD NAME sütunu altinda VCARD isimlerinin
        // görüntülendigini dogrulanir."

        ReusableMethods.waitFor(3);


        if(userDashboard.columnPhoneWE.getText()!= null)
            System.out.println(userDashboard.columnPhoneWE.getText());

        Assert.assertTrue(userDashboard.columnPhoneWE.getText()!= null);

        extentTest.pass( "Ilgili sütunda bilgilerin görüldügü dogrulanir.");

        Driver.closeDriver();

    }
    @Test // TC_21
    public void createOnVisible_Test21() {
        // 1- Browser'a https://qa.smartcardlink.com/ yazilir.
        extentTest = extentReports.createTest("CREATION ON görünürlük Test","Ziyaretci CREATION ON sütununda tarihleri görür.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrls"));

        //2- Acilan sayfanin Sign In butonuna tiklanir.
        HomePage homePage = new HomePage();
        homePage.signinButton.click();

        //3- Username ve password girilir.
        LoginPage loginPage = new LoginPage();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("usernameBulent"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("passwordBulent"));
        extentTest.info("Username ve password girilir.");
        //4- Login buttonuna tiklanir.
        loginPage.loginBox.click();
        extentTest.info("Login butonuna tiklanir.");
        //5- Acilan sayfadan Enquiries linkine tiklanir.
        UserDashboard userDashboard = new UserDashboard();
        userDashboard.enquiriesWE.click();
        extentTest.info("Enquiries sayfasina gecilir.");
        //"6- Acilan sayfada  VCARD NAME sütunu altinda VCARD isimlerinin
        // görüntülendigini dogrulanir."

        ReusableMethods.waitFor(3);


        if(userDashboard.columnCreatedOnWE.getText()!= null)
            System.out.println(userDashboard.columnCreatedOnWE.getText());

        Assert.assertTrue(userDashboard.columnCreatedOnWE.getText()!= null);
        extentTest.pass( "Ilgili sütunda bilgilerin görüldügü dogrulanir.");


      // Driver.closeDriver();

    }
    @Test // TC_22
    public void iconEyeMessageVisible_Test22() {
        // 1- Browser'a https://qa.smartcardlink.com/ yazilir.
        extentTest = extentReports.createTest("Message görünürlük Test","Ziyaretci GÖZ singesine tiklayrak mesajlari görür.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrls"));

        //2- Acilan sayfanin Sign In butonuna tiklanir.
        HomePage homePage = new HomePage();
        homePage.signinButton.click();

        //3- Username ve password girilir.
        LoginPage loginPage = new LoginPage();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("usernameBulent"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("passwordBulent"));
        extentTest.info("Username ve password girilir.");
            //4- Login buttonuna tiklanir.
        loginPage.loginBox.click();
        extentTest.info("Login butonuna tiklanir.");
        //5- Acilan sayfadan Enquiries linkine tiklanir.
        UserDashboard userDashboard = new UserDashboard();
        userDashboard.enquiriesWE.click();
        extentTest.info("Enquiries sayfasina gecilir.");
        //"6- Acilan sayfada  VCARD NAME sütunu altinda VCARD isimlerinin
        // görüntülendigini dogrulanir."

        ReusableMethods.waitFor(3);


        // 6- En sagdaki göz simgesine tiklanir.
        userDashboard.iconEyeWE.click();
        // 7- Aclan popup penceresinden mesajin görüntülendigi dogrulanir.
        ReusableMethods.wait(2);

        System.out.println(userDashboard.labelMessageWE.getText());
        userDashboard.closeButtonWE.click();
        Assert.assertTrue(userDashboard.labelMessageWE.isDisplayed());
        extentTest.pass( "Message larin görüldügü dogrulanir.");
        userDashboard.closeButtonWE.click();

        Driver.closeDriver();

    }


    @Test // TC_23
    public void iconEyeMessageDelete_Test23() {
        // Vcard üzerinden gönderilen mesajların/sorunun silinebildigini dogrulayin.

        // 1- Browser'a https://qa.smartcardlink.com/ yazilir.
        extentTest = extentReports.createTest("Message Delete Test","Ziyaretci Delete singesine tiklayrak mesajlari siler.");
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
        extentTest.info("Username ve password girilir.");
        //4- Login buttonuna tiklanir.
        loginPage.loginBox.click();
        extentTest.info("Login butonuna tiklanir.");
        //5- Acilan sayfadan Enquiries linkine tiklanir.
        UserDashboard userDashboard = new UserDashboard();
        userDashboard.enquiriesWE.click();
        extentTest.info("Enquiries sayfasina gecilir.");
        // görüntülenen ilk kayit sayisini alinir
        String[] resultStrArray = userDashboard.labelShowingResultWE.getText().split(" ");
        int firstResultNumber = Integer.parseInt(resultStrArray[1]);
        int expectedResult = firstResultNumber-1;
        System.out.println("First result number " + firstResultNumber);

        //
        // 6- Acilan sayfada ACTION sütunu altinda delete simgesine tiklanir.
        ReusableMethods.waitFor(3);
        userDashboard.iconDeleteWE.click();

        // 7- 7- Acilan popup penceresinde "Yes,Delete!" dügmesine tiklanir.
        ReusableMethods.wait(2);

        userDashboard.buttonDeleteYesWE.click();
        ReusableMethods.wait(3);
        // görüntülenen son kayit sayisini alinir ve karsilastirir

        String[] lastResultArray = userDashboard.labelShowingResultWE.getText().split(" ");
        int lastResultNumber = Integer.parseInt(lastResultArray[1]);
        int actualResult = lastResultNumber;
        System.out.println("Last resul number " + lastResultNumber);

        // 8- Kaydin silindigi dogrulanir.
        Assert.assertEquals(actualResult,expectedResult);
        extentTest.pass( "Message larin silindigi dogrulanir.");
        Driver.closeDriver();

    }

}
