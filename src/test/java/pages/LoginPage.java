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
}