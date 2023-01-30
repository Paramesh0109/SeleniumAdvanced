package com.links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_learn {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\IT\\Desktop\\SeleniumLearn\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//("https://leafground.com/link.xhtml");
		driver.navigate().to("https://leafground.com/link.xhtml");
					
		WebElement linkclick = driver.findElement(By.linkText("Go to Dashboard"));
		linkclick.click();
		driver.navigate().back();
		
		WebElement Findmydesign = driver.findElement(By.partialLinkText("Find the URL"));
		String foundlink = Findmydesign.getAttribute("href");
		System.out.println("This link go to : " + foundlink);
		
		WebElement brokenlink = driver.findElement(By.linkText("Broken?"));
		brokenlink.click();
		String title = driver.getTitle();
		if (title.contains("404")) {
			System.out.println("The Link is Broken");
		} else {
			System.out.println("The Link is Not Broken");
		}
		driver.navigate().back();
		
		WebElement linkclick1 = driver.findElement(By.linkText("Go to Dashboard"));
		linkclick1.click();
		Thread.sleep(2000);
		driver.navigate().back();
				
		List<WebElement> totallink = driver.findElements(By.tagName("a"));
		int linkcount = totallink.size();
		
		System.out.println("Link count is : " +linkcount);
		
	}

}
