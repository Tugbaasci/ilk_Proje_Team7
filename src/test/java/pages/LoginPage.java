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
@FindBy(xpath = "//input[@id='password']")
public WebElement passwordBox;

////Login sayfasındaki Login kutusu locate'i
@FindBy(xpath = "//button[text()='Login']")
public WebElement loginBox;

//busra

@FindBy(id = "twotabsearchtextbox")
    public WebElement aramakutusu;
@FindBy(xpath = "(//*[contains(@class, 'btn-white')])[1]")
    public WebElement signinbutton;
@FindBy(xpath = "//div[@class='width-540']")
    public WebElement errorMessage;
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









}


