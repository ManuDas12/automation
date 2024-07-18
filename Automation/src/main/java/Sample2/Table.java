package Sample2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Table extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table obj=new Table();
		obj.InitialiseBrowser();
		obj.fullTable();
		System.out.println("========================");
		obj.particularRow();
		System.out.println("========================");
		obj.particularElement();
		System.out.println("========================");
		obj.searchElement();
		System.out.println("========================");
		obj.selectColumn();
		System.out.println("========================");
		obj.selectColumnFromRow();
	}
	
	public void fullTable() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table =driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());
	}
	public void particularRow() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[7]"));
		System.out.println(table.getText());
		
	}
	
	public void particularElement() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement selectData=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[7]/td[2]"));
		System.out.println(selectData.getText());
	}
	public void searchElement() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		String inputData="Tiger Nixon";
		List<WebElement> search=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		for(WebElement element:search) {
			if (element.getText().equals(inputData))
			System.out.println(element.getText());
		}
		
	}
	public void selectColumn() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> column=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[3]"));
		for(WebElement option:column) {
			System.out.println(option.getText());
		}
	}
	public void selectColumnFromRow() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> rowColumn=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr[5]/td[3]"));
		for(WebElement option:rowColumn) {
			System.out.println(option.getText());  
		}
		
	}

}
