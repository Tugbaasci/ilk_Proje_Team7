package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserDashboard {
    public UserDashboard(){PageFactory.initElements(Driver.getDriver(),this);}

    //Login olunca ksisiel fptnun yanindaki acilir menu;
    @FindBy(xpath = "//button[@id='dropdownMenuButton1']")
    public WebElement kisiselIsimAcilirMenu;

    //Dashboard header
    @FindBy(id = "nav-header")
    public WebElement headerDashboard;
}
