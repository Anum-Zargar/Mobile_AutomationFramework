package com.framework.pages;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.framework.general.Mobile_Base;
import com.framework.util.TestUtil;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AccountPages extends Mobile_Base {
	
	   protected WebDriverWait wait;
	   TestUtil testUtil = new TestUtil();
	   
	
	  public AccountPages(AndroidDriver driver ) {
	        this.driver = driver;
	        wait = new WebDriverWait(driver, 1);
	        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	    }
	  
	  @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='What's On']")
	  private MobileElement whatsOn;
	  
	  
	  @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Coming Soon']")
	  private MobileElement   comingSoon;
	
	  @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='My Tickets']")
	  private MobileElement   myTickets;
	  
	  @AndroidFindBy(xpath ="//android.view.ViewGroup[@content-desc='LOGIN TO ACCESS TICKETS']")
	  private MobileElement   accessTickets;
	  
	  @AndroidFindBy(xpath =("(//android.widget.EditText)[1]"))
	  private MobileElement   email;
	  
	  @AndroidFindBy(xpath =("(//android.widget.EditText)[2]"))
	  private MobileElement   password;
	  
	  
	  @AndroidFindBy(xpath ="//android.view.ViewGroup[@content-desc='LOGIN']")
	  private MobileElement   login;
	  
	  
	  @AndroidFindBy(xpath ="//android.view.ViewGroup[@content-desc='Next Show']")
	  private MobileElement   nextshow;
	  
	  @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Upcoming Shows']")
	  private MobileElement   upcomingShows;
	  
	  @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Recently Watched']")
	  private MobileElement   recentlywatched;
	  
	  @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"LET'S GO\"]")
	  private MobileElement letsgo;
	  
	  @AndroidFindBy(xpath ="(//android.view.ViewGroup[@content-desc='NO THANKS'])[2]")
	  private MobileElement nothanks;

	  @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Today, June 06']")
	  private MobileElement today;
	  
	  @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Coming Soon']")
	  private MobileElement comingsoon;
	  
	  @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Opening: Fri, Jul 24']")
	  private MobileElement startmovie;
	 
	  @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Opening: Fri, Aug 21']")
	  private MobileElement endmovie;
	  
	  @AndroidFindBy(xpath ="//android.view.ViewGroup[@content-desc='Cineplex.Corporate.Presentation.MovieShowtimesPageViewModel']/android.view.ViewGroup/android.view.ViewGroup[1]")
     private MobileElement playtrailer;
	  
	  @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']") 
	  private MobileElement backbutton;
	  
	  @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc= '... READ MORE']")
	  private MobileElement readmore;
	  
	  @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Theatres']")
	  private MobileElement theatres;
	  
	  @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Cineplex.Corporate.Presentation.TheatreItemViewModel']")
	  private MobileElement silvermovie;
	  
	  
	  @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='MORE THEATRE INFO']")
	  private MobileElement moretheatreinfo; 
	  
	  //@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Cineplex Cinemas Mississauga']")
	 // private MobileElement startsilvermovie;
	  
	  @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc= 'Friday, November 13']")
	  private MobileElement thetresdate;
	  
	  @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc= 'TODAY, June 07']")
	  private MobileElement todaydate;
	  
	  @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc= 'Seats Preview']")	 
	  private MobileElement seatpreview;
	  
	  @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc= 'View Menu']")	
	  private MobileElement menu;
	  
	  @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc= 'Cineplex.Corporate.Presentation.TheatreShowtimeItem'][1]")
	  private MobileElement time;
	  
	  
	  @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc= 'Close']")
			  private MobileElement close;
	  
	  
	  @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc= 'Food']/android.view.ViewGroup")	 
	  private MobileElement food;
	  
	  @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc= 'VIEW'][1]")
	  private MobileElement   viewfood;
	  
	  @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc= 'Login and select a showtime for in-seat ordering']")
	  private MobileElement   clicklogin;
	 
	  @AndroidFindBy(xpath = "//android.widget.Button[@text= 'OK']")
	 private MobileElement   textok;
	
	  
	  @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc= 'ADD TO CART']")
	  private MobileElement   addtocart;
	  
	  public void myTickets() throws Exception
	  	{
	  		testUtil.clickElement(nothanks, "No thanks");
	  		testUtil.clickElement(myTickets, "my Tickets");
	  		testUtil.clickElement(accessTickets, "access Tickets");
	  		Thread.sleep(3000);
	  		testUtil.enterText(email, "raj.ssbc@gmail.com", "Email");
	  		testUtil.enterText(password, "Tablet123", "Password");
	  		 driver.hideKeyboard();
	  		testUtil.clickElement(login, "Login");
	  		Thread.sleep(2000);
	  		testUtil.clickElement(nextshow, "Next show");
	  		testUtil.clickElement(upcomingShows, "Upcoming Shows");
	  		testUtil.clickElement(upcomingShows, "Upcoming Shows");
	  		testUtil.clickElement(recentlywatched, "Recently Watched");
	  		testUtil.clickElement(letsgo, "Lets Go");
	  		testUtil.clickElement(comingsoon, "Coming soon");
	  	}
	  	
	  	public void clicktab() {
			boolean flag = false;
		//	views.click();
			for (int i = 0;  i <= 10; i++) {
				try {
					//endmovie.click();
					//silvermovie.click();
					seatpreview.click();
					flag=true;
					break;
				}
				catch (Exception e) {
					// TODO: handle exception
					verticalSwipe();

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
	  	
	  	
	  	
	  	public void Whatson() throws Exception 
	  	{
	  		testUtil.clickElement(nothanks, "No thanks");
	  		testUtil.clickElement(today, "Today 06 June");
	  		testUtil.clickElement(comingsoon, "Comingsoon");
	  		Thread.sleep(3000);
	  	      clicktab();
	  		testUtil.clickElement(endmovie, "end movie");
	  		Thread.sleep(3000);
	  		testUtil.clickElement(readmore, "Read more");
	  		testUtil.clickElement(backbutton, "back button");
	  		//testUtil.clickElement(playtrailer, "Play Trailer");
	  		
	  	}
	  	
	  	 public void theatres() throws Exception
		  	{
		  		testUtil.clickElement(nothanks, "No thanks");
		  		testUtil.clickElement(theatres, "Click Theatres");
		  		Thread.sleep(3000);
		  			System.out.println("Testt");
		  			MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
		  					"new UiScrollable(new UiSelector().resourceId(\"android:id/content\")).scrollIntoView("
		  					+ "new UiSelector().description(\"Cineplex Cinemas Queensway and VIP\"))"));
		  			element.click();
		  			System.out.println("Testt1221");
		  		Thread.sleep(3000);
		  		testUtil.clickElement(todaydate, "Click on today date");
		  		testUtil.clickElement(thetresdate, "Click on theatres date");
		  		//clicktab();
		  		Thread.sleep(3000);
		  		testUtil.clickElement(seatpreview, "Click on seat preview");
		  		//testUtil.clickElement(moretheatreinfo, "Click More theatre info");
		  		Thread.sleep(3000);
		  		//testUtil.waitForElement(time, 10, "Time should be there");
		  		testUtil.clickElement(time, "Click on time preview");
		  		testUtil.clickElement(close, "Click on Close seat preview");
		  	}
	  	 
	  	public void food() throws Exception
	  	{
	  		testUtil.clickElement(nothanks, "No thanks");
	  		testUtil.clickElement(food, "Click food");
	  		Thread.sleep(3000);
	  		testUtil.clickElement(menu, "Click menu");
	  		//MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"android:id/content\")).scrollIntoView("new UiSelector().description(\"Sparkling + Rose"/))"));
	  				MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
		  					"new UiScrollable(new UiSelector().resourceId(\"android:id/content\")).scrollIntoView("
		  					+ "new UiSelector().description(\"Sparkling + Rose\"))"));
		  			element.click();
		  			System.out.println("Testt1221");
		  		Thread.sleep(3000);
		  		testUtil.clickElement(viewfood, "Choose food menu");
		  		testUtil.clickElement(clicklogin, "Click food login");
		  		testUtil.clickElement(textok, "Click Ok");
		  		Thread.sleep(3000);
		  		testUtil.clickElement(addtocart, "Click Add to Cart");
	  	}
}
