package Sample2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DragnDrop obj=new DragnDrop();
		obj.InitialiseBrowser();
		obj.dragDrop();
	}
	
	public void dragDrop() {
		WebElement drag=driver.findElement(By.id("others"));
		drag.click();
		
		
		WebElement drop=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement dropmove=driver.findElement(By.id("mydropzone"));
		
		Actions actions=new Actions(driver);
		actions.dragAndDrop(drop,dropmove).perform();
	}

}
