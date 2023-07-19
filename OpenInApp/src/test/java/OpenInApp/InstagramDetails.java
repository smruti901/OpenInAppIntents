package OpenInApp;

import java.net.URL;
import java.util.Enumeration;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.IOException;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstagramDetails {

	@Test
	public void instagramDetails() throws ZipException, IOException, InterruptedException {
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
		System.out.println(driver.getPageSource());
		
	}
}
