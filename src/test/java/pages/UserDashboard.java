package pages;

import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
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


    // bulent
    @FindBy(linkText = "Enquiries")     // Enquiries Link locate i
    public WebElement enquiriesWE;
    // //tr sadece sutun isimleri
    @FindBy(xpath = "//tr[1]/td[1]")    // VCARD NAME
    public WebElement columnVCardNameWE;
    @FindBy(xpath = "//tr[1]/td[2]")    // NAME
    public WebElement columnNameWE;
    @FindBy(xpath = "//tr[1]/td[3]")    // EMAIL
    public WebElement columnEMailWE;
    @FindBy(xpath = "//tr[1]/td[4]")    // PHONE
    public WebElement columnPhoneWE;
    @FindBy(xpath = "//tr[1]/td[5]")    // CREATED ON Datum
    public WebElement columnCreatedOnWE;
    @FindBy(xpath = "(//*[@class='btn px-1 text-info fs-3 enquiries-view-btn'])[1]")    // Eye Icon
    public WebElement iconEyeWE;

    @FindBy(xpath = "(//*[@class='col-sm-12 mb-5'])[5]")
    public  WebElement labelMessageWE;
    @FindBy(xpath = "(//button[@class='btn-close'])[1]")
    public WebElement closeButtonWE;

    @FindBy(xpath = "(//a[@title='Delete'])[1]")
    public WebElement iconDeleteWE;

    @FindBy(xpath = "//button[text()='Yes, Delete!']")
    public WebElement buttonDeleteYesWE;

    @FindBy(xpath = "//*[@class='col-12 text-muted pagination-record ms-sm-3']")
    public WebElement labelShowingResultWE;

    // VirtualBackGraoung sayfasi
    @FindBy(linkText = "Virtual Backgrounds")
    public WebElement linkVirtualBackgroundWE;

    @FindBy (xpath = "(//*[@class='flip-box-inner'])[1]")
    public WebElement imageFirstCardWE;

    @FindBy (xpath = "//h1[text()='Add Virtual Background']")
    public WebElement labelAddVirtualBackgroundWE;

   @FindBy(xpath = "//*[@title='Select Vcard']")
   // @FindBy(xpath = "//*[@id='select2-e-vcard-id-results']")
    public WebElement comboBoxVCardNameWE;
  @FindBy(xpath = "(//*[contains(@id,'select2-data-select2-e-vcard-id-result')])[1]")
  public WebElement comboBoxListWE;

    @FindBy(xpath = "(//span[@aria-expanded='true'])[1]")
    public WebElement comboBoxVCardNameWE2;

    // textBox lar
    @FindBy (xpath = "//input[@name='first_name']")
    public WebElement textBoxFirstNameWE;

    @FindBy (xpath = "//input[@name='last_name']")
    public WebElement textBoxLastNameWE;
    @FindBy (xpath = "//input[@name='email']")
    public WebElement textBoxEmailWE;
    @FindBy (xpath = "//input[@name='occupation']")
    public WebElement textBoxOccupationWE;

    @FindBy (xpath = "//input[@name='location']")
    public WebElement textBoxLocationWE;

    @FindBy (xpath = "//input[@id='phoneNumber']")
    public WebElement textBoxPhoneNumberWE;
    @FindBy (xpath = "//input[@id='e-card-website']")
    public WebElement textBoxWebsiteWE;

    @FindBy(xpath = "//button[@class='btn btn-primary me-3']")
    public WebElement buttonSaveWE;

    @FindBy(id = "profileImageIcon")
    public WebElement iconChangeProfileImageWE;
    @FindBy(xpath = "//iframe[@name='__privateStripeMetricsController8730']")
    public WebElement iFrameWE;
}
