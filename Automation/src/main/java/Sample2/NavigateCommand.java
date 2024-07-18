package Sample2;

public class NavigateCommand extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigateCommand obj1=new NavigateCommand();
		obj1.InitialiseBrowser();
		obj1.NavigateCommands();
	}
	
	public void NavigateCommands() {
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
