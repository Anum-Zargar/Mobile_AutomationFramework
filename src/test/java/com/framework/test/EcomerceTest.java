package com.framework.test;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.framework.general.Mobile_Base;
import com.framework.pages.EcommercePage;
import com.framework.pages.LoginPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class EcomerceTest extends Mobile_Base {
	

		
//		LoginPage lp = new LoginPage(driver);
		
		//@Test(priority=1)
		public void Login() {
			EcommercePage Ep = new EcommercePage(driver);
			Ep.Name();
			
	
}
		
	//	@Test()
			public void Addtocart() throws InterruptedException {
				EcommercePage Ep = new EcommercePage(driver);
				Ep.AddCart();
			}
		
		
		//@Test()
		public void SumofProduct() throws InterruptedException {
			EcommercePage Ep = new EcommercePage(driver);
			Ep.Totalprice();
			
		
		}
		
		//@Test()
		public void ClickonConditions() throws InterruptedException {
			EcommercePage Ep = new EcommercePage(driver);
			Ep.checkBox();
			
		
		}
		
		@Test()
		public void ClickonWebView() throws InterruptedException {
			EcommercePage Ep = new EcommercePage(driver);
			Ep.WebView();
			
		
		}
		
		
}
		

