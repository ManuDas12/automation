package Sample2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {
WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleWindow obj=new MultipleWindow();
		obj.launchSite();
	}
	public void launchSite() {
		driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		WebElement contactUs=driver.findElement(By.xpath("//a[@id='contact-us']"));
		contactUs.click();
		WebElement login=driver.findElement(By.xpath("//a[@id='login-portal']"));
		login.click();
		
		String parentName=driver.getWindowHandle();
		System.out.println(parentName);

		Set<String> allWindow=driver.getWindowHandles();
		String title="";
		for(String temp:allWindow) {
			if(!temp.equals(parentName)) {
				System.out.println("All windows"+ temp);
				driver.switchTo().window(temp);
				System.out.println(driver.getTitle());
				title=driver.getTitle();
			}	
			if(title.equals("WebDriver | Contact Us")) {
				WebElement firstName=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
				firstName.sendKeys("Manu");
				WebElement lastName=driver.findElement(By.xpath("//input[@name='last_name']"));
				lastName.sendKeys("Das");
				WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
				email.sendKeys("hi123@gmail.com");
				
			}
			if(title.equals("WebDriver | Login Portal")) {
				WebElement login1=driver.findElement(By.xpath("//input[@placeholder='Username']"));
				login1.sendKeys("user123");
				WebElement loginPassword=driver.findElement(By.xpath("//input[@id='password']"));
				loginPassword.sendKeys("12345");
				WebElement loginButton=driver.findElement(By.xpath("//button[@id='login-button']"));
				loginButton.click();
			}
			driver.switchTo().window(parentName);
		}
	}
	
	public void multipleWindow() {
		
	}

}
