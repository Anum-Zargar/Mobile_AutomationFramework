package com.framework.general;

import static java.time.Duration.ofMillis;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;

public class Mobile_Base {
	
	 public static AndroidDriver<AndroidElement> driver = null;
	
	@SuppressWarnings("rawtypes")
	
	@BeforeTest
  public void setUp() throws MalformedURLException, InterruptedException 
	{
	
		  File f = new File("src"); 
		 File fs = new File(f, "General-Store.apk");
	//File f = new File("src");
	//File fs = new File(f, "original.apk");
	
	DesiredCapabilities caps = new DesiredCapabilities();
	caps.setCapability("deviceName","Anum");
	caps.setCapability("automationName","uiAutomator2");
	caps.setCapability("platformName","Android");
	caps.setCapability("fullReSet",true);
	caps.setCapability("newCommandTimeout", 120);
	caps.setCapability("app",fs.getAbsolutePath());
	//caps.setCapability("appPackage", "com.cineplex.storefront");
	 //caps.setCapability("appActivity","com.cineplex.store.android.main.MainActivity");
	//caps.setCapability("appPackage", "io.appium.android.apis");
	//caps.setCapability("appActivity","io.appium.android.apis.ApiDemos");
	caps.setCapability("appPackage", "com.androidsample.generalstore");
	caps.setCapability("appActivity", "com.androidsample.generalstore.SplashActivity");
	driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    //driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.cineplex.storefront:id/fte_skip_button']")).click();
	//driver.findElement(By.xpath("//android.widget.Button[@text='SKIP']")).click();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(10000);
	 //Thread.sleep(3000);
	 //driver.findElement(By.xpath("//android.widget.Button[@text='SKIP']")).click();
	// driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
	 //driver.findElement(By.xpath("//android.widget.TextView[@text='Animation']")).click();
	
	 //Thread.sleep(3000);
	 //driver.findElement(By.xpath("//android.widget.TextView[@text='8. Headers']")).click();
	// driver.findElement(By.xpath("//android.widget.TextView[@text='View Flip']")).click();
	// return driver
	 //driver.findElement(By.xpath("//android.widget.Button[@text='Flip']")).click();
	//Thread.sleep(3000);
	 //driver.findElement(By.xpath("//android.widget.Button[@text='Close app']'")).click();
		

	
	}


//	public static void main(String[]args) throws MalformedURLException, InterruptedException {
		//Mobile_Base b = new Mobile_Base();
		//Thread.sleep(3000);
		//b.setUp();
	//	b.clicktab();}
	
	
	
	
	// @AfterSuite()
	 public void tear()
	 { 
		driver.close();
		   System.out.println("Driver quit");
		}
	 }
	 




