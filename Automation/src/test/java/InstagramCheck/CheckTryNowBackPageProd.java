package InstagramCheck;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CheckTryNowBackPageProd {

	@Test
	public void InstagramValidate() throws IOException, InterruptedException {
		//Youtube
		System.out.println("Youtube");
		Capabilities("openinapp.co/orw6j");  
//		Capabilities("Youtube.openinapp.co/fz2c9"); 

		// Instagram
//		System.out.println("Instagram");
//		System.out.println();
//		Capabilities("openinapp.co/ybhuv");  
//		Capabilities("Instagram.openinapp.co/r4nxv");  
		
//		// Facebook
		System.out.println("Facebook");
		Capabilities("openinapp.co/mtfcd"); 
//		Capabilities("Facebook.openinapp.co/01k6c"); 
		
//		// Amazon
		System.out.println("Amazon");
    	Capabilities("openinapp.co/bnpv9");  
////		Capabilities("Amazon.openinapp.co/1051o");  
//
//		// LinkedIN
		System.out.println("LinkedIN");
		Capabilities("openinapp.co/yztxm");  	
////		Capabilities("LinkedIn.openinapp.co/zidj3");  
//	   
//		// twitter
		System.out.println("Twitter");
		Capabilities("openinapp.co/zrf2t");  
////		Capabilities("Twitter.openinapp.co/cg2n4");  
//
//		// Spotify
		System.out.println("Spotify");
 		Capabilities("openinapp.co/rq8q2");  
////		Capabilities("Spotify.openinapp.co/ha44f");  
//		
//		//Snapchat
		System.out.println("Snapchat");
		Capabilities("openinapp.co/c85es");  
////		Capabilities("Snapchat.openinapp.co/71r5y"); 
//		
//		//Bitly
		System.out.println("BitLy");
		Capabilities("openinapp.co/o6cva");
////		Capabilities("Bitly.openinapp.co/qe6xe"); 
//		
//		// bookmyshow
		System.out.println("Book My Show");
		Capabilities("openinapp.co/jp4pp");  
////		Capabilities("BMS.openinapp.co/b6l3u"); 
//		
//		// Moj app
		System.out.println("Moj App");
		Capabilities("openinapp.co/6w4io"); 
////		Capabilities("MojApp.openinapp.co/988m6");  
//		
//		// Twitch
		System.out.println("Twitch");
		Capabilities("openinapp.co/u7o7b");  
//		Capabilities("Twitch.openinapp.co/fu4b3");  

//		//Capabilities("openinapp.co/o7bhe");  Capabilities("inopenapp.com/vpor4");// Loco
//		//Capabilities("Loco.openinapp.co/ym8nk");  Capabilities("Loco.inopenapp.com/x5u7i");

		
	
	}

	public void Capabilities(String openinappLink) throws InterruptedException, IOException {
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		cap.setCapability(MobileCapabilityType.UDID, "d4241031");
		cap.setCapability("appPackage","com.instagram.android");
		cap.setCapability("appActivity", ".activity.MainTabActivity");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		URL url = new URL("http://localhost:4723/wd/hub");
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
		System.out.println(openinappLink);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Done\"]/android.widget.ImageView")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Done\"]/android.widget.ImageView")).click();
		driver.findElement(By.id("com.instagram.android:id/text_1")).click();
		Thread.sleep(2500);
		String xmlSource = driver.getPageSource();
		
        // Extract the package name using regex
        Pattern pattern = Pattern.compile("package=\"(.*?)\"");
        Matcher matcher = pattern.matcher(xmlSource);
        if (matcher.find()) {
            String packageName = matcher.group(1);
            
            System.out.println("Redirected app package name: " + packageName);
        }
		Thread.sleep(5000);
		String command = "adb shell input keyevent KEYCODE_APP_SWITCH";
        Runtime.getRuntime().exec(command);
        driver.findElement(By.xpath("//android.widget.FrameLayout[contains(@content-desc,\"Instagram\")]")).click();
        System.out.println(driver.findElement(By.xpath("//android.widget.Button[@text='Try Now!']")).getText());
        driver.findElement(By.xpath("//android.widget.Button[@text='Try Now!']")).click();
        Thread.sleep(2000);
//       
        driver.findElement(By.id("com.android.chrome:id/url_bar")).click();
        System.out.println(driver.findElement(By.id("com.android.chrome:id/line_1")).getText());
        System.out.println();
		
	        
//	        Thread.sleep(5000);
//		TakesScreenshot ts= (TakesScreenshot)driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File trg= new File("./openinappLinkScreenshots/InstagramBioOpenInAppLinks"+timestampDate()+"/"+timestampTime()+".jpeg");
//		FileUtils.copyFile(src, trg);
		
//		logger.info("This will be logged and saved to the configured appenders.");
		
		
		          
	}
	
//	 private static String extractTitleFromPageSource(String pageSource) {
//	        Pattern pattern = Pattern.compile("<title>(.*?)</title>");
//	        Matcher matcher = pattern.matcher(pageSource);
//	        if (matcher.find()) {
//	            return matcher.group(1);
//	        }
//	        return null;
//	    }
//	public static String timestampTime() {
//		return new SimpleDateFormat("HH-mm-ss").format(new Date());
//	}
//
//	public static String timestampDate() {
//		return new SimpleDateFormat("dd-MM-yyyy").format(new Date());
//	}
//	public static String timestampTimeMilliseconds() {
//	    long currentTimeMillis = System.currentTimeMillis();
//	    String milliseconds = String.format("%03d", currentTimeMillis % 1000);
//	    return milliseconds;
//	}
//	public static String timestampTimeAll() {
//	    String timestamp = new SimpleDateFormat("HH-mm-ss").format(new Date());
//	    long currentTimeMillis = System.currentTimeMillis();
//	    String milliseconds = String.format("%03d", currentTimeMillis % 1000);
//	    return timestamp + "-" + milliseconds;
//	}
//	public static long getTimestampDiffInMillis(String timestamp1, String timestamp2) {
//	    try {
//	        SimpleDateFormat sdf = new SimpleDateFormat("HH-mm-ss-SSS");
//	        Date date1 = sdf.parse(timestamp1);
//	        Date date2 = sdf.parse(timestamp2);
//	        long diffInMillis = date2.getTime() - date1.getTime();
//	        return diffInMillis;
//	    } catch (ParseException e) {
//	        e.printStackTrace();
//	        return -1; // or throw an exception
//	    }
//	}
}
