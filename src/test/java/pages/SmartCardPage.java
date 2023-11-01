package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SmartCardPage {
    public SmartCardPage() {
        PageFactory.initElements(Driver.getDriver(), this);    }

    //Header bolumu WebElementleri
    @FindBy(xpath = "//*[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']")
    public WebElement ilkSingnInButonu;
    @FindBy(linkText = "Contact")
    public WebElement contactButonu;
    @FindBy(linkText = "Pricing")
    public WebElement pricingButonu;
    @FindBy(linkText = "About")
    public WebElement aboutButonu;
    @FindBy(id = "frontAboutTabUsTab")
    public WebElement aboutButonuAktifElementi;
    @FindBy(linkText = "Features")
    public WebElement featuresButonu;
    @FindBy(linkText = "Home")
    public WebElement homeButonu;
    @FindBy(xpath = "//*[@class='col-lg-3 col-sm-8 col-5 order-lg-1 order-0']")
    public WebElement smartCardLinkLogosu;
    @FindBy(id = "email")
    public WebElement emailKutusu;
    @FindBy(id = "password")
    public WebElement passwordKutusu;
    @FindBy(xpath = "//*[@aria-label='Next']")
    public WebElement tarifeIleriTusu;
    @FindBy(xpath = "//*[@class='slick-prev slick-arrow']")
    public WebElement tarifeGeriTusu;
    @FindBy(id = "slick-slide00")
    public WebElement tarifeStandardElementi;
    @FindBy(linkText = "Features")
    public WebElement featuresButonuAktifElementi;
    @FindBy(linkText = "Subscribe")
    public WebElement subscribeYiziElementi;
    @FindBy(id = "dropdownMenuButton1")
    public WebElement dilSecimMenusu;
    //Body bolumu Webelementleri
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement subscribeButonu;
    @FindBy(xpath = "//*[@class='form-control bg-white']")
    public WebElement subscribeEmailBox;
    @FindBy(linkText = "Get Started")
    public WebElement getStartedButonu;
    //Contact us altında bulunan :
    @FindBy(xpath = "//a[text()='+1 987-654-3210']")
    public WebElement telefonNumarasi;
    @FindBy(linkText = "info@smartcardlink.com")
    public WebElement contactEmailYaziElementi;
    @FindBy(id = "name")
    public WebElement contactNameBox;
    @FindBy(id = "email")
    public WebElement contactEmailBox;
    @FindBy(id = "subject")
    public WebElement contactSubjectBox;
    @FindBy(id = "message")
    public WebElement contactMessageBox;
    @FindBy(id = "submit")
    public WebElement mesajgondermeButonu;
    @FindBy(xpath = "//div[@class='toast-progress']")
    public WebElement messageAlindiIletisiElementi;
    @FindBy(id = "slick-slide01")
    public WebElement tarifeSilverElementi;
    @FindBy(id = "slick-slide02")
    public WebElement tarifeGoldElementi;
    @FindBy(id = "slick-slide03")
    public WebElement tarifeUnlimitedElement;
    @FindBy(id = "slick-slide04")
    public WebElement tarifOzgurrasitElement;
    @FindBy(id = "slick-slide05")
    public WebElement tarifTest456Element;
    @FindBy(id = "slick-slide06")
    public WebElement tarifTest438Element;
    @FindBy(id = "slick-slide07")
    public WebElement tarifTest428Element;
    //Us5 icin yeni kayit sayfasi WebElementleri
    @FindBy(linkText = "Create an Account")
    public WebElement createAnAccoutYaziElementi;
    @FindBy(id = "first_name")
    public WebElement firstNameBox;
    @FindBy(id = "last_name")
    public WebElement lastNameBox;
    @FindBy(id = "email")
    public WebElement createAccoutEmailBox;
    @FindBy(id = "password")
    public WebElement createAccoutPasswordBox;
    @FindBy(id = "password_confirmation")
    public WebElement createAccoutpassword_confirmationBox;
    @FindBy(id = "privacyPolicyCheckbox")
    public WebElement boxPrivacyPolicyCheck;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement buttonSubmit;


}
