package com.windowhandling;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IT\\Desktop\\SeleniumLearn\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://finance.ftxtradingsoftware.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement un=driver.findElement(By.id("email"));
		un.sendKeys("billing@callcentreproject.com");
		
		WebElement pw = driver.findElement(By.id("password-field"));
		pw.sendKeys("dTTslyGAl");
		
		WebElement sub = driver.findElement(By.className("acceptBtn"));
		sub.click();
		Thread.sleep(2000);
		
		WebElement se = driver.findElement(By.xpath("//*[@id=\"menu\"]/li[2]/a/span"));
		se.click();
		Thread.sleep(1000);
		
		WebElement sign = driver.findElement(By.xpath("//*[@id=\'menu\']/li[2]/ul/li[1]/a"));
		sign.click();
		Thread.sleep(2000);
		
		String oldwindow = driver.getWindowHandle();
		
		WebElement pending = driver.findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[6]/a"));
		pending.click();
		
		Set<String> handles = driver.getWindowHandles();
				
		for (String firstwindow : handles) {
			driver.switchTo().window(firstwindow);
			}
		
		WebElement ab = driver.findElement(By.name("invoice_id"));
		ab.sendKeys("123234");
		Thread.sleep(2000);
		
		WebElement abc = driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[4]/div/div[2]/div[1]/div/div[2]/div/div[17]/div[1]/button"));
		abc.click();
		Thread.sleep(2000);
		
		int noofwindow = driver.getWindowHandles().size();
		System.out.println(" Totally " +noofwindow +" windows opened");
		
		Set<String> newindows = driver.getWindowHandles();
		
		for (String allwindow : newindows) {
			if (!allwindow.equals(oldwindow)) {
				driver.switchTo().window(allwindow);
				Thread.sleep(2000);
				driver.close();
				Thread.sleep(2000);
				driver.quit();
			}			
			
		}												

	}

}
