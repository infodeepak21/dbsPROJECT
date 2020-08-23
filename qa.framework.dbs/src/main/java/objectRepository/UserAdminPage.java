package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import commonUtilities.BasePage;
import commonUtilities.GenericUtils;

public class UserAdminPage extends BasePage {

	public static final String nameDropdownList = "//li[@role='presentation']";
	public static final String myProfile = "//div[@class='drop-option-menu ng-scope']//a[.='My Profile']";
	public static final String signOut = "//div[@class='drop-option-menu ng-scope']//a[.='Sign Out']";

	public UserAdminPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickSignout() {
		getLogs(this.getClass());
		logger.info("Click Signout Button");
		GenericUtils.clickElement("xpath", nameDropdownList);
		GenericUtils.clickElement("xpath", signOut);
	}
}
