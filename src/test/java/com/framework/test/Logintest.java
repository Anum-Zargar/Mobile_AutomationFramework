package com.framework.test;

import org.testng.annotations.Test;

import com.framework.general.Mobile_Base;
import com.framework.pages.LoginPage;

public class Logintest extends Mobile_Base {
	
//	LoginPage lp = new LoginPage(driver);
	
	//@Test(priority=1)
	public void scrollView() {
		LoginPage lp = new LoginPage(driver);
		lp.clicktab();
	
	}
	
	//@Test
	public void TabsFactory() {
		LoginPage lp = new LoginPage(driver);
		lp.Factory();
		
		}
	
	
	//@Test
	public void Touch() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.Touch();
		
		}
	
	//@Test
	public void LongPress() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.LongPress();
		}
	
	//@Test
	public void DragAndDrop() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.DragandDrop();
		}
	
	
	

}
