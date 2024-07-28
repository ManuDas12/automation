package testscript;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest2 {
  @Test
  public void nextMethod() {
	  System.out.println("hiii world");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("hoiiiiiii before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("hi after method");
  }
  @Test
  public void method12() {
	  System.out.println("no display");
  }

}
