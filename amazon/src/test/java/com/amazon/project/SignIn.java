package com.amazon.project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SignIn {
	WebDriver driver;
	public SignIn(WebDriver driver) {
		this.driver=driver;
	}
	public void signIn() throws InterruptedException {
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Hello, Sign in']"))).build().perform();;
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("12345");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("a-autoid-0")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("34215");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		
		driver.close();



	}

}
