package basepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Base_class {
	public WebDriver driver;
	@BeforeTest
	public void browser() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlload() {
		driver.get("https://picsart.com/create");
	}
	

}
