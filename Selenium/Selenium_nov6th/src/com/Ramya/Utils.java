package com.Ramya;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Utils 
{
	public static WebDriver driver;
	public static void screenshot(String Name) throws IOException
	{
System.out.println("entr into screenshot");
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			File Destination=new File("C:\\Users\\TT089\\Rafi\\Selenium\\Selenium_nov6th\\Result"+Name+".png");
			FileUtils.copyFile(source, Destination);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
System.out.println(e);		}
		
		
	}

}
