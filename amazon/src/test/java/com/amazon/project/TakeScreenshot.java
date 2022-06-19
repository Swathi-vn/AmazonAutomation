package com.amazon.project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshot {
	WebDriver driver;
	public TakeScreenshot(WebDriver driver) {
		this.driver=driver;
	}

	public void takeScreenshot(String Filename) throws IOException, InterruptedException {
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Thread.sleep(3000);
        System.out.println("take ss");
		FileUtils.copyFile(file, new File("/home/swathinagraj24g/Prac_Java/amazon/src/test/java/com/amazon/project"+Filename+".jpg"));
System.out.println("ss");
	}
}
