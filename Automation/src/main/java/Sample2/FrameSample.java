package Sample2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameSample {
WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameSample obj=new FrameSample();
		obj.launchsite();
	}
	public void launchsite() {
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(iframe);
		WebElement frame1=driver.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']"));
		frame1.click();
		
	}

}

