package OpenInApp;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LinkTestingThroughOpenInApp {
	
	@Test
	public void LinksToBeTested() throws InterruptedException, IOException {
//		Capabilities("https://www.instagram.com/openinappdotcom/"); Capabilities("https://www.instagram.com/listedfans/"); 
//		Capabilities("https://www.instagram.com/rajshamani/"); Capabilities("https://heylink.me/linkdebhai");
//		Capabilities("https://t.me/nanicricketpredictions"); Capabilities("https://youtu.be/Q7f5ietCgbc"); 
//		Capabilities("https://youtu.be/IFfCjbvhqnU");
//		Capabilities("https://play.google.com/store/apps/details?id=com.diamondgamerloot.gamerdiamondloot"); 
//		Capabilities("https://t.me/virallinksss"); 
//		Capabilities("https://youtu.be/uoinX81mugc"); 
//		Capabilities("https://youtu.be/al3uRTc_KG0");
//		Capabilities("https://t.me/hoodieguy"); 
//		Capabilities("https://youtu.be/PMVK14XksHs"); 
//		Capabilities("https://t.me/adult_insaann"); 
//		Capabilities("https://youtu.be/W7hzDiiAJjQ");
//		Capabilities("https://youtu.be/uoinX81mugc"); 
//		Capabilities("https://youtube.com/@therealworld0707"); 
//		Capabilities("https://youtu.be/6Z7Sy-6sAYA"); Capabilities("https://youtube.com/@LadhaMusic");
//		Capabilities("https://www.google.com/search?q=govtjobshirings.blogspot.com&client=ms-android-oppo-rvo3&sxsrf=ALiCzsZJ-5djGG7V89t7U8Uv93D0oP1oWg%3A1667879540832&ei=dNJpY9GxMtvPseMPrLm5qAs&oq=govtjobshirings&gs_lcp=ChNtb2JpbGUtZ3dzLXdpei1zZXJwEAEYADIHCCMQsAMQJzIHCCMQsAMQJzIKCAAQRxDWBBCwAzIKCAAQRxDWBBCwAzIKCAAQRxDWBBCwAzIKCAAQRxDWBBCwAzIKCAAQRxDWBBCwAzIKCAAQRxDWBBCwAzIKCAAQRxDWBBCwAzIKCAAQRxDWBBCwAzIKCAAQyQMQsAMQQzIICAAQkgMQsAMyDQguEMcBENEDELADEEMyBwgAELADEEMyBwgAELADEEMyBwgAELADEENKBAhBGABQAFgAYNvWAmgCcAB4AIABAIgBAJIBAJgBAMgBEMABAQ&sclient=mobile-gws-wiz-serp#ip=1"); 
//		Capabilities("https://youtube.com/shorts/W-9OsTCPrQE?feature=share"); 
//		Capabilities("https://youtu.be/74dqM_xtvAA"); Capabilities("https://youtu.be/Z0r6CWUQ2lc");
//		Capabilities("https://t.me/Sukhibhava_Deals");
//		Capabilities("https://youtu.be/zsju6VsoOF0"); 
//		Capabilities("https://t.me/govtjobsalert0"); not genrating
//		Capabilities("https://youtube.com/@hackiestokes");
//		Capabilities("https://t.me/Cricketspy"); Capabilities("https://youtu.be/_WLfQsLWuDA"); 
//		Capabilities("https://youtu.be/4WeClbwxyMw"); Capabilities("https://youtu.be/1LPHVO9cK6M");
//		Capabilities("https://youtu.be/bQ6CiztpRnQ"); Capabilities("https://youtu.be/ZElxwvvs-ms"); 
//		Capabilities("https://youtu.be/DaEUXyrXbeY"); Capabilities("https://youtu.be/RwHMJtptnxg");
//		Capabilities("https://youtu.be/XudAJ-uSs6I"); 
//		Capabilities("https://youtube.com/shorts/8fAe83ahBcI?feature=share"); 
//		Capabilities("https://youtu.be/DqNOa3LBLCo"); 
//		Capabilities("https://youtu.be/pmlv4p1NLlQ");
//		Capabilities("https://youtu.be/dxgs_M8QiFk");
//		Capabilities("https://t.me/Divya69_bot"); Capabilities("https://youtu.be/XudAJ-uSs6I");
//		Capabilities("https://telegram.me/betadetectivebackups"); 
//		Capabilities("https://www.youtube.com/watch?v=j3TKH6s2Ot8");
//		Capabilities("https://youtu.be/peGdyGydspo"); Capabilities("https://youtu.be/CaryNwapxis");
		Capabilities("https://t.me/moviedekhoyt");
		Capabilities("https://t.me/Paisa_Bachao");
		Capabilities("https://t.me/freedom_mobile01"); Capabilities("https://youtu.be/PBfn6uUyMr0");
		Capabilities("https://youtu.be/gtS0Dpx5GyY"); Capabilities("https://play.google.com/store/apps/details?id=cm.loveff.diamond");
		

	}
	public void Capabilities(String openinappLink ) throws InterruptedException, IOException {
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
		driver.findElement(By.className("android.widget.ImageButton")).click();
		driver.findElement(By.className("android.widget.EditText")).sendKeys(openinappLink);
		String link = driver.findElement(By.className("android.widget.EditText")).getText();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Generate Link']")).click();
		String openinappUrl = driver.findElement(By.id("com.openinapp:id/tv_smart_link_url")).getText();
		driver.findElement(By.id("com.openinapp:id/iv_cancel")).click();
		driver.swipe(260, 1376, 327, 52, 100);
		driver.findElement(By.xpath("//android.widget.TextView[@text='View all Links']")).click();
		driver.findElement(By.id("com.openinapp:id/et_feed_search")).sendKeys(openinappUrl);
		Thread.sleep(3000);
		driver.tap(1, 338, 448, 100);
		driver.findElement(By.id("com.openinapp:id/iv_link_redirect")).click();
		System.out.println(openinappUrl+" ========>  "+link);
		Thread.sleep(6000);
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg= new File("./openinappLinkScreenshots/links2"+timestampDate()+"/"+timestampTime()+".jpeg");
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
