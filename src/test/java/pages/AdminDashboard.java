package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;



public class AdminDashboard {

    public AdminDashboard() {
        PageFactory.initElements(Driver.getDriver(), this);


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


    //Eyyup yilmaz
    @FindBy(xpath = "//input[@id='email']")
    public WebElement adminEmailButton;

    //Eyyup yilmaz
    @FindBy(xpath = "//input[@id='password']")
    public WebElement adminPasswordButton;

    //Eyyup yilmaz
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement adminLoginButton;

    //Eyyup yilmaz
    @FindBy(xpath = "//a[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']")
    public WebElement ilkSignInButton;

    //Eyyup yilmaz
    @FindBy(xpath = "//button[@id='dropdownMenuButton1']")
    public WebElement adminMenuDrop;



    //Eyyup yilmaz
    @FindBy(xpath = "(//span[normalize-space()='Users'])[1]")
    public WebElement UsersButton;

    //Eyyup yilmaz
    @FindBy(xpath = "//div[@class='d-flex flex-column']")
    public WebElement kayitliKullanicilar;

    //Eyyup yilmaz
    @FindBy(xpath = "//div[@class='text-muted ms-sm-3 pagination-record']")
    public WebElement kullaniciSayisi;

    //Eyyup yilmaz
    @FindBy(xpath = "(//*[name()='svg'][@role='img'])[48]")
    public WebElement editButton;

    //Eyyup yilmaz
    @FindBy(xpath = "(//input[@id='userFirstName'])[1]")
    public WebElement editFirstName;

    //Eyyup yilmaz
    @FindBy(xpath = "(//input[@id='userLastName'])[1]")
    public WebElement editLastName;


    //Eyyup yilmaz
    @FindBy(xpath = "(//input[@value='Save'])[1]")
    public WebElement editSaveButton;

    //Eyyup yilmaz
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement changeTest;

    //Eyyup yilmaz
    @FindBy(xpath = "//div[@class='swal-text']")
    public WebElement deleteIsSuccess;

    //Eyyup yilmaz
    @FindBy(xpath = "(//a[@title='Delete'])[3]")
    public WebElement deleteButton;

    //Eyyup yilmaz
    @FindBy(xpath = "(//button[normalize-space()='Yes, Delete!'])[1]")
    public WebElement yesDeleteButton;


    //Eyyup yilmaz
    @FindBy(xpath = "(//a[normalize-space()='Add User'])[1]")
    public WebElement adUsserButton;

    //Eyyup yilmaz
    @FindBy(xpath = "(//input[@id='userFirstName'])[1]")
    public WebElement addUsserFirstName;

    //Eyyup yilmaz
    @FindBy(xpath = "(//input[@id='userLastName'])[1]")
    public WebElement addUsserlastname;

    //Eyyup yilmaz
    @FindBy(xpath = "(//input[@id='email'])[1]")
    public WebElement addUsserEmail;


    //Eyyup yilmaz
    @FindBy(xpath = "(//input[@id='phoneNumber'])[1]")
    public WebElement addUssserphone;


    //Eyyup yilmaz
    @FindBy(xpath = "(//input[@id='password'])[1]")
    public WebElement addUsserPassword;

    //Eyyup yilmaz
    @FindBy(xpath = "(//input[@id='cPassword'])[1]")
    public WebElement adUsserConfirmPassword;

    //Eyyup yilmaz
    @FindBy(xpath = "(//span[@id='select2-plan-container'])[1]")
    public WebElement addUsserPlan;

    //Eyyup yilmaz
    @FindBy(xpath = "(//input[@value='Save'])[1]")
    public WebElement addUsserSave;

    //Eyyup yilmaz
    @FindBy(xpath = "(//div[@role='alert'])[1]")
    public WebElement addUsserSuccess;

    //Eyyup yilmaz
    @FindBy(xpath = "(//*[name()='svg'][@role='img'])[32]")
    public WebElement changePassword;

    //Eyyup yilmaz
    @FindBy(xpath = "(//input[@placeholder='New Password'])[2]")
    public WebElement newPasswordBox1;

    //Eyyup yilmaz
    @FindBy(xpath = "(//input[@id='confirm_password'])[2]")
    public WebElement newPasswordBox2;

    //Eyyup yilmaz
    @FindBy(xpath = "//button[@id='UserPasswordChangeBtn']")
    public WebElement changePasswordSavebutton;

    //Eyyup yilmaz
    @FindBy(xpath = "//*[@class='toast-title']")
    public WebElement newPasswordSuccessButton;

    //Eyyup yilmaz
    @FindBy(xpath = "(//a[@data-turbo='false'][normalize-space()='Impersonate'])[1]")
    public WebElement impersonateButton;

    //Eyyup yilmaz
    @FindBy(xpath = "//div[@class='col-xxl-3 col-xl-4 col-sm-6 widget']")
    public WebElement userkart;


    //Eyyup yilmaz
    @FindBy(xpath = "//span[@class='text-primary']")
    public WebElement adminLogo;









    }

