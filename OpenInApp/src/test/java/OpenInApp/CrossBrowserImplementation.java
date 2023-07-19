package OpenInApp;

import java.io.IOException;

import org.testng.annotations.Test;

import BaseClass.BaseClassWeb;

public class CrossBrowserImplementation  extends BaseClassWeb{

	@Test
	public void OpenInAppLink1() throws InterruptedException, IOException {
		Capabilities("https://heylink.oia.bio/heylink"); 
		 	 
	}
	@Test
	public void OpenInAppLink2() throws InterruptedException, IOException {
		Capabilities("https://openinapp.co/iq4pb");
	}
	@Test
	public void OpenInAppLink3() throws InterruptedException, IOException {
		Capabilities("https://Cricketspy.oia.bio/Cricketspy");
	}
	@Test
	public void OpenInAppLink4() throws InterruptedException, IOException {
		Capabilities("https://openinapp.co/8w0zd");
	}
	@Test
	public void OpenInAppLink15() throws InterruptedException, IOException {
		Capabilities("https://openinapp.co/hycn8");
	}
	@Test
	public void OpenInAppLink6() throws InterruptedException, IOException {
		Capabilities("https://openinapp.co/kb3nu");
	}
	@Test
	public void OpenInAppLink7() throws InterruptedException, IOException {
		Capabilities("https://openinapp.co/rvylo");
	}
	@Test
	public void OpenInAppLink8() throws InterruptedException, IOException {
		Capabilities("https://openinapp.co/e5hdx");
	}
	@Test
	public void OpenInAppLink9() throws InterruptedException, IOException {
		Capabilities("https://openinapp.co/m0fuf");
	}
	
	public void Capabilities(String Url) throws InterruptedException, IOException {

		driver.get(Url);

		driver.close();

	}

}
