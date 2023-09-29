package pagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mouseover {
	WebDriver driver;
	 By reditingtools=By.xpath("//*[@id=\"header-desktop\"]/div/div[2]/nav/div[2]/strong");
	    By rbackgroundremover=By.xpath("//*[@id=\"header-desktop\"]/div/div[2]/nav/div[2]/div/div/div[1]/div/a[2]");
	   
	    public Mouseover(WebDriver driver)
	    {
	    	this.driver=driver;
	    }
	    public void click()
	    {
	    	driver.findElement(reditingtools).click();
	    }
	    public WebElement click2()
	    {
	    	return driver.findElement(rbackgroundremover);
	    }
    

}
