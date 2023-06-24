package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utility.Helper;
import utility.TestLog;
import java.util.ArrayList;
import java.util.List;

public class B2BPompage {

        public static WebDriver driver; //web driver variable
        static Helper h = new Helper();
        public B2BPompage(WebDriver _driver) {
            driver = _driver;
            AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 100);
            PageFactory.initElements(factory, this);
        }
        public static List<TestLog> _testLogs = new ArrayList<>(); //this is needed for the reporting. Excel report class




        // Locators and methods for the login page
        public void userLogsIn() {
            driver.findElement(By.xpath(XPathLocators._EmailField)).sendKeys("fritztester01+qa1@gmail.com");
            h.pause(2);
            driver.findElement(By.xpath(XPathLocators._PasswordField)).sendKeys("Totoy04256823111!");
            h.pause(2);
            driver.findElement(By.xpath(XPathLocators._loginButton)).click();
            h.pause(8);
        }
        public void userClicksTheForgotPassword() {
            driver.findElement(By.xpath(XPathLocators._forgotpwButton)).click();
        }


        // Locators and methods for the Header section
        public static class ProfileIcon {
                public static void userClicksTheProfileIcon(WebDriver driver){
                    driver.findElement(By.xpath(XPathLocators.Header.ProfileIconSelection._ProfileIcon)).click();
                    h.pause(8);
                }
                public static class UserSetting {
                    public static void userSelectsUserSetting(WebDriver driver) {
                        driver.findElement(By.xpath(XPathLocators.Header.ProfileIconSelection.UserSetting._UserSetting)).click();
                        h.pause(4);
                    }
                }
                public static void userLogsOut(WebDriver driver) {
                    driver.findElement(By.xpath(XPathLocators.Header.ProfileIconSelection.LogOut._LogOutDEbtn + "|" + XPathLocators.Header.ProfileIconSelection.LogOut._LogOutENbtn)).click();
                    h.pause(4);
                }

        }
        public static class CompanySelector {
                public static void userClicksTheCompanySelector(WebDriver driver) {
                    driver.findElement(By.xpath(XPathLocators.Header.CompanySelector._CompanySelector)).click();
                    h.pause(4);
                }
                public static void userValidatesTheCompanySelector(WebDriver driver) {
                    driver.findElement(By.xpath(XPathLocators.Header.CompanySelector._CompanySelectorSearch)).isDisplayed();
                    driver.findElement(By.xpath(XPathLocators.Header.CompanySelector._CompanyList)).isDisplayed();
                    driver.findElement(By.xpath(XPathLocators.Header.CompanySelector._CompanyOnboardingDEbtn  + " | " + XPathLocators.Header.CompanySelector._CompanyOnboardingENbtn)).isDisplayed();
                    h.pause(4);
                }
                public static void userSearchesForACompany(WebDriver driver) {
                    driver.findElement(By.xpath(XPathLocators.Header.CompanySelector._CompanySelectorSearch)).sendKeys("CREM");
                    h.pause(3);
                }
                public static void userClicksTheResult(WebDriver driver) {
                    driver.findElement(By.xpath(XPathLocators.Header.CompanySelector._CompanySearchResult)).click();
                    h.pause(3);
                }
                public static void userClicksTheCompanyOnboardingButton(WebDriver driver) {
                    driver.findElement(By.xpath(XPathLocators.Header.CompanySelector._CompanyOnboardingDEbtn  + " | " + XPathLocators.Header.CompanySelector._CompanyOnboardingENbtn)).click();
                    h.pause(3);
                }
                public static void userValidatesTheCompanyOnboardingModal(WebDriver driver) {
                    driver.findElement(By.xpath(XPathLocators.Header.CompanySelector._OnboardingHeaderDE + "|" + XPathLocators.Header.CompanySelector._OnboardingHeaderEN)).isDisplayed();
                    driver.findElement(By.xpath(XPathLocators.Header.CompanySelector._OnboardingTextField)).isDisplayed();
                    driver.findElement(By.xpath(XPathLocators.Header.CompanySelector._CancelDEBtn + "|" + XPathLocators.Header.CompanySelector._CancelENBtn)).isDisplayed();
                    driver.findElement(By.xpath(XPathLocators.Header.CompanySelector._AddCompanyDEBtn + "|" + XPathLocators.Header.CompanySelector._AddCompanyENBtn)).isDisplayed();
                    h.pause(3);
                }
                public static void userOnboardsACompany(WebDriver driver) {
                    driver.findElement(By.xpath(XPathLocators.Header.CompanySelector._OnboardingTextField)).sendKeys("TestOnboardingviaAutomation");
                    driver.findElement(By.xpath(XPathLocators.Header.CompanySelector._AddCompanyDEBtn + "|" + XPathLocators.Header.CompanySelector._AddCompanyENBtn)).click();
                    h.pause(3);
                }
                public static void userSeesTheErrorMessage(WebDriver driver) {
                    driver.findElement(By.xpath(XPathLocators.Header.CompanySelector._OnboardingErrorMsgDE + "|" + XPathLocators.Header.CompanySelector._OnboardingErrorMsgEN)).isDisplayed();
                    h.pause(3);
                }
        }
        public static class LanguageSelector {
                public static void userClicksTheLanguageSelector(WebDriver driver) {
                    driver.findElement(By.xpath(XPathLocators.Header.LanguageSelector._LanguageSelector)).click();
                    h.pause(8);
                }
                public static void userChoosesEnglish(WebDriver driver) {
                    driver.findElement(By.xpath(XPathLocators.Header.LanguageSelector._LanguageSelectorEN)).click();
                    h.pause(8);
                }
                public static void userChoosesGerman(WebDriver driver) {
                    driver.findElement(By.xpath(XPathLocators.Header.LanguageSelector._LanguageSelectorDE)).click();
                    h.pause(8);
                }
        }






        // Locators and methods for the Dashboard section
        public void userSeesTheDashboard() {
            driver.findElement(By.xpath(XPathLocators.Dashboard.myappsTxtlbl._MyAppsDE + " | " + XPathLocators.Dashboard.myappsTxtlbl._MyAppsEN)).isDisplayed();
            h.pause(7);
        }





        // Locators and methods for the Footer section
        public void userClicksTheAGB() {
            driver.findElement(By.xpath(XPathLocators.Footer.Terms._TrmsandCndtsDE + " | " + XPathLocators.Footer.Terms._TrmsandCndtsEN)).click();
            h.pause(2);
        }
        public void userClicksTheImpressum() {
            driver.findElement(By.xpath(XPathLocators.Footer.Contacts._CntctDE + " | " + XPathLocators.Footer.Contacts._CntctEN)).click();
            h.pause(2);
        }
        public void userClicksTheDatenschutz() {
            driver.findElement(By.xpath(XPathLocators.Footer.Privacy._PrvcyPlcyDE + " | " + XPathLocators.Footer.Privacy._PrvcyPlcyEN)).click();
            h.pause(2);
        }















//
//
//    //User Setting
//    public void validateTheTextsAndButtons() throws IOException {
//        h.xwaitForElementVisibility(translations._Zuruck, driver, "isDisplayed", "Back Button is visible", _testLogs);
//        h.xwaitForElementVisibility(translations._Benutzereinstellungen, driver, "isDisplayed", "User Setting Text Label is visible", _testLogs);
//        h.xwaitForElementVisibility(translations._Zugangsdaten, driver, "isDisplayed", "Zugangsdaten Text Label is visible", _testLogs);
//        h.xwaitForElementVisibility(translations._Vorname, driver, "isDisplayed", "Vorname Text Label is visible", _testLogs);
//        h.xwaitForElementVisibility(translations._Nachname, driver, "isDisplayed", "Nachname Text Label is visible", _testLogs);
//        h.xwaitForElementVisibility(translations._Email, driver, "isDisplayed", "Email Text Label is visible", _testLogs);
//        h.xwaitForElementVisibility(translations._Rolle, driver, "isDisplayed", "Rolle Text Label is visible", _testLogs);
//        h.xwaitForElementVisibility(translations._Kontakt, driver, "isDisplayed", "Kontakt Text Label is visible", _testLogs);
//        h.xwaitForElementVisibility(translations._Telefon, driver, "isDisplayed", "Telefon Text Label is visible", _testLogs);
//        h.xwaitForElementVisibility(translations._Edit, driver, "isDisplayed", "Edit Text Label is visible", _testLogs);
//        h.xwaitForElementVisibility(translations._PasswordReset, driver, "isDisplayed", "PasswordReset Text Label is visible", _testLogs);
//    }
//
//    public void userExits() throws IOException {
//        h.xwaitForElementVisibility(translations._Zuruck, driver, "isDisplayed", "click Exit Button", _testLogs).isDisplayed();
//        translations._Zuruck.click();
//        h.pause(4);
//    }
//
//    public void userClicksTheEditButton() throws IOException {
//        h.xwaitForElementVisibility(translations._Edit, driver, "isDisplayed", "click Edit Button", _testLogs).isDisplayed();
//        translations._Edit.click();
//        h.pause(2);
//    }
//
//    public void userFillsInTheFields() throws IOException {
//        h.enterEachChar("Fritz", h.xwaitForElementVisibility(translations._VornameField, driver, "enter", "input the First Name", _testLogs));
//        h.enterEachChar("Tester", h.xwaitForElementVisibility(translations._NachnameField, driver, "enter", "input the Last Name", _testLogs));
//        h.enterEachChar("09999695607", h.xwaitForElementVisibility(translations._TelefonField, driver, "enter", "input the Telephone", _testLogs));
//        h.pause(2);
//    }
//
//    public void userClicksTheSaveButton() throws IOException {
//        h.xwaitForElementVisibility(translations._Aktualisieren, driver, "isDisplayed", "click Save button", _testLogs).isDisplayed();
//        translations._Aktualisieren.click();
//        h.pause(3);
//    }
//

}
