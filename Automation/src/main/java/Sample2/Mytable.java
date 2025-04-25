package Sample2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mytable {
WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mytable obj =new Mytable();
		obj.launch();
		obj.web();
		obj.table();
	}
	
	public void launch() {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void web() {
		WebElement user=driver.findElement(By.name("username"));
		String name="Admin";
		String pass="admin123";
		user.clear();
		user.sendKeys("Admin");
		WebElement pass2=driver.findElement(By.name("password"));
		pass2.clear();
		pass2.sendKeys("admin123");
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
	}
	public void table() {
		WebElement tab=driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']"));
		tab.click();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		WebElement button=driver.findElement(By.xpath("//input[@value='1']"));
		button.click();
		WebElement click2=driver.findElement(By.xpath("//div[text()='54321' ]"));
		click2.click();
		System.out.println(click2.getText());
		
	}
}
