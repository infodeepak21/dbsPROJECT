package commonUtilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import mailSender.MailNotification;
/*
 * This class is responsible for implementing AutoConstant as well the main use of this class is to drive the test.
 * This class will be inherited by all the Test classes in order to meet the prerequisite.
 * This class deals with different annotations of TestNG except @Test and thus makes the class as abstract.
 * Methods which will be implemented in this test are as follows:-
 *   a.) calling the method of BrowserSelectionAndAction class
 *   b.) test initialization
 *   c.) test completion
 *   d.) database connection making
 *   e.) closing the database connection
 *   f.) connection of excel
 *   g.) closing the excel 
 *   
 *   @author Abhishek Shandilya
 */
public abstract class  BaseTest implements AutoConstant {
	public static WebDriver driver;
	public static FileInputStream fis;
	public static Workbook wb;

	/*
	 * @BeforeSuite public void connectDataBase() {
	 * 
	 * }
	 * 
	 * @BeforeTest public void openExcel(String file) {
	 * ExcelLib.openExcelSheet(file); }
	 */
	
	/*
	 * This method is used for opening the browser and entering the url as providing the implicit wait time before starting the 
	 * test.It will accept one Parameter of type integer and it will implict wait is in Minute which is further linked with
	 * Wait class implicit wait method.
	 * 
	 *
	 * Method to open browser
	 * 
	 * @param wait time
	 * 
	 * @return opening of respectie browser, passing of url, and providing implicit wait time to the execution.
	 *
	 * 
	 * 
	 */
	@BeforeClass
	@Parameters({ "waitTime" })
	public void openBrowser(@Optional("10") int waitTime) {
		BrowserSelectionAndAction.browserOption();
		BrowserSelectionAndAction.browserAction(waitTime);
		BrowserSelectionAndAction.signIn();
	}
	
	/*
	 * The use of this method is to indicate the user to have a clear picture of Test getting initiated even if one Test class 
	 * is having multiple test methods.Before starting any test it will refresh the page which is currently made mandatory so 
	 * that all the elements gets loaded on the page and the test can start in a smoother manner.
	 */
	@BeforeMethod
	public void testIntialization() {
		driver.navigate().refresh();
		Reporter.log(
				"              -------------------------------------- Test Started --------------------------------------              ",
				true);
	}

	/*
	 * The use of this method is just to indicate the end user about the test has been executed.
	 */
	@AfterMethod
	public void testCompletion() {
		Reporter.log(
				"              -------------------------------------- Test Completed --------------------------------------              ",
				true);
	}

	/*
	 * The use of this method is to close the browser once the entire test suites test has been executed. 
	 */
	@AfterClass
	public void closeBrowser() {
		BrowserSelectionAndAction.signOut();
		BrowserSelectionAndAction.browserClosing();
	}

	/*
	 * @AfterTest public void closeExcel() { ExcelLib.closeExcelSheet(); }
	 */
	@AfterSuite
	public void sendMailAfterExecution() {
		MailNotification.sendMailWithAttachment();
	}
	  
}
