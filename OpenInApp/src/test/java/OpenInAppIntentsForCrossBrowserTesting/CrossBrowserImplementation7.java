package OpenInAppIntentsForCrossBrowserTesting;

import java.io.IOException;

import org.testng.annotations.Test;

import BaseClass.BaseClassWeb;

public class CrossBrowserImplementation7  extends BaseClassWeb{

	
	@Test
	public void OpenInAppLink7() throws InterruptedException, IOException {
		Capabilities("https://openinapp.co/rvylo");
	}
	
	
	public void Capabilities(String Url) throws InterruptedException, IOException {

		driver.get(Url);

		driver.close();

	}

}
