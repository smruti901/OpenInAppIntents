package OpenInAppIntentsForCrossBrowserTesting;

import java.io.IOException;

import org.testng.annotations.Test;

import BaseClass.BaseClassWeb;

public class CrossBrowserImplementation3  extends BaseClassWeb{

	
	@Test
	public void OpenInAppLink3() throws InterruptedException, IOException {
		Capabilities("https://Cricketspy.oia.bio/Cricketspy");
	}
	
	
	public void Capabilities(String Url) throws InterruptedException, IOException {

		driver.get(Url);

		driver.close();

	}

}
