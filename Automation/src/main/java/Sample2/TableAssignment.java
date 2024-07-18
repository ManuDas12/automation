package Sample2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableAssignment extends BaseClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableAssignment obj=new TableAssignment();
		obj.InitialiseBrowser();
		obj.fullTable4();
		System.out.println("==========");
		obj.particularRow();
		System.out.println("==========");
		obj.particularElement();
		System.out.println("==========");
		obj.searchElement();
		System.out.println("==========");
		obj.selectColumn();
		
	}
	
	public void fullTable4() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement page4=driver.findElement(By.xpath("//a[@data-dt-idx='4']"));
		page4.click();
		WebElement table4=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table4.getText());	
	}
	
	public void particularRow() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement page4=driver.findElement(By.xpath("//a[@data-dt-idx='4']"));
		page4.click();
		WebElement row=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[4]"));
		System.out.println(row.getText());	
	}
	public void particularElement() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement page4=driver.findElement(By.xpath("//a[@data-dt-idx='4']"));
		page4.click();
		WebElement particularItem=driver.findElement(By.xpath("//table[@id=\"dtBasicExample\"]/tbody/tr[5]/td[2]"));
		System.out.println(particularItem.getText());
		
	}
	public void searchElement() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement page4=driver.findElement(By.xpath("//a[@data-dt-idx='4']"));
		page4.click();
		String office="Team Leader";
		List<WebElement> searchItem=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
		for(WebElement item:searchItem) {
			if(item.getText().equals(office)) 
				System.out.println(item.getText());
		}	
	}
	public void selectColumn() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement page4=driver.findElement(By.xpath("//a[@data-dt-idx='4']"));
		page4.click();
		List<WebElement> ColoumnItem=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[6]"));
		for(WebElement option:ColoumnItem) {
			System.out.println(option.getText());
		}
		
	}
	
	
	
}
