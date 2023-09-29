package testpackage;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import basepackage.Base_class;
import io.netty.handler.codec.http.multipart.FileUpload;
//import io.netty.handler.codec.http.multipart.FileUpload;
import pagepackage.Datadriven;
import pagepackage.Fileupload;
import pagepackage.Mouseover;
import utilities.Excelutils;


public class Testpicsart extends Base_class{
	@Test
	
	public void testrun() throws AWTException, InterruptedException {
	driver.manage().window().maximize();
	Datadriven l=new  Datadriven(driver);
	String xl="C:\\Users\\reshm\\OneDrive\\Desktop";
	String sheet="Sheet1";
	int rowCount=Excelutils.getRowCount(xl,sheet);
	
	for(int i=1;i<=rowCount;i++) {
		String email=Excelutils.getCelValue(xl,sheet,i,0);
		System.out.println("email---"+email);
		String password=Excelutils.getCelValue(xl,sheet,i,1);
		System.out.println("password---"+password);
		l.logininclick();
		l.details(email, password);
		l.clicklogin();
	}
	Fileupload fu=new Fileupload(driver);
	fu.file();
	fu.Fileupload("C:\\Users\\reshm\\OneDrive\\Desktop\\projectexcelr.xlsx");
	Thread.sleep(3000);
	
	
	
Mouseover mh=new Mouseover(driver);
mh.click();
Thread.sleep(3000);
WebElement rbackgroundremover=mh.click2();
Actions act=new Actions(driver);
act.moveToElement(rbackgroundremover);
act.perform();
Thread.sleep(3000);

//File screenshot=((TakeScreenshot)driver).getScreenshotAs(OutputType.FILES);
//FileHandler.copy(Screenshot,new File("\"C:\\screenshot\""));


		
	}
	

}
