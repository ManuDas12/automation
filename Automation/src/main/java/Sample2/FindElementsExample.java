package Sample2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementsExample extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindElementsExample obj=new FindElementsExample();
		obj.InitialiseBrowser();
		obj.elements();
	}
	
	public void elements() {
		WebElement inputForm=driver.findElement(By.xpath("(//a[@href='simple-form-demo.php'])[1]"));
		inputForm.click();
		
		List<WebElement> ele=driver.findElements(By.xpath("//input[@type='text']"));
		for (WebElement option:ele) {
			option.sendKeys("hello");
		}
	}

}
