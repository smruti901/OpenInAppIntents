package OpenInApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidOpenInApp extends Baseclass {

	@Test
	public void OpenInAppAndroid() throws MalformedURLException, InterruptedException {
		driver.findElement(By.xpath("//android.widget.TextView[@text='View all Links']")).click();
		//		checkintents("amazon.in");
		//		checkintents("amzn.to");
//		checkintents("app.bitly.com"); 		checkintents("apps.apple.com"); 		checkintents("bit.ly");
//		checkintents("bitly.com"); 		 	checkintents("bookmyshow.com"); 		checkintents("chat.whatsapp.com");
//		checkintents("discord.gg"); 		checkintents("discord.io");  			checkintents("dl.loco.gg");
//		checkintents("docs.google.com"); 	checkintents("drive.google.com"); 		checkintents("facebook.com");
//		checkintents("fb.gg"); 				checkintents("fb.watch"); 				checkintents("flipkart.com");
//		checkintents("hotstar.com"); 		checkintents("imdb.com"); 				checkintents("in.bookmyshow.com");
//		checkintents("in.pinterest.com"); 	checkintents("instagram.com"); 			checkintents("jiosaavn.com");
//		checkintents("l.instagram.com"); 	checkintents("linkedin.com"); 			checkintents("loco.gg");
//		checkintents("m.facebook.com"); 	checkintents("m.youtube.com"); 			checkintents("mobile.twitter.com");
//		checkintents("mojapp.in"); 			checkintents("music.apple.com"); 		checkintents("mxtakatak.com");
		//checkintents("open.spotify.com"); 	
	//	checkintents("opensea.io"); 			
	//	checkintents("photos.google.com");
//		checkintents("pinterest.com"); 		checkintents("primevideo.com"); 		checkintents("quora.com");
//		checkintents("share.mxtakatak.com");checkintents("share.myjosh.in"); 		checkintents("snapchat.com");
//		checkintents("spotify.com");  	
//		checkintents("story.snapchat.com"); 	checkintents("t.me");
//		checkintents("telegram.me"); 		checkintents("twitch.tv"); 				checkintents("twitter.com");
//		checkintents("wa.link"); 			checkintents("wa.me"); 					checkintents("www.amazon.com");
//		checkintents("www.amazon.in"); 		checkintents("www.bookmyshow.com"); 	checkintents("www.docs.google.com");
//		checkintents("www.facebook.com"); 	checkintents("www.flipkart.com"); 		checkintents("www.hotstar.com");
//		checkintents("www.imdb.com"); 		checkintents("www.instagram.com"); 		checkintents("www.instagram.com");
//		checkintents("www.jiosaavn.com"); 	checkintents("www.linkedin.com"); 		checkintents("www.mojapp.in");
//		checkintents("www.mxtakatak.com");	checkintents("www.pinterest.com"); 		checkintents("www.quora.com");
//		checkintents("www.snapchat.com"); 	checkintents("www.twitch.tv");			checkintents("youtu.be");
		checkintents("www.twitter.com");  	checkintents("www.youtube.com"); 		checkintents("youtube.com");
		checkintents("www.share.mxtakatak.com");
	}

	public void checkintents(String url) throws InterruptedException {
		SoftAssert sf= new SoftAssert();
		driver.findElement(By.id("com.openinapp:id/et_feed_search")).sendKeys(url);
		MobileElement urlClick = driver.findElement(By.id("com.openinapp:id/top"));
		if(urlClick.isDisplayed()) {
			driver.findElement(By.id("com.openinapp:id/top")).click();
		}
		else {
			driver.findElement(By.id("com.openinapp:id/iv_clear_search")).click();
		}
		String originalLink = driver.findElement(By.id("com.openinapp:id/tv_original_link_value")).getText();
		System.out.println(originalLink);
		String openInAppUrl = driver.findElement(By.id("com.openinapp:id/tv_smart_url")).getText();
		System.out.println(openInAppUrl);
		driver.findElement(By.id("com.openinapp:id/iv_link_redirect")).click();
		Thread.sleep(3000);
		String openInappOpenUrl = driver.findElement(By.id("com.android.chrome:id/url_bar")).getText();
		System.out.println(openInappOpenUrl);
		Thread.sleep(3000);
		String openInappOpenUrl2 = driver.findElement(By.id("com.android.chrome:id/url_bar")).getText();
		System.out.println(openInappOpenUrl2);
		Thread.sleep(10000);
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		sf.assertAll();
	}
}
