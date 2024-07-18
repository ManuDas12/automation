package Sample2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioButton obj =new RadioButton();
		obj.initialiseBrowser();
		obj.radioButton();
	}

	public void initialiseBrowser() {
		driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
	}

	public void radioButton() {
		WebElement radio=driver.findElement(By.xpath("//input[@value='blue']"));
		//System.out.println(radio.isSelected());
		//System.out.println(radio.isEnabled());
		System.out.println(radio.isDisplayed());
	}
}



