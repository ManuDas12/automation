package testscript;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest4 {
  @Test(priority = 2)
  public void priority() {
	  System.out.println("first method");
  }
  @Test(priority = 1)
  public void priority2() {
	  System.out.println("second method");
  }
  @Test(priority = 3)
  public void priority3() {
	  System.out.println("third method");
  }
  

  }



