import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class TestingJenkins {
	
		@Test
		public void hello() throws IOException, InterruptedException{
			 DesiredCapabilities capabiliti=new DesiredCapabilities();
			 
		     capabiliti.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		  
		     capabiliti.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		     capabiliti.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");

		    capabiliti.setCapability(MobileCapabilityType.APP_PACKAGE, "com.sei.android");
		    capabiliti.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.sei.android.views.MainActivity");
		
		    AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabiliti);
		
		    
		    //to make register happen 
//		    driver.findElementById("com.sei.android:id/invertedButtonStyle1").click();
//		    driver.findElementById("com.sei.android:id/txtFirstName").sendKeys("Harish");
//		    driver.findElementById("com.sei.android:id/txtLastName").sendKeys("Kumar");
//		    driver.findElementById("com.sei.android:id/txtEmail").sendKeys("harish.kumarqa5@gmail.com");
//		    driver.findElementById("com.sei.android:id/txtVerifyEmail").sendKeys("harish.kumarqa5@gmail.com");
//		    driver.scrollTo("Country");
//		    Thread.sleep(3000);
//		    driver.findElementById("com.sei.android:id/txtPassword").sendKeys("azmeera1993");
//		    driver.findElementById("com.sei.android:id/txtVerifyPassword").sendKeys("azmeera1993");
//		    
//		    Thread.sleep(2000);
		    
		    //for swiping up and down direction 
		    
		    
		    
		   // driver.scrollTo("Submit");
		    
		   
		    
		    
		    
		    
//		    //for handling android native key event 
//		    driver.sendKeyEvent(AndroidKeyCode.BACK);
//		    
//		    
//		   
//		    
//		    //for tapping action Touch Action.
//		    
//	        MobileElement ele= (MobileElement)driver.findElementById("com.sei.android:id/txtBirthday");
////		    
//		    ele.swipe(SwipeElementDirection.UP, 4000);
//	   	    
		     
		    
		  /*  
		    
		    TouchAction t=new TouchAction(driver);
		               t.tap(ele).perform();
		    
		               
		     for(int i=0;i<180;i++){
		       
		    	 driver.findElementById("android:id/prev").click();   
		    
		     }
		               
		     
		    driver.findElementByAndroidUIAutomator("new UiSelector().text(\"11\")").click();
		     
		  
		    driver.findElementById("android:id/button1").click();
		               
		               
		               
		 
		    driver.findElementById("com.sei.android:id/chkAcceptTermsAndConditions").click();
		    driver.findElementById("com.sei.android:id/navRightText").click();
		    */
		    
	        
	        //for sign in operation to be done.
		    driver.findElementById("com.sei.android:id/solidButtonStyle1").click();
		    
		    //in the sign in page 
	        driver.findElementById("com.sei.android:id/txtEmail").sendKeys("rahulazmeera@gmail.com");
	        driver.findElementById("com.sei.android:id/txtPassword").sendKeys("azmeera1993");
	        
	        //click the submit button 
	        driver.findElementById("com.sei.android:id/navRightText").click();
	        
	        Thread.sleep(3000);
	        
	        String so= driver.getPageSource();
		    
		    System.out.print(so);
	        
	        
		    //method to take screenshot 
		   // String outputlocation="/home/rahul/Desktop/UntitledFolder";
		    
		    Thread.sleep(3000);
		    File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    //FileUtils.copyFile(srcFiler, new File(outputlocation+ "appImage" + ".png"));
		    
		   // FileUtils.copyFile(srcFile, new File("/home/rahul/Desktop/appImlllllage.png"));
		    
		   /* //after successful  registration
		    driver.findElementById("com.sei.android:id/navLogo").click();
		    
		    Thread.sleep(3000);
		    File srFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    //FileUtils.copyFile(srcFiler, new File(outputlocation+ "appImage" + ".png"));
		    
		    FileUtils.copyFile(srFile, new File("/home/rahul/Desktop/appImage1.png"));   */
		    
		    //after looged in to the app
		    driver.findElementById("com.sei.android:id/navMenuIcon").click();
		    
		    Thread.sleep(3000);
		    
		    
		    File sFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    //FileUtils.copyFile(srcFiler, new File(outputlocation+ "appImage" + ".png"));
		    
		  //  FileUtils.copyFile(sFile, new File("/home/rahul/Desktop/appImagkkk.png"));
		   
		    //clicking on the side header from menu
		    driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Feedback\")").click();
		    
		    
		    //clicking the inside of the app 
		    driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Compliment\")").click();
		    //next page clicking 
		    driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Product Quality\")").click();
		    
		    
		    //clicking on the starts
		    driver.findElementById("com.sei.android:id/lblStar1").click();
		    driver.findElementById("com.sei.android:id/lblStar2").click();
		    driver.findElementById("com.sei.android:id/lblStar3").click();
		    driver.findElementById("com.sei.android:id/lblStar4").click();
	        
		    //entering in the text box 
		    driver.findElementById("com.sei.android:id/txtAnswer").sendKeys("I love this app !");
		    
		    //next page to locate stores
	        driver.findElementById("com.sei.android:id/navRightText").click();
	        
	        //feedback 
	        
	        driver.findElementById("com.sei.android:id/solidButtonStyle3Title").click();
	        
	        //to find address
	        driver.findElementById("com.sei.android:id/txtAddress").sendKeys("75006");
	        
	        Thread.sleep(3000);
	        
	        driver.findElementById("com.sei.android:id/lblFind").click();
	        
	        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	        
	        //selecting the store
	        
	        driver.scrollTo("18078").click();
	         
	        //contacting way
	        
	         driver.findElementByAndroidUIAutomator("new Uiselector().text(\"Yes, by email\")").click();
	         
	        
	        
	        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Enter your first name here.\")").sendKeys("Rahul");
	        
	        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Enter your last name here.\")").sendKeys("azmeer");

	        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Enter your email address here.\")").sendKeys("rahulazmeera@gmail.com");
	        
	        //navigate previous page
		    driver.findElementById("com.sei.android:id/navLeftText").click();
		    
		    
		   String s= driver.getPageSource();
		    
		    System.out.print(s);
	}
		
	

	
	
}
