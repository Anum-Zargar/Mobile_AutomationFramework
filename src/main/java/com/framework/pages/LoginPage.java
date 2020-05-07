package com.framework.pages;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import java.util.concurrent.TimeUnit;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import static io.appium.java_client.touch.offset.ElementOption.element;
import com.framework.general.Mobile_Base;
import static java.time.Duration.ofSeconds;

import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

public class LoginPage extends Mobile_Base {
	
	   protected WebDriverWait wait;
	   
	
	  public LoginPage(AndroidDriver driver ) {
	        this.driver = driver;
	        wait = new WebDriverWait(driver, 1);
	        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	    }
	
	  @AndroidFindBy(xpath = "//android.widget.TextView[@text='Views']")
	    private MobileElement views;
	  
	  @AndroidFindBy(xpath = "//android.widget.TextView[@text='Tabs']")
	    private MobileElement tabs;

	  
	  @AndroidFindBy(xpath = "//android.widget.TextView[@text='2. Content By Factory']")
	  private MobileElement tabsFactory;
	  
	  @AndroidFindBy(xpath = "//android.widget.TextView[@text='Expandable Lists']")
	    private MobileElement expandableLists;
	  
	  @AndroidFindBy(xpath = "//android.widget.TextView[@text='1. Custom Adapter']")
	    private MobileElement customAdapter;
	  
	  @AndroidFindBy(xpath = "//android.widget.TextView[@text='People Names']")
	    private MobileElement peopleNames;
	  
	//  @AndroidFindBy(id = "//android:id/title")
	   // private MobileElement sampleMenu;

	  @AndroidFindBy(xpath = "//android.widget.TextView[@text='Drag and Drop']")
	    private MobileElement dragDrop;

	
	
				public void clicktab() {
					boolean flag = false;
					views.click();
					for (int i = 0;  i <= 20; i++) {
						try {
					       tabs.click();
							//tabsFactory.click();
							flag=true;
							break;
						}
						catch (Exception e) {
							// TODO: handle exception
							verticalSwipe();
					//	driver.findElement(By.xpath("//[android.widget.TextView[@text='1. Content By Id']")).isDisplayed();
						}
						
					}
					
				}
				
				public void verticalSwipe()
				{
					Dimension dim =driver.manage().window().getSize();
					int height =dim.getHeight();
					int width =dim.getWidth();
					int x =width/2;
					int starty = (int)(height*0.80);
					int endy  = (int)(height*0.20);
				//	((Object) driver).swipe(x, starty, x, endy, 2000); 
					new TouchAction((PerformsTouchActions) driver)
				    .press(point(x, starty))
				    .waitAction(waitOptions(ofMillis(3000)))
				    .moveTo(point(x, endy))
				    .release().perform();
						}
				
				public void Factory() {
					clicktab();
					tabsFactory.click();
				}
				
				public void Touch() throws InterruptedException {
					views.click();
					Thread.sleep(3000);
					TouchAction t = new TouchAction(driver);
					t.tap(tapOptions().withElement(element(expandableLists))).perform();
					//t.longPress(longPressOptions().withElement(element(peopleNames)).withDuration(ofSeconds(2))).release().perform();
					//Thread.sleep(3000);
					//System.out.println("Sample Menu is there " + sampleMenu.isDisplayed());
				}
				
				public void LongPress() throws InterruptedException {
					
					views.click();
					Thread.sleep(3000);
				TouchAction t = new TouchAction(driver);
					t.tap(tapOptions().withElement(element(expandableLists))).perform();
					new WebDriverWait(driver,5).until(ExpectedConditions.visibilityOf(customAdapter));
					customAdapter.click();
					t.longPress(longPressOptions().withElement(element(peopleNames)).withDuration(ofSeconds(2))).release().perform();
					Thread.sleep(3000);
					System.out.println(driver.findElementById("android:id/title").isDisplayed());
					
				}
				
				public void DragandDrop() {
					views.click();
					new WebDriverWait(driver,5).until(ExpectedConditions.visibilityOf(dragDrop));
					dragDrop.click();
				WebElement source=	driver.findElementsByClassName("android.view.View").get(0);
				WebElement destination=	driver.findElementsByClassName("android.view.View").get(1);
					TouchAction t = new TouchAction(driver);
				//	t.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
					t.longPress(element(source)).moveTo(element(destination)).release().perform();
					
				}
				
}
