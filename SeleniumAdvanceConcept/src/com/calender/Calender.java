package com.calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IT\\Desktop\\SeleniumLearn\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/calendar.xhtml");
		
		WebElement clicknext = driver.findElement(By.xpath("//*[@id=\"j_idt87:schedule\"]/div[1]/div[1]/div/button[2]"));
		clicknext.click();
		
		WebElement selectdate = driver.findElement(null);
		

	}

}
 