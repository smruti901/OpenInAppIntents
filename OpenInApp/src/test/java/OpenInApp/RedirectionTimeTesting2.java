package OpenInApp;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class RedirectionTimeTesting2 {
	
	@Test
	public void InstagramValidate() throws IOException, InterruptedException {
		Capabilities("https://oia.bio/noormusicvideo"); 
//		Capabilities("https://Cricketspy.oia.bio/Cricketspy");
//		Capabilities("https://youtube.openinapp.co/flyingmeenaboi");
//		Capabilities("https://openinapp.co/sau-dafa-song");
//		Capabilities("https://openinapp.co/76xy6");  
//		Capabilities("https://openinapp.co/dyl6w");
//		Capabilities("https://heylink.oia.bio/heylink"); 
//		Capabilities("https://openinapp.co/xpt6m"); 
//		Capabilities("https://openinapp.co/os9qq");  
//		Capabilities("https://openinapp.co/jwc2k");
//		Capabilities("https://openinapp.co/bleed-blue-army");  
//		Capabilities("https://openinapp.co/8w0zd");
//		Capabilities("https://openinapp.co/837t0");  
//		Capabilities("https://openinapp.co/telegram/crazziee-stuff");
//		Capabilities("https://openinapp.co/dkxot");  
//		Capabilities("https://openinapp.co/30i1k");
//		Capabilities("https://openinapp.co/0z26q");  
//		Capabilities("https://openinapp.co/klf5c");
//		Capabilities("https://openinapp.co/youtube/solsothebest");  
//		Capabilities("https://openinapp.co/5mkvi");  
//		Capabilities("https://openinapp.co/xw9ri"); 
//		Capabilities("https://openinapp.co/wsvp5");  Capabilities("https://openinapp.co/apebu");
//		Capabilities("https://oia.bio/Lveffdiamond");  Capabilities("https://openinapp.co/ytseh");
//		Capabilities("https://openinapp.co/udvgx");  
//		Capabilities("https://openinapp.co/talibpictures"); 
//		Capabilities("https://openinapp.co/zgr0d");  Capabilities("https://telegram.openinapp.co/betadetective-1");
//		Capabilities("https://openinapp.co/t57tt");  
//		Capabilities("https://openinapp.co/kgzbp");
//		Capabilities("https://openinapp.co/Mms-Link-video");  Capabilities("https://openinapp.co/1a1j7");
//		Capabilities("https://openinapp.co/lc7ud");  
//		Capabilities("https://openinapp.co/t7570");
//		Capabilities("https://openinapp.co/g2wtm");  Capabilities("https://t.oia.bio/government");
//		Capabilities("https://openinapp.co/an6u3");  
//		Capabilities("https://2-DIN.openinapp.co/iputq");
//		Capabilities("https://openinapp.co/fp7l8"); 
//		Capabilities("https://openinapp.co/ofuaj");
//		Capabilities("https://openinapp.co/z6yzv"); 
//		Capabilities("https://openinapp.co/b7r9h");
//		Capabilities("https://openinapp.co/9qxk6");
//		Capabilities("https://openinapp.co/u6lk9");  
//		Capabilities("https://openinapp.co/heub0"); 
//		Capabilities("https://t.oia.bio/cinedreams-1-76866");  
//		Capabilities("https://openinapp.co/xs0vm"); 
//		Capabilities("https://openinapp.co/diyds");
		
	
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
		System.out.println(openinappLink);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Done\"]/android.widget.ImageView")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Done\"]/android.widget.ImageView")).click();
		driver.findElement(By.id("com.instagram.android:id/text_1")).click();
		Thread.sleep(10000);
		Object appNameObj = driver.getCapabilities().getCapability("appPackage");
        Object appVersionObj = driver.getCapabilities().getCapability("appVersion");
        Object platformNameObj = driver.getCapabilities().getCapability("platformName");

        // Check if the capabilities are not null before accessing their values
        String appName = (appNameObj != null) ? appNameObj.toString() : "N/A";
        String appVersion = (appVersionObj != null) ? appVersionObj.toString() : "N/A";
        String platformName = (platformNameObj != null) ? platformNameObj.toString() : "N/A";

        // Print the app information
        System.out.println("App Name: " + appName);
        System.out.println("App Version: " + appVersion);
        System.out.println("Platform Name: " + platformName);
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg= new File("./openinappLinkScreenshots/InstagramBioOpenInAppLinks"+timestampDate()+"/"+timestampTime()+".jpeg");
		FileUtils.copyFile(src, trg);
		          
	}
	public static String timestampTime() {
		return new SimpleDateFormat("HH-mm-ss").format(new Date());
	}

	public static String timestampDate() {
		return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
	}

}
