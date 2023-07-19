package OpenInAppIntentsForCrossBrowserTesting;

import java.io.IOException;

import org.testng.annotations.Test;

import BaseClass.BaseClassWeb;

public class CrossBrowserImplementation  extends BaseClassWeb{

	@Test
	public void OpenInAppLink1() throws InterruptedException, IOException {
		Capabilities("https://heylink.oia.bio/heylink"); 
		 	 
	}
	
	
	
	public void Capabilities(String Url) throws InterruptedException, IOException {

		driver.get(Url);

		driver.close();

	}

}
