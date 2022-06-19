package com.amazon.project;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchProduct {
WebDriver driver;
	public SearchProduct(WebDriver driver) {
		this.driver=driver;
		
	}
	public void searchDell() throws InterruptedException {
		
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dell laptops");
		Thread.sleep(3000);
		System.out.println("dell laptop");
		 driver.findElement(By.id("nav-search-submit-button")).click();
		
		//List<WebElement> listItems = driver.findElements(By.cssSelector("a-size-medium a-color-base a-text-normal"));
		List<WebElement> listItems = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		System.out.println(listItems.size());
		List<String> destination =new ArrayList<String>();
		for(WebElement item: listItems) {
			System.out.println(item.getText());
			destination.add(item.getText());
		}
		JDBCAmazon jdbc = new JDBCAmazon();
		List<String> dataFromDB = null;
		try {
			dataFromDB = jdbc.fetchDataFromDB();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(String item:dataFromDB)
		{
			System.out.println("Source -> "+item);
			boolean found = false;
			for(String item1: destination) {
				
				System.out.println("Dest -> "+item1);
				if(item1.contentEquals(item)) {
					found = true;
				}
			}
			if(found) {
				System.out.println("FOUND");
			}else {
				System.out.println("NOT FOUND");
			}
		}
	}
	
}

