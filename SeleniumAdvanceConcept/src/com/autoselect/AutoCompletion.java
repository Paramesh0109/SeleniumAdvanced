package com.autoselect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompletion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IT\\Desktop\\SeleniumLearn\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		
		WebElement input = driver.findElement(By.id("j_idt87:auto-complete_input"));
		input.sendKeys("A");
		
		Thread.sleep(2000);
		List<WebElement> searchlist = driver.findElements(By.xpath("//*[@id=\"j_idt87:auto-complete_panel\"]/ul/li"));
		System.out.println(searchlist.size());
		
		for (WebElement webElement : searchlist) {
			
			if (webElement.getText().equals("RestAssured")) {
				webElement.click();
				
			}
		}		

	}

}
