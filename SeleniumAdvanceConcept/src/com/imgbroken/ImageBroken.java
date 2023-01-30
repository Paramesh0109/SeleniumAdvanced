package com.imgbroken;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageBroken {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IT\\Desktop\\SeleniumLearn\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://activationcall.ftxtradingsoftware.com/login");
		Thread.sleep(1000);
				
		driver.findElement(By.id("email")).sendKeys("notification@ftxtradingsoftware.com");
		driver.findElement(By.id("password")).sendKeys("Activation8903233335");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		
		WebElement enquiry = driver.findElement(By.xpath("//html/body/div[2]/div/aside/ul/li[2]/a/span[1]"));
		enquiry.click();
		Thread.sleep(2000);
		
		WebElement inprogress = driver.findElement(By.xpath("//html/body/div[2]/div/aside/ul/li[2]/ul/li[2]/a/span[1]"));
		inprogress.click();
		Thread.sleep(2000);
		
		WebElement icon = driver.findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[6]/a/i"));
		icon.click();
		Thread.sleep(2000);
		
		WebElement imgcheck = driver.findElement(
				By.xpath("//html/body/div[2]/div/div[4]/div[1]/div[2]/div/div[2]/div[2]/div/div[1]/div[1]/div/a/figure/img"));
		
		if(imgcheck.getAttribute("naturalWidth").equals("0")){
			System.out.println("The Image is Broken");
		} else {
			System.out.println("The Image is Not Broken");
		}
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
