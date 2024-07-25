package Sample2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {
WebDriver driver;

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		RobotClass obj=new RobotClass();
		obj.roboLaunch();
	}
	
public void roboLaunch() throws AWTException {
	driver=new ChromeDriver();
	driver.get("https://www.ilovepdf.com/pdf_to_word");
	driver.manage().window().maximize();
	
	WebElement selectPdf=driver.findElement(By.xpath("//span[text()='Select PDF file']"));
	//selectPdf.click();
	//selectPdf.sendKeys("C:\\Users\\user\\Desktop\\b33f3cc4-a8ad-4144-bc6c-2ba7a57fc78a.pdf");
	
	StringSelection s = new StringSelection("C:\\\\Users\\\\user\\\\Desktop\\\\b33f3cc4-a8ad-4144-bc6c-2ba7a57fc78a.pdf");
    // Clipboard copy
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null); //cpaste to clipboard
 // Robot object creation
    Robot r = new Robot();
    //pressing enter
    r.delay(10);
    r.keyPress(KeyEvent.VK_ENTER);
    //releasing enter
    r.keyRelease(KeyEvent.VK_ENTER);
    //pressing ctrl+v
    r.keyPress(KeyEvent.VK_CONTROL);//two commands for pate
    r.keyPress(KeyEvent.VK_V);//two
    //releasing ctrl+v
    r.keyRelease(KeyEvent.VK_CONTROL);//release command
    r.keyRelease(KeyEvent.VK_V);
    	      //pressing enter
    	      r.keyPress(KeyEvent.VK_ENTER);
    	      //releasing enter
    	      r.delay(90);
    	      r.keyRelease(KeyEvent.VK_ENTER);
}

}
