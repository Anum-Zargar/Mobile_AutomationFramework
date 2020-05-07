package com.framework.pages;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

import java.time.temporal.TemporalAmount;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.framework.general.Mobile_Base;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import static io.appium.java_client.touch.TapOptions.tapOptions;

public class EcommercePage extends Mobile_Base {
	
	   protected WebDriverWait wait;
	   
	
	  public EcommercePage(AndroidDriver driver ) {
	        this.driver = driver;
	        wait = new WebDriverWait(driver, 1);
	        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	    }
	  
	  @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.androidsample.generalstore:id/nameField']")
	  private MobileElement name;
	  
	  @AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter name here']")
	    private MobileElement name1;
	  
	  @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.androidsample.generalstore:id/btnLetsShop']")
	  private MobileElement shop;
	  
	  
	  @AndroidFindBy(xpath = "//*[@text='Female']")
	    private MobileElement female;
	  
	  @AndroidFindBy(xpath = "//[@resource-id='android:id/text1']")
	  private MobileElement option;
	  
	  @AndroidFindBy(xpath = "//android.widget.TextView[@text='Belgium']")
	    private MobileElement country;
	  
	  @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/'productName']")
	    private MobileElement jordan;
	  
	  
	  @AndroidFindBy(xpath = "//android.widget.TextView[@text='$120.0']")
	    private MobileElement price1;
	  
	  @AndroidFindBy(xpath = "//android.widget.TextView[@text='$160.97']")
	    private MobileElement price2;
	  
	  
	  @AndroidFindBy(xpath = "//android.widget.TextView[@text='$ 280.97']")
	  private MobileElement totalamt;
	  
	  @AndroidFindBy(xpath = "//*[@text ='Send me e-mails on discounts related to selected products in future']")
	  private MobileElement checkbox;
	  
	  
	  @AndroidFindBy(xpath = "//*[@text ='Please read our terms of conditions']")
	  private MobileElement text;
	  		
	  
	  @AndroidFindBy(xpath = "//*[@text ='Visit to the website to complete purchase']")
	  private MobileElement website;
	  
	  @AndroidFindBy(id = "com.androidsample.generalstore:id/productName")
	  private MobileElement productName;
	  
	  @AndroidFindBy(xpath = "//*[@text ='CLOSE']")
	  private MobileElement closebtn;
	  
	  @AndroidFindBy(id = "com.androidsample.generalstore:id/productPrice")
	  private List <WebElement> productPrice;
	  
	  public void clicktab() {
			boolean flag = false;
			for (int i = 0;  i <= 20; i++) {
				try {
					country.click();
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
	  
	     public void Name() {
	     //  clicktab();
			name1.sendKeys("Hellosss");
			driver.hideKeyboard();
			female.click();
			new WebDriverWait(driver,5).until(ExpectedConditions.visibilityOf(shop));
			//option.click();
			shop.click();
		
		}
	     
	     //move to specific product and add to list
	     
	     public void addcart() {
	    	 driver.findElement(By.id("android:id/text1")).click();
	    	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
	    		name1.sendKeys("Hellosss");
				driver.hideKeyboard();
				female.click();
				new WebDriverWait(driver,5).until(ExpectedConditions.visibilityOf(shop));
				//option.click();
				shop.click();
	    	 
	    	 driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));
	    	 int count=    driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
	    	    for(int i=0;i<count;i++)

	    	    {

	    	    String text=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();

	    	   

	    	    if(text.equalsIgnoreCase("Jordan 6 Rings"))

	    	    {  
	    	    	driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();

	    	break;

	    	    }
	    	    }

	    	   driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	    	   String lastpageText =    driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
	    	   Assert.assertEquals("Jordan 6 Rings", lastpageText);

	    	   }
	     		

	 

			
			public void AddCart() throws InterruptedException {
				name1.sendKeys("Anu");
				driver.hideKeyboard();
				female.click();
				new WebDriverWait(driver,5).until(ExpectedConditions.visibilityOf(shop));
				//option.click();
				shop.click();
				Thread.sleep(3000);
				  driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
				  driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
				  driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
				  
			}
			
			//sum of price equal to total price
			public void Totalprice() throws InterruptedException {
				AddCart();
				  Thread.sleep(4000);
				//String amt1 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();
				  String amt1 = productPrice.get(0).getText();
				amt1= amt1.substring(1);
				double  amount1 =Double.parseDouble(amt1);
				//StString amt1 =ring amt2 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();
				String amt2 =productPrice.get(1).getText();
				amt2= amt2.substring(1);
				double amount2 =Double.parseDouble(amt2);
				double sumofProducts =amount1 +  amount2;
				String total = totalamt.getText();
				total= total.substring(1);
				Double TotalSumofProducts = Double.parseDouble(total);
				Assert.assertEquals(sumofProducts, TotalSumofProducts);
				
				
			} 
			
			
			public void checkBox() throws InterruptedException {
				Totalprice();
				TouchAction t=new TouchAction(driver);
				t.tap(tapOptions().withElement(element(checkbox))).perform();
				t.longPress(longPressOptions().withElement(element(text)).withDuration(ofSeconds(2))).release().perform();
				closebtn.click();
				website.click();
				
				
				
				
				}
			
			public void WebView() throws InterruptedException {
				checkBox() ;
				Thread.sleep(4000);
				Set<String> contexts=driver.getContextHandles();
				for(String ContextName : contexts) {
					System.out.println(ContextName);
					
				}
				
				driver.context("WEBVIEW_com.androidsample.generalstore");
				driver.findElementByName("q").sendKeys("Hello");
				driver.pressKey(new KeyEvent(AndroidKey.BACK));
				driver.context("NATIVE APP");
				
			}
}