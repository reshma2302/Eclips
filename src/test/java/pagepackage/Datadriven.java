package pagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Datadriven {
	 WebDriver driver;
	    
	   By rsignin=By.xpath("//*[@id=\"header-desktop\"]/div/div[3]/div[2]/div/div/button");
	   By remail=By.xpath("//*[@id=\"auth-form\"]/div/div[1]/div/div/input");
	   By remailclick=By.xpath("//*[@id=\"auth-form\"]/div/div[2]/button[2]");
	   By rpassword=By.xpath("//*[@id=\"auth-form\"]/div/div[1]/div/div[1]/input");
	   By rpasswordclick=By.xpath("//*[@id=\"auth-form\"]/div/div[2]/button[2]");

	public Datadriven(WebDriver driver) {
		this.driver=driver;
	}
	public void logininclick()
	{
		driver.findElement(rsignin).click();
	}
	public void details(String email,String password) {
		driver.findElement(remail).clear();
		driver.findElement(remail).sendKeys(email);
		driver.findElement(rpassword).clear();
		driver.findElement(rpassword).sendKeys(password);
	}
	public void clicklogin()
	{
		driver.findElement(remailclick).click();
		driver.findElement(rpasswordclick).click();
	}
	
}


