package BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassWeb {
	public WebDriver driver;
	@Parameters("browser")
	@BeforeClass(alwaysRun= true)
	public void launchBrowser(String browser) {
		if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
		else if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
		else {
			System.out.println("Enter a proper Browser");
		}
	}
	
	

}
