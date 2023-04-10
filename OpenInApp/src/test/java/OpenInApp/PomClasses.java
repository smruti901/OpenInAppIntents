package OpenInApp;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PomClasses extends Baseclass{
	
	public PomClasses(AndroidDriver<MobileElement> driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "com.openinapp:id/et_feed_search") public MobileElement search;
	@FindBy(id = "com.openinapp:id/top") public MobileElement urlClick;
	@FindBy(id = "com.openinapp:id/tv_original_link_value") public MobileElement originalLink;
	@FindBy(id = "com.openinapp:id/tv_smart_url") public MobileElement openInAppUrl;
	@FindBy(id = "com.openinapp:id/iv_link_redirect") public MobileElement redirectLink;
	@FindBy(id = "com.android.chrome:id/url_bar") public MobileElement openInappOpenUrl;
	@FindBy(id = "com.android.chrome:id/url_bar") public MobileElement openInappOpenUrl2;
	
	public void checkIntent(String url) {
		search.sendKeys(url);
		urlClick.click();
		originalLink.getText();
		openInAppUrl.getText();
		redirectLink.click();
		openInappOpenUrl.getText();
		openInappOpenUrl2.getText();
	}
	
	

}
