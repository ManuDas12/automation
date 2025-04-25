package Sample2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class javaScriptExecutor {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1550)");//scroll down
	//	js.executeScript("window.scrollBy(0,-1550)");//scroll up
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));//"nav-search-submit-button"
		js.executeScript("arguments[0].click();",search);
		search.click();
	}

}
