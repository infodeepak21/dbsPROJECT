package commonUtilities;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;

import objectRepository.LoginPage;
import objectRepository.UserAdminPage;
import synchronizerHelper.Wait;

/*
 * BrowserSelectionAndAction inherits the property of BaseTest and class and allows the for the instantiation of
 * respective of browser.
 * In this class we have written two methods:-
 *  a.) browserOption
 *  b.) browserAction
 *  c.) browserClosing
 *  
 *  @author Abhishek Shandilya
 */

public class BrowserSelectionAndAction extends BaseTest {
	
	/*
	 * browserOption checks and opens the browser mentioned by the user from the properties file if an invalid browser is 
	 * passed then in that case it is capable of handling exception with an error message to the user. 
	 */
	public static void browserOption() {
		try {
			PropertyManager.loadConfig();
			if (PropertyManager.prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				System.setProperty(chromedriver, chromepath);
				driver = new ChromeDriver();
			} else if (PropertyManager.prop.getProperty("browser").equalsIgnoreCase("firefox")) {
				System.setProperty(firefoxriver, firefoxpath);
				driver = new FirefoxDriver();
			} else {
				System.setProperty(internetExplorerDriver, internetExplorerpath);
				driver = new InternetExplorerDriver();
			}
		} catch (Exception e) {
			Reporter.log("Invalid Browser Selection", true);
		}
	}
    
	/*
	 * browserAction method is responsible for some basic browser related operation like deleting the cookies for any 
	 * hashle free execution
	 * It also call the implict wait method from Wait class and tell the browser that some time period has been defined 
	 * by the user in respective type of duration a user is interested in holding the test.
	 * The method also deals with maximizing the browser rather than a default mode execution and it is also responsible 
	 * for passing the application url what so mentioned by the user from the respective Properties file. 
	 * 
	 */
	public static void browserAction(int time) {
		driver.manage().deleteAllCookies();
		Wait.implicitWait();
		driver.manage().window().maximize();
		driver.get(PropertyManager.prop.getProperty("appUrl"));

	}

	/*
	 * browseClosing deals basically for closing the browser when only one tab is opened in the respective browser 
	 * and quitting the browser when multiple tabs are opened during execution by selenium
	 */
	public static void browserClosing() {
		driver.close();
		driver.quit();
	}


}
