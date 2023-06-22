package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utility.Helper;
import utility.TestLog;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class B2BPompage {

    public static WebDriver driver; //web driver variable
    Helper h = new Helper();

    public static List<TestLog> _testLogs = new ArrayList<>(); //this is needed for the reporting. Excel report class

    //Log In Screen
    @FindBy(xpath = "//input[contains(@name,'username')]") public WebElement _EmailField;
    @FindBy(xpath = "//input[contains(@type,'password')]") public WebElement _PasswordField;
    @FindBy(xpath = "//button[@type='submit']") public WebElement _LogInButton;
    @FindBy(xpath = "//a[@class='link'][contains(.,'Passwort vergessen')]") public WebElement _ForgotPassword;
    //Header
    @FindBy(xpath = "//*[@id=\"host-header\"]/b2b-mfe-header/app-header/div/div/div[2]/b2b-ui-svg") public WebElement _ProfileIcon;
    @FindBy(xpath = "//span[contains(@class,'dropdown-lbl')]") public WebElement _CompanySelector;
        @FindBy(xpath = "//input[contains(@autocomplete,'off')]") public WebElement _CompanySelectorSearch;
        @FindBy(xpath = "//*[@id=\"mat-menu-panel-0\"]/div/app-dropdown-panel/div/div[2]/ul") public WebElement _CompanyList;
        @FindBy(xpath = "(//div[contains(.,'Add new customer')])[8]") public WebElement _CompanyOnboardingENbtn;
        @FindBy(xpath = "(//div[contains(.,'Neuen Kunden hinzufügen')])[8]") public WebElement _CompanyOnboardingDEbtn;
        @FindBy(xpath = "(//div[contains(.,'CREM')])[13]") public WebElement _CompanySearchResult;
        @FindBy(xpath = "//*[@id=\"Modal\"]/app-new-customer-modal/div/div[1]") public WebElement _CompanyOnboardingHeader;
        @FindBy(xpath = "//textarea[contains(@name,'company-name')]") public WebElement _OnboardingTextField;
        @FindBy(xpath = "//*[@id=\"Modal\"]/app-new-customer-modal/div/div[2]/div[2]/button[1]") public WebElement _CancelBtn;
        @FindBy(xpath = "//*[@id=\"Modal\"]/app-new-customer-modal/div/div[2]/div[2]/button[2]") public WebElement _AddCompanyBtn;
        @FindBy(xpath = "//p[contains(@class,'helper-text error-text')]") public WebElement _CompanyOnboardingErrorMsg;
    @FindBy(xpath = "(//div[contains(.,'Deutsch')])[9]") public WebElement _LanguageSelectorDE;
    @FindBy(xpath = "(//div[contains(.,'English')])[10]") public WebElement _LanguageSelectorEN;
    //Footer
    @FindBy(xpath = "//*[@id=\"host-footer\"]/b2b-mfe-footer/app-footer/div/div/div/div/a[1]/b2b-ui-text") public WebElement _AGB;
    @FindBy(xpath = "//*[@id=\"host-footer\"]/b2b-mfe-footer/app-footer/div/div/div/div/a[2]/b2b-ui-text") public WebElement _Impressum;
    @FindBy(xpath = "//*[@id=\"host-footer\"]/b2b-mfe-footer/app-footer/div/div/div/div/a[3]/b2b-ui-text") public WebElement _Datenschutz;
    //Dashboard
    @FindBy(xpath = "//*[@id=\"host-content\"]/b2b-mfe-dashboard/app-dashboard/div/div[1]/b2b-ui-text") public WebElement _MyApps;
    @FindBy(xpath = "(//div[contains(.,'Meine Apps')])[5]") public WebElement _MyAppsDE;
    @FindBy(xpath = "(//div[contains(.,'My Apps')])[5]") public WebElement _MyAppsEN;
    //Profile Icon Selections
    @FindBy(xpath = "(//div[contains(.,'Benutzereinstellungen')])[6]") public WebElement _UserSetting;
    @FindBy(xpath = "(//div[contains(.,'Ausloggen')])[6]") public WebElement _LogOut;
    //User Setting
    @FindBy(xpath = "(//div[contains(.,'Zurück')])[4]") public WebElement _Zuruck;
    @FindBy(xpath = "(//div[contains(.,'Benutzereinstellungen')])[5]") public WebElement _Benutzereinstellungen;
    @FindBy(xpath = "(//div[contains(.,'Zugangsdaten')])[6]") public WebElement _Zugangsdaten;
    @FindBy(xpath = "(//div[contains(.,'Vorname:')])[6]") public WebElement _Vorname;
    @FindBy(xpath = "(//div[contains(.,'Nachname:')])[6]") public WebElement _Nachname;
    @FindBy(xpath = "(//div[contains(.,'E-Mail Adresse:')])[6]") public WebElement _Email;
    @FindBy(xpath = "(//div[contains(.,'Rolle:')])[6]") public WebElement _Rolle;
    @FindBy(xpath = "(//div[contains(.,'Kontakt')])[6]") public WebElement _Kontakt;
    @FindBy(xpath = "(//div[contains(.,'Telefon:')])[6]") public WebElement _Telefon;
    @FindBy(xpath = "//*[@id=\"host-content\"]/b2b-mfe-user-management/app-user-profile/div/div[2]/div/form/div/b2b-ui-button[1]/button") public WebElement _Edit;
    @FindBy(xpath = "(//div[contains(.,'Passwort ändern')])[7]") public WebElement _PasswordReset;
    @FindBy(xpath = "(//div[contains(.,'Aktualisieren')])[7]") public WebElement _Aktualisieren;
    @FindBy(xpath = "//input[@formcontrolname='firstname']") public WebElement _VornameField;
    @FindBy(xpath = "//input[@formcontrolname='lastname']") public WebElement _NachnameField;
    @FindBy(xpath = "//input[@formcontrolname='tel']") public WebElement _TelefonField;
    //Footer




    public B2BPompage(WebDriver _driver) {
        driver = _driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 100);
        PageFactory.initElements(factory, this);
    }

    //Log In page
    public void userLogsIn() throws IOException {
        h.enterEachChar("fritztester01+qa1@gmail.com", h.xwaitForElementVisibility(_EmailField, driver, "enter", "input the username", _testLogs));
        h.enterEachChar("Totoy04256823111!", h.xwaitForElementVisibility(_PasswordField, driver, "enter", "input the password", _testLogs));
        h.xwaitForElementVisibility(_LogInButton, driver, "click", "click log in button", _testLogs).click();
        h.pause(2);
    }

    public void userClicksTheForgotPassword() throws IOException {
        h.xwaitForElementVisibility(_ForgotPassword, driver, "click", "click Forgot Password", _testLogs).click();
    }

    //Header
    public void userClicksTheProfileIcon() throws IOException {
        h.xwaitForElementVisibility(_ProfileIcon, driver, "isDisplayed", "click Profile Icon", _testLogs).isDisplayed();
        _ProfileIcon.click();
        h.pause(8);
    }

    public void userClicksTheCompanySelector() throws IOException {
        h.xwaitForElementVisibility(_CompanySelector, driver, "click", "click Company Selector", _testLogs).click();
        h.pause(2);
    }

            public void userValidatesTheCompanySelector() throws IOException {
                h.xwaitForElementVisibility(_CompanySelectorSearch, driver, "isDisplayed", "Search Box is visible", _testLogs);
                h.xwaitForElementVisibility(_CompanyList, driver, "isDisplayed", "Company List is visible", _testLogs);
                h.xwaitForElementVisibility(_CompanyOnboardingENbtn = _CompanyOnboardingDEbtn, driver, "isDisplayed", "Company Onboarding Button is visible", _testLogs);
                h.pause(2);
            }

            public void userSearchesForACompany() throws IOException {
                h.enterEachChar("CREM",h.xwaitForElementVisibility(_CompanySelectorSearch, driver, "enter", "input the company name", _testLogs));
                h.pause(2);
            }

            public void userClicksTheResult() throws IOException {
                h.xwaitForElementVisibility(_CompanySearchResult, driver, "click", "click the company name", _testLogs).click();
                h.pause(2);
            }

            public void userClicksTheCompanyOnboardingButton() throws IOException {
                h.xwaitForElementVisibility(_CompanyOnboardingDEbtn, driver, "click", "click Company Onboarding Button", _testLogs).click();
                h.pause(2);
            }

            public void userValidatesTheCompanyOnboardingModal() throws IOException {
                h.xwaitForElementVisibility(_CompanyOnboardingHeader, driver, "isDisplayed", "Modal Header is visible", _testLogs);
                h.xwaitForElementVisibility(_OnboardingTextField, driver, "isDisplayed", "Text Field is visible", _testLogs);
                h.xwaitForElementVisibility(_CancelBtn, driver, "isDisplayed", "Cancel Button is visible", _testLogs);
                h.xwaitForElementVisibility(_AddCompanyBtn, driver, "isDisplayed", "Add Button is visible", _testLogs);
            }

            public void userOnboardsACompany() throws IOException {
                h.enterEachChar("TestJune22", h.xwaitForElementVisibility(_OnboardingTextField, driver, "enter", "input the company name", _testLogs));
                h.xwaitForElementVisibility(_AddCompanyBtn, driver, "click", "Add Button is visible", _testLogs).click();
                h.pause(2);
            }

            public void userSeesTheErrorMessage() throws IOException {
                h.xwaitForElementVisibility(_CompanyOnboardingErrorMsg, driver, "isDisplayed", "Error Message is displayed", _testLogs).isDisplayed();
            }


    public void userClicksTheLanguageSelector() throws IOException{
        h.xwaitForElementVisibility(_LanguageSelectorDE, driver, "click", "Click Language Selector", _testLogs).click();
        h.pause(4);
    }

            public void userChoosesEnglish() throws IOException {
                h.xwaitForElementVisibility(_LanguageSelectorEN, driver, "isDisplayed", "Click English Language", _testLogs).isDisplayed();
                _LanguageSelectorEN.click();
                h.pause(4);
            }

            public void userChoosesGerman() throws IOException {
                h.xwaitForElementVisibility(_LanguageSelectorEN, driver, "isDisplayed", "Click English Language", _testLogs).isDisplayed();
                _LanguageSelectorEN.click();
                h.pause(4);
            }

    //Dashboard
    public void userSeesTheDashboard() throws IOException {
        h.xwaitForElementVisibility(_MyApps, driver, "isDisplayed", "user lands to the dashboard", _testLogs);
        h.pause(4);
    }

    //Profile Icon Selections
    public void userSelectsUserSetting() throws IOException {
        h.xwaitForElementVisibility(_UserSetting, driver, "isDisplayed", "click User Setting", _testLogs).isDisplayed();
        _UserSetting.click();
        h.pause(4);
    }

    public void userLogsOut() throws IOException {
        h.xwaitForElementVisibility(_LogOut, driver, "isDisplayed", "click Log out", _testLogs).isDisplayed();
        _LogOut.click();
        h.pause(4);
    }


    //User Setting
    public void validateTheTextsAndButtons() throws IOException {
        h.xwaitForElementVisibility(_Zuruck, driver, "isDisplayed", "Back Button is visible", _testLogs);
        h.xwaitForElementVisibility(_Benutzereinstellungen, driver, "isDisplayed", "User Setting Text Label is visible", _testLogs);
        h.xwaitForElementVisibility(_Zugangsdaten, driver, "isDisplayed", "Zugangsdaten Text Label is visible", _testLogs);
        h.xwaitForElementVisibility(_Vorname, driver, "isDisplayed", "Vorname Text Label is visible", _testLogs);
        h.xwaitForElementVisibility(_Nachname, driver, "isDisplayed", "Nachname Text Label is visible", _testLogs);
        h.xwaitForElementVisibility(_Email, driver, "isDisplayed", "Email Text Label is visible", _testLogs);
        h.xwaitForElementVisibility(_Rolle, driver, "isDisplayed", "Rolle Text Label is visible", _testLogs);
        h.xwaitForElementVisibility(_Kontakt, driver, "isDisplayed", "Kontakt Text Label is visible", _testLogs);
        h.xwaitForElementVisibility(_Telefon, driver, "isDisplayed", "Telefon Text Label is visible", _testLogs);
        h.xwaitForElementVisibility(_Edit, driver, "isDisplayed", "Edit Text Label is visible", _testLogs);
        h.xwaitForElementVisibility(_PasswordReset, driver, "isDisplayed", "PasswordReset Text Label is visible", _testLogs);
    }

    public void userExits() throws IOException {
        h.xwaitForElementVisibility(_Zuruck, driver, "isDisplayed", "click Exit Button", _testLogs).isDisplayed();
        _Zuruck.click();
        h.pause(4);
    }

    public void userClicksTheEditButton() throws IOException {
        h.xwaitForElementVisibility(_Edit, driver, "isDisplayed", "click Edit Button", _testLogs).isDisplayed();
        _Edit.click();
        h.pause(2);
    }

    public void userFillsInTheFields() throws IOException {
        h.enterEachChar("Fritz", h.xwaitForElementVisibility(_VornameField, driver, "enter", "input the First Name", _testLogs));
        h.enterEachChar("Tester", h.xwaitForElementVisibility(_NachnameField, driver, "enter", "input the Last Name", _testLogs));
        h.enterEachChar("09999695607", h.xwaitForElementVisibility(_TelefonField, driver, "enter", "input the Telephone", _testLogs));
        h.pause(2);
    }

    public void userClicksTheSaveButton() throws IOException {
        h.xwaitForElementVisibility(_Aktualisieren, driver, "isDisplayed", "click Save button", _testLogs).isDisplayed();
        _Aktualisieren.click();
        h.pause(3);
    }

    //Footer
    public void userClicksTheAGB() throws IOException {
        h.xwaitForElementVisibility(_AGB, driver, "click", "click AGB Link", _testLogs).click();
        h.pause(2);
    }

    public void userClicksTheImpressum() throws IOException {
        h.xwaitForElementVisibility(_Impressum, driver, "click", "click Impressum Link", _testLogs).click();
        h.pause(2);
    }

    public void userClicksTheDatenschutz() throws IOException {
        h.xwaitForElementVisibility(_Datenschutz, driver, "click", "click Datenschutz Link", _testLogs).click();
        h.pause(2);
    }


}
