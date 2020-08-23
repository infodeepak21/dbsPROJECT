package dbs.qa.framework.dbs;

import org.testng.Assert;
import org.testng.annotations.Test;

import commonUtilities.BaseTest;
import objectRepository.LoginPage;

public class Demo extends BaseTest {
	
	LoginPage lp = new LoginPage(driver);	
	
	@Test
	public void truly() throws InterruptedException {
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"Erixis");
		
		lp.
	
	}
	
	@Test
	public void falsey() throws InterruptedException {
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"Google");
	}
	
	@Test
	public void print() {
		System.out.println("Hi");
	}

}
