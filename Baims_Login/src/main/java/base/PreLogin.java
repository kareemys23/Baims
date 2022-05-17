package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

@Test
public class PreLogin {
	
	public WebDriver ChromeDriverObject;
	public String Email = "kareemyassersamir74@gmail.com";
	public String Password = "ABcd1234";
	public Faker fake=new Faker();
	public String username=fake.name().username();
	public String InvalidEmail = username+"5689@gmail.com";
	public String InvalidPassword =fake.internet().password();	
	
	@BeforeMethod
	public void Login() {
		
		System.setProperty("webdriver.chrome.driver","F:\\Testing\\Programs\\chromedriver.exe");
		ChromeDriverObject = new ChromeDriver();
		ChromeDriverObject.navigate().to("https://baims.com/");
		ChromeDriverObject.manage().window().maximize();
		WebElement Signin = ChromeDriverObject.findElement(By.xpath("//*[@id=\"app_login\"]/a"));
		Signin.click();
	}
	
		
	}
	
