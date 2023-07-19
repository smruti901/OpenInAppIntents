package OpenInApp;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.bouncycastle.asn1.dvcs.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LinksToBeTested {
	
	@Test
	public void LinksOfOpenInApp() throws InterruptedException, IOException {
		Capabilities("https://openinapp.co/edkud");
		Capabilities("https://openinapp.co/77pqc");
		Capabilities("https://raj-shamani.openinapp.co/vzcf1");
		Capabilities("https://heylink.oia.bio/heylink");  
//		Capabilities("https://openinapp.co/Adultinsaan");
		
	    Capabilities("https://openinapp.co/cgap0"); 
		Capabilities("https://openinapp.co/ebcwc");
		Capabilities("https://openinapp.co/gwojs");  Capabilities("https://openinapp.co/8w0zd");
		Capabilities("https://openinapp.co/7xakq"); 
		Capabilities("https://roccohunt.openinapp.co/nonlitighiamopiu"); 
		Capabilities("https://t.oia.bio/government");  Capabilities("https://openinapp.co/ojgn8");
		Capabilities("https://openinapp.co/2k0ay");  Capabilities("https://t.openinapp.co/Ajeesh_Kumar_tips");
		Capabilities("https://openinapp.co/xq13d");  Capabilities("https://openinapp.co/vvage");
		Capabilities("https://openinapp.co/Roobai");  Capabilities("https://openinapp.co/e5f48");
		Capabilities("https://Post14.oia.bio/66v1v");  
		Capabilities("https://openinapp.co/56az0");
		Capabilities("https://openinapp.co/vb3ah");  
		Capabilities("https://openinapp.co/30tcj");  
		Capabilities("https://openinapp.co/sroxh"); 
		Capabilities("https://openinapp.co/og531");  Capabilities("https://openinapp.co/4g59a");
		Capabilities("https://TamilTech.openinapp.co/vivoT2");  Capabilities("https://openinapp.co/8jb1o");
		Capabilities("https://openinapp.co/9ywqo");  
		Capabilities("https://Post56.oia.bio/ajwgw"); 
		Capabilities("https://openinapp.co/n4ga1");  Capabilities("https://Post57.oia.bio/desiw");
//		Capabilities("https://openinapp.co/v66mq");  Saniya
		Capabilities("https://openinapp.co/dwdpj");
		Capabilities("https://openinapp.co/LSGIPL2023");  Capabilities("https://google.oia.bio/search-45");
		Capabilities("https://telegram.openinapp.co/betadetective-1");  
		Capabilities("https://TrakinTech.openinapp.co/vivoT2");
		Capabilities("https://openinapp.co/mh5f1");  Capabilities("https://openinapp.co/x3068");
		Capabilities("https://openinapp.co/telegram/PremiumDeals");  Capabilities("https://Telegram.openinapp.co/telegram/technical-sapien");
		Capabilities("https://openinapp.co/dh7ws"); 
		Capabilities("https://ghulam35.openinapp.co/59laq");
		Capabilities("https://openinapp.co/l0amz");  Capabilities("https://openinapp.co/3xg80");
		Capabilities("https://oia.bio/fc8fe");  Capabilities("https://t.openinapp.co/yedhotedagaundhi20");
		Capabilities("https://openinapp.co/2l6k9");  
		Capabilities("https://openinapp.co/lnzb5"); 
		Capabilities("https://openinapp.co/lpfuc");  
		Capabilities("https://openinapp.co/00v72"); 
		Capabilities("https://openinapp.co/p0m1p");
	}
	
	public void Capabilities(String openinappLink ) throws InterruptedException, IOException {
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		cap.setCapability(MobileCapabilityType.UDID, "d4241031");
		cap.setCapability("appPackage","com.android.chrome");
		cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(url, cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("com.android.chrome:id/url_bar")).click();
		driver.findElement(By.id("com.android.chrome:id/url_bar")).sendKeys(openinappLink);
		
		driver.tap(1, 656, 1495, 500);
		Thread.sleep(6000);
		String s = driver.findElement(By.id("com.android.chrome:id/url_bar")).getText();
		

		if(s.contains("youtube") || s.contains("youtu.be")) {
		  
			   driver.findElement(By.xpath("//android.widget.Button[@text='Open App']")).click();
				driver.findElement(By.xpath("//android.widget.TextView[@text='Open the app']")).click();
		  	
		}
		else if (s.contains("instagram")) {
			driver.findElement(By.xpath("//android.widget.Button[@text='Open App']")).click();
		}
		else if (s.contains("t.me") || s.contains("telegram")) {
			driver.findElement(By.xpath("//android.widget.Button[@text='Continue']")).click();
			
		}
		
		
		
		Thread.sleep(3000);
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg= new File("./openinappLinkScreenshots/links"+timestampDate()+"/"+timestampTime()+".jpeg");
		FileUtils.copyFile(src, trg);
		Thread.sleep(5000);
		System.out.println(openinappLink+"   =======>   "+s);
		
		driver.quit();
		
	}
	
	public static String timestampTime() {
		return new SimpleDateFormat("HH-mm-ss").format(new Date());
	}
	
	public static String timestampDate() {
		return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
	}

}
