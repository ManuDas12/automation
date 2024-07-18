package Sample2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseClass obj=new BaseClass();
		obj.InitialiseBrowser();
		//obj.DriverQuit();

	}
	
	public void InitialiseBrowser() {
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize();
	}
	
	public void DriverQuit() {
		driver.close();
		
	}

}
