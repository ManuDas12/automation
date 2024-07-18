package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public void idLocator() {
WebElement id1=driver.findElement(By.id("single-input-field"));
WebElement id2=driver.findElement(By.id("message-two"));
WebElement id3=driver.findElement(By.id("button-one"));
WebElement id4=driver.findElement(By.id("single-input-field2"));
WebElement id5=driver.findElement(By.id("button-two"));
}

public void classLocator() {
	WebElement classname1=driver.findElement(By.className("clearfix"));
	WebElement classname2=driver.findElement(By.className("ui-button ui-corner-all ui-widget"));
	WebElement classname3=driver.findElement(By.className("navbar navbar-expand-md navbar-dark"));
	WebElement classname4=driver.findElement(By.className("card-body"));
	WebElement classname5=driver.findElement(By.className("dataTables_paginate paging_simple_numbers"));
}

public void nameLocator() {
	WebElement name1=driver.findElement(By.name("viewport"));
	WebElement name2=driver.findElement(By.name("keywords"));
	WebElement name3=driver.findElement(By.name("description"));
	WebElement name4=driver.findElement(By.name("author"));


}

public void linkText() {
	WebElement link1=driver.findElement(By.linkText("simple-form-demo.php"));
	WebElement link2=driver.findElement(By.linkText("check-box-demo.php"));
	WebElement link3=driver.findElement(By.linkText("select-input.php"));
}

public void partialLink() {
	WebElement partial1=driver.findElement(By.partialLinkText("simple-form"));
	WebElement partial2=driver.findElement(By.partialLinkText("bootstrap-dual-list"));
	WebElement partial3=driver.findElement(By.partialLinkText("radio-button-demo"));
}

//css selector

public void cssSelector() {
	//tag and id
	WebElement selector1=driver.findElement(By.cssSelector("input#single-input-field"));//tag#idvalue
	WebElement selector2=driver.findElement(By.cssSelector("button#button-one"));
	WebElement selector3=driver.findElement(By.cssSelector("span#basic-addon1"));
	
	//tag and class
	WebElement tag1=driver.findElement(By.cssSelector("input.form-control"));  //tag.classname
	WebElement tag2=driver.findElement(By.cssSelector("span.input-group-text")); 
	WebElement tag3=driver.findElement(By.cssSelector("div.container")); 
	/////
	WebElement tagattribute1=driver.findElement(By.cssSelector("input[placeholder =Message]")); //tag[attributetype=attribute value]
	WebElement tagattribute2=driver.findElement(By.cssSelector("button[type=\"button]"));
	WebElement tagattribute3=driver.findElement(By.cssSelector("div[id=\"message-two\"]"));
	////
	WebElement tagclass1=driver.findElement(By.cssSelector("button.navbar-toggler[type=\"button\"]")); // tag.class[attribute type =attribute value]
	WebElement tagclass2=driver.findElement(By.cssSelector("span.input-group-text[id=\"basic-addon1\"]"));
	WebElement tagclass3=driver.findElement(By.cssSelector("div.my-2[id=\"message-one\"]"));
}


public void rxPath() {

	WebElement xpath2=driver.findElement(By.xpath("//input[@placeholder='Enter Value']"));
	WebElement xpath3=driver.findElement(By.xpath("//meta[@content=\"IE=edge\"]"));
}

public void abXpath() {
	WebElement abXpath1=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div[2]/form/div[1]/input"));//absolute xpath
	WebElement abXpath2=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button"));
}

public void dxPath() {
	WebElement dxpath1=driver.findElement(By.xpath("//input[contains(@id,'-a')]"));// dynamic xpath contains  //syntax: tagname[contains(@attribute, 'value')]
	WebElement dxpath2=driver.findElement(By.xpath("//div[contains(@class,'input-group-append')]"));
}

public void dxpathText() {
	WebElement dxpathtext1=driver.findElement(By.xpath("//button[text()='Show Message']"));// dynamic xpath text   //syntax:  tagname[text()='value']
	WebElement dxpathtext2=driver.findElement(By.xpath("//button[text()='Get Total']"));   //
	WebElement dxpathtext3=driver.findElement(By.xpath("//label[text()=\"Enter Message\"]")); 
}
public void xPath() {  //x path axes method
WebElement axes1=driver.findElement(By.xpath("//div[@data-provide=\"datepicker\"]//child::input"));//syntax:  //tag_name[@attribute_name=’attribute_value’]//child:: tag_name
WebElement axes2=driver.findElement(By.xpath("//button[@type=\"button\"]//child::span"));
}

public void xpathParent() { // parent xpath
WebElement parent1=driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));// 	syntax: //tagname[@attribute='attribute value']//parent::parent tag"));
}

public void xpathFollowing() {
	WebElement following1=driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id=\"message-one\"]")); // 	syntax: //tagname[@attribute='attribute value']//following::tag[@attribute=attribute value]"));
}
public void xpathIndex() {
	WebElement index1=driver.findElement(By.xpath("(//form[@method=\"POST\"])[1]")); //returns index // syntax:: (//tagname[@attribute="attribute value"])[1 or 2 or ..n]")) //where 1 or 2 or n denotes the number of index value repeated in the code to select the specific code at the specific position 
}

}
