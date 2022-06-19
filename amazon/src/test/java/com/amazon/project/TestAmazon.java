package com.amazon.project;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAmazon {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","//home/swathinagraj24g/chromedriver/chromedriver");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		RadioButtons radioButton=new RadioButtons(driver);
		radioButton.radBut();
		//		SearchProduct search=new SearchProduct(driver);
		//		search.searchDell();

		//		AddToCart ad=new AddToCart(driver);
		//		ad.addCart();
		
//		SignIn signin=new SignIn(driver);
//		signin.signIn();
//		TakeScreenshot ts=new TakeScreenshot(driver);
//	ts.takeScreenshot("File name");
//		CheckBoxes check=new CheckBoxes(driver);
//		check.checkBox();
	}

}
