package com.drag.drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IT\\Desktop\\SeleniumLearn\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/drag.xhtml");
		
		WebElement from = driver.findElement(By.xpath("//*[@id=\"form:drag_content\"]"));
		WebElement to = driver.findElement(By.xpath("//*[@id=\"form:drop_content\"]/p"));
		
		Actions dd = new Actions(driver);
		//dd.clickAndHold(from).moveToElement(to).release(to).build().perform();
		dd.dragAndDrop(from, to).build().perform();
	
		

	}

}
