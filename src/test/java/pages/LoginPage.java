package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){

PageFactory.initElements(Driver.getDriver(),this);
        }
//Login sayfasındaki Email kutusu locate'i
@FindBy(xpath = "//input[@id='email']")
public WebElement emailBox;

//Login sayfasındaki Password kutusu locate'i
@FindBy(xpath = "//div[@class='mb-3 position-relative']//input[@id='password']")
public WebElement passwordBox;

////Login sayfasındaki Login kutusu locate'i
@FindBy(xpath = "//button[text()='Login']")
public WebElement loginBox;

//busra

@FindBy(id = "twotabsearchtextbox")
    public WebElement aramakutusu;
@FindBy(xpath = "(//*[contains(@class, 'btn-white')])[1]")
  
    public WebElement signinButton;
@FindBy(xpath = "//div[@class='width-540']")
    public WebElement errorMessage;
@FindBy(xpath = "//span[text()='Settings']")
    public WebElement succesfulEntranceElement;
@FindBy(xpath = "//span[text()='Settings']")
    public WebElement settingsButton;
@FindBy(id = "stripeKey")
    public WebElement stripeKeyFill;
@FindBy(id = "userCredentialSettingBtn")
    public WebElement saveButton;

    //public WebElement errorMessage;
@FindBy(xpath = "//span[text()='Settings']")
    public WebElement basariliGirisElementi;
@FindBy(xpath = "//span[text()='Settings']")
    public WebElement ayarlarButonu;
@FindBy(id = "stripeKey")
    public WebElement stripeKeyBoslugu;
@FindBy(id = "userCredentialSettingBtn")
    public WebElement saveButonu;

@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[2]/div/div/div/div/div[1]")
    public WebElement UpdatedConfirmation;
@FindBy(id = "//button[@id='dropdownMenuButton1' ")
    public WebElement settings;

    //Tugba create an account linki
    @FindBy(xpath = "(//a[@class='link-info fs-6 text-decoration-none'])[2]")
    public WebElement createAnaccountLink;

    //Tugba firstname text box
    @FindBy(xpath ="//input[@id='first_name']")
    public WebElement firstnameTextBox;

    //Tugba lastname text box;
    @FindBy(id = "last_name")
    public WebElement lastnameTextBox;

    //Tugba submit butonu
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    //Tugba policy agreement check box
    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement policyAgreementCheckBox;

    //Tugba confirm password
    @FindBy(id = "password_confirmation")
    public WebElement confirmPassword;







}


