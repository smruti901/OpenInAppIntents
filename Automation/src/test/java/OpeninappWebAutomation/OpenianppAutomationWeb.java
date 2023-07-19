package OpeninappWebAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import BaseClass.ListenersImplementation;

import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenianppAutomationWeb extends BaseClass {
	
	@Test
	public void CreationOfLink() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[@class=\"w-[440px] bg-white rounded-lg py-4\"]/div[3]/button[1]")).click();
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("smruti@openinapp.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='Welcome']"))));
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Bapee@123");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//p[text()='Create link']")).click();
		driver.findElement(By.xpath("//div[@class=\"w-[440px] bg-white rounded-lg py-4\"]/div[3]/form/div/div[2]/input")).sendKeys("www.google.com");
		driver.findElement(By.xpath("//div[@class=\"w-[440px] bg-white rounded-lg py-4\"]/div[3]/form/button[2]")).click();
		driver.findElement(By.xpath("//div[@class=\"w-[440px] bg-white rounded-lg py-4\"]/div[4]/div[2]/button/div/p")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\"h-screen overflow-y-scroll flex-1 relative\"]/div[2]/section/div[2]/form/div[2]/div[2]/input")).sendKeys("Google");
		driver.findElement(By.xpath("//div[@class=\"h-screen overflow-y-scroll flex-1 relative\"]/div[2]/section/div[2]/form/div[5]/button[2]/div/p")).click();
		
			
	}
	
	@Test
	public void CampaignFlowCheck() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[@class=\"w-[440px] bg-white rounded-lg py-4\"]/div[3]/button[1]")).click();
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("tester4@openinapp.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='Welcome']"))));
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("listed@123");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//nav[@class=\"flex flex-col px-5 mt-5 gap-2 w-48 justify-center\"]/div[3]/p")).click();
		driver.findElement(By.xpath("//div[@class=\"h-screen overflow-y-scroll flex-1 relative\"]/div[2]/section/div[2]/div[1]")).click();
//		 driver.findElement(By.xpath("//div[@class=\"w-full lg:hidden mx-auto bg-graybg relative shadow-lg pb-20\"]/div[2]//button/img")).click();
//		 ListenersImplementation listenersImplementation   =new ListenersImplementation();
//		 listenersImplementation.clickCross();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class=\"w-full lg:hidden mx-auto bg-graybg relative shadow-lg pb-20\"]/div[2]/div/span/img"))));
		driver.findElement(By.xpath("//div[@class=\"w-full lg:hidden mx-auto bg-graybg relative shadow-lg pb-20\"]/div[2]/div/span/img")).click();
		 }

	
}
