package com.framework.test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.framework.general.Mobile_Base;
import com.framework.pages.AccountPages;
import com.framework.pages.SamplePage;

public class SampleTest extends Mobile_Base {
	

	

	//@Test(priority=1)
	public void Login() throws Exception 
	{
		SamplePage Sp = new SamplePage(driver);
		Sp.login();
		
	}
	
	@Test(priority=2)
	public void validateCart() throws Exception 
	{
		SamplePage Sp = new SamplePage(driver);
		Sp.addtocart();
		
		 
		
	}
	//@AfterTest
	public void teardown() throws Exception 
	{
		driver.close();
		
	}
	
	
}