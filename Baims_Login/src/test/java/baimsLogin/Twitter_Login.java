package baimsLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import base.PreLogin;

public class Twitter_Login extends PreLogin{

	//Login into twitter with valid Twitter account
	@Test(priority=4)
	public void ValidTwitter() throws InterruptedException{
		
		WebElement Gmail = ChromeDriverObject.findElement(By.xpath("/html/body/div/div/div[1]/main/main/div[1]/div[1]/div[2]/div/div[1]/div[2]/div[2]"));
		Thread.sleep(20000);
		Gmail.click();
		Thread.sleep(10000);
		String winHandleBefore = ChromeDriverObject.getWindowHandle();
		for(String winHandle : ChromeDriverObject.getWindowHandles()){
			ChromeDriverObject.switchTo().window(winHandle);
			}
		WebElement Email_Field = ChromeDriverObject.findElement(By.id("username_or_email"));
		Email_Field.sendKeys(Email);
		WebElement Pass_Field = ChromeDriverObject.findElement(By.id("password"));
		Pass_Field.sendKeys(Password);
		Pass_Field.sendKeys(Keys.ENTER);
		Thread.sleep(10000);
		ChromeDriverObject.switchTo().window(winHandleBefore);
		String expectedTitle = "https://baims.com/";
		String actualTitle = ChromeDriverObject.getCurrentUrl();
		AssertJUnit.assertEquals(actualTitle, expectedTitle);
		System.out.println(actualTitle);
		ChromeDriverObject.quit();
	}
	
	//Login into twitter with invalid mail
	@Test(priority=5)
	public void InvalidTMmail() throws InterruptedException{
		
		WebElement Twitter = ChromeDriverObject.findElement(By.xpath("/html/body/div/div/div[1]/main/main/div[1]/div[1]/div[2]/div/div[1]/div[2]/div[2]"));
		Thread.sleep(10000);
		Twitter.click();
		Thread.sleep(10000);
		for(String winHandle : ChromeDriverObject.getWindowHandles()){
			ChromeDriverObject.switchTo().window(winHandle);
			}
		WebElement Email_Field = ChromeDriverObject.findElement(By.id("username_or_email"));
		Email_Field.sendKeys(InvalidEmail);
		WebElement Pass_Field = ChromeDriverObject.findElement(By.id("password"));
		Pass_Field.sendKeys(Password);
		Pass_Field.sendKeys(Keys.ENTER);
		Thread.sleep(10000);
		ChromeDriverObject.quit();
	}
	
	//Login into twitter with invalid password
	@Test(priority=6)
	public void InvalidTPassword() throws InterruptedException{
		
		WebElement Twitter = ChromeDriverObject.findElement(By.xpath("/html/body/div/div/div[1]/main/main/div[1]/div[1]/div[2]/div/div[1]/div[2]/div[2]"));
		Thread.sleep(10000);
		Twitter.click();
		Thread.sleep(10000);
		for(String winHandle : ChromeDriverObject.getWindowHandles()){
			ChromeDriverObject.switchTo().window(winHandle);
			}
		WebElement Email_Field = ChromeDriverObject.findElement(By.id("username_or_email"));
		Email_Field.sendKeys(Email);
		WebElement Pass_Field = ChromeDriverObject.findElement(By.id("password"));
		Pass_Field.sendKeys(InvalidPassword);
		Pass_Field.sendKeys(Keys.ENTER);
		Thread.sleep(10000);
		ChromeDriverObject.quit();
	}
	

}
