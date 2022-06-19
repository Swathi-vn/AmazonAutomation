package com.amazon.project;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxes {
	WebDriver driver;
	public CheckBoxes(WebDriver driver) {
		this.driver=driver;
	}
	public void checkBox() throws InterruptedException {
		driver.findElement(By.linkText("Mobiles")).click();;
		Thread.sleep(3000);
		WebElement element=driver.findElement(By.xpath("//span[text()='Seller']"));
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		System.out.println("scroll down");
		Thread.sleep(2000);
		//List<WebElement> allCheckboxes=driver.findElements(By.xpath("(//ul[@class='a-unordered-list a-nostyle a-vertical a-spacing-medium'])[12]")); 
	   // int size=allCheckboxes.size();
	    
	   // System.out.println("Size "+size);
	    //driver.findElement(By.linkText("AMEZ")).click();
	    List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
	    System.out.println("Number of Check boxes : "+ Integer.toString(allCheckBoxes.size()));
	         
	    for(WebElement cb:allCheckBoxes)
	    {
	    	System.out.println("Checkboxes "+ cb.getAttribute("value"));
	        //cb.click();
	    }
	    System.out.println("All check boxes have been checked");
	      }
//	    for(int i=0;i<size;i++) {
//	    	String items=allCheckboxes.get(i).get;
//	    	System.out.println("items in the list"+items);
//	    	if(allCheckboxes.get(i).getText().contains("AMEZ")) {
//	    		
//	    		System.out.println("working");
//	    		allCheckboxes.get(i).click();
//	    	}
//	    	
//	    	
//	    	
//	    }
//	    	
	//}

}
