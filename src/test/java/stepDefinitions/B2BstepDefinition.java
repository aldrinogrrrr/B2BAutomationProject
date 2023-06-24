package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pompages.B2BPompage;
import utility.Instance;
import utility.Helper;


public class B2BstepDefinition extends Instance {

    public static WebDriver driver;
    B2BPompage _page;
    Helper h = new Helper();


    // Step Definitions for the login page
        @Given("user goes to B2B site")
        public void userGoesToB2BSite() {
                driver = getChromeDriverInstance("https://business-qa.energieportal.bayernwerk.de/");
                _page = new B2BPompage(driver);
                h.pause(3);
        }
        @And("user logs in")
        public void userLogsIn() {
                _page.userLogsIn();
                h.pause(3);
        }
        @And("user clicks the Forgot Password")
        public void userClicksTheForgotPassword() {
                _page.userClicksTheForgotPassword();
        }



    // Step Definitions for the Header Section
        public static class ProfileIcon {
                @Then("user clicks the profile icon")
                public void userClicksTheProfileIcon() {
                    B2BPompage.ProfileIcon.userClicksTheProfileIcon(driver);
                }
                public static class UserSetting {
                    @Then("user selects User Setting")
                    public void userSelectsUserSetting() {
                        B2BPompage.ProfileIcon.UserSetting.userSelectsUserSetting(driver);
                    }
                }
                @Then("user logs out")
                public void userLogsOut() {
                    B2BPompage.ProfileIcon.userLogsOut(driver);
                }
        }
        public static class CompanySelector {
                @Then("user clicks the Company Selector")
                public void userClicksTheCompanySelector() {
                    B2BPompage.CompanySelector.userClicksTheCompanySelector(driver);
                }
                @Then("user validates the Company Selector")
                public void userValidatesTheCompanySelector() {
                    B2BPompage.CompanySelector.userValidatesTheCompanySelector(driver);
                }
                @Then("user searches for a company")
                public void userSearchesForACompany(){
                    B2BPompage.CompanySelector.userSearchesForACompany(driver);
                }
                @Then("user clicks the result")
                public void userClicksTheResult() {
                    B2BPompage.CompanySelector.userClicksTheResult(driver);
                }
                @Then("user clicks the Company Onboarding button")
                public void userClicksTheCompanyOnboardingButton() {
                    B2BPompage.CompanySelector.userClicksTheCompanyOnboardingButton(driver);
                }
                @Then("user validates the Company Onboarding Modal")
                public void userValidatesTheCompanyOnboardingModal() {
                    B2BPompage.CompanySelector.userValidatesTheCompanyOnboardingModal(driver);
                }
                @Then("user onboards a company")
                public void userOnboardsACompany() {
                    B2BPompage.CompanySelector.userOnboardsACompany(driver);
                }
                @Then("user sees the error message")
                public void userSeesTheErrorMessage() {
                    B2BPompage.CompanySelector.userSeesTheErrorMessage(driver);
                }
        }
        public static class LanguageSelector {
                @Then("user clicks the language selector")
                public void userClicksTheLanguageSelector() {
                    B2BPompage.LanguageSelector.userClicksTheLanguageSelector(driver);
                }
                @Then("user chooses English")
                public void userChoosesEnglish() {
                    B2BPompage.LanguageSelector.userChoosesEnglish(driver);
                }
                @Then("user chooses German")
                public void userChoosesGerman()  {
                    B2BPompage.LanguageSelector.userChoosesGerman(driver);
                }
        }






    // Step Definitions for the Dashboard Section
        @Then("user sees the dashboard")
        public void userSeesTheDashboard() {
                _page.userSeesTheDashboard();
        }




    // Step Definitions for the Footer Section
        @Then("user clicks the AGB")
        public void userClicksTheAGB() {
                _page.userClicksTheAGB();
        }
        @Then("user clicks the Impressum")
        public void userClicksTheImpressum() {
                _page.userClicksTheImpressum();
        }
        @Then("user clicks the Datenschutz")
        public void userClicksTheDatenschutz() {
                _page.userClicksTheDatenschutz();
        }

















//
//    //    Profile Icon Selections

//

//
//    //    User Setting
//
//    @Then("validate the texts and buttons")
//    public void validateTheTextsAndButtons() throws IOException {
//        _page.validateTheTextsAndButtons();
//    }
//    @And("user exits")
//    public void userExits() throws IOException {
//        _page.userExits();
//    }
//    @Then("user clicks the edit button")
//    public void userClicksTheEditButton() throws IOException {
//        _page.userClicksTheEditButton();
//    }
//
//    @Then("user fills in the fields")
//    public void userFillsInTheFields() throws IOException {
//        _page.userFillsInTheFields();
//    }
//
//    @Then("user clicks the save button")
//    public void userClicksTheSaveButton() throws IOException {
//        _page.userClicksTheSaveButton();
//    }
//


}
