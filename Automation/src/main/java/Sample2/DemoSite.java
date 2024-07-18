package Sample2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoSite {
WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoSite obj=new DemoSite();
		obj.initialiseBrowser();
		obj.demosite1();
	}
	
	public void initialiseBrowser() {
		driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
	}
	
	public void demosite1() {
		WebElement dropdown=driver.findElement(By.id("dropdowm-menu-1"));
		dropdown.click();
		Select select=new Select(dropdown);
		//select.selectByVisibleText("Python");
		//select.selectByValue("python");
		select.selectByIndex(2);
		
		WebElement dropdown2=driver.findElement(By.id("dropdowm-menu-2"));
		dropdown2.click();
		Select select1=new Select(dropdown2);
		select1.selectByVisibleText("TestNG");
		
		WebElement dropdown3=driver.findElement(By.id("dropdowm-menu-3"));
		dropdown3.click();
		Select select3=new Select(dropdown3);
		select3.selectByVisibleText("CSS");
		dropdown3.click();
		
	}

}
