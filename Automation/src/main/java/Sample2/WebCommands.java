package Sample2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebCommands extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebCommands obj=new WebCommands();
		obj.InitialiseBrowser();
		obj.webCommands();
		//obj.getTotal();
	}
	
	public void webCommands() {
		WebElement inputform1=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputform1.click();
		WebElement message=driver.findElement(By.id("single-input-field"));
		message.sendKeys("Hello world");
		WebElement send=driver.findElement(By.id("button-one"));
		send.click();
		System.out.println(send.getText());
	}

	public void getTotal() {
		WebElement inputform1=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputform1.click();
		WebElement value1=driver.findElement(By.id("value-a"));
		value1.sendKeys("20");
		WebElement value2=driver.findElement(By.id("value-b"));
		value2.sendKeys("20");
		WebElement total=driver.findElement(By.id("button-two"));
		total.click();
	}
}
