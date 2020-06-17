package com.framework.pages;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

import java.awt.List;
import java.time.temporal.TemporalAmount;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.framework.general.Mobile_Base;
import com.framework.util.TestUtil;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import java.util.*;


public class SamplePage extends Mobile_Base {

	protected WebDriverWait wait;
	TestUtil testUtil = new TestUtil();

	public SamplePage(AndroidDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 1);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = ("//android.widget.EditText[@content-desc='test-Username']"))
	private MobileElement username;

	@AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='test-Password']")
	private MobileElement password;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='test-LOGIN']")
	private MobileElement login;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='test-ADD TO CART'][1]/android.widget.TextView")
	private MobileElement addtocart1;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='test-ADD TO CART'][4]/android.widget.TextView")
	private MobileElement addtocart;

	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Toggle']/android.widget.ImageView")
	private MobileElement list;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@text= 'test-ADD TO CART'][5]")
	private MobileElement addcarttext;
	 		
@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Cart']")
private MobileElement cartbtn;
	
@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Toggle']/android.widget.ImageView")
private MobileElement viewlist;


@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Amount']/android.widget.TextView")
private MobileElement viewqty;


@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Menu']/android.view.ViewGroup/android.widget.ImageView")
private MobileElement viewqtyback;


public void login() throws Exception 
{
		  testUtil.enterText(username, "standard_user", "Enter username");
		 testUtil.enterText(password, "secret_sauce", "Enter password");
		 testUtil.clickElement(login, "Click Login");
		 testUtil.clickElement(list, "Click list"); 
		// String title=driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[2]")).getText();
		System.out.println("Testing 455 jee");

}
	
	public void verticalSwipe()
	{
		Dimension dim =driver.manage().window().getSize();
		int height =dim.getHeight();
		int width =dim.getWidth();
		int x =width/2;
		int starty = (int)(height*0.80);
		int endy  = (int)(height*0.20);
		new TouchAction((PerformsTouchActions) driver)
	    .press(point(x, starty))
	    .waitAction(waitOptions(ofMillis(3000)))
	    .moveTo(point(x, endy))
	    .release().perform();
	}
	
	
	public void clickByClientName() throws Exception
	{
		System.out.println("scroll");
		verticalSwipe();
		System.out.println("Display list of shirts ");
		 java.util.List<AndroidElement> eleTwo = driver.findElements(By.xpath("//android.view.ViewGroup[@content-desc='test-Item']"));
		int x = eleTwo.size();
		System.out.println("Shirt size :- " +x);
		WebElement addbutton  = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='test-ADD TO CART']['"+x+"']"));
		testUtil.clickElement(addbutton,"click on add button");
		System.out.println("Successfully clicked on "+addbutton);
	}
	
	

	public void addtocart() throws Exception {
		// TODO Auto-generated method stub
		  testUtil.enterText(username, "standard_user", "Enter username");
		  testUtil.enterText(password, "secret_sauce", "Enter password");
		   testUtil.clickElement(login, "Click Login");
		  testUtil.clickElement(list, "Click list");
		  clickByClientName();
		  testUtil.clickElement(viewlist, "View list"); 
		  testUtil.clickElement(cartbtn, "Click cartbtn"); 
		  System.out.println("Cart Button Verify qunatity" +cartbtn.getSize());
		 driver.navigate().back();
		  
		 
	}

}
		
	
	
	
	

