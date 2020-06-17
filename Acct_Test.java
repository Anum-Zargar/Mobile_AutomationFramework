package com.framework.test;

import org.testng.annotations.Test;

import com.framework.general.Mobile_Base;
import com.framework.pages.AccountPages;
import com.framework.pages.LoginPage;


public class Acct_Test extends Mobile_Base {
	

		

		//@Test(priority=1)
		public void Login() throws Exception 
		{
			AccountPages Ap = new AccountPages(driver);
			Ap.myTickets();
			
	
		}
		
		
	//@Test(priority=1)
		public void whatTab() throws Exception 
		{
			AccountPages Ap = new AccountPages(driver);
			Ap.Whatson();
			
	
		}
		
		
	//@Test(priority=2)
		public void Theatre() throws Exception 
		{
			AccountPages Ap = new AccountPages(driver);
			Ap.theatres();
			
	
		}
		
		@Test(priority=3)
		public void clickfood() throws Exception 
		{
			AccountPages Ap = new AccountPages(driver);
			Ap.food();
			
	
		}
		
		
	
}
		

	