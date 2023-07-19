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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseClass.BaseClassWeb;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OIAlinksforChromeWeb  {

	@Test
	public void LinksToBeTestedInWeb() throws InterruptedException, IOException {
		Capabilities("https://heylink.oia.bio/heylink"); Capabilities("https://openinapp.co/iq4pb");
		Capabilities("https://Cricketspy.oia.bio/Cricketspy"); Capabilities("https://openinapp.co/8w0zd");
		Capabilities("https://openinapp.co/hycn8"); Capabilities("https://openinapp.co/kb3nu");
		Capabilities("https://openinapp.co/rvylo"); Capabilities("https://openinapp.co/e5hdx");
		Capabilities("https://openinapp.co/m0fuf"); Capabilities("https://openinapp.co/4hhsy");
		Capabilities("https://openinapp.co/4cp37"); Capabilities("https://oia.bio/SukhibhavaDeals");
		Capabilities("https://openinapp.co/95zwl"); Capabilities("https://openinapp.co/7cath");
		Capabilities("https://openinapp.co/dyl6w"); Capabilities("https://openinapp.co/telegram/PremiumDeals");
		Capabilities("https://rajshamani.openinapp.co/FO-85"); Capabilities("https://openinapp.co/0eamck");
		Capabilities("https://openinapp.co/iheal"); Capabilities("https://openinapp.co/Adultinsaan");
		Capabilities("https://openinapp.co/n7obz"); Capabilities("https://Post58.oia.bio/ftkdi");
		Capabilities("https://openinapp.co/z3nlo"); Capabilities("https://openinapp.co/telegram/msp-deals");
		Capabilities("https://openinapp.co/e3xxg"); Capabilities("https://openinapp.co/offerdeal");
		Capabilities("https://google.oia.bio/search-45"); Capabilities("https://openinapp.co/g8foe");
		Capabilities("https://openinapp.co/diruq"); Capabilities("https://openinapp.co/hsv84");
		Capabilities("https://openinapp.co/9fl2h"); Capabilities("https://openinapp.co/1mx75");
		Capabilities("https://openinapp.co/s3743"); Capabilities("https://openinapp.co/cg3zn");
		Capabilities("https://openinapp.co/ssxch"); Capabilities("https://t.oia.bio/government");
		Capabilities("https://openinapp.co/kbs6g"); Capabilities("https://openinapp.co/dbb1u");
		Capabilities("https://openinapp.co/y8z1p"); Capabilities("https://openinapp.co/3publ");
		Capabilities("https://openinapp.co/n4ga1"); Capabilities("https://openinapp.co/grqqf");
		Capabilities("https://roobai.openinapp.co/join"); Capabilities("https://openinapp.co/djaa0");
		Capabilities("https://telegram.openinapp.co/betadetective-1"); Capabilities("https://telegram.openinapp.co/money-purse");
		Capabilities("https://openinapp.co/56az0"); Capabilities("https://openinapp.co/rzyya");
		Capabilities("https://openinapp.co/8r5ku"); Capabilities("https://openinapp.co/fapbw");

	}


	public void Capabilities(String Url) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



		driver.get(Url);

		TakesScreenshot ts= (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg= new File("./openinappLinkScreenshots/linksInWebs"+timestampDate()+"/"+timestampTime()+".jpeg");
		FileUtils.copyFile(src, trg);
		Thread.sleep(6000);
		String s = driver.getTitle();
		System.out.println(Url+"   =======>   "+s);

		driver.close();

	}

	public static String timestampTime() {
		return new SimpleDateFormat("HH-mm-ss").format(new Date());
	}

	public static String timestampDate() {
		return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
	}


}
