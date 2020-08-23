package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import commonUtilities.BasePage;
import commonUtilities.GenericUtils;

/**
 * @author abhishek shandilya
 *
 */
public class LoginPage extends BasePage{
	
	public static final String usernameTB="login-username";
	public static final String passwordTB="login-password";
	public static final String loginBTN="//button[.='Submit']";
	public static final String forgotPassworLink="//a[.='Forgot your Password ?']";
	public static final String RememberPasswordCheckbox="//label[contains(.,' Remember my Id')]";
	public static final String lnBtn ="Learn more";
	public static final String  Sustainability ="Sustainability";
	public static final String  About ="About";
	public static final String Whoweare="Who we are";
	public static final String  Awards="Our Awards & Accolades";
	

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void enterUsername(String userName) {
		getLogs(this.getClass());
		logger.info("Enter UserName");
		GenericUtils.entervalueinTextbox("id", usernameTB, userName);
	}

	public void enterPassword(String password) {
		getLogs(this.getClass());
		logger.info("Enter Password");
		GenericUtils.entervalueinTextbox("id", passwordTB, password);
	}

	public void clickForgotPasswordLink() {
		getLogs(this.getClass());
		logger.info("Click Forgot Password Link");
		GenericUtils.clickElement("xpath", forgotPassworLink);
	}

	
	public void clickMoreButton() {
		getLogs(this.getClass());
		logger.info("Click Submit Button");
		GenericUtils.clickElement("xpath",lnBtn);
	}
	public void clickMoreButton() {
		getLogs(this.getClass());
		logger.info("Click Submit Button");
		GenericUtils.clickElement("xpath",Sustainability);
	}
	
	public void clickMoreButton() {
		getLogs(this.getClass());
		logger.info("Click Submit Button");
		GenericUtils.clickElement("xpath",About);
	}
	
	public void clickMoreButton() {
		getLogs(this.getClass());
		logger.info("Click Submit Button");
		GenericUtils.clickElement("xpath",Whoweare );
	}
	public void clickMoreButton() {
		getLogs(this.getClass());
		logger.info("Click Submit Button");
		GenericUtils.clickElement("xpath",Awards );
	}
}
