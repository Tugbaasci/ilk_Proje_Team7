package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
public  HomePage(){PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath = "//a[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']")//home page/header daki sign in butonu
    public WebElement signinButton;


}
