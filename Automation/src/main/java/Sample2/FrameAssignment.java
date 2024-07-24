package Sample2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAssignment {
WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameAssignment obj=new FrameAssignment();
		obj.launch();
	}

	public void launch() {
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/guru99home/");
	driver.manage().window().maximize();	
	
//	WebElement iframe=driver.findElement(By.xpath("//iframe[@wmode='transparent']"));
	//driver.switchTo().frame(iframe);
	WebElement frameSample=driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/RbSlW8jZFe8']"));
	frameSample.click(); 
		
	}
	
}






//iframe[@id="google_ads_iframe_/24132379/guru99.com_300x600_sticky_0"]