package testscript;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class NewTest {
  @Test
  public void testSample() {
	  System.out.println("this is displaying");
  }
  @Test
  public void newHi() {
	  System.out.println("New Display");
  }
  @Test
  public void myText() {
	  System.out.println("iam typing");
  }
}
