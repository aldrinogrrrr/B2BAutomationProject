package utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static utility.ExcelReport.generateTestLogReport;



public class Helper  {
	ExcelReport er = new ExcelReport();
	String[] actions = new String[]{"click", "sendkeys", "enter", "input", "gettext","isDisplayed","check"};
	public String path = System.getProperty("user.dir") + "\\src\\main\\java\\screenshots\\";

	Timer timer;
	//enter character of a string one by one
	public void enterEachChar(String _value, WebElement element) {

		for (int i = 0; i < _value.length(); i++) {
			char c = _value.charAt(i);
			String s = String.valueOf(c);
			element.sendKeys(s);
		}
	}

	//WAIT FOR THE ELEMENT WITH RETRY 3 TIMES
	public WebElement  xwaitForElementVisibility(WebElement _field, WebDriver driver, String action,
												 String webElementVariableName,List<TestLog> _testLogs) throws IOException {

		pause(1);
		String _status = "";
		int attempt = 0;
		WebElement _element = null;
		while(attempt <=2) {
			try{
				// Waiting #of seconds for an element to be present on the page, checking
				// for its presence once every 3 seconds.
				Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
						.withTimeout(Duration.ofSeconds(21))
						.pollingEvery(Duration.ofSeconds(3))
						.ignoring(NoSuchElementException.class);

				_element = wait.until(driver1 -> _field);
				if(_element.getSize() != null){
					for(String x : actions){
						if(x == action){
							_status = "passed";
							System.out.println(webElementVariableName + " Element found");

						}
					}
//					Actions act = new Actions(driver);
//					Action _seriesOfAction = act
//							.moveToElement(_field)
//							.build();
//					_seriesOfAction.perform();
					//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", _field);
					break;
				}
			}
			catch (Exception e){
				//element not found
				_element = null;
				_status="failed";

			}attempt++;
		}

		try{
			//element not found
			if(attempt==3){
				_status = "failed";
				System.out.println("The status is : "+_status + " and attempt counter is 3 " + webElementVariableName + " is not found");
				er.writeLog(action +"-"+webElementVariableName,_status,_testLogs);
				generateTestLogReport(_status+"-",_testLogs);
				//generate file name for screenshot
				String fileName = new SimpleDateFormat("yyyy-MM-dd-HHmm").format(new Date());
				takeScreenShot(driver,"img"+fileName +".jpg");
				pause(3);
				//driver.quit();

			}
			else{
				//element is found
				er.writeLog(action+"-"+webElementVariableName,_status,_testLogs);
				//generateTestLogReport(_status+" UserVerifyData",_testLogs);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return _element;
	}



//		Actions action = new Actions(driver);
//		Action _seriesOfAction = action
//				.moveToElement(element)
//				.click()
//				.build();
//		action.wait(2000);
//		_seriesOfAction.perform();

	//code for action class
	/**   Actions action = new Actions(driver);
	 Action _seriesOfAction = action
	 .moveToElement(em._meinepersonlichendaten)
	 .click()
	 .build();
	 _seriesOfAction.perform();
	 **/

	//use this JavaScriptExecutor to click an element that is not clickable by default selenium click();
	public void clickUsingJS(WebDriver driver, WebElement _element) {
		pause(3);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", _element);
	}

	public void pause(Integer seconds) {
		try {
			SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	//generate 5 digit random number
	public int randomNumber(){
		Random r = new Random( System.currentTimeMillis() );
		return 10000 + r.nextInt(20000);
	}


	//use for manipulating the map page e.g. navigating to the right side of the map
	//using robot class to implement keyboard stroke of a user
	public void navigateTheMapToRightSide() throws AWTException {

		pause(1);
		Robot robot = new Robot();
		robot.mouseMove(131,389);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		for(int i = 1 ; i <11; i++){
			robot.keyPress(KeyEvent.VK_RIGHT); //arrow right of the keyboard
			pause(1);
			robot.keyRelease(KeyEvent.VK_RIGHT);
		}
	}

	public void takeScreenShot(WebDriver driver, String fileName) throws IOException {
		TakesScreenshot screenShot = ((TakesScreenshot) driver);
		//Call getScreenshotAs method to create image file
		File srcFile=screenShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File destFile = new File(path+fileName);
		FileUtils.copyFile(srcFile, destFile);
	}


	//enter value in textbox using javascriptexecutor
	public void enterTextValueUsingJS(WebDriver driver, WebElement _element,String _value){
		JavascriptExecutor jse = ((JavascriptExecutor)driver);
		jse.executeScript("arguments[0].value='---your email id---';", _element);
	}

	//Run on random browser
	public String randomBrowser (){
		List<String> givenList = Arrays.asList("Chrome","Firefox","Edge");
        Random rand = new Random();
        String browserName = givenList.get(rand.nextInt(givenList.size()));
        System.out.println(browserName);
//
//        List<String> browser = new ArrayList<>();
//        browser.add("Chrome");
//        browser.add("Firefox");
//        browser.add("Edge");
//
//        Random randomizer = new Random();
//        String randomListElement = browser.get(randomizer.nextInt(browser.size()));
//        System.out.println("Random List Element: " +randomListElement);

		return browserName;
	}


} //end of class utility



