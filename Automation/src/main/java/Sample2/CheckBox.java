package Sample2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBox obj=new CheckBox();
		obj.initialiseBrowser();
		obj.buttons();
		
	}
	
	
	public void initialiseBrowser() {
		driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
	}
	
	public void buttons() {
		WebElement button=driver.findElement(By.xpath("//input[@value='option-1']"));
				button.click();
		System.out.println(button.isSelected());
		
	}

}
