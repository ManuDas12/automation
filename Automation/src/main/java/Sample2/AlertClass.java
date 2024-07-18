package Sample2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertClass extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertClass obj=new AlertClass();
		obj.InitialiseBrowser();
		obj.alert();
	}
	
	public void alert() {
		WebElement click1=driver.findElement(By.id("alert-modal"));
		click1.click();
		WebElement click2=driver.findElement(By.xpath("//a[@href='javascript-alert.php']"));
		click2.click();
		//WebElement alert1=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		//alert1.click();
		//driver.switchTo().alert().accept();
		//==========
		//WebElement nextbutton=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		//nextbutton.click();
		//driver.switchTo().alert().dismiss();
		//==================
		WebElement button3=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		button3.click();
		driver.switchTo().alert().sendKeys("MANU DAS M");
	    driver.switchTo().alert().accept();
		
	}
	
}
