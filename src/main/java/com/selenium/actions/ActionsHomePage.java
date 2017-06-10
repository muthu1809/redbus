package com.selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selenium.pageobjects.HomePage;
import com.selenium.util.ExcelReadingUtil;

public class ActionsHomePage {

/*	public static void execute(WebDriver driver, String fromCityName, String toCityName) {

			HomePage.fromCity(driver).click();
			HomePage.fromCity(driver).clear();
			HomePage.fromCity(driver).sendKeys(fromCityName);
			HomePage.toCity(driver).click();
			HomePage.toCity(driver).clear();
			HomePage.toCity(driver).sendKeys(toCityName);
			HomePage.journeyDate(driver).findElement(By.xpath("//input[@id='txtOnwardCalendar']")).click(); 
			HomePage.journeyDate(driver)
					.findElement(By.xpath("//div[@id='rbcal_txtOnwardCalendar']/table/tbody/tr[7]/td[4]")).click();
			HomePage.searchBuses(driver).click();

		} */
		
		public static void execute(WebDriver driver) {
			
			try {
				String fromCity = ExcelReadingUtil.getCellData(1, 1);
				String toCity = ExcelReadingUtil.getCellData(1, 2);
				HomePage.fromCity(driver).click();
				HomePage.fromCity(driver).clear();
				HomePage.fromCity(driver).sendKeys(fromCity);
				HomePage.toCity(driver).click();
				HomePage.toCity(driver).clear();
				HomePage.toCity(driver).sendKeys(toCity);
				HomePage.journeyDate(driver).findElement(By.xpath("//input[@id='txtOnwardCalendar']")).click(); 
				HomePage.journeyDate(driver)
						.findElement(By.xpath("//div[@id='rbcal_txtOnwardCalendar']/table/tbody/tr[7]/td[4]")).click();
				HomePage.searchBuses(driver).click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 



	}

}
