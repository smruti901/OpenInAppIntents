package OpeninappWebAutomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class OpeninappMobile {
	
	@Test
	public void Openianpp() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		cap.setCapability(MobileCapabilityType.UDID, "d4241031");
		cap.setCapability("appPackage","com.openinapp");
		cap.setCapability("appActivity", ".ui.splash.SplashActivity");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		URL url = new URL("http://localhost:4724/wd/hub");
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(url, cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean dashboard = driver.findElement(By.id("com.openinapp:id/tv_title")).isDisplayed();
		System.out.println(dashboard);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Courses']")).click();
		boolean courses = driver.findElement(By.id("com.openinapp:id/tv_title")).isDisplayed();
		System.out.println(courses);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.openinapp:id/space_text' and @text='Campaigns']")).click();
		boolean campaigns = driver.findElement(By.id("com.openinapp:id/tv_title")).isDisplayed();
		System.out.println(campaigns);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.openinapp:id/space_text' and @text='Profile']")).click();
		boolean profile = driver.findElement(By.id("com.openinapp:id/tv_title")).isDisplayed();
		System.out.println(profile);
		String user = driver.findElement(By.id("com.openinapp:id/tv_profileName")).getText();
		String userEmail = driver.findElement(By.id("com.openinapp:id/tv_savedEmail")).getText();
		boolean profilePicture = driver.findElement(By.id("com.openinapp:id/iv_profile")).isDisplayed();
		System.out.println("Username is : "+ user + "===> Email Id is: "+ userEmail+" ===> and Profile Picture is displayed :"+profilePicture);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Links']")).click();
		String TotalClicks = driver.findElement(By.id("com.openinapp:id/tv_total_clicks_count")).getText();
		String TodaysClicks = driver.findElement(By.id("com.openinapp:id/tv_today_clicks_count")).getText();
		String TodaysLinks = driver.findElement(By.id("com.openinapp:id/tv_total_links_count")).getText();
		driver.swipe(667, 1020, 50, 1017, 500);
		String TopLocation = driver.findElement(By.id("com.openinapp:id/tv_top_loc_name")).getText();
		String TopSource = driver.findElement(By.id("com.openinapp:id/tv_top_source_name")).getText();
		String bestTime = driver.findElement(By.id("com.openinapp:id/tv_best_time")).getText();
		System.out.println(	"Total Clicks 	:"+TotalClicks +"\n"+
							"Today's Click 	:"+TodaysClicks+"\n"+
				            "Total Links 	:"+TodaysLinks +"\n"+
							"Top Location 	:"+TopLocation+"\n"+ 
				            "Total Source 	:"+TopSource +"\n"+
							"Best Time 	:"+ bestTime	);
		driver.findElement(By.xpath("//android.widget.TextView[@text='View Analytics']")).click();
		driver.findElement(By.id("com.openinapp:id/tv_to_from_date")).click();
		driver.findElement(By.id("com.openinapp:id/tv_allTime")).click();
		Thread.sleep(2000);
		String TotalclicksInsideAnalytics = driver.findElement(By.id("com.openinapp:id/tv_total_clicks_count")).getText();
		Assert.assertEquals(TotalClicks, TotalclicksInsideAnalytics, "Not Equal");
		
		
		
		
		
	}

}
