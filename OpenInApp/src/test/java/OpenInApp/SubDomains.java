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

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SubDomains {

	@Test
	public void LinksToBeTested() throws InterruptedException, IOException {
//		Capabilities("https://openinapp.co/oxxcx"); 
		Capabilities("https://openinapp.co/6gbbi"); 
//		Capabilities("https://openinapp.co/jzbfl"); Capabilities("https://openinapp.co/9vl6c");
//		Capabilities("https://openinapp.co/g3n8t"); Capabilities("https://openinapp.co/wwtu3"); 
//		Capabilities("https://openinapp.co/61orp");	Capabilities("https://openinapp.co/9ohas");
//		Capabilities("https://openinapp.co/cb60y"); Capabilities("https://openinapp.co/wgto1");
//		Capabilities("https://openinapp.co/zurzt"); 
//		Capabilities("https://openinapp.co/5pvdz"); 
//		Capabilities("https://openinapp.co/p5smq"); 
//		Capabilities("https://openinapp.co/fqu2s"); 
//		Capabilities("https://openinapp.co/vo5n3"); Capabilities("https://openinapp.co/x1eu6");
//		Capabilities("https://openinapp.co/3ys2m");  
//		Capabilities("https://openinapp.co/iws7c");
//		Capabilities("https://openinapp.co/vercx"); 
//		Capabilities("https://openinapp.co/r1v3l"); 
//		Capabilities("https://openinapp.co/tt7ok"); 
		Capabilities("https://openinapp.co/cqq0u"); 
//		Capabilities("https://openinapp.co/se0qo"); 
//		Capabilities("https://openinapp.co/b3f1t"); Capabilities("https://openinapp.co/bfiha");
//		Capabilities("https://openinapp.co/oyvoa"); Capabilities("https://openinapp.co/9dlc6");
//		Capabilities("https://openinapp.co/dn81j");	Capabilities("https://openinapp.co/pypxk");
//		Capabilities("https://openinapp.co/g072i"); Capabilities("https://openinapp.co/mfzwo");
//		Capabilities("https://openinapp.co/xmqmf"); 
//		Capabilities("https://openinapp.co/txpw8"); 
//		Capabilities("https://openinapp.co/hneas"); Capabilities("https://openinapp.co/4lync"); 
//		Capabilities("https://openinapp.co/ikgkb"); Capabilities("https://openinapp.co/r4bj8");
//		Capabilities("https://openinapp.co/xj054"); Capabilities("https://openinapp.co/74h8p");
//		Capabilities("https://openinapp.co/ps3tc");	Capabilities("https://openinapp.co/h6dad");
//		Capabilities("https://openinapp.co/hodjh"); Capabilities("https://openinapp.co/2qy2s");
//		
//		Capabilities("https://openinapp.co/07hk2"); Capabilities("https://openinapp.co/jzgf0");
//		Capabilities("https://openinapp.co/ih817"); Capabilities("https://openinapp.co/u9up5");
		Capabilities("https://openinapp.co/irbt8");	
//		Capabilities("https://openinapp.co/rdsxm");
		
		
		
	}
	
	public void Capabilities(String openinappUrl ) throws InterruptedException, IOException {
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		cap.setCapability(MobileCapabilityType.UDID, "d4241031");
		cap.setCapability("appPackage","com.openinapp");
		cap.setCapability("appActivity", ".ui.splash.SplashActivity");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(url, cap);
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.swipe(260, 1376, 327, 52, 100);
		driver.findElement(By.xpath("//android.widget.TextView[@text='View all Links']")).click();
		driver.findElement(By.id("com.openinapp:id/et_feed_search")).sendKeys(openinappUrl);
		Thread.sleep(3000);
		driver.tap(1, 338, 448, 100);
		String originalDomain = driver.findElement(By.id("com.openinapp:id/tv_original_link_value")).getText();
		driver.findElement(By.id("com.openinapp:id/iv_link_redirect")).click();
		System.out.println(openinappUrl+" ======> "+originalDomain);
		
		Thread.sleep(6000);
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg= new File("./openinappLinkScreenshots/SubDomainLinks"+timestampDate()+"/"+timestampTime()+".jpeg");
		FileUtils.copyFile(src, trg);
		Thread.sleep(5000);
		
		driver.quit();
}
	public static String timestampTime() {
		return new SimpleDateFormat("HH-mm-ss").format(new Date());
	}
	
	public static String timestampDate() {
		return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
	}
}
