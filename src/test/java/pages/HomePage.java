package pages;

import org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi;
import org.checkerframework.framework.qual.QualifierForLiterals;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
public  HomePage(){PageFactory.initElements(Driver.getDriver(),this);}


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
