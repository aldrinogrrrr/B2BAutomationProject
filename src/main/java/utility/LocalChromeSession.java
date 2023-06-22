package utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocalChromeSession extends Instance implements IChrome {


    public WebDriver _chromeSession() {
        String chromeExepath = System.getProperty("user.dir") + "\\src\\main\\java\\utility\\chromedriver_win32\\chromedriver.exe";
        System.out.println("driver exe file path: " + chromeExepath);
        //Setting system properties of ChromeDriver
       // System.setProperty("webdriver.chrome.driver", "C:"
         //       +"//Users//fsaul//Documents//Client Projects//EON Project//eon_automation_test//src//main//java//utility//chromedriver_win32//chromedriver.exe");
        //Creating an object of ChromeDriver
        System.setProperty("webdriver.chrome.driver",chromeExepath);

        _driver = new ChromeDriver();
        //_driver.manage().window().maximize();
        System.out.println("Title of the page is -> " + _driver.getTitle());
        return  _driver;
    }

}
