package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//author: Francis Saul
//descripton: this class will implement the method/s of the interface
public  class Driver{

	public  WebDriver driver;

	public WebDriver _chromeSession() {
		
		//Setting system properties of ChromeDriver
		System.setProperty("webdriver.chrome.driver", "C:"
				//+ "//Users//fsaul//eclipse-workspace//java101//drivers//chromedriver_win32//chromedriver.exe");
		        +"//Users//fsaul//Documents//Client Projects//EON Project//eon_automation_test//src//main//java//utility//chromedriver_win32//chromedriver.exe");
		//Creating an object of ChromeDriver
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	
		
		return driver;

	}



}
