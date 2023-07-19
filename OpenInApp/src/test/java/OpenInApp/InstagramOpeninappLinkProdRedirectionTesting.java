package OpenInApp;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class InstagramOpeninappLinkProdRedirectionTesting {
	
	@Test
	public void RedirectionTesting() throws IOException, InterruptedException {
		//Youtube
		System.out.println("Youtube");
		System.out.println();
		Capabilities("https://openinapp.co/7beod");  
		Capabilities("Youtube.openinapp.co/2moqz"); 

		// Instagram
		System.out.println("Instagram");
		System.out.println();
		Capabilities("https://openinapp.co/sje4r");  
		Capabilities("https://Instagram.openinapp.co/49l7y");  
		
		// Facebook
		System.out.println("Facebook");
		System.out.println();
		Capabilities("openinapp.co/mtfcd"); 
		Capabilities("Facebook.openinapp.co/01k6c"); 
		
		// Amazon
		System.out.println("Amazon");
		System.out.println();
    	Capabilities("openinapp.co/i4oq9");  
		Capabilities("Amazon.openinapp.co/jeli0");  

		// LinkedIN
		System.out.println("LinkedIN");
		System.out.println();
		Capabilities("openinapp.co/yztxm");  	
		Capabilities("LinkedIn.openinapp.co/zidj3");  
	   
		// twitter
		System.out.println("Twitter");
		System.out.println();
		Capabilities("openinapp.co/zrf2t");  
		Capabilities("Twitter.openinapp.co/01idc");  

		// Spotify
		System.out.println("Spotify");
		System.out.println();
 		Capabilities("openinapp.co/rq8q2");  
		Capabilities("Spotify.openinapp.co/ha44f");  
		
		//Snapchat
		System.out.println("Snapchat");
		System.out.println();
		Capabilities("openinapp.co/c85es");  
		Capabilities("Snapchat.openinapp.co/71r5y"); 
		
		//Bitly
		System.out.println("BitLy");
		System.out.println();
		Capabilities("openinapp.co/o6cva");
		Capabilities("Bitly.openinapp.co/qe6xe"); 
		
		// bookmyshow
		System.out.println("Book My Show");
		System.out.println();
		Capabilities("openinapp.co/jp4pp");  
		Capabilities("BMS.openinapp.co/b6l3u"); 
		
		// Moj app
		System.out.println("Moj App");
		System.out.println();
		Capabilities("openinapp.co/6w4io"); 
		Capabilities("Moj.openinapp.co/f3j55");  
		
		// Twitch
		System.out.println("Twitch");
		System.out.println();
		Capabilities("openinapp.co/u7o7b");  
		Capabilities("Twitch.openinapp.co/fu4b3");  
		
	
	}

	public void Capabilities(String openinappLink) throws InterruptedException, IOException {
		
//		int numRuns = 3;
//		for (int i = 0; i < numRuns; i++) {
//            try {
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		cap.setCapability(MobileCapabilityType.UDID, "d4241031");
		cap.setCapability("appPackage","com.instagram.android");
		cap.setCapability("appActivity", ".activity.MainTabActivity");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		URL url = new URL("http://localhost:4724/wd/hub");
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(url, cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("com.instagram.android:id/tab_avatar")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text='Edit profile']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Links']")).click();
		driver.tap(1, 498, 332, 100);
		driver.findElement(By.id("com.instagram.android:id/remove_link_button")).click();
		driver.findElement(By.id("com.instagram.android:id/primary_button")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Add external link']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='URL']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='URL']/following-sibling::android.widget.EditText")).sendKeys(openinappLink);
		System.err.println();
		System.out.println();
		System.out.print(openinappLink+" ==>");
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Done\"]/android.widget.ImageView")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Done\"]/android.widget.ImageView")).click();
		driver.findElement(By.id("com.instagram.android:id/text_1")).click();
		driver.findElement(By.id("android:id/button1")).click();
		 String currentAppPackage = driver.getCapabilities().getCapability("appPackage").toString();
//	        System.out.println("Current app package: " + currentAppPackage);
//	       String currentAppPackageTime = timestampTimeAll();
//	       System.out.println(timestampDate()+" "+currentAppPackageTime);
	       
	       Thread.sleep(2500);
	       String MiddleAppPackage = driver.currentActivity();
//	        System.out.println("Apppackage after redirecting from Instagram : " + MiddleAppPackage);
	        String MiddleAppPackageTime1 = timestampTimeAll();
//		       System.out.println(timestampDate()+" "+MiddleAppPackageTime1);
	       
	      
	      Thread.sleep(2500);
		 String xmlSource = driver.getPageSource();
		
	        // Extract the package name using regex
	        Pattern pattern = Pattern.compile("package=\"(.*?)\"");
	        Matcher matcher = pattern.matcher(xmlSource);
	        if (matcher.find()) {
	            String packageName = matcher.group(1);
	            
//	            System.out.println("Redirected app package name: " + packageName);
	           String RedirectedAppPackageTime = timestampTimeAll();
//	           System.out.println(timestampDate()+" "+RedirectedAppPackageTime);
	           
	            System.out.print(getTimestampDiffInMillis(MiddleAppPackageTime1, RedirectedAppPackageTime)-2500+" ms (Redirection Timing to )"+"==>"+packageName +"  Date and Time==>"+timestampDate()+"  "+timestampTime());
	            System.out.println();
	            System.out.println();
	            
	        } else {
	            System.out.println("Unable to extract package name");
	        }
	        
	        Thread.sleep(5000);
	        
	       
//	        String appName = driver.getCapabilities().getCapability("appPackage").toString();
//	        String appVersion = driver.getCapabilities().getCapability("appVersion").toString();
//	        String appCode = driver.getCapabilities().getCapability("appBuild").toString();
//
//	        System.out.println("App Name: " + appName);
//	        System.out.println("App Version: " + appVersion);
//	        System.out.println("App Code: " + appCode);


	       
	        

		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg= new File("./openinappLinkScreenshots/InstagramBioOpenInAppLinks"+timestampDate()+"/"+timestampTime()+".jpeg");
		FileUtils.copyFile(src, trg);
		
//		logger.info("This will be logged and saved to the configured appenders.");
		
//            } catch (IOException | InterruptedException e) {
//                e.printStackTrace();
//            }
//		}
		          
	}
	
	public static String timestampTime() {
		return new SimpleDateFormat("HH-mm-ss").format(new Date());
	}

	public static String timestampDate() {
		return new SimpleDateFormat("dd-MM-yyyy").format(new Date());
	}
	public static String timestampTimeMilliseconds() {
	    long currentTimeMillis = System.currentTimeMillis();
	    String milliseconds = String.format("%03d", currentTimeMillis % 1000);
	    return milliseconds;
	}
	public static String timestampTimeAll() {
	    String timestamp = new SimpleDateFormat("HH-mm-ss").format(new Date());
	    long currentTimeMillis = System.currentTimeMillis();
	    String milliseconds = String.format("%03d", currentTimeMillis % 1000);
	    return timestamp + "-" + milliseconds;
	}
	public static long getTimestampDiffInMillis(String timestamp1, String timestamp2) {
	    try {
	        SimpleDateFormat sdf = new SimpleDateFormat("HH-mm-ss-SSS");
	        Date date1 = sdf.parse(timestamp1);
	        Date date2 = sdf.parse(timestamp2);
	        long diffInMillis = date2.getTime() - date1.getTime();
	        return diffInMillis;
	    } catch (ParseException e) {
	        e.printStackTrace();
	        return -1; // or throw an exception
	    }
	}
}
