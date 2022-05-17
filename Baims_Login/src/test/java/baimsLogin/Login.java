package baimsLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import base.PreLogin;

public class Login extends PreLogin {
	
	//Login with valid Gmail account
	@Test(priority=1)
	public void ValidGmail() throws InterruptedException{
		
		WebElement Gmail = ChromeDriverObject.findElement(By.xpath("/html/body/div/div/div[1]/main/main/div[1]/div[1]/div[2]/div/div[1]/div[2]/div[1]"));
		Thread.sleep(20000);
		Gmail.click();
		Thread.sleep(10000);
		String winHandleBefore = ChromeDriverObject.getWindowHandle();
		for(String winHandle : ChromeDriverObject.getWindowHandles()){
			ChromeDriverObject.switchTo().window(winHandle);
			}
		WebElement Email_Field = ChromeDriverObject.findElement(By.id("identifierId"));
		Email_Field.sendKeys(Email);
		WebElement Next1 = ChromeDriverObject.findElement(By.id("identifierNext"));
		Next1.click();
		Thread.sleep(10000);
		WebElement Pass_Field = ChromeDriverObject.findElement(By.name("password"));
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
	
	//Login with invalid Gmail address
	@Test(priority=2)
	public void InvalidGmail() throws InterruptedException{
		
		WebElement Gmail = ChromeDriverObject.findElement(By.xpath("/html/body/div/div/div[1]/main/main/div[1]/div[1]/div[2]/div/div[1]/div[2]/div[1]"));
		Thread.sleep(10000);
		Gmail.click();
		Thread.sleep(10000);
		for(String winHandle : ChromeDriverObject.getWindowHandles()){
			ChromeDriverObject.switchTo().window(winHandle);
			}
		WebElement Email_Field = ChromeDriverObject.findElement(By.id("identifierId"));
		Email_Field.sendKeys(InvalidEmail);
		WebElement Next1 = ChromeDriverObject.findElement(By.id("identifierNext"));
		Next1.click();
		Thread.sleep(10000);
		ChromeDriverObject.quit();
	}
	
	//Login with invalid Gmail Password
	@Test(priority=3)
	public void InvalidGPassword() throws InterruptedException{
		
		WebElement Gmail = ChromeDriverObject.findElement(By.xpath("/html/body/div/div/div[1]/main/main/div[1]/div[1]/div[2]/div/div[1]/div[2]/div[1]"));
		Thread.sleep(10000);
		Gmail.click();
		Thread.sleep(10000);
		for(String winHandle : ChromeDriverObject.getWindowHandles()){
			ChromeDriverObject.switchTo().window(winHandle);
			}
		WebElement Email_Field = ChromeDriverObject.findElement(By.id("identifierId"));
		Email_Field.sendKeys(Email);
		WebElement Next1 = ChromeDriverObject.findElement(By.id("identifierNext"));
		Next1.click();
		Thread.sleep(10000);
		WebElement Pass_Field = ChromeDriverObject.findElement(By.name("password"));
		Pass_Field.sendKeys(InvalidPassword);
		Pass_Field.sendKeys(Keys.ENTER);
		Thread.sleep(10000);
		ChromeDriverObject.quit();
	}
}
