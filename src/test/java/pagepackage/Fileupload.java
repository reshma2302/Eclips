package pagepackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fileupload {
	WebDriver driver;
	By rupload=By.xpath("//*[@id=\"upload-button_undefined\"]");
	public Fileupload(WebDriver driver)
	{
		this.driver=driver;
	}
	public void file()
	{
		driver.findElement(rupload).click();
	}
	public void Fileupload(String f) throws AWTException{
	{
		StringSelection strSelection=new StringSelection(f);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
		
		//to paste into system window
		Robot robot=new Robot();
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
		
		
		
	}
}

	