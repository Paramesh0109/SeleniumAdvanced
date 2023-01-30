package com.filedowload;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDowload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IT\\Desktop\\SeleniumLearn\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/file.xhtml");
		
		WebElement downloadlink = driver.findElement(By.id("j_idt93:j_idt95"));
		downloadlink.click();
		Thread.sleep(2000);
		
		File filelocation = new File("C:\\Users\\IT\\Downloads");
		File[] Checkallfile = filelocation.listFiles();
		
		for (File file : Checkallfile) {
			
			if (file.getName().equals("TestLeaf Logo.png")) {
				System.out.println("File is downloaded");
				break;												
			}
		driver.quit();	
		}
		
	}
}
