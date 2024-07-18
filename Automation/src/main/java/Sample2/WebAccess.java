package Sample2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebAccess {
WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebAccess obj=new WebAccess();
		obj.display();
	}
	
	public void display() {
	 	driver = new ChromeDriver();
	 	driver =new FirefoxDriver();
	 	driver=new EdgeDriver();
	}

}
