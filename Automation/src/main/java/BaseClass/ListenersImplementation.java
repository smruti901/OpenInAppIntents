package BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestListener;

public class ListenersImplementation extends BaseClass implements ITestListener{

	
	public void Listeners() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class=\"w-full lg:hidden mx-auto bg-graybg relative shadow-lg pb-20\"]/div[2]//button/img") private WebElement cross;
	
	
	public void clickCross() {
		cross.click();
	}
}
