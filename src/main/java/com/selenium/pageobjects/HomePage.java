package com.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public static WebElement element = null;

	public static WebElement fromCity(WebDriver driver) {
		 element = driver.findElement(By.id("txtSource"));
		 return element; 
	}
	public static WebElement toCity(WebDriver driver) {
		 element = driver.findElement(By.id("txtDestination"));
		 return element; 
	}
	public static WebElement journeyDate(WebDriver driver)
	{
		 element = driver.findElement(By.xpath("//input[@id='txtOnwardCalendar']"));
		 
		 return element; 
	}
	public static WebElement searchBuses(WebDriver driver)
	{
		element = driver.findElement(By.id("searchBtn"));
		return element; 
	}
}
