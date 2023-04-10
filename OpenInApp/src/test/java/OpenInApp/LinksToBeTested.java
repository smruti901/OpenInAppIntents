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
		Capabilities("https://openinapp.openinapp.co/edkud");
		Capabilities("https://openinapp.co/77pqc");
		Capabilities("https://raj-shamani.openinapp.co/vzcf1");
		Capabilities("https://heylink.oia.bio/heylink");  
		Capabilities("https://openinapp.co/Adultinsaan");
		
	    Capabilities("https://openinapp.co/0osq5"); 
		Capabilities("https://openinapp.co/ei3qa");
		Capabilities("https://openinapp.co/8otqz");  Capabilities("https://openinapp.co/wplni");
		Capabilities("https://openinapp.co/jjkdd"); 
		Capabilities("https://openinapp.co/4g5u8"); 
		Capabilities("https://openinapp.co/telegram/PremiumDeals");  Capabilities("https://openinapp.co/7ky8m");
		Capabilities("https://Post56.oia.bio/ajwgw");  Capabilities("https://openinapp.co/8w0zd");
		Capabilities("https://openinapp.co/kb6o4");  Capabilities("https://openinapp.co/dn75q");
		Capabilities("https://openinapp.co/gp1eh");  Capabilities("https://t.openinapp.co/yedhotedagaundhi20");
		Capabilities("https://ldb.oia.bio/memes");  
		Capabilities("https://roccohunt.openinapp.co/nonlitighiamopiu");
		Capabilities("https://openinapp.co/z59hl");  
		Capabilities("https://openinapp.co/vb3ah"); 
		Capabilities("https://openinapp.co/Roobai");  Capabilities("https://openinapp.co/cpwy7");
		Capabilities("https://t.oia.bio/government");  Capabilities("https://openinapp.co/acszu");
		Capabilities("https://openinapp.co/9z9fn");  Capabilities("https://openinapp.co/ux4l6");
//		Capabilities("https://openinapp.co/yuf09");  Arti
//		Capabilities("https://openinapp.co/x4xd9"); Karan
		Capabilities("https://openinapp.co/560ad");  Capabilities("https://telegram.openinapp.co/betadetective-1");
		Capabilities("https://openinapp.co/30tcj");  Capabilities("https://openinapp.co/oid1u");
		Capabilities("https://openinapp.co/56az0");  Capabilities("https://t.oia.bio/cinedreams-1-76866");
		Capabilities("https://YouTube.openinapp.co/DekhDilYeHumara");  Capabilities("https://openinapp.co/d93r9");
		Capabilities("https://openinapp.co/dc9cf");  Capabilities("https://google.oia.bio/search-45");
		Capabilities("https://openinapp.co/csg7n");  Capabilities("https://oia.bio/fc8fe");
//		Capabilities("https://openinapp.co/kh6zq"); NR
//		Capabilities("https://openinapp.co/8u2qy");
		Capabilities("https://telegram.openinapp.co/Magixdeals");  Capabilities("https://openinapp.co/fft3v");
		Capabilities("https://Post55.oia.bio/ugkp4");  Capabilities("https://openinapp.co/2k0ay");
		Capabilities("https://openinapp.co/wb3b3");  
		Capabilities("https://openinapp.co/o5sno"); 
//		Capabilities("https://openinapp.co/uhlr2");  //Lucky
		Capabilities("https://oia.bio/Lveffdiamond");
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
		File trg= new File("./openinappLinkScreenshots/links/"+timestamp()+".jpeg");
		FileUtils.copyFile(src, trg);
		Thread.sleep(5000);
		System.out.println(openinappLink+"   =======>   "+s);
		
		driver.quit();
		
	}
	
	public static String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

}
