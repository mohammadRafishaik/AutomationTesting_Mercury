package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actionclasses extends Commanmethods {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new FirefoxDriver();
	    driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		Thread.sleep(3000);
		clickelement(".//*[@id='sidebar']/aside[1]/ul/li[1]/a");
//		driver.findElement(By.xpath(".//*[@id='sidebar']/aside[1]/ul/li[1]/a")).click();
//		WebElement element=driver.findElement(By.tagName("iframe"));
//		WebElement element=driver.findElement(By.xpath(".//*[@id='content']/iframe"));
//		driver.switchTo().frame(element);
//	String text=driver.findElement(By.xpath(".//*[@id='draggable']")).getText();
//	System.out.println(text);
		
				}

}
