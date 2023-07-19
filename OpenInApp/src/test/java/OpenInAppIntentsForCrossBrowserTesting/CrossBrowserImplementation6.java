package OpenInAppIntentsForCrossBrowserTesting;

import java.io.IOException;

import org.testng.annotations.Test;

import BaseClass.BaseClassWeb;

public class CrossBrowserImplementation6  extends BaseClassWeb{

	
	@Test
	public void OpenInAppLink6() throws InterruptedException, IOException {
		Capabilities("https://openinapp.co/kb3nu");
	}
	
	
	public void Capabilities(String Url) throws InterruptedException, IOException {

		driver.get(Url);

		driver.close();

	}

}
