package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

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
  
    //Homepage>> SignInButton>>PasswordButton>>LoginButton>>UserNameButton>>AccountSettings
    @FindBy(xpath = "//a[@class='dropdown-item text-gray-900']")
    public  WebElement accountSettingsElement;

    //Homepage>> SignInButton>>PasswordButton>>LoginButton>>UserNameButton>>AccountSettings>>ProfileDetails
    @FindBy(xpath = "(//a[normalize-space()='Profile Details'])[1]")
    public  WebElement profileDetailsElement;
    //Tugba Vcards>> new vcard butonu
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement newVcardButton;

    //Tugba Card url text kutusu
    @FindBy(id = "vcard-url-alias")
    public WebElement urlAliasTextBox;

    //Tugba Card name text kutusu
    @FindBy(xpath = "//*[@id='name']")
    public WebElement cardNameTextBox;

    //Tugba Occupation text kutusu
    @FindBy(id = "occupation")
    public WebElement occupationTextBox;

    //Tugba new vcard save butonu
    @FindBy(id = "vcardSaveBtn")
    public WebElement newVcardSaveButton;

    //Tugba qr_code islem butonu
    @FindBy(xpath = "(//*[@data-icon='qrcode'])[1]")
    public WebElement qrCodeButton;

    //Tugba card download butonu
    @FindBy(xpath = "(//a[@class='btn px-1 text-info fs-3'])[1]")
    public WebElement downloadVCardButton;

    //Tugba Enquiries butonu
    @FindBy(xpath = "(//a[@class='btn px-1 text-info fs-3'])[2]")
    public WebElement enquiriesButton;

    //Tugba edit butonu
    @FindBy(xpath = "(//a[@class='btn px-1 text-primary fs-3'])[1]")
    public WebElement editButton;

    //Tugba delete butonu
    @FindBy(xpath = "(//a[@class='btn px-1 text-danger fs-3 vcard_delete-btn'])[1]")
    public WebElement deleteButton;

    //Tugba duplicate butonu
    @FindBy(xpath = "(//a[@class='duplicate-vcard-btn btn px-1 text-secondary fs-3'])[1]")
    public WebElement duplicateButton;

    //Tugba appointments link under edit vcard
    @FindBy(xpath = "(//a[@class='nav-link p-4 '])[7]")
    public WebElement appointmentsUnderEditVcard;

    //Tugba appointment monday checkbox
    @FindBy(id = "chkShortWeekDay_MON")
    public WebElement appointmentMon;

    //Tugba appointments save butonu;
    @FindBy(xpath = "//button[@class='btn btn-primary me-3']")
    public WebElement appointmentSaveButton;

    //Tugba appointments tablodaki bilgileri listele
    @FindBy(xpath = "//tr//td")
    public List<WebElement> appointmentTableList;

    //Dashboard linki user hesabinda
    @FindBy(xpath = "(//span[@class='aside-menu-title'])[1]")
    public WebElement dashboardLink;

    //Tugba Vcard linki user hesabinda
    @FindBy(xpath = "(//span[@class='aside-menu-title'])[2]")
    public WebElement vcardLink;

    //renkli gosterim kutularindan vcard kutusu sayi yazi elementi
    @FindBy(xpath = "(//h2[@class='fs-1-xxl fw-bolder text-white'])[1]")
    public WebElement vcardCountLabel;

    //Tugba appointments link sol yanda
    @FindBy(xpath = "(//a[@class='nav-link d-flex align-items-center py-3'])[4]")
    public WebElement appointmentsLinkLeft;

    //Tugba hesap isminden acilan menudeki manage subsription linki;
    @FindBy(xpath = "(//a[@class='dropdown-item text-gray-900'])[2]")
    public WebElement manageSubscriptionOption;

    //Tugba manage subscription upgrade plan butonu
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement upGradeButton;

    //Tugba unlimited yazi elementi
    @FindBy(xpath = "(//a[@class='nav-link'])[2]")
    public WebElement unlimitedLabel;

    //Tugba unlimited switch butonu
    @FindBy(xpath = "(//a[@class='btn btn-primary rounded-pill mx-auto '])[4]")
    public WebElement unlimitedSwitchButton;

    //Tugba select payment
    @FindBy(xpath = "(//span[@class='select2-selection select2-selection--single'])[1]")
    public WebElement selectPaymentElementi;

    //Tugba Stripe odeme
    @FindBy(xpath = "//li[text()='Stripe']")
    public WebElement stripePaymentElementi;

    //Tugba odeme seceneginin altindaki switch butonu
    @FindBy(xpath = "(//button[@class='btn btn-primary rounded-pill mx-auto d-block makePayment'])[2]")
    public WebElement switchButtonUnderSelect;

    //Tugba kredikarti numara textbox
    @FindBy(xpath = "//input[@id='cardNumber']")
    public WebElement creditCardNumber;

    //Tugba kredi karti kullanim tarihi
    @FindBy(xpath = "//input[@id='cardExpiry']")
    public WebElement cardDate;
    //Tugba kredi karti CVC numarasi
    @FindBy(xpath = "//input[@id='cardCvc']")
    public WebElement cardCVCnumber;

    //Tugba kredi karti sahibi adi textbox
    @FindBy(xpath = "//input[@id='billingName']")
    public WebElement cardHolderName;

    //Tugba kredi karti bolumundeki ode butonu
    @FindBy(xpath = "//div[@class='SubmitButton-IconContainer']")
    public WebElement creditCardPay;

    //Tugba back to subscription elmenti
    @FindBy(xpath = "//a[@class='btn mt-5 btn-back']")
    public WebElement backToSubscription;

    //Tugba Affiliations linki solda
    @FindBy (xpath = "(//a[@class='nav-link d-flex align-items-center py-3'])[6]")
    public WebElement AffiliationsLink;

    //Tugba Affiliations >> toplam tutar sayi
    @FindBy(xpath = "(//div[@class='text-end text-white'])[1]")
    public WebElement totalAmountCount;

    //Tugba Affiliations >> guncel tutar
    @FindBy(xpath = "(//div[@class='text-end text-white'])[2]")
    public WebElement currentAmountCount;

    //Tugba Affiliations >> copy link
    @FindBy (id = "copyLinkBtn")
    public WebElement copyLinkButton;

    //Tugba Affiliations >> send invite butonu
    @FindBy(xpath = "//a[@class='btn btn-primary sendInviteBtn']")
    public WebElement sendInviteButton;

    //Tugba Send invite >> send email
    @FindBy(xpath = "(//input[@type='email'])[2]")
    public WebElement sendInviteEmailTextBox;

    //Tugba Send invite >> send butonu
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement sendInviteSendEmailButton;

    //Tugba Affiliations >> withdrawal
    @FindBy(xpath = "//button[@id='withdrawal-tab']")
    public WebElement withdrawalLink;

    //Tugba Affiliations >> withdrawal >> withdraw amount
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement withdrawAmount;

    //Tugba Affiliations >> withdrawal >> withdraw amount >> amount
    @FindBy(xpath = "//input[@id='withdrawAmount']")
    public WebElement withdrawAmountEnter;

    //Tugba Affiliations >> withdrawl >> withdraw amount >> verify paypal email
    @FindBy(xpath = "//input[@id='paypalEmail']")
    public WebElement paypalEmail;

    //Tugba Affiliations >> withdrawal >> withdraw amount >> save btn
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement withdrawSaveBtn;

    //Tugba Settings sol kosedeki link
    @FindBy(xpath = "(//a[@class='nav-link d-flex align-items-center py-3'])[7]")
    public WebElement settingsElementi;

    //Tugba Settings >> paypal Email >> save
    @FindBy(xpath = "//button[@id='userCredentialSettingBtn']")
    public WebElement settingsSaveButton;

    //Tugba >> user acilir menu sign out elementi
    @FindBy(xpath = "//span[@class='dropdown-icon me-4 text-gray-600']/following-sibling::span[contains(text(),'Sign Out')]")
    public WebElement signOutElementi;

    //Tugba >> appointments tablosu
    @FindBy(xpath = "//table[@class='table table-striped']")
    public WebElement appointmentsTable;

    //Tugba >> copy link url
    @FindBy(xpath = "//input[@id='urlLink']")
    public WebElement copyInviteUrl;

    //Tugba >> Settings >> save btn
    @FindBy(id = "userCredentialSettingBtn")
    public WebElement SettingsSaveBtn;

    //Tugba >> Settings >> select currency
    @FindBy(xpath = "(//span[@class='selection'])[1]")
    public WebElement selectCurrencyElementi;
    //Settings >> select currency >> euro
    @FindBy(id = "select2-userCurrencySettingId-result-fjis-2")
    public WebElement currencyEuroElement;

    //Tugba Affiliations >> withdrawal >> ilk siradaki approved elementi
    @FindBy(xpath = "(//td[@class='whitespace-nowrap px-3 py-2 md:px-6 md:py-4 text-sm leading-5 text-gray-900 dark:text-white'][2])[8]")
    public WebElement withdrawApprovedElement;



















    //busra
    @FindBy(xpath = "//input[@id='editProfileFirstName'] ")
    public  WebElement settingsNameElement;

    @FindBy(xpath = "//*[@id=\"userProfileEditForm\"]/div[2]")
    public  WebElement settingsSaveElement;


}



