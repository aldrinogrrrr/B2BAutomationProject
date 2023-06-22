package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pompages.B2BPompage;
import utility.Instance;
import utility.Helper;

import java.io.IOException;

public class B2BstepDefinition extends Instance {

    public static WebDriver driver;
    B2BPompage _page;
    Helper h = new Helper();


    //    Log In Screen
    @Given("user goes to B2B site")
    public void userGoesToB2BSite() {
        driver = getChromeDriverInstance("https://business-qa.energieportal.bayernwerk.de/");
        _page = new B2BPompage(driver);
        h.pause(3);
    }

    @And("user logs in")
    public void userLogsIn() throws IOException {
        _page.userLogsIn();
        h.pause(20);
    }

    @And("user clicks the Forgot Password")
    public void userClicksTheForgotPassword() throws IOException {
        _page.userClicksTheForgotPassword();
    }

    //    Dashboard
    @Then("user sees the dashboard")
    public void userSeesTheDashboard() throws IOException {
        _page.userSeesTheDashboard();
    }

    //    Header
    @Then("user clicks the profile icon")
    public void userClicksTheProfileIcon() throws IOException {
        _page.userClicksTheProfileIcon();
    }

    @Then("user clicks the Company Selector")
    public void userClicksTheCompanySelector() throws IOException{
        _page.userClicksTheCompanySelector();
    }

            @Then("user validates the Company Selector")
            public void userValidatesTheCompanySelector() throws IOException {
                _page.userValidatesTheCompanySelector();
            }

            @Then("user searches for a company")
            public void userSearchesForACompany() throws IOException {
                _page.userSearchesForACompany();
            }

            @Then("user clicks the result")
            public void userClicksTheResult() throws IOException {
                _page.userClicksTheResult();
            }

            @Then("user clicks the Company Onboarding button")
            public void userClicksTheCompanyOnboardingButton() throws IOException {
                _page.userClicksTheCompanyOnboardingButton();
            }

            @Then("user validates the Company Onboarding Modal")
            public void userValidatesTheCompanyOnboardingModal() throws IOException {
                _page.userValidatesTheCompanyOnboardingModal();
            }

            @Then("user onboards a company")
            public void userOnboardsACompany() throws IOException {
                _page.userOnboardsACompany();
            }

            @Then("user sees the error message")
            public void userSeesTheErrorMessage() throws IOException {
                _page.userSeesTheErrorMessage();
            }

    @Then("user clicks the language selector")
    public void userClicksTheLanguageSelector() throws IOException {
        _page.userClicksTheLanguageSelector();
    }
            @Then("user chooses English")
            public void userChoosesEnglish() throws IOException {
                _page.userChoosesEnglish();
            }
            @Then("user chooses German")
            public void userChoosesGerman() throws IOException {
                _page.userChoosesGerman();
            }

    //    Profile Icon Selections
    @Then("user selects User Setting")
    public void userSelectsUserSetting() throws IOException {
        _page.userSelectsUserSetting();
    }

    @Then("user logs out")
    public void userLogsOut() throws IOException {
        _page.userLogsOut();
    }

    //    User Setting

    @Then("validate the texts and buttons")
    public void validateTheTextsAndButtons() throws IOException {
        _page.validateTheTextsAndButtons();
    }
    @And("user exits")
    public void userExits() throws IOException {
        _page.userExits();
    }
    @Then("user clicks the edit button")
    public void userClicksTheEditButton() throws IOException {
        _page.userClicksTheEditButton();
    }

    @Then("user fills in the fields")
    public void userFillsInTheFields() throws IOException {
        _page.userFillsInTheFields();
    }

    @Then("user clicks the save button")
    public void userClicksTheSaveButton() throws IOException {
        _page.userClicksTheSaveButton();
    }

    //    Footer

    @Then("user clicks the AGB")
    public void userClicksTheAGB() throws IOException {
        _page.userClicksTheAGB();
    }

    @Then("user clicks the Impressum")
    public void userClicksTheImpressum() throws IOException {
        _page.userClicksTheImpressum();
    }

    @Then("user clicks the Datenschutz")
    public void userClicksTheDatenschutz() throws IOException {
        _page.userClicksTheDatenschutz();
    }


}
