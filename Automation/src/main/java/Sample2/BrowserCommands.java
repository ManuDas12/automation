package Sample2;

public class BrowserCommands extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands obj=new BrowserCommands();
		obj.InitialiseBrowser();
		obj.browserCommands();
	}
	
public void browserCommands() {
	String title=driver.getTitle();
	System.out.println(title);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	String pagesource=driver.getPageSource();
	System.out.println(pagesource);
}

}
