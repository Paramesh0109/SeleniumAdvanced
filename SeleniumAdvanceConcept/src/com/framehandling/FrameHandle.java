package com.framehandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FrameHandle {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IT\\Desktop\\SeleniumLearn\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/frame.xhtml");
		
		driver.switchTo().frame(0);
		WebElement clk = driver.findElement(By.id("Click"));
		clk.click();
		String txt = driver.findElement(By.id("Click")).getText();
		System.out.println(txt);
		
		driver.switchTo().defaultContent();
						
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		WebElement clk1 = driver.findElement(By.xpath("//*[@id=\'Click\']"));
		clk1.click();
		String txt1 = driver.findElement(By.id("Click")).getText();
		System.out.println(txt1);
		
		
		driver.switchTo().defaultContent();
		List<WebElement> clk2 = driver.findElements(By.tagName("iframe"));
		int size = clk2.size();
		System.out.println(size);
		driver.quit();
	}

}
