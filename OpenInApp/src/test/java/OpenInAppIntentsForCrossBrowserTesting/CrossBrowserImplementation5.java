package OpenInAppIntentsForCrossBrowserTesting;

import java.io.IOException;

import org.testng.annotations.Test;

import BaseClass.BaseClassWeb;

public class CrossBrowserImplementation5  extends BaseClassWeb{

	
	@Test
	public void OpenInAppLink5() throws InterruptedException, IOException {
		Capabilities("https://openinapp.co/hycn8");
	}
	
	
	public void Capabilities(String Url) throws InterruptedException, IOException {

		driver.get(Url);

		driver.close();

	}

}
