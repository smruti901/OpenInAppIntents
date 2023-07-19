package SauceLab;

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
import org.openqa.selenium.remote.*;
import org.testng.annotations.Test;


import com.browserstack.local.*;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SauceLabAutomate {

	@Test
	public void AutomateInBrowserStack() throws InterruptedException, IOException {
		 DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName","Android");
		caps.setCapability("appium:deviceName","Android GoogleAPI Emulator");
		caps.setCapability("appium:deviceOrientation", "portrait");
		caps.setCapability("appium:platformVersion","12.0");
		caps.setCapability("appium:automationName", "UiAutomator2");
		caps.setCapability("appium:app", "C:\\Users\\muska\\Downloads\\Instagram_276.1.0.26.103_Apkpure.apk");
		DesiredCapabilities sauceOptions = new DesiredCapabilities();
		sauceOptions.setCapability("build", "appium-build-1WMWW");
		sauceOptions.setCapability("name", "<your test name>");
		caps.setCapability("sauce:options", sauceOptions);
		

		 URL url = new URL("https://oauth-smruti-22384:5be39013-aa8e-4eb2-b240-916067a0551c@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
		 AndroidDriver driver = new AndroidDriver(url, caps);
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
