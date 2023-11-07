package tests.ertugrul;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.HomePage;
import pages.LoginPage;
import utilities.*;

import java.util.List;

public class US_25 extends TestBaseRapor {


    @Test
    public void Test01() {
        extentTest = extentReports.createTest("TestCase25_01: Admin olarak uyelik planlarinin goruntulendigini dogrulamaliyim", "Admin olarak uyelik planlarini gormeliyim");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        HomePage homePage=new HomePage();
        LoginPage loginPage = new LoginPage();
        AdminDashboard adminDashboard = new AdminDashboard();
        homePage.signinButton.click();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("admin_username"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("admin_Password"));
        loginPage.loginBox.click();
        extentTest.info("Admin olarak giris yapilir");
        adminDashboard.adminPlansButtonElement.click();
        extentTest.info("Plan butonuna tiklanir.");
        ReusableMethods.wait(2);
        List<WebElement> planElementsList = adminDashboard.userPlanDetailsListElement;
        int num = 0;
        for (WebElement each : planElementsList) {
            System.out.println(num + ".element= " + each.getText());
            Assert.assertTrue(each.isDisplayed());
            num++;
        }
        extentTest.info("Herhangi bir kullanicinin bilgileri list olarak kaydedilir ve bir dongu icinde getirilir.");
        System.out.println(planElementsList.size());
        extentTest.pass("Admin olarak uyelik planlarinin goruntulendigi dogrulanir");
    }

    @Test
    public void Test02() {
        extentTest = extentReports.createTest("TestCase25_02: Admin olarak yeni plan ekleyebildigim dogrulanmali", "Admin olarak yeni plan eklemeliyim");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        LoginPage loginPage = new LoginPage();
        AdminDashboard adminDashboard = new AdminDashboard();
        Faker faker = new Faker();
        HomePage homePage=new HomePage();
        ReusableMethods.wait(2);
        homePage.signinButton.click();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("admin_username"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("admin_Password"));
        loginPage.loginBox.click();
        extentTest.info("Admin olarak giris yapilir");
        adminDashboard.adminPlansButtonElement.click();
        extentTest.info("Plan butonuna tiklanir.");
        adminDashboard.newPlanButtonElement.click();
        extentTest.info("New Plan butonuna tiklanir.");
        Actions actions = new Actions(Driver.getDriver());
        adminDashboard.newPlanNameBox.sendKeys(faker.name().firstName());
        adminDashboard.newPlanNameBox.sendKeys(Keys.TAB);
        actions.sendKeys(Keys.ENTER)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.TAB)
                .sendKeys("100")
                .sendKeys(Keys.TAB)
                .sendKeys("114")
                .sendKeys(Keys.TAB)
                .sendKeys("30")
                .perform();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", adminDashboard.selectAllFeatureBox);
        ReusableMethods.waitFor(2);
        adminDashboard.selectAllFeatureBox.click();
        extentTest.info("Sayfa kaydirilir ve Feature'lara tiklanir.");
        adminDashboard.newPlanSaveButton.click();
        extentTest.info("Save butonuna tiklanir.");
        System.out.println(adminDashboard.newPlanControlElement.getText());
        Assert.assertTrue(adminDashboard.newPlanControlElement.isDisplayed());
        extentTest.pass("Admin olarak Yeni Plan ekleyebildigim dogrulanir");
        DriverCross.quitDriver();
    }

    @Test(dependsOnMethods = "Test02")
    public void Test03() {
        extentTest = extentReports.createTest("TestCase25_03: Admin olarak olusturulmus olan planlarin silindigi dogrulanabilmeli", "Admin olarak mevcut planlari silebilmeliyim");

        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        LoginPage loginPage = new LoginPage();
        AdminDashboard adminDashboard = new AdminDashboard();
        ReusableMethods.wait(2);
        HomePage homePage=new HomePage();
        homePage.signinButton.click();
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("admin_username"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("admin_Password"));
        loginPage.loginBox.click();
        extentTest.info("Admin olarak giris yapilir");
        adminDashboard.adminPlansButtonElement.click();
        String[] resultText = adminDashboard.newPlanResultTextElement.getText().split(" ");
        String result = resultText[5];
        int numResult = Integer.parseInt(result);
        int expectedResult=numResult-1;
        System.out.println(expectedResult);
        adminDashboard.planPageDeleteButton.click();
        extentTest.info("Plan delete simgesine tiklanir.");
        ReusableMethods.wait(2);
        adminDashboard.planDeleteBoxElement.click();
        extentTest.info("Yes, Delete butonuna tiklanir");
        ReusableMethods.wait(2);
        String[] resultTextNext = adminDashboard.newPlanResultTextElement.getText().split(" ");
        String resultNext = resultTextNext[5];
        int numResultNext = Integer.parseInt(resultNext);
        int actualResult= numResultNext;
        System.out.println(actualResult);
        Assert.assertEquals(actualResult,expectedResult);
        extentTest.pass("Admin olarak mevcut herhangi bir planin silinebildigi dogrulanir. ");
    }
}
