package com.inetbanking.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObject.LoginPage;

public class TC_LoginTest_01 extends BaseClass {
	
	
	@Test
	public void loginTest() throws IOException {
		
		driver.get(baseURL);
		logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		logger.info("Entered username");
		lp.setPassword(password);
		logger.info("Entered password");
		lp.clickSubmit();
		//captureScreen(driver,"loginTest");
		//String title=driver.getTitle();
		//System.out.println(title);
		
		
		if(driver.getTitle().equals("OrangeHRM") ) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
			captureScreen(driver,"loginTest");
		}
		
	}

}
