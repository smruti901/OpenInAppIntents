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

public class InstagramBioBaseURL {
	@Test
	public void InstagramValidate() throws IOException, InterruptedException {
		//		Capabilities("https://openinapp.co/u6lk9"); 
				Capabilities("https://openinapp.co/0tu0v");
		//		Capabilities("https://openinapp.co/edkud");
		//		Capabilities("https://openinapp.co/77pqc");
		//		Capabilities("https://openinapp.co/fp7l8");  
		//		Capabilities("https://openinapp.co/8w0zd");
		//		Capabilities("https://openinapp.co/s82ds"); 
		//		Capabilities("https://openinapp.co/abnnu"); 
		//		Capabilities("https://openinapp.co/0z26q");  Capabilities("https://openinapp.co/iq4pb");
		//		Capabilities("https://openinapp.co/4vk2y");  
		//		Capabilities("https://openinapp.co/7i0lp");
		//		Capabilities("https://oia.bio/SukhibhavaDeals");  
		//		Capabilities("https://openinapp.co/wrw8g");
		//		Capabilities("https://openinapp.co/y1q1o");  
		//		Capabilities("https://Earn.openinapp.co/elu1c");
		//		Capabilities("https://openinapp.co/30i1k");  
		//		Capabilities("https://openinapp.co/telegram/all-movies-suggestion");
		//		Capabilities("https://openinapp.co/3lh5s");  
		//		Capabilities("https://openinapp.co/2s0bl");  
		//		Capabilities("https://rajshamani.openinapp.co/FO-85"); 
		//		Capabilities("https://openinapp.co/v5hg1");  Capabilities("https://openinapp.co/2lfzq");
		//		Capabilities("https://openinapp.co/44asi");  Capabilities("https://openinapp.co/klg5x");
		//		Capabilities("https://openinapp.co/8n4au");  
		//		Capabilities("https://openinapp.co/1tdp2"); 
		//		Capabilities("https://openinapp.co/of5yg");  Capabilities("https://openinapp.co/LinkuuuMowa");
		//		Capabilities("https://openinapp.co/p0x3k");  
		//		Capabilities("https://openinapp.co/wy22m");
		//		Capabilities("https://openinapp.co/837t0");  Capabilities("https://telegram.openinapp.co/betadetective-1");
		//		Capabilities("https://openinapp.co/hhetk");  
		//		Capabilities("https://openinapp.co/telegram/crazziee-stuff");
		//		Capabilities("https://openinapp.co/uee3c");  Capabilities("https://openinapp.co/af5ab");
		//		Capabilities("https://openinapp.co/45eth");  
		//		Capabilities("https://openinapp.co/ojebo");
		//		Capabilities("https://openinapp.co/71zgj"); 
		//		Capabilities("https://openinapp.co/0tu0v");
		//		Capabilities("https://openinapp.co/lc7ud"); 
		//		Capabilities("https://openinapp.co/32gd2");
		//		Capabilities("https://openinapp.co/hyy9r");  Capabilities("https://openinapp.co/8t6m9");
		//		Capabilities("https://openinapp.co/ucct8");  
		//		Capabilities("https://openinapp.co/mp71k"); 
		//		Capabilities("https://openinapp.co/cqkax");  
		//		Capabilities("https://openinapp.co/n4ga1"); 
		//		Capabilities("https://openinapp.co/3du3q");

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
		Thread.sleep(6000);
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg= new File("./openinappLinkScreenshots/InstagramBioBaseUrlLinks"+timestampDate()+"/"+timestampTime()+".jpeg");
		FileUtils.copyFile(src, trg);
	}
	public static String timestampTime() {
		return new SimpleDateFormat("HH-mm-ss").format(new Date());
	}

	public static String timestampDate() {
		return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
	}
}
