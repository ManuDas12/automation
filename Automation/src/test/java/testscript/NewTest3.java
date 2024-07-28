package testscript;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest3 {
  @Test
  public void myMethod() {
	  System.out.println("hiii 1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("hiii before");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("hiii after");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("hiii before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("hiii after class");
  }

}
