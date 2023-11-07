package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;



public class AdminDashboard {

    public AdminDashboard() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    //Dashboard sayfasında bulunan "Dashboard Başlık Yazı Elementi"
    @FindBy(xpath = "//a[@class='nav-link p-0 active']")
    public WebElement dashboardText;

    //Dashboard sayfasında soldaki menüde bulunan "Affiliation Transactions Yazı Elementi"
    @FindBy(xpath = "//span[text()='Affiliation Transactions']")
    public WebElement affiliationTransactionsElement;

    //Dashboard sayfasında bulunan "Affiliation Transactions Başlık Yazı Elementi"
    @FindBy(xpath = "//a[@class='nav-link p-0 active']")
    public WebElement affiliationTransactionsText;

    //Dashboard sayfasında soldaki menüde bulunan "Affiliate Users Yazı Elementi"
    @FindBy(xpath = "//span[text()='Affiliate Users']")
    public WebElement affiliationUsersElement;

    //Dashboard sayfasında bulunan "Affiliate Users Başlık Yazı Elementi"
    @FindBy(xpath = "//a[@class='nav-link p-0 active']")
    public WebElement affiliateUsersText;

    //Dashboard sayfasında soldaki menüde bulunan "Currencies Yazı Elementi"
    @FindBy(xpath = "//span[text()='Currencies']")
    public WebElement currenciesWebElement;

    //Currencies sayfasindaki sonuc adedi yazisinin webelementi
    @FindBy(xpath = "//div[@class='text-muted ms-sm-3 pagination-record']")
    public WebElement numberOfCurrenciesText;

    // Affiliate Users sayfasındaki Affiliate By sutunundaki tum  elementler
    @FindBy(xpath = "//tr//td[1]")
    public List<WebElement> affiliatedByListElement;

    // Affiliate Users sayfasındaki User sutunundaki tum  elementler
    @FindBy(xpath = "//tr//td[2]")
    public List<WebElement> userListElement;

    //Affiliate Users sayfasındaki Affiliation Amount sutunundaki tum  elementler
    @FindBy(xpath = "//tr//td[3]")
    public List<WebElement> amountListElement;

    //Affiliate Users sayfasındaki Date sutunundaki tum  elementler
    @FindBy(xpath = "//tr//td[4]")
    public List<WebElement> dateListElement;

    // Affiliation Transactions sayfasındaki User sutunundaki tum  elementler
    @FindBy(xpath = "//tr//td[1]")
    public List<WebElement> userTransactionsListElement;

    // Affiliation Transactions sayfasındaki Amount sutunundaki tum  elementler
    @FindBy(xpath = "//tr//td[2]")
    public List<WebElement> amountTransactionsListElement;

    //Affiliation Transactions sayfasındaki Approvel Status sutunundaki tum  elementler
    @FindBy(xpath = "//tr//td[3]")
    public List<WebElement> approvelStatusTransactionsListElement;

    //Affiliation Transactions sayfasındaki Date sutunundaki tum  elementler
    @FindBy(xpath = "//tr//td[4]")
    public List<WebElement> dateTransactionsListElement;

    //Affiliation Transactions sayfasındaki Action sutunundaki tum  elementler
    @FindBy(xpath = "//tr//td[5]")
    public List<WebElement> actionTransactionsListElement;


    //=========================Ertugrul==========================================

    //Admin sayfalarindan "Cash Payments" secenegi elementi
    @FindBy(xpath = "//span[text()='Cash Payments']")
    public WebElement cashPaymentsElement;

    @FindBy(xpath = "//td[@class='text-end']")
    public List<WebElement> planPriceElement;

    //Admin olarak girdikten sonra nakit odeme yapan kullanici sayisini yazisiyla beraber veren element
    @FindBy(xpath = "//div[@class='text-muted ms-sm-3 pagination-record']")
    public WebElement showingResultElement;

    //Admin sayfalarindan "Subscribed User Plans" secenegi elementi
    @FindBy(xpath = "//span[normalize-space()='Subscribed User Plans']")
    public WebElement UserPlanElement;

    //"User name","Plan Name", "Start Date" ve "End Date" barlarinin altindaki kullanici bilgerini getiren WebElement'ler listesi.
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/table[1]/tbody[1]/tr")
    public List<WebElement> userPlanListElement;

    //View tiklama elementi
    @FindBy(xpath = "(//a[@title='View'])[1]")
    public WebElement viewButtonElement;

    @FindBy(xpath = "(//h5[normalize-space()='Subscribed Plan Details'])[1]")
    //Subscribe Plan Details  (//div[@class='modal-header'])[2]
    public WebElement planDetailsTextElement;

    //Subscribe Users Plan'in icinde Edit butonu elementi
    @FindBy(xpath = "//a[@title='Edit']")
    public WebElement usersEditButtonElement;

    //Subscribe Users Plan'in icinde Edit butonuna tiladiktan sonra cikan tarih kutusu elementi
    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement editDateBoxElement;

    @FindBy(xpath = "//span[text()='16']")
    public WebElement changeDateBoxElement;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButtonElement;

    @FindBy(xpath = "//div[@class='toast-title']")
    public WebElement succesTextElement;

    @FindBy(xpath = "//tbody['wire:sortable']")//      //div[@class='row py-3']
    public List<WebElement> userPlanDetailsListElement;

    @FindBy(xpath = "(//span[@class='aside-menu-title'])[8]")
    public WebElement adminPlansButtonElement;

    @FindBy(xpath = "(//tr[@*='text-muted'])[2]")
    public WebElement usersPlanInfoListElement;
    @FindBy(linkText= "New Plan")
    public WebElement newPlanButtonElement;
    @FindBy(xpath = "//input[@placeholder='Enter Plan Name']")
    public WebElement newPlanNameBox;
    @FindBy(xpath = "//input[@id='featureAll']")
    public WebElement selectAllFeatureBox;
    @FindBy(id = "planFormSubmit")
    public WebElement newPlanSaveButton;
    @FindBy(xpath = "(//a[@title='Delete'])[1]")
    public WebElement planPageDeleteButton;
    @FindBy(xpath = "//button[text()='Yes, Delete!']")
    public WebElement planDeleteBoxElement;
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement newPlanControlElement;
    @FindBy(xpath = "//div[@class='text-muted ms-sm-3 pagination-record']")
    public WebElement newPlanResultTextElement;




    //Rumeysa locates

    //testcase32
    @FindBy(xpath = "//*[text()='Coupon Codes']")
    public WebElement couponCodesButton;

    @FindBy(xpath = "//*[text()='Add Coupon Code']")
    public WebElement addCouponCodeButton;

    @FindBy(id = "couponName")
    public WebElement couponeNameBox;

    @FindBy(id = "percentageType")
    public WebElement radioButtonPercentage;

    @FindBy(id = "fixedType")
    public WebElement radioButtonFixedType;

    @FindBy(id = "couponDiscount")
    public WebElement couponDiscountBox;

    @FindBy(id = "couponExpireAt")
    public WebElement couponExpireBox;


    @FindBy(xpath = "//*[@class='flatpickr-monthDropdown-months']")
    public WebElement dropDownMonthsYear;

    @FindBy(xpath ="(//*[@class='flatpickr-innerContainer'])[1]" )
    public WebElement calendar;

    @FindBy(xpath ="(//*[@class='dayContainer'])[1]" )
    public WebElement dayContainer;

    @FindBy(xpath ="(//span[@aria-label='November 11, 2023'])[1]" )
    public WebElement boxday1;

    @FindBy(xpath = "//*[@aria-label='December 30, 2023']")
    public WebElement boxday2;

    @FindBy(id = "couponStatus")
    public WebElement couponStatus;

    @FindBy(id = "couponCodeSaveBtn")
    public WebElement saveButton;

    @FindBy(xpath = "(//*[text()='Coupon Codes'])[2]")
    public WebElement CouponcodesText;


    @FindBy(xpath ="//tbody" )
    public List<WebElement> allCouponCodes;

    //Coupon Codes 1.satirdaki tum elementler
    @FindBy(xpath="//tbody/tr[1]")
    public WebElement RowFirst;

    @FindBy(xpath = "//tbody/tr[3]/td[1]")
    public WebElement couponNameSatiri;


    @FindBy(xpath = "(//a[@title='Edit'])[1]")//tbody/tr[3]/td[6]//a[@title='Edit']
    public WebElement editButton;

    @FindBy(xpath = "(//*[@title='Delete'])[1]")//tbody/tr[3]/td[6]//a[@title='Delete']
    public WebElement deleteButton;

    @FindBy(xpath = "//*[@id='changeCouponStatus']")
    public WebElement changeCouponStatusButton;


    @FindBy(linkText = "Coupon Codes")
    public WebElement couponcodesText;

    //Webtable List Element
    @FindBy(xpath = "//tr//td[1])")
    public List<WebElement> birinciSutun;

    @FindBy(xpath = "//tr//td[2])")
    public List<WebElement> ikinciSutun;

    @FindBy(xpath = "//tr//td[3])")
    public List<WebElement> ucuncuSutun;

    @FindBy(xpath = "//tr//td[4])")
    public List<WebElement> dorduncuSutun;

    @FindBy(xpath = "//tr//td[5])")
    public List<WebElement> besinciSutun;

    @FindBy(xpath = "//tr//td[6])")
    public List<WebElement> altinciSutun;



    //testcase34
    @FindBy(xpath = "//*[@class='nav-item active']")
    public WebElement subscriedUserPlansButton;


    @FindBy(xpath = "//a[@title='View']")
    public WebElement viewButton;

    @FindBy(xpath = "//*[text()='Front CMS']")
    public WebElement frontCMSButton;

    @FindBy(partialLinkText = "Subscribers")
    public WebElement subscribersLink;

    @FindBy(xpath = "//div[@class='text-muted ms-sm-3 pagination-record']")
    public WebElement subscribersResult;

    @FindBy(xpath = "//tbody//tr")
    public WebElement rowFirst;

    @FindBy(xpath = "//th[2]")
    public WebElement columnAction;

    //testcase35

    @FindBy(partialLinkText = "Testimonials")
    public WebElement testimonialsLink;

    @FindBy(partialLinkText = "Enquiries")
    public WebElement enquiriesLink;

    @FindBy(id = "addTestimonialBtn")
    public WebElement addTestimonialButton;

    @FindBy(xpath = "//*[@id='name']")
    public WebElement testimonialNameBox;

    @FindBy(id = "description")
    public WebElement testimonialDescriptionBox;

    @FindBy(xpath = "(//*[@data-placement='top'])[2]")
    public WebElement testimonialsChangeImageIcon;

    @FindBy(id = "testimonialSave")
    public WebElement testimonialsSaveButton;

    @FindBy(xpath = "(//*[@role='img'])[26]")
    public WebElement testimonialsViewButton;
    @FindBy(xpath = "(//*[@role='img'])[27]")
    public WebElement testimonialsEditButton;
    @FindBy(xpath = "(//*[@role='img'])[26]")
    public WebElement testimonialsDeleteButton;

    @FindBy(xpath = "//*[@class='position-relative d-flex width-320']")
    public WebElement searchBox;

    // ========Esref_28-30-33=========//

    //Dashboard sayfasında bulunan "Withdraw Transactions" yazi elementi
    @FindBy(xpath = "(//span[@class='aside-menu-title'])[11]")
    public WebElement withdrawTransactionsElement;

//Withdraw Transactions sayfasindaki User sutundaki tum elementler
    @FindBy(xpath = "//tr//td[1]")
    public List<WebElement> withdrawTransactionsUserElement;

    //Withdraw Transactions sayfasindaki Amount sutundaki tum elementler
    @FindBy(xpath = "//tr//td[2]")
    public List<WebElement> withdrawTransactionsAmountElement;

    //Withdraw Transactions sayfasindaki PAYMENT TYPE sutundaki tum elementler
    @FindBy(xpath = "//tr//td[3]")
    public List<WebElement> withdrawTransactionsPaymentTypeElement;

    //Withdraw Transactions sayfasindaki Date sutundaki tum elementler
    @FindBy(xpath = "//tr//td[4]")
    public List<WebElement> withdrawTransactionsDateElement;

//Dashboard sayfasında bulunan "Countries" yazi elementi
    @FindBy(xpath = "(//span[@class='aside-menu-title'])[13]")
    public WebElement countriesElement;

    //Countries sayfasindaki ic countries yazi elementi
    @FindBy(xpath = "(//a[@href='https://qa.smartcardlink.com/sadmin/countries'])[2]")
    public WebElement sayfaninIcindekiCountriesElement;

    //Countries sayfasindaki sonuc  yazisi elementi
    @FindBy(xpath = "//div[@class='text-muted ms-sm-3 pagination-record']")
    public WebElement countriesSonucYaziElement;

    //Countries sayfasindaki "States" yazisi elementi
    @FindBy(xpath = "//a[@href='https://qa.smartcardlink.com/sadmin/states']")
    public WebElement statesElement;

    //Countries sayfasindaki States sonuc  yazisi elementi
    @FindBy(xpath = "(//div[@class='text-muted ms-sm-3 pagination-record'])[1]")
    public WebElement statesSonucYaziElement;

    //Countries sayfasindaki "Cities" yazi elementi
    @FindBy(xpath = "(//a[normalize-space()='Cities'])[1]")
    public WebElement citiesElement;

    //Countries sayfasindaki Cities sonuc  yazisi elementi
    @FindBy(xpath = "//div[@class='text-muted ms-sm-3 pagination-record'] ")
    public WebElement citiesSonucYaziElement;

    //Countries sayfasindaki "New Country" yazi elementi
    @FindBy(xpath = "//a[@class='btn btn-primary ms-auto']")
    public WebElement newCountryElement;

    //Countries sayfasindaki  New Contry altinda Name yazi elementi
    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    public WebElement newCountryNameElement;

    //Countries sayfasindaki New Contry altinda Short Code yazi elementi
    @FindBy(xpath = "(//input[@class='form-control'])[3]")
    public WebElement newCountryShortCodeElement;

    //Countries sayfasindaki New Contry altinda Phone Code yazi elementi
    @FindBy(xpath = "(//input[@class='form-control'])[4]")
    public WebElement newCountryPhoneCodeElement;

    //Countries sayfasindaki New Contry altinda Save yazi elementi
       @FindBy(xpath = "(//button[@type='submit'])[1]")
       public WebElement newCountrySaveElement;

    // Countries sayfasindaki 2.satirdaki yeni ulke elemeti
    @FindBy(xpath = "(//tr//td)[1]")
    public WebElement newCountryEklemeElementi;

    //State sayfasindaki "New State" yazi elementi
    @FindBy(xpath = "//a[@class='btn btn-primary ms-auto']")
    public WebElement newStateElement;

    //State sayfasindaki  New State altinda Name yazi elementi
    @FindBy(xpath = "(//input[@id='name'])[1]")
    public WebElement newStateNameElement;

    //State sayfasindaki  New State altinda Select Country yazi elementi
    @FindBy(xpath = "(//span[@id='select2-countryState-container'])[1]")
    public WebElement selectCountryElement;

    //State sayfasindaki  New State altinda Select Country yazi elementi
    @FindBy(xpath = "(//input[@role='searchbox'])[1]")
    public WebElement selectSearchbox;

    //State sayfasindaki New State altinda Save yazi elementi
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement newStateSaveElement;

    // State sayfasindaki 2.satirdaki yeni sehir elemeti
    @FindBy(xpath = "(//tr//td)[1]")
    public WebElement newStateEklemeElement;

    //Cities sayfasinda New City tiklanir
    @FindBy(xpath = "(//a[normalize-space()='New City'])[1]")
    public WebElement newCitylement;

    //New City sayfasinda Name buslugu tiklanir
    @FindBy(xpath = "(//input[@id='name'])[1]")
    public WebElement newCityNameElement;

    //New City sayfasinda Select State buslugu tiklanir
    @FindBy(xpath = "(//span[@id='select2-StateCity-container'])[1]")
    public WebElement selectStateElement;

    //New City sayfasinda Select State  box  tiklanir
    @FindBy(xpath = "(//input[@role='searchbox'])[1]")
    public WebElement selectStateBox;

    //New City sayfasinda Save  tiklanir
    @FindBy(xpath = "(//button[@id='btnSave'])[1]")
    public WebElement citySaveButton;

    // Cities sayfasindaki 2.satirdaki yeni sehir elemeti
    @FindBy(xpath = "(//tr//td)[1]")
    public WebElement newCityEklemeElement;

    //delete
    @FindBy(xpath = "(//a[@title='Delete'])[1]")
    public WebElement delete;

    //Silme ok secme
    @FindBy(xpath = "(//button[normalize-space()='Yes, Delete!'])[1]")
    public WebElement deleteYes;

    //Front Cms elementi basligi
    @FindBy(xpath = "(//span[@class='aside-menu-title'])[16]")
    public WebElement frontCmsElementi;

    //Front CMS sayfasında bulunan "Features" yazi elementi
    @FindBy(xpath = "//a[normalize-space()='Features']")
    public WebElement featuresElement;

    //Front CMS sayfasında bulunan "About Us" yazi elementi
    @FindBy(xpath = "//a[normalize-space()='About Us']")
    public WebElement aboutUsElement;



    //Eyyup yilmaz
    @FindBy(xpath = "//input[@id='email']")
    public WebElement adminEmailButton;

    //Eyyup yilmaz
    @FindBy(xpath = "//input[@id='password']")
    public WebElement adminPasswordButton;

    //Eyyup yilmaz
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement adminLoginButton;

    //Eyyup yilmaz
    @FindBy(xpath = "//a[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']")
    public WebElement ilkSignInButton;

    //Eyyup yilmaz
    @FindBy(xpath = "//button[@id='dropdownMenuButton1']")
    public WebElement adminMenuDrop;



    //Eyyup yilmaz
    @FindBy(xpath = "(//span[normalize-space()='Users'])[1]")
    public WebElement UsersButton;

    //Eyyup yilmaz
    @FindBy(xpath = "//div[@class='d-flex flex-column']")
    public WebElement kayitliKullanicilar;

    //Eyyup yilmaz
    @FindBy(xpath = "//div[@class='text-muted ms-sm-3 pagination-record']")
    public WebElement kullaniciSayisi;

    //Eyyup yilmaz
    @FindBy(xpath = "(//*[name()='svg'][@role='img'])[48]")
    public WebElement editButton1;

    //Eyyup yilmaz
    @FindBy(xpath = "(//input[@id='userFirstName'])[1]")
    public WebElement editFirstName;

    //Eyyup yilmaz
    @FindBy(xpath = "(//input[@id='userLastName'])[1]")
    public WebElement editLastName;


    //Eyyup yilmaz
    @FindBy(xpath = "(//input[@value='Save'])[1]")
    public WebElement editSaveButton;

    //Eyyup yilmaz
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement changeTest;

    //Eyyup yilmaz
    @FindBy(xpath = "//div[@class='swal-text']")
    public WebElement deleteIsSuccess;

    //Eyyup yilmaz
    @FindBy(xpath = "(//a[@title='Delete'])[3]")
    public WebElement deleteButton1;

    //Eyyup yilmaz
    @FindBy(xpath = "(//button[normalize-space()='Yes, Delete!'])[1]")
    public WebElement yesDeleteButton;


    //Eyyup yilmaz
    @FindBy(xpath = "(//a[normalize-space()='Add User'])[1]")
    public WebElement adUsserButton;

    //Eyyup yilmaz
    @FindBy(xpath = "(//input[@id='userFirstName'])[1]")
    public WebElement addUsserFirstName;

    //Eyyup yilmaz
    @FindBy(xpath = "(//input[@id='userLastName'])[1]")
    public WebElement addUsserlastname;

    //Eyyup yilmaz
    @FindBy(xpath = "(//input[@id='email'])[1]")
    public WebElement addUsserEmail;


    //Eyyup yilmaz
    @FindBy(xpath = "(//input[@id='phoneNumber'])[1]")
    public WebElement addUssserphone;


    //Eyyup yilmaz
    @FindBy(xpath = "(//input[@id='password'])[1]")
    public WebElement addUsserPassword;

    //Eyyup yilmaz
    @FindBy(xpath = "(//input[@id='cPassword'])[1]")
    public WebElement adUsserConfirmPassword;

    //Eyyup yilmaz
    @FindBy(xpath = "(//span[@id='select2-plan-container'])[1]")
    public WebElement addUsserPlan;

    //Eyyup yilmaz
    @FindBy(xpath = "(//input[@value='Save'])[1]")
    public WebElement addUsserSave;

    //Eyyup yilmaz
    @FindBy(xpath = "(//div[@role='alert'])[1]")
    public WebElement addUsserSuccess;

    //Eyyup yilmaz
    @FindBy(xpath = "(//*[name()='svg'][@role='img'])[32]")
    public WebElement changePassword;

    //Eyyup yilmaz
    @FindBy(xpath = "(//input[@placeholder='New Password'])[2]")
    public WebElement newPasswordBox1;

    //Eyyup yilmaz
    @FindBy(xpath = "(//input[@id='confirm_password'])[2]")
    public WebElement newPasswordBox2;

    //Eyyup yilmaz
    @FindBy(xpath = "//button[@id='UserPasswordChangeBtn']")
    public WebElement changePasswordSavebutton;

    //Eyyup yilmaz
    @FindBy(xpath = "//*[@class='toast-title']")
    public WebElement newPasswordSuccessButton;

    //Eyyup yilmaz
    @FindBy(xpath = "(//a[@data-turbo='false'][normalize-space()='Impersonate'])[1]")
    public WebElement impersonateButton;

    //Eyyup yilmaz
    @FindBy(xpath = "//div[@class='col-xxl-3 col-xl-4 col-sm-6 widget']")
    public WebElement userkart;


    //Eyyup yilmaz
    @FindBy(xpath = "//span[@class='text-primary']")
    public WebElement adminLogo;



    //Tugba >> Affiliation Transactions >>Approval Status >> Approve >> cash payment box >> save btn >> close
    @FindBy(xpath = "(//button[@class='btn-close'])[5]")
    public WebElement AffiliationsSaveBtnClose;

    //Tugba >> admin acilir menu
    @FindBy(id = "dropdownMenuButton1")
    public WebElement adminUserDropDown;

    //Tugba >> userpage acilir menu >> sign out
    @FindBy(xpath = "//span[@class='dropdown-icon me-4 text-gray-600']/following-sibling::span[contains(text(),'Sign Out')]")
    public WebElement userMenuSignOut;
    //Tugba >> Affiliation Transactions >> Approval Status >> Approve
    @FindBy(id = "approveWithdrawalBtn")
    public WebElement AffiliationsApprovalApprove;
    //Tugba >> Affiliation Transactions >>Approval Status >> Approve >> cash payment box
    @FindBy(id = "select2-withdrawPaymentMethod-container")
    public WebElement AffiliationsCashpaymentBox;
    //Tugba >>Affiliation Transactions >>Approval Status >> Approve >> cash payment box >> cash payment option
    @FindBy(xpath = "//li[text()='Cash Payment']")
    public WebElement AffiliationsCashPaymentOption;

    //Tugba >> Affiliation Transactions Linki
    @FindBy(xpath = "(//span[@class='aside-menu-title'])[10]")
    public WebElement AffiliationTransactionLink;

    //Tugba >> Affiliation Transactions >> Approval Status
    @FindBy(xpath = "//button[@id='dropdownMenuLink']")
    public WebElement AffiliationApprovalStatus;

    //Tugba >> Affiliation Transactions >>Approval Status >> Approve >> cash payment box >> save btn
    @FindBy(id = "approveWithdrawalStatus")
    public WebElement AffiliationsPaymentSaveBtn;





}

