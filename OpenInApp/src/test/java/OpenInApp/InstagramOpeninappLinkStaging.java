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


public class InstagramOpeninappLinkStaging {

	@Test
	public void InstagramValidate() throws IOException, InterruptedException {
				//Youtube
				System.out.println("Youtube");
				System.out.println();
				Capabilities("inopenapp.com/t7aqa"); 
				Capabilities("Youtube.inopenapp.com/42wyu");
				
				// Instagram
				System.out.println("Instagram");
				System.out.println();
				Capabilities("inopenapp.com/g2y0i"); 
				Capabilities("Instagram.inopenapp.com/n43ia");
				
				// Facebook
				System.out.println("Facebook");
				System.out.println();
				Capabilities("inopenapp.com/t6r6a"); 
				Capabilities("https://Facebook.inopenapp.com/6pxzd");
				
				// Amazon
				System.out.println("Amazon");
				System.out.println();
				Capabilities("inopenapp.com/0aiec");
				Capabilities("Amazon.inopenapp.com/4q6f3");
				
				// LinkedIN
				System.out.println("LinkedIN");
				System.out.println();
				Capabilities("inopenapp.com/myln3");
				Capabilities("LinkedIn.inopenapp.com/azpqy");
			    
				// twitter
				System.out.println("Twitter");
				System.out.println();
				Capabilities("inopenapp.com/hesga");
				Capabilities("Twitter.inopenapp.com/obo72");
				
				// Spotify
				System.out.println("Spotify");
				System.out.println();
				Capabilities("inopenapp.com/u3cv8");
				Capabilities("Spotify.inopenapp.com/c1716");
				
				//Snapchat
				System.out.println("Snapchat");
				System.out.println();
				Capabilities("inopenapp.com/rbhcs");
				Capabilities("Snapchat.inopenapp.com/lsqog");
				
				//Bitly
				System.out.println("BitLy");
				System.out.println();
				Capabilities("inopenapp.com/c332r");  // bitly
				Capabilities("UsingBitly.inopenapp.com/v1ehj");

				// bookmyshow
				System.out.println("Book My Show");
				System.out.println();
				Capabilities("inopenapp.com/0sw1j");
				Capabilities("Bookmyshow.inopenapp.com/asdfg");

				// Moj app
				System.out.println("Moj App");
				System.out.println();
				Capabilities("inopenapp.com/iutvy");
				Capabilities("MojApp.inopenapp.com/jrehe");
				
				// Twitch
				System.out.println("Twitch");
				System.out.println();
				Capabilities("inopenapp.com/tbk30");
				Capabilities("Twitch.inopenapp.com/prgfi");

				//Capabilities("openinapp.co/o7bhe");  Capabilities("inopenapp.com/vpor4");// Loco
				//Capabilities("Loco.openinapp.co/ym8nk");  Capabilities("Loco.inopenapp.com/x5u7i");



	}

	public void Capabilities(String openinappLink) throws InterruptedException, IOException {
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
		driver.findElement(By.id("com.instagram.android:id/tab_avatar")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text='Edit profile']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Links']")).click();
		driver.tap(1, 498, 332, 100);
		driver.findElement(By.id("com.instagram.android:id/remove_link_button")).click();
		driver.findElement(By.id("com.instagram.android:id/primary_button")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Add external link']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='URL']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='URL']/following-sibling::android.widget.EditText")).sendKeys(openinappLink);
		System.err.println();
		System.out.println();
		System.out.println(openinappLink);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Done\"]/android.widget.ImageView")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Done\"]/android.widget.ImageView")).click();
		driver.findElement(By.id("com.instagram.android:id/text_1")).click();
		String currentAppPackage = driver.getCapabilities().getCapability("appPackage").toString();
		System.out.println("Current app package: " + currentAppPackage);
		String currentAppPackageTime = timestampTimeAll();
		System.out.println(timestampDate()+" "+currentAppPackageTime);

		Thread.sleep(2500);
		String xmlSource = driver.getPageSource();

		// Extract the package name using regex
		Pattern pattern = Pattern.compile("package=\"(.*?)\"");
		Matcher matcher = pattern.matcher(xmlSource);
		if (matcher.find()) {
			String packageName = matcher.group(1);

			System.out.println("Redirected app package name: " + packageName);
			String RedirectedAppPackageTime = timestampTimeAll();
			System.out.println(timestampDate()+" "+RedirectedAppPackageTime);

			System.out.println(getTimestampDiffInMillis(currentAppPackageTime, RedirectedAppPackageTime)-2500+" ms ==> Redirection Timing");
			System.out.println();
			System.out.println();

		} else {
			System.out.println("Unable to extract package name");
		}

		Thread.sleep(5000);

		TakesScreenshot ts= (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg= new File("./openinappLinkScreenshots/InstagramBioOpenInAppLinks"+timestampDate()+"/"+timestampTime()+".jpeg");
		FileUtils.copyFile(src, trg);

		//		logger.info("This will be logged and saved to the configured appenders.");



	}
	public static String timestampTime() {
		return new SimpleDateFormat("HH-mm-ss").format(new Date());
	}

	public static String timestampDate() {
		return new SimpleDateFormat("dd-MM-yyyy").format(new Date());
	}
	public static String timestampTimeMilliseconds() {
		long currentTimeMillis = System.currentTimeMillis();
		String milliseconds = String.format("%03d", currentTimeMillis % 1000);
		return milliseconds;
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
