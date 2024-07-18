package Sample2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DropDown obj=new DropDown();
		obj.InitialiseBrowser();
		obj.selectInput();
	}
	
	public void selectInput() {
		WebElement inputForm=driver.findElement(By.xpath("(//a[@href='simple-form-demo.php'])[1]"));
		inputForm.click();
		WebElement selectInput=driver.findElement(By.xpath("//a[@href='select-input.php']"));
		selectInput.click();
		WebElement dropdown= driver.findElement(By.id("single-input-field"));
		Select select=new Select(dropdown);
		//select.selectByVisibleText("Red");
		//select.selectByValue("Red");
		select.selectByIndex(1);
	}
}


