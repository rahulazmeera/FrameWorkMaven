import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class TestingJenkins {
	
     
	  public static AndroidDriver driver;
		
	  
	    @BeforeTest
		public void hello() throws IOException, InterruptedException{
			//App launch 
			
			 DesiredCapabilities capabiliti=new DesiredCapabilities();
			 
		     capabiliti.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		  
		     capabiliti.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		     capabiliti.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");

		    capabiliti.setCapability(MobileCapabilityType.APP_PACKAGE, "com.seven.eleven.phoenix");
		    capabiliti.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.seven.eleven.phoenix.ui.SplashActivity");
		
		    driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabiliti);
		 
		}
		    
		    /***Test start from Here ***/
	    
	   
	        @Test(priority=1)
		    public void skipbuttonPresent(){
		    
		    //click the skip button present
		    driver.findElementById("com.seven.eleven.phoenix:id/btn_skip").click();
		    
		    System.out.println("first page launched successfully ");
		    
		    }
		    
		    @Test(priority=2)
		    public void KababMenuPresent(){
		    //click the kabab menu button
		    driver.findElementById("com.seven.eleven.phoenix:id/btn_overflow").click();
		    System.out.println("Kabab menu present and able to click");
		    }
		    
		    @Test(priority=3)
		    public void helpButtonPresent(){
		    //click the help button present and close the button
		    driver.findElementById("com.seven.eleven.phoenix:id/btn_help").click();
		    driver.findElementById("com.seven.eleven.phoenix:id/close_btn").click();
		    
		    }
		    
		    @Test(priority=4)
		    public void sign_inButtonPresent(){
		    
		    //click the sign in button and close 
		    driver.findElementById("com.seven.eleven.phoenix:id/btn_sign_in").click();
		    driver.findElementById("com.seven.eleven.phoenix:id/close_btn").click();
		     System.out.print("Sign in Button working");
		    }
		    
		    @Test(priority=5)
		    public void StoreLocatPresent(){
		    
		    //click the store locator button. 
		    driver.findElementById("com.seven.eleven.phoenix:id/btn_store_locator").click();
		   // driver.findElementById("com.seven.eleven.phoenix:id/close_btn").click();
		   
		    
		    //skip mode
		   try{
		    	
		    	driver.findElementById("com.seven.eleven.phoenix:id/btn_skip").click();
		    }
		    catch(Exception e){
	          e.printStackTrace();
		    }
		    
			//driver.findElementByName("Skip this for now").click();
			
	    	//System.out.println("Clicked by name");
		    
		    //close the button 
		    driver.findElementById("com.seven.eleven.phoenix:id/close_btn").click();
		    
		    
		    }
		    
		    @Test(priority=6)
		    public void signIn() throws InterruptedException{
		    
		    //sign in user flow on the menu button screen
		    //click sign in
		    driver.findElementById("com.seven.eleven.phoenix:id/btn_sign_in").click();
		    
		    System.out.println("sign in button present");
		    //enter email
		    driver.findElementById("com.seven.eleven.phoenix:id/email").sendKeys("trainingmode@7-11.com");
		    System.out.println("Successfully entered Email");
		    //enter password
		    driver.findElementById("com.seven.eleven.phoenix:id/password").sendKeys("@Seven11");
		    System.out.println("Successfully entered Password");
		    
		    //enter sign in 
		    driver.findElementById("com.seven.eleven.phoenix:id/sign_in_btn").click();
		    System.out.println("Successfully signed in");
		    
		   
		    
		    }
		    

		    @Test(priority=7)
		    public void OrderButtonPresent() throws InterruptedException{
		    Thread.sleep(5000);
		    //Orders Button 
		    driver.findElementById("com.seven.eleven.phoenix:id/btn_orders").click();
		    String s= driver.getPageSource();
		    System.out.println(s);
		    Thread.sleep(3000);
		    TouchAction a=new TouchAction(driver);
		   // a.press(990, 157);
		      a.tap(990, 157).perform();
		    
	         System.out.println("orders button present"); 
		      
		   
		    }
		    
		    @Test(priority=8)
		    public void StoreLocatorPresent(){
		    //Store Locator Button 
		    driver.findElementById("com.seven.eleven.phoenix:id/btn_store_locator").click();
		    System.out.println("StoreLocatorPresent Success");
             try{
		    	
		    	driver.findElementById("com.seven.eleven.phoenix:id/btn_skip").click();
		     }
		     catch(Exception e){
	          e.printStackTrace();
		     }
             driver.findElementById("com.seven.eleven.phoenix:id/close_btn").click();
		    
             
             
		    }
		    
		    @Test(priority=9)
		    public void TermsAndConditionsPresent() throws InterruptedException{
		    
		    //Terms and Conditions
		    driver.findElementById("com.seven.eleven.phoenix:id/btn_terms_conditions").click();
		    Thread.sleep(5000);
		    TouchAction a2=new TouchAction(driver);
			  
		      a2.tap(59, 200).perform();
		      
		      System.out.println("Terms and Conditions present");
		  //  driver.findElementById("com.seven.eleven.phoenix:id/backarrow").click();
		    }
		    
		    @Test(priority=10)
		    public void PrivacyPolicyPresent() throws InterruptedException{
		    //Privacy Policy
		    driver.findElementById("com.seven.eleven.phoenix:id/btn_privacy_policy").click();
		    Thread.sleep(5000);
		    TouchAction a1=new TouchAction(driver);
			  
			      a1.tap(59, 200).perform();
			      
		   System.out.println("Privacy Policy Present");	      
		   // driver.findElementById("com.seven.eleven.phoenix:id/backarrow").click();
		    }
		    
		    
		    @Test(priority=11)
		    public void HelpButtonPresent() throws InterruptedException{
		    
		    //validating Help
		    driver.findElementById("com.seven.eleven.phoenix:id/btn_help").click();
		    Thread.sleep(3000);
		    driver.findElementById("com.seven.eleven.phoenix:id/close_btn").click();
		    
		    System.out.println("help Button Present");
		    }
		    
		    
		    @Test(priority=12)
		    public void ProfileLinkPresent() throws InterruptedException{
		    //profile link validation
		    driver.findElementById("com.seven.eleven.phoenix:id/btn_profile").click();
		    Thread.sleep(3000);
		    driver.findElementById("com.seven.eleven.phoenix:id/close_btn").click();
		    
		    System.out.println("Profile link present");
		    
		    }
		    
		    @Test(priority=13)
		    public void ValletButtonPresent() throws InterruptedException{
		   //wallet button 
		    driver.findElementById("com.seven.eleven.phoenix:id/btn_wallet").click();
		    Thread.sleep(5000);
		    
		    if(driver.findElementsById("com.seven.eleven.phoenix:id/close_btn").size()>1){
            driver.findElementById("com.seven.eleven.phoenix:id/close_btn").click();
		    } else
		      {
		    	  TouchAction a3=new TouchAction(driver);
				   // a.press(990, 157);
				      a3.tap(990, 157).perform();
		    	
		      }
		    
		    System.out.println("Vallet Button is present");
		    	
		    }
		    
		    
		    @Test(priority=14)
		    public void SignOut() throws InterruptedException{
		    //Sign Out
		    driver.findElementById("com.seven.eleven.phoenix:id/btn_sign_out").click();
		    Thread.sleep(3000);
		    driver.findElementById("com.seven.eleven.phoenix:id/ok_btn").click();
		    System.out.println("Successfully logged Out of the app");  
		    }
		    
		    
		    
	}

		
	

	
	

