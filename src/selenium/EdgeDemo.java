package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDemo {

public static void main(String[] args) {
	
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Rahul\\git\\TestLearning\\driver\\edge\\115\\edgedriver_win64\\msedgedriver.exe");
	
	WebDriver driver = new EdgeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://techelliptica.com/login.php");
	driver.close();
}
}
