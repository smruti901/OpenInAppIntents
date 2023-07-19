package BrowserStackCheck;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.browserstack.local.*;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BrowserStackAutomate {

	@Test
	public void AutomateInBrowserStack() throws InterruptedException, IOException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserstack.user", "smrutiranjanmoha_2WXkRK");
		capabilities.setCapability("browserstack.key", "xpTjTJGZAfDmsJpVpm7o");
		capabilities.setCapability("device", "Google Pixel 6");
		capabilities.setCapability("os_version", "12.0");
		capabilities.setCapability("app", "bs://5a19696a9391e13912224e291b35f2d676153b54"); // Replace <APP_ID> with your app ID
		capabilities.setCapability("browserstack.debug", "true");
		capabilities.setCapability("noReset", true);
		capabilities.setCapability("automationName", "UiAutomator2");
		

		 AndroidDriver<MobileElement> driver = new AndroidDriver<>(
	                new URL("http://hub.browserstack.com/wd/hub"), capabilities);
		 Thread.sleep(3000);
		 
		 driver.tap(1, 268, 633, 100);
		 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
		 		+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
		 		+ "android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/"
		 		+ "android.widget.FrameLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/"
		 		+ "android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/"
		 		+ "android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/"
		 		+ "android.widget.EditText")).sendKeys("smr938965");
		 driver.tap(1, 284, 774, 100);
		 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
		 		+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/"
		 		+ "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/"
		 		+ "android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/"
		 		+ "android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/"
		 		+ "android.view.ViewGroup/android.widget.EditText")).sendKeys("bapee123");

		 
		 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
		 		+ "android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/"
		 		+ "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/"
		 		+ "android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/"
		 		+ "android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
		 		+ "android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/"
		 		+ "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/"
		 		+ "android.view.ViewGroup/android.view.ViewGroup[3]")).click();
		 driver.findElement(By.id("com.instagram.android:id/tab_avatar")).click();
		 driver.findElement(By.id("com.instagram.android:id/text_1")).click();
		 driver.tap(1, 551, 1502, 100);
		 Thread.sleep(6000);
			TakesScreenshot ts= (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File trg= new File("./openinappLinkScreenshots/InstagramBioOpenInAppLinksUsingBrowserStack"+timestampDate()+"/"+timestampTime()+".jpeg");
			FileUtils.copyFile(src, trg);
		 
	}
	public static String timestampTime() {
		return new SimpleDateFormat("HH-mm-ss").format(new Date());
	}

	public static String timestampDate() {
		return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
	}
}
