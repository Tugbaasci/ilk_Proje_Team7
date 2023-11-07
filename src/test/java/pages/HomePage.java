package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

      //samet


    // HomePage Contact Butonu
    @FindBy(xpath = "//a[normalize-space()='Contact']")
    public WebElement ContactTabElementi;

    // Homepage Footer Contact US Yazi Elementi
    @FindBy(xpath = "//h2[@class='heading text-success text-center margin-b-80px mb-5']")
    public WebElement ContactUSElement;

    //HomePage sayfasindaki Logo
    @FindBy(xpath = "//img[@alt='company-logo']")
    public WebElement actualLogoElement;

    //HomePage SignIn Butonu
    @FindBy(xpath = "//a[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']")
    public WebElement SigInButton;

    //HomePage sayfasindaki Logo Elementi
    @FindBy(xpath = "//img[@class='img-fluid navbar-logo']")
    public WebElement logoHomePage;

    //Login sayfasındaki Email kutusu
    @FindBy(xpath = "//input[@type='email']")
    public WebElement EmailBox;

    // Login sayfasındaki Password kutusu
    @FindBy(xpath = "//input[@type='password']")
    public WebElement PasswordBox;

    // Login sayfasındaki Login Butonu
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement LogInButton;

    //Adminpage AdminKullanicisi Menusundeki Dropdown Elementi
    @FindBy(xpath = "//a[@class='nav-link p-0 active']")
    public WebElement AdminDashboard;

    //Adminpage AdminKullanicisi Menusundeki ExitClick Elementi
    @FindBy(xpath = "//button[@id='dropdownMenuButton1']")
    public WebElement DropdownExitPanel;

    //Adminpage AdminKullanicisi Menusundeki Sign Out Elementi
    @FindBy(xpath = "(//span[@class='dropdown-icon me-4 text-gray-600'])[4]")
    public WebElement LogOutbutton;

    //AdminPage Diller Sekmesi
    @FindBy(xpath = "(//span[@class='aside-menu-title'])[14]")
    public WebElement LanguagesButton;

    //Adminpage GosterilenDiller Yazi Elementi
    @FindBy(xpath = "//div[@class='col-12 text-muted pagination-record ms-sm-3']")
    public WebElement LanguagesResultElement;

    // Adminpage ActiveUsers Yazi Elementi
    @FindBy(xpath = "(//h2[@class='fs-1-xxl fw-bolder text-white'])[1]")
    public WebElement ActiveUsersElement;

    // Adminpage InActiveUsers Yazi Elementi
    @FindBy(xpath = "(//h2[@class='fs-1-xxl fw-bolder text-white'])[3]")
    public  WebElement InActiveUsers;

    //AdminPage ActiveVCards Elementi
    @FindBy(xpath = "(//h2[@class='fs-1-xxl fw-bolder text-white'])[2]")
    public WebElement ActiveVcardsElement;

    //AdminPage InActiveVCards Elementi
    @FindBy(xpath = "(//h2[@class='fs-1-xxl fw-bolder text-white'])[4]")
    public WebElement InActiveVcardsElement;

    //AdminPage PlanRatesGraphic Elementi
    @FindBy(xpath = "//canvas[@id='dashboardPlanPieChart']")
    public WebElement PlanRatesGraphElement;

    // AdminPage RevenueGraphic Elementi
    @FindBy(xpath = "//canvas[@id='dashboardIncomeChart']")
    public WebElement RevenueGraphElement;

    //AdminPage Gunluk Kullanici Elementi
    @FindBy (xpath = "//button[@id='overview-tab']")
    public WebElement DailyUsersElement;

    // AdminPage Aylik Kullanici Elementi
    @FindBy(xpath = "//button[@id='monthData']")
    public WebElement MonthlyUsersElement;

    // AdminPage Haftalik Kullanici Elementi
    @FindBy(xpath = "//button[@id='vweekData']")
    public WebElement WeeklyUseersElement;

    @FindBy(xpath  ="//tbody[@id='dailyReport']")
    public List<WebElement> UsersTabloElement;





    @FindBy(xpath = "//a[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']")//home page/header daki sign in butonu
    public WebElement signinButton;

    // bulent
    // homepage footer bolumundeki simgelerin ve linklerin locate leri
    @FindBy(xpath = "//a[@title='Facebook']")
    public WebElement footerFacebookIcon;
    @FindBy(xpath = "//a[@title='Twitter']")
    public WebElement footerXIcon;
    @FindBy(xpath = "//a[@title='Instagram']")
    public WebElement footerInstagramIcon;
    @FindBy(xpath = "//a[@title='Linkedin']")
    public WebElement footerLinkedInIcon;
    @FindBy(xpath = "//a[@title='Pinterest']")
    public WebElement footerPinterestIcon;
    @FindBy(linkText = "Terms & Conditions")
    public WebElement footerTermsConditions;
    @FindBy (linkText = "Privacy Policy")
    public WebElement footerPrivacyPolicy;
    @FindBy (linkText = "FAQ")
    public WebElement footerFAQ;
    // footer bölümündeki likler ile acilan sayfalarin sayfa ici metinlerinin locate i
    @FindBy (xpath = "//h1[text()='Terms & Conditions']")
    public WebElement termsConditionsWE;
    @FindBy(xpath = "//h1[text()='Privacy Policy']")
    public WebElement privacyPolicyWE;
    @FindBy(xpath = "//h1[text()='Frequently Asked Questions (FAQ)']")
    public WebElement faqWE;





}

