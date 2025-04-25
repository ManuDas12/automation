package Sample2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_Sample { 
	WebDriver driver;

	public void roboLaunch() throws AWTException {
		driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		
	 Robot robot = new Robot();
	 robot.keyPress(KeyEvent.VK_CONTROL);
	 robot.keyPress(KeyEvent.VK_T);
	 robot.keyRelease(KeyEvent.VK_CONTROL);
	 robot.keyRelease(KeyEvent.VK_T);
		 
}
	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		Robot_Sample obj=new Robot_Sample();
		obj.roboLaunch();
	}
	
}