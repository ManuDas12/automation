package Sample2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckboxDemo extends DemoSite{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CheckboxDemo obj=new  CheckboxDemo();
		 obj.initialiseBrowser();
		 obj.checkBox();
	}
	
	public void checkBox() {
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement option:checkbox) {
			option.click();
			System.out.println(option.isSelected());
		}
	}

}
