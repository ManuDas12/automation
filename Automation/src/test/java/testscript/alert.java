package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class alert extends baseclass {
  @Test
  public void alertHandle() {
		WebElement click1=driver.findElement(By.id("alert-modal"));
		click1.click();
		WebElement click2=driver.findElement(By.xpath("//a[@href='javascript-alert.php']"));
		click2.click();
		WebElement alert1=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		alert1.click();
		driver.switchTo().alert().accept();
		//========================
		
		WebElement button3=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		button3.click();
		driver.switchTo().alert().sendKeys("MANU DAS M");
	    driver.switchTo().alert().accept();
  }
}
