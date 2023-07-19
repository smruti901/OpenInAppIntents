package OpenInAppIntentsForCrossBrowserTesting;

import java.io.IOException;

import org.testng.annotations.Test;

import BaseClass.BaseClassWeb;

public class CrossBrowserImplementation4  extends BaseClassWeb{

	
	@Test
	public void OpenInAppLink4() throws InterruptedException, IOException {
		Capabilities("https://openinapp.co/8w0zd");
	}
	
	
	public void Capabilities(String Url) throws InterruptedException, IOException {

		driver.get(Url);

		driver.close();

	}

}
