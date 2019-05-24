package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		driver.findElement(By.xpath(".//*[@id='sidebar']/aside[1]/ul/li[2]/a")).click();
		WebElement element=driver.findElement(By.xpath(".//*[@id='content']/iframe"));
		driver.switchTo().frame(element);
	WebElement drag=driver.findElement(By.xpath(".//*[@id='draggable']"));
	WebElement drop=driver.findElement(By.xpath(".//*[@id='droppable']"));
	Actions act=new Actions(driver);
	act.dragAndDrop(drag, drop).build().perform();
		

	}

}
