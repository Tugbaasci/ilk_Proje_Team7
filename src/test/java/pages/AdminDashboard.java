package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class AdminDashboard {
    public AdminDashboard() {

        PageFactory.initElements(Driver.getDriver(), this);



    }


    }


import java.util.List;

public class AdminDashboard {
    public AdminDashboard(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    //Dashboard sayfasında bulunan "Dashboard Başlık Yazı Elementi"
    @FindBy(xpath = "//a[@class='nav-link p-0 active']")
    public WebElement dashboardText;

    //Dashboard sayfasında soldaki menüde bulunan "Affiliation Transactions Yazı Elementi"
    @FindBy(xpath = "//span[text()='Affiliation Transactions']")
    public WebElement affiliationTransactionsElement;

    //Dashboard sayfasında bulunan "Affiliation Transactions Başlık Yazı Elementi"
    @FindBy(xpath = "//a[@class='nav-link p-0 active']")
    public WebElement affiliationTransactionsText;

    //Dashboard sayfasında soldaki menüde bulunan "Affiliate Users Yazı Elementi"
    @FindBy(xpath = "//span[text()='Affiliate Users']")
    public WebElement affiliationUsersElement;

    //Dashboard sayfasında bulunan "Affiliate Users Başlık Yazı Elementi"
    @FindBy(xpath = "//a[@class='nav-link p-0 active']")
    public WebElement affiliateUsersText;

    //Dashboard sayfasında soldaki menüde bulunan "Currencies Yazı Elementi"
    @FindBy(xpath = "//span[text()='Currencies']")
    public WebElement currenciesWebElement;

    //Currencies sayfasindaki sonuc adedi yazisinin webelementi
    @FindBy(xpath = "//div[@class='text-muted ms-sm-3 pagination-record']")
    public WebElement numberOfCurrenciesText;

    // Affiliate Users sayfasındaki Affiliate By sutunundaki tum  elementler
    @FindBy(xpath = "//tr//td[1]")
    public List<WebElement> affiliatedByListElement;

    // Affiliate Users sayfasındaki User sutunundaki tum  elementler
    @FindBy(xpath = "//tr//td[2]")
    public List<WebElement> userListElement;

    //Affiliate Users sayfasındaki Affiliation Amount sutunundaki tum  elementler
    @FindBy(xpath = "//tr//td[3]")
    public List<WebElement> amountListElement;

    //Affiliate Users sayfasındaki Date sutunundaki tum  elementler
    @FindBy(xpath = "//tr//td[4]")
    public List<WebElement> dateListElement;

    // Affiliation Transactions sayfasındaki User sutunundaki tum  elementler
    @FindBy(xpath = "//tr//td[1]")
    public List<WebElement> userTransactionsListElement;

    // Affiliation Transactions sayfasındaki Amount sutunundaki tum  elementler
    @FindBy(xpath = "//tr//td[2]")
    public List<WebElement> amountTransactionsListElement;

    //Affiliation Transactions sayfasındaki Approvel Status sutunundaki tum  elementler
    @FindBy(xpath = "//tr//td[3]")
    public List<WebElement> approvelStatusTransactionsListElement;

    //Affiliation Transactions sayfasındaki Date sutunundaki tum  elementler
    @FindBy(xpath = "//tr//td[4]")
    public List<WebElement> dateTransactionsListElement;

    //Affiliation Transactions sayfasındaki Action sutunundaki tum  elementler
    @FindBy(xpath = "//tr//td[5]")
    public List<WebElement> actionTransactionsListElement;
}

