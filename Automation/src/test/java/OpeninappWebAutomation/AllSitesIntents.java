package OpeninappWebAutomation;

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

public class AllSitesIntents {
	
	@Test
	public void LinksToBeTested() throws InterruptedException, IOException {
		Capabilities("https://youtu.be/QDCpb-6mnLA"); 
//		Capabilities("https://openinapp.co/8szlb"); 
//		Capabilities("https://openinapp.co/xl0re"); 
////		Capabilities("amzn.t");
//		Capabilities("https://openinapp.co/emr59"); 
//		Capabilities("https://openinapp.co/01olj"); 
//		Capabilities("https://openinapp.co/zyydn"); 
//		Capabilities("https://openinapp.co/s2nlz");
//		Capabilities("https://openinapp.co/ygvlb"); 
//		Capabilities("https://openinapp.co/b6l3u"); 
//		Capabilities("https://openinapp.co/syhoh"); 
//		Capabilities("https://openinapp.co/fxb1f");
//		Capabilities("https://openinapp.co/l4mxr"); 
//		Capabilities("https://openinapp.co/6qnl1"); 
//		Capabilities("https://openinapp.co/tfcv1"); Capabilities("https://openinapp.co/bt48d");
//		Capabilities("https://openinapp.co/kuu7v"); 
//		Capabilities("https://openinapp.co/r8thl"); 
//		Capabilities("https://openinapp.co/kc9zn"); Capabilities("https://openinapp.co/9duw7");
//		Capabilities("https://openinapp.co/7pd3w"); 
//		
//		Capabilities("https://openinapp.co/cj70n"); Capabilities("https://openinapp.co/czh6n");
//		Capabilities("https://openinapp.co/ex2t0");
//		Capabilities("https://openinapp.co/ryh3j"); 
//		Capabilities("https://openinapp.co/xv865"); 
//		Capabilities("https://openinapp.co/kuhwq");
//		Capabilities("https://openinapp.co/9ecp1"); Capabilities("https://openinapp.co/prz47"); 
//		Capabilities("https://openinapp.co/o9dys"); Capabilities("https://openinapp.co/tinot");
//		Capabilities("https://openinapp.co/988m6"); Capabilities("https://openinapp.co/f9d12"); 
//		Capabilities("https://openinapp.co/hosqe"); Capabilities("https://openinapp.co/ha44f");
//		Capabilities("https://openinapp.co/lrl14"); Capabilities("https://openinapp.co/qgat7"); 
//		Capabilities("pinterest.com"); Capabilities("primevideo.com");
//		Capabilities("quora.com");
//		Capabilities("share.mxtakatak.com"); Capabilities("share.myjosh.in");
//		Capabilities("snapchat.com"); 
//		Capabilities("spotify.com");
//		Capabilities("story.snapchat.com"); 
////		Capabilities("t.me");not opening
//		Capabilities("telegram.me"); Capabilities("twitch.tv");
//		Capabilities("twitter.com"); Capabilities("wa.me");
//		Capabilities("www.amazon.com"); Capabilities("www.amazon.in");
//		Capabilities("www.bookmyshow.com"); Capabilities("www.docs.google.com");
//		Capabilities("www.facebook.com"); Capabilities("www.flipkart.com");
//		Capabilities("www.hotstar.com"); Capabilities("www.imdb.com");
//		Capabilities("www.instagram.com"); Capabilities("www.jiosaavn.com");
//		Capabilities("www.linkedin.com"); Capabilities("www.mojapp.in");
//		Capabilities("www.mxtakatak.com"); Capabilities("www.pinterest.com");
//		Capabilities("www.quora.com"); Capabilities("www.share.mxtakatak.com");
//		Capabilities("www.snapchat.com"); Capabilities("www.twitch.tv");
//		Capabilities("www.twitter.com"); Capabilities("www.youtube.com");
//		Capabilities("youtu.be"); Capabilities("youtube.com");
		
		

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
