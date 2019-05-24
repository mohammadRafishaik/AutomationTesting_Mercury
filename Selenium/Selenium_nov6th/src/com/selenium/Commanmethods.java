package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Commanmethods {

	public static WebDriver driver;
	

public static  void clickelement(String objectxpath) {
	try {
	
	
		 driver.findElement(By.xpath(objectxpath)).click();
	} catch (Exception e) {
		// TODO Auto-generated catch block
System.out.println(e);	}
	
}
}