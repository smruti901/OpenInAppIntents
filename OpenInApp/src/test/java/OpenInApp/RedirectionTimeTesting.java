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

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class RedirectionTimeTesting {
	
	public static void main(String[] args) {
        // Set desired capabilities for the Android device or emulator
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "device_name");
        caps.setCapability(MobileCapabilityType.APP, "path/to/app.apk");
        
        // Set the deep link URL
        String deepLinkUrl = "your_deep_link_url";
        
        // Create Appium driver instance
        AppiumDriver<MobileElement> driver;
        try {
            driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
        
        // Start measuring redirection time
        long startTime = System.currentTimeMillis();

        // Trigger the deep link by launching the URL
        driver.get(deepLinkUrl);

        // Wait for the app to open and measure the redirection time
        long endTime = System.currentTimeMillis();
        long redirectionTime = endTime - startTime;
        System.out.println("Redirection Time: " + redirectionTime + "ms");

        // Perform assertions or validations on the redirection time

        // Quit the driver and close the session
        driver.quit();
    }

}
