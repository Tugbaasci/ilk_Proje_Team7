package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserDashboard {

    public UserDashboard(){
        PageFactory.initElements(Driver.getDriver(),this);}
    // Homepage>> SignInButton>>
    @FindBy(xpath = "(//a[@class='btn btn-white fs-18 ms-3 d-lg-block d-none'])[1]")
    public WebElement signInButton;

    //Homepage>> SignInButton>>EmailButton>>
    @FindBy(xpath = "//input[@id='email']")
    public  WebElement emailButton;

    //Homepage>> SignInButton>>PasswordButton>>
    @FindBy(xpath = "//input[@id='password']")
    public  WebElement passwordButton;

    //Homepage>> SignInButton>>PasswordButton>>LoginButton>>
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public  WebElement loginButton;

    //Homepage>> SignInButton>>PasswordButton>>LoginButton>>Dashboard>>
    @FindBy(xpath = "//a[@class='nav-link p-0 active']")
    public  WebElement dashboardElement;

    //Homepage>> SignInButton>>PasswordButton>>LoginButton>>Dashboard>>Vcards
    @FindBy(xpath = "(//a[@class='nav-link d-flex align-items-center py-3'])[2]")
    public  WebElement vcardsElement;

    //Homepage>> SignInButton>>PasswordButton>>LoginButton>>Dashboard>>Enquiries
    @FindBy(xpath = "(//a[@class='nav-link d-flex align-items-center py-3'])[3]")
    public  WebElement enquiriesElement;

    //Homepage>> SignInButton>>PasswordButton>>LoginButton>>Dashboard>>Appointments
    @FindBy(xpath = "(//a[@class='nav-link d-flex align-items-center py-3'])[4]")
    public  WebElement appointmentsElement;

    //Homepage>> SignInButton>>PasswordButton>>LoginButton>>Dashboard>>VirtualBackrounds
    @FindBy(xpath = "(//a[@class='nav-link d-flex align-items-center py-3'])[5]")
    public  WebElement virtualBackroundsElement;

    //Homepage>> SignInButton>>PasswordButton>>LoginButton>>Dashboard>>Settings
    @FindBy(xpath = "(//a[@class='nav-link d-flex align-items-center py-3'])[6]")
    public  WebElement settingsElement;

    //Homepage>> SignInButton>>PasswordButton>>LoginButton>>UserNameButton
    @FindBy (xpath = "//button[@id='dropdownMenuButton1']")
    public WebElement userNameButton;

    //Homepage>> SignInButton>>PasswordButton>>LoginButton>>UserNameButton>>ChangePassword
    @FindBy (xpath = "//a[@id='changePassword']")
    public WebElement changePasswordButton;

    //Homepage>> SignInButton>>PasswordButton>>LoginButton>>UserNameButton>>ChangePassword>>CurrentPassword
    @FindBy (xpath = "//input[@id='current_password']")
    public WebElement currentPasswordButton;

    //Homepage>> SignInButton>>PasswordButton>>LoginButton>>UserNameButton>>ChangePassword>>NewPassword
    @FindBy (xpath = "//input[@id='new_password']")
    public WebElement newPasswordButton;

    //Homepage>> SignInButton>>PasswordButton>>LoginButton>>UserNameButton>>ChangePassword>>ConfirmPassword
    @FindBy (xpath = "//input[@id='confirm_password']")
    public WebElement confirmPasswordButton;

    //Homepage>> SignInButton>>PasswordButton>>LoginButton>>UserNameButton>>ChangePassword>>ConfirmPassword>>ChangePasswordSaveButton
    @FindBy (xpath = "//button[@id='passwordChangeBtn']")
    public WebElement changePasswordSaveButton;

    //Homepage>> SignInButton>>PasswordButton>>LoginButton>>UserNameButton>>ChangeLanguage
    @FindBy (xpath = "//a[@id='changeLanguage']")
    public WebElement changeLanguageButton;


    //Homepage>> SignInButton>>PasswordButton>>LoginButton>>UserNameButton>>ChangeLanguage>>ChangeLanguageSearchBoxButton
    @FindBy(xpath = "//*[@id='selectLanguage']")
    public WebElement selectlang;

    //Homepage>> SignInButton>>PasswordButton>>LoginButton>>UserNameButton>>ChangeLanguage>>ChangeLanguageSearchBoxButton>>ChangeLanguageSaveButton
    @FindBy (xpath = "//button[@id='languageChangeBtn']")
    public WebElement changeLanguageSaveButton;

    @FindBy(className = "toast-message")
    public WebElement warningMessage;


    //Homepage>> SignInButton>>PasswordButton>>LoginButton>>UserNameButton>>SignOut
    @FindBy (xpath = "//span[normalize-space()='Sign Out']")
    public WebElement signOutButton;

    //Homepage>> SignInButton>>PasswordButton>>LoginButton>>UserNameButton>>SignOut>>SignInPage
    @FindBy (xpath = "//form[@method='POST']")
    public WebElement successfulSignOutElement;

    //Homepage>> SignInButton>>PasswordButton>>LoginButton>>UserNameButton>>ManageSubscribtionButton
    @FindBy (xpath = "(//a[@class='dropdown-item text-gray-900'])[2]")
    public WebElement manageSubscribtionButton;

    //Homepage>> SignInButton>>PasswordButton>>LoginButton>>UserNameButton>>ManageSubscribtionButton>>
    // ManageSubscibtionPage
    @FindBy (xpath = "//a[@class='nav-link p-0 active']")
    public WebElement manageSubscribtionPage;

    //Homepage>> SignInButton>>PasswordButton>>LoginButton>>UserNameButton>>ManageSubscribtionButton>>
    // UpgradePlanButton
    @FindBy (xpath = "//a[@class='btn btn-primary']")
    public WebElement upgradePlanButton;

    //Homepage>> SignInButton>>PasswordButton>>LoginButton>>UserNameButton>>ManageSubscribtionButton>>
    // UpgradePlanButton>>SwitchPlanButton
    @FindBy (xpath = "(//a[@class='btn btn-primary rounded-pill mx-auto '][normalize-space()='Switch Plan'])[2]")
    public WebElement switchPlanButton;

    @FindBy(xpath = "//h1[normalize-space()='Payment']")
    public WebElement paymentYazisi;

    //Homepage>> SignInButton>>PasswordButton>>LoginButton>>UserNameButton>>ManageSubscribtionButton>>
    // UpgradePlanButton>>SwitchPlanButton>>SelectPaymentGateway
    @FindBy (xpath = "//select[@class='form-select select2-hidden-accessible']")
    public WebElement selectPaymentGateway;

    //Homepage>> SignInButton>>PasswordButton>>LoginButton>>UserNameButton>>ManageSubscribtionButton>>
    // UpgradePlanButton>>SwitchPlanButton>>SelectPaymentGateway>>Pay/SwitchPlan
    @FindBy (xpath = "(//button[@class='btn btn-primary rounded-pill mx-auto d-block makePayment'])[2]")
    public WebElement paySwitchPlan;

    //cardInformation
    @FindBy (xpath = "//input[@aria-label='Card number']")
    public WebElement CardInformationButton;

    //countryName
    @FindBy (xpath = "(//select[@id='billingCountry'])[1]")
    public WebElement countryName;

    //cpostCode
    @FindBy (xpath = "//select[@id='billingCountry']")
    public WebElement postCode;

    //Homepage>> SignInButton>>PasswordButton>>LoginButton>>UserNameButton>>ManageSubscribtionButton>>
    // UpgradePlanButton>>SwitchPlanButton>>SelectPaymentGateway>>PayButton
    @FindBy (xpath = "//div[@class='SubmitButton-IconContainer']")
    public WebElement payButton;



    //Homepage>> SignInButton>>PasswordButton>>LoginButton>>UserNameButton>>ManageSubscribtionButton>>
    // UpgradePlanButton>>SwitchPlanButton>>SelectPaymentGateway>>Pay/SwitchPlan>>PaymentSuccessful
    @FindBy (xpath = "//h1[@class='payment-title mb-3']")
    public WebElement paymentSuccessful;


    //addYourNotes
    @FindBy(xpath = "//textarea[@placeholder='Add Your Notes']")
    public WebElement addYourNotes;


    //cashPay
  //  @FindBy(xpath = "//button[@type='submit']")
    @FindBy(xpath = "//button[normalize-space()='Cash Pay']")
    public  WebElement cashPayButton;



    //Login olunca ksisiel fptnun yanindaki acilir menu;
    @FindBy(xpath = "//button[@id='dropdownMenuButton1']")
    public WebElement kisiselIsimAcilirMenu;

    //Dashboard header
    @FindBy(id = "nav-header")
    public WebElement headerDashboard;

    //Homepage>> SignInButton>>PasswordButton>>LoginButton>>UserNameButton>>AccountSettings
    @FindBy(xpath = "//a[@class='dropdown-item text-gray-900']")
    public  WebElement accountSettingsElement;

    //Homepage>> SignInButton>>PasswordButton>>LoginButton>>UserNameButton>>AccountSettings>>ProfileDetails
    @FindBy(xpath = "(//a[normalize-space()='Profile Details'])[1]")
    public  WebElement profileDetailsElement;

}



