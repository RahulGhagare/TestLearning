package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class FirefoxDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rahul\\git\\TestLearning\\driver\\firefox\\115\\geckodriver-v0.33.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();

		//username

		By ref1 = By.id("user-name");
		WebElement driver1 = driver.findElement(ref1);
		driver1.sendKeys("standard_user");
		

		//password
		By ref2 = By.id("password");
		WebElement driver2 = driver.findElement(ref2);
		driver2.sendKeys("secret_sauce");

		//LoginButton click

		//By ref3 = By.id("login-button");
		//WebElement driver3 = driver.findElement(ref3);
		//driver3.click();

		By ref3 = By.xpath("//input[@id='login-button']");
		WebElement driver3 = driver.findElement(ref3);
		driver3.click();

		//By ref4 = By.xpath("//input[@id='react-burger-menu-btn']");
		
		By ref4 = By.xpath("//input[@id='react-burger-menu-btn']");
		WebElement driver4 = driver.findElement(ref4);
		driver4.click();
		
		
		By ref5 = By.id("logout_sidebar_link");
		WebElement driver5 = driver.findElement(ref5);
		driver5.click();

		





	}

}
