package utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class Instance {

	public  static WebDriver _driver;
	public  String saveScreenshotPath = System.getProperty("user.dir") + "\\src\\main\\java\\screenshots\\";


	public static WebDriver getChromeDriverInstance(String _url) {
		//driver for local machine
		String chromeExepath = System.getProperty("user.dir") + "\\src\\main\\java\\utility\\chromedriver_win32\\chromedriver.exe";
		//driver for running in azure devops
		//String chromeExepath = System.getProperty("user.dir") + "\\src\\main\\java\\utility\\azure_chromeDriver\\chromedriver.exe";


		System.out.println("driver exe file path: " + chromeExepath);
		System.setProperty("webdriver.chrome.driver",chromeExepath);
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("headless");
		//_driver = new ChromeDriver(options);
		options.addArguments("start-maximized");
		_driver = new ChromeDriver(options);
		if(_url != null){
			_driver.get(_url);

		}
		//_driver.manage().window().maximize();

		return  _driver;



	}

	public static WebDriver getFirefoxDriverInstance() {
		//driver for local machine
		String firefoxExepath = System.getProperty("user.dir") + "\\src\\main\\java\\utility\\geckodriver_win64\\geckodriver.exe";
		//driver for running in azure devops
		//String firefoxExepath = System.getProperty("user.dir") + "\\src\\main\\java\\utility\\geckodriver_win64\geckodriver.exe";


		System.out.println("driver exe file path: " + firefoxExepath);
		System.setProperty("webdriver.gecko.driver",firefoxExepath);
		FirefoxOptions options = new FirefoxOptions();
		//options.addArguments("headless");
		_driver = new FirefoxDriver(options);

		_driver.manage().window().maximize();

		return  _driver;
	}

	public static WebDriver getEdgeDriverInstance() {
		//driver for local machine
		String edgeExepath = System.getProperty("user.dir") + "\\src\\main\\java\\utility\\edgedriver_win64\\msedgedriver.exe";
		//driver for running in azure devops
		//String edgeExepath = System.getProperty("user.dir") + "\\src\\main\\java\\utility\\edgedriver_win64\\msedgedriver.exe";


		System.out.println("driver exe file path: " + edgeExepath);
		System.setProperty("webdriver.edge.driver",edgeExepath);
		EdgeOptions options = new EdgeOptions();

		//options.addArguments("headless");
		//_driver = new ChromeDriver(options);
//		options.addArguments("start-maximized");
		_driver = new EdgeDriver(options);
		_driver.manage().window().maximize();

		//_driver.manage().window().maximize();

		return  _driver;
	}


	public static WebDriver getChromeDriver() {
		//driver for local machine
		String chromeExepath = System.getProperty("user.dir") + "\\src\\main\\java\\utility\\chromedriver_win32\\chromedriver.exe";
		//driver for running in azure devops
		//String chromeExepath = System.getProperty("user.dir") + "\\src\\main\\java\\utility\\azure_chromeDriver\\chromedriver.exe";


		System.out.println("driver exe file path: " + chromeExepath);
		System.setProperty("webdriver.chrome.driver",chromeExepath);
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("headless");
		//_driver = new ChromeDriver(options);
		options.addArguments("start-maximized");
		_driver = new ChromeDriver(options);

		return  _driver;

	}
	public static WebDriver getRandomDriver(String _url, String Browser) {

		if (Browser.equals("Chrome")) {
			_driver = getChromeDriver();
//			_driver = getFirefoxDriverInstance();
//			_driver = getEdgeDriverInstance();
			}
		if (Browser.equals("Firefox")) {
//			_driver = getFirefoxDriverInstance();
			_driver = getChromeDriver();
//			_driver = getEdgeDriverInstance();
			}
		if (Browser.equals("Edge")) {
//			_driver = getEdgeDriverInstance();
			_driver = getChromeDriver();
//			_driver = getFirefoxDriverInstance();
			}

			_driver.get(_url);
			return _driver;

		}
	}



