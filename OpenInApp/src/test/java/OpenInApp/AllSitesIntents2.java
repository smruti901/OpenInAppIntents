package OpenInApp;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AllSitesIntents2 {
	
	@Test
	public void LinksToBeTested() throws InterruptedException, IOException {
		Capabilities("https://openinapp.co/dlzy0"); 
		Capabilities("https://oia.bio/c56v1"); 

		
		

	}
	public void Capabilities(String openinappUrl) throws InterruptedException, IOException {
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
		
		driver.swipe(260, 1376, 327, 52, 100);
		driver.findElement(By.xpath("//android.widget.TextView[@text='View all Links']")).click();
		driver.findElement(By.id("com.openinapp:id/et_feed_search")).sendKeys(openinappUrl);
		System.out.println(openinappUrl);
		Thread.sleep(3000);
		driver.tap(1, 338, 448, 100);
		driver.findElement(By.id("com.openinapp:id/iv_link_redirect")).click();
		
		
		String currentAppPackage = driver.getCapabilities().getCapability("appPackage").toString();
        System.out.println("Current app package: " + currentAppPackage);
       String currentAppPackageTime = timestampTimeAll();
       System.out.println(currentAppPackageTime);

      Thread.sleep(2000);
	 String xmlSource = driver.getPageSource();
	
        // Extract the package name using regex
        Pattern pattern = Pattern.compile("package=\"(.*?)\"");
        Matcher matcher = pattern.matcher(xmlSource);
        if (matcher.find()) {
            String packageName = matcher.group(1);
            
            System.out.println("Redirected app package name: " + packageName);
           String RedirectedAppPackageTime = timestampTimeAll();
           System.out.println(RedirectedAppPackageTime);
           
            System.out.println(getTimestampDiffInMillis(currentAppPackageTime, RedirectedAppPackageTime)-2000+" ms ==> Redirection Timing");
            
        } else {
            System.out.println("Unable to extract package name");
        }
		Thread.sleep(6000);
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg= new File("./openinappLinkScreenshots/OpenAppIntents"+timestampDate()+"/"+timestampTime()+".jpeg");
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
	public static String timestampTimeAll() {
	    String timestamp = new SimpleDateFormat("HH-mm-ss").format(new Date());
	    long currentTimeMillis = System.currentTimeMillis();
	    String milliseconds = String.format("%03d", currentTimeMillis % 1000);
	    return timestamp + "-" + milliseconds;
	}
	public static long getTimestampDiffInMillis(String timestamp1, String timestamp2) {
	    try {
	        SimpleDateFormat sdf = new SimpleDateFormat("HH-mm-ss-SSS");
	        Date date1 = sdf.parse(timestamp1);
	        Date date2 = sdf.parse(timestamp2);
	        long diffInMillis = date2.getTime() - date1.getTime();
	        return diffInMillis;
	    } catch (ParseException e) {
	        e.printStackTrace();
	        return -1; // or throw an exception
	    }
	}
}
