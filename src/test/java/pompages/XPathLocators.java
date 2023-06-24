package pompages;

public class XPathLocators {

        // Add more XPath locators for other elements in the Log In Screen
        public static final String _EmailField = "//input[contains(@name,'username')]";
        public static final String _PasswordField = "//input[contains(@type,'password')]";
        public static final String _loginButton = "//button[@type='submit']";
        public static final String _forgotpwButton = "//a[@class='link'][contains(.,'Passwort vergessen')]";


        // Add more XPath locators for other elements on the Header Section
        public static class Header {
            public static class ProfileIconSelection {
                    public static final String _ProfileIcon = "//*[@id=\"host-header\"]/b2b-mfe-header/app-header/div/div/div[2]/b2b-ui-svg/div";
                    public static class UserSetting {
                        public static final String _UserSetting = "(//div[contains(.,'Benutzereinstellungen')])[6]";
                        public static final String _Zuruck = "(//div[contains(.,'Zurück')])[4]";
                        public static final String _Benutzereinstellungen = "(//div[contains(.,'Benutzereinstellungen')])[5]";
                        public static final String _Zugangsdaten = "(//div[contains(.,'Zugangsdaten')])[6]";
                        public static final String _Vorname = "(//div[contains(.,'Vorname:')])[6]";
                        public static final String _Nachname = "(//div[contains(.,'Nachname:')])[6]";
                        public static final String _Email = "(//div[contains(.,'E-Mail Adresse:')])[6]";
                        public static final String _Rolle = "(//div[contains(.,'Rolle:')])[6]";
                        public static final String _Kontakt = "(//div[contains(.,'Kontakt')])[6]";
                        public static final String _Telefon = "\"(//div[contains(.,'Telefon:')])[6]";
                        public static final String _Edit = "//*[@id=\\\"host-content\\\"]/b2b-mfe-user-management/app-user-profile/div/div[2]/div/form/div/b2b-ui-button[1]/button";
                        public static final String _PasswordReset = "(//div[contains(.,'Passwort ändern')])[7]";
                        public static final String _Aktualisieren = "(//div[contains(.,'Aktualisieren')])[7]";
                        public static final String _VornameField = "//input[@formcontrolname='firstname']";
                        public static final String _NachnameField = "//input[@formcontrolname='lastname']";
                        public static final String _TelefonField = "//input[@formcontrolname='tel']";
                    }
                    public static class LogOut {
                        public static final String _LogOutDEbtn = "(//div[contains(.,'Ausloggen')])[6]";
                        public static final String _LogOutENbtn = "(//div[contains(.,'Logout')])[6]";
                    }
            }
            public static class CompanySelector {
                        public static final String _CompanySelector = "//span[contains(@class,'dropdown-lbl')]";
                        public static final String _CompanySelectorSearch = "//input[contains(@autocomplete,'off')]";
                        public static final String _CompanyList = "//*[@id=\"mat-menu-panel-0\"]/div/app-dropdown-panel/div/div[2]/ul";
                        public static final String _CompanySearchResult = "(//div[contains(.,'CREM')])[13]";
                        public static final String _OnboardingTextField = "//textarea[contains(@name,'company-name')]";
                        public static final String _CompanyOnboardingDEbtn = "(//div[contains(.,'Neuen Kunden hinzufügen')])[8]";
                        public static final String _CompanyOnboardingENbtn = "(//div[contains(.,'Add new customer')])[8]";
                        public static final String _OnboardingHeaderDE = "(//div[contains(.,'Neuen Kunden hinzufügen')])[4]";
                        public static final String _OnboardingHeaderEN = "(//div[contains(.,'Add new customer')])[4]";
                        public static final String _CancelDEBtn = "//button[@type='secondary'][contains(.,'Abbrechen')]";
                        public static final String _CancelENBtn = "//button[@type='secondary'][contains(.,'Cancel')]";
                        public static final String _AddCompanyDEBtn = "//button[@class='default-btn'][contains(.,'Neuen Kunden hinzufügen')]";
                        public static final String _AddCompanyENBtn = "//button[@class='default-btn'][contains(.,'Add new customer')]";
                        public static final String _OnboardingErrorMsgDE = "//p[@class='helper-text error-text'][contains(.,'Name existiert bereits, bitte wählen Sie einen anderen.')]";
                        public static final String _OnboardingErrorMsgEN = "//p[@class='helper-text error-text'][contains(.,'Name already exists, please choose another.')]";
                    }
            public static class LanguageSelector {
                        public static final String _LanguageSelector = "//*[@id=\"host-header\"]/b2b-mfe-header/app-header/div/div/div[2]/div[1]/b2b-ui-select/div/div[1]";
                        public static final String _LanguageSelectorDE = "(//div[contains(.,'Deutsch')])[9]";
                        public static final String _LanguageSelectorEN = "(//div[contains(.,'English')])[10]";
            }

        }


        // Add more XPath locators for elements on the Dashboard Section
        public static class Dashboard {
            public static class myappsTxtlbl {
                public static final String _MyAppsDE = "(//div[contains(.,'Meine Apps')])[5]";
                public static final String _MyAppsEN = "(//div[contains(.,'My Apps')])[5]";
            }
            public static class myApps {
                public static class AssetMonitor {
                    public static final String _AssetMonitorDE = "(//div[contains(.,'AnlagenMonitor')])[7]";
                    public static final String _AssetMonitorEN = "(//div[contains(.,'AssetMonitor')])[7]";
                }
                public static class EnergyManagement {
                    public static class EMBasic {
                        public static final String _EMBasicDE = "(//div[contains(.,'Energiemanagement')])[7]";
                        public static final String _EMBasicEN = "(//div[contains(.,'Energy Management')])[7]";
                    }
                    public static class EMPremiumG {
                        public static final String _EMPremiumGDE = "(//div[contains(.,'Energiemanagement (G)')])[7]";
                        public static final String _EMPremiumGcEN = "(//div[contains(.,'Energy Management (G)')])[7]";
                    }
                    public static class EMPremiumO {
                        public static final String _EMPremiumODE = "(//div[contains(.,'Energiemanagement (O)')])[7]";
                        public static final String _EMPremiumOEN = "(//div[contains(.,'Energy Management (O)')])[7]";
                    }
                }
                public static class EnergyMap {
                    public static final String _EnergyMapDE = "(//div[contains(.,'Energiekarte')])[7]";
                    public static final String _EnergyMapEN = "(//div[contains(.,'EnergyMap')])[7]";
                }
                public static class HeatNetMonitor {
                    public static final String _HeatNetMonitorDE = "(//div[contains(.,'Wärmenetz Monitor')])[7]";
                    public static final String _HeatNetMonitorEN = "(//div[contains(.,'Heat Net Monitor')])[7]";
                }
                public static class SmartIndoorMonitoring {
                    public static final String _SmartIndoorMonitoringDE = "(//div[contains(.,'Smart Indoor Monitoring')])[7]";
                    public static final String _SmartIndoorMonitoringEN = "(//div[contains(.,'Smart Indoor Monitoring')])[7]";
                }
                public static class Webshop {
                    public static final String _WebshopDE = "(//div[contains(.,'Webshop')])[7]";
                    public static final String _WebshopEN = "(//div[contains(.,'Webshop')])[7]";
                }
                public static class Xenon {
                    public static final String _XenonDE = "(//div[contains(.,'Xenon')])[7]";
                    public static final String _XenonEN = "(//div[contains(.,'Xenon')])[7]";
                }
                public static class Aski {
                    public static final String _AskiDE = "";
                    public static final String _AskiEN = "";
                }
            }
        }


        // Add more XPath locators for elements on the Footer Section
        public static class Footer {
            public static class Terms {
                public static final String _TrmsandCndtsDE = "(//div[contains(.,'AGB')])[6]";
                public static final String _TrmsandCndtsEN = "(//div[contains(.,'Terms & Conditions')])[6]";
            }
            public static class Contacts {
                public static final String _CntctDE = "(//div[contains(.,'Impressum')])[6]";
                public static final String _CntctEN = "(//div[contains(.,'Contact')])[6]";
            }
            public static class Privacy {
                public static final String _PrvcyPlcyDE = "(//div[contains(.,'Datenschutz')])[6]";
                public static final String _PrvcyPlcyEN = "(//div[contains(.,'Privacy Policy')])[6]";
            }
            public static class Version {
                public static class BAG {
                    public static final String _VersionDE = "(//div[contains(.,'© Bayernwerk Netz GmbH 2023')])[7]";
                    public static final String _VersionEN = "(//div[contains(.,'© Bayernwerk Netz GmbH 2023')])[7]";
                }
                public static class HAW {

                }
                public static class LEW {

                }
            }
        }


}

