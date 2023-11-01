package pages;


import org.openqa.selenium.WebDriver;

import org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi;
import org.checkerframework.framework.qual.QualifierForLiterals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

//samet


    // HomePage Contact Butonu
    @FindBy(xpath = "//a[normalize-space()='Contact']")
    public WebElement ContactTabElementi;


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

    @FindBy(xpath = "//td[normalize-space()='French'])[1]")
    public WebElement FrenchButton;

    // Adminpage ActiveUsers Yazi Elementi
    @FindBy(xpath = "(//h2[@class='fs-1-xxl fw-bolder text-white'])[1]")
    public WebElement ActiveUsers;

    // Adminpage InActiveUsers Yazi Elementi
    @FindBy(xpath = "(//h2[@class='fs-1-xxl fw-bolder text-white'])[3]")
    public  WebElement InCactiveUsers;


    @FindBy(xpath = "//a[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']")//home page/header daki sign in butonu
    public WebElement signinButton;

    // bulent
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
    @FindBy (xpath = "//h1[text()='Terms & Conditions']")
    public WebElement termsConditionsWE;
    @FindBy(xpath = "//h1[text()='Privacy Policy']")
    public WebElement privacyPolicyWE;
    @FindBy(xpath = "//h1[text()='Frequently Asked Questions (FAQ)']")
    public WebElement faqWE;




}

