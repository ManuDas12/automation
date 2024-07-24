package Sample2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDrop {
	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileDrop obj=new FileDrop();
		obj.fileUpload();
		
	}
	
	public void fileUpload() {
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		
		WebElement selectPdf=driver.findElement(By.id("file-upload"));
		selectPdf.sendKeys("C:\\Users\\user\\Desktop\\b33f3cc4-a8ad-4144-bc6c-2ba7a57fc78a.pdf");
		WebElement upload=driver.findElement(By.id("file-submit"));
		upload.click();
	}
	
}
