package com.amazon.project;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddToCart {
	WebDriver driver;
	public AddToCart(WebDriver driver) {
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	@SuppressWarnings("deprecation")
	public void addCart(){
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell Keyboard wired");
		driver.findElement(By.id("nav-search-submit-button")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("window.scrollBy(0,250)");
		WebElement ele=driver.findElement(By.xpath("//span[text()='Dell Wired Keyboard with Wired Mouse']"));
		ele.click();
		System.out.println("xpath");
//
//		JavascriptExecutor js1 = (JavascriptExecutor)driver;
//		js1.executeScript("window.scrollBy(0,250)");
//
//		WebElement element=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
//		System.out.println("xpath");
//
//		Actions actions=new Actions(driver);
//		actions.moveToElement(element).build().perform();
		Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        driver.findElement(By.id("add-to-cart-button")).click();
		//Set<String> ids1 = driver.getWindowHandles();
        //Iterator<String> it1 = ids1.iterator();
        //String parentId1 = it1.next();
        //String childId1 = it1.next();
        //driver.switchTo().window(childId1);
        
        
        driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
	}
}


