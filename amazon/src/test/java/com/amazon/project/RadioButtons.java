package com.amazon.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class RadioButtons {
	WebDriver driver;
	public RadioButtons(WebDriver driver) {
		this.driver=driver;
	}
	@SuppressWarnings("unchecked")
	public void radBut() throws InterruptedException {
		WebElement ele=driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[1]"));
		Actions actions=new Actions(driver) ;
		actions.moveToElement(ele).build().perform();
		ele.click();
		Thread.sleep(5000);
WebElement elements=driver.findElement(By.xpath("//input[@value='kn_IN']"));
Actions actions1=new Actions(driver) ;
actions1.moveToElement(elements).click().build().perform();
	}
}







