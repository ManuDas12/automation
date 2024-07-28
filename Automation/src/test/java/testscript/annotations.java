package testscript;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class annotations {
  @Test
  public void allMethodTry() { //reads 4th
	  System.out.println("hi sample 1 method");
  }
  @BeforeMethod
  public void beforeMethod() {//reads third
	  System.out.println("hi sample before  method");
  }

  @AfterMethod
  public void afterMethod() { //reads 5th
	  System.out.println("hi sample after method");
  }

  @BeforeClass
  public void beforeClass() {//reads second
	  System.out.println("hi sample before class");
  }

  @AfterClass
  public void afterClass() {//reads 6th
	  System.out.println("hi sample after class");
  }

  @BeforeTest
  public void beforeTest() { //reads first
	  System.out.println("hi sample before test");
  }
  

  @AfterTest
  public void afterTest() {//reads 7th
	  System.out.println("hi sample after test");
  }

}
