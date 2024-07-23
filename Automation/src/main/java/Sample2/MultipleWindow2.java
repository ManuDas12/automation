package Sample2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow2 {
	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleWindow2 obj=new MultipleWindow2();
		obj.launchsite();
	}
	
	public void launchsite() {
		driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		WebElement toDo=driver.findElement(By.xpath("//a[@id='to-do-list']"));
		toDo.click();
		WebElement scroll=driver.findElement(By.xpath("//a[@id='scrolling-around']"));
		scroll.click();
		
		String parentName=driver.getWindowHandle();
		System.out.println(parentName);
		
		Set<String> allWindow=driver.getWindowHandles();
		String title="";
		
		for(String temp:allWindow) {
			if(!temp.equals(parentName)) {
				System.out.println("all windows"+temp);
				driver.switchTo().window(temp);
				System.out.println(driver.getTitle());
				title=driver.getTitle();
			}
			
			if(title.equals("WebDriver | To Do List")) {
				WebElement text1=driver.findElement(By.xpath("//input[@placeholder='Add new todo']"));
				text1.sendKeys("New Agenda");
				WebElement text2=driver.findElement(By.xpath("//li[text()=' Go to potion class']"));
				text2.click();
			}
			if(title.equals("WebDriver | Scrolling")) {
				WebElement  scroll1=driver.findElement(By.xpath("//div[@id='zone1']"));
				scroll1.click();
			}
			driver.switchTo().window(parentName);
		}
	}

}
