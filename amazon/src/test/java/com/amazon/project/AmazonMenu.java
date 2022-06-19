package com.amazon.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AmazonMenu {
	WebDriver driver;

	public AmazonMenu(WebDriver driver) {
		this.driver=driver;
	}

	public void SelectMenu() throws InterruptedException {
		WebElement ele=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Thread.sleep(3000);
		//To select one object from the list
		//Select selects=new Select(ele);
		//selects.selectByVisibleText("Amazon Pharmacy");

		//To select all objects
		Select selects=new Select(ele);
		List<WebElement> listMenu=selects.getOptions();
		System.out.println(listMenu.size());
		//Print all the values
		Thread.sleep(3000);

		for(int i=0;i<listMenu.size();i++) {
			String menuItems=listMenu.get(i).getText();
			System.out.println(menuItems);
			if(menuItems.equals("Watches")) {
				listMenu.get(i).click();
				break;
			}
		}




	}
}
