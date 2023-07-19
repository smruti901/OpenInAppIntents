package OpenInAppIntentsForCrossBrowserTesting;

import java.io.IOException;

import org.testng.annotations.Test;

import BaseClass.BaseClassWeb;

public class CrossBrowserImplementation2  extends BaseClassWeb{

	
	@Test
	public void OpenInAppLink2() throws InterruptedException, IOException {
		Capabilities("https://openinapp.co/iq4pb");
	}
	
	
	public void Capabilities(String Url) throws InterruptedException, IOException {

		driver.get(Url);

		driver.close();

	}

}
