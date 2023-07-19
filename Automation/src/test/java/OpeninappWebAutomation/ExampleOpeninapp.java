package OpeninappWebAutomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ExampleOpeninapp {
	
	@Test
	public void Example() throws MalformedURLException, InterruptedException {
		 DesiredCapabilities cap = new DesiredCapabilities();
		 cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		 cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		 cap.setCapability(MobileCapabilityType.UDID,"d4241031");
		 cap.setCapability("appPackage", "com.openinapp");
		 cap.setCapability("appActivity", ".ui.splash.SplashActivity");
		 cap.setCapability(MobileCapabilityType.NO_RESET, true);
		 URL url = new URL("http://localhost:4724/wd/hub");
		 AndroidDriver <MobileElement> driver = new AndroidDriver<MobileElement>(url, cap);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 Thread.sleep(2000);
		 driver.swipe(349, 1359, 357, 58, 100);
		 driver.swipe(349, 1359, 357, 58, 100);
		 //driver.findElement(By.id("com.openinapp:id/ll_view_all_links")).click();
		 driver.findElement(By.xpath("//android.widget.TextView[@text='View all Links']")).click();
		 String linksPresent = driver.findElement(By.id("com.openinapp:id/tv_title")).getText();
		 System.out.println(linksPresent);
		 
	}

}
