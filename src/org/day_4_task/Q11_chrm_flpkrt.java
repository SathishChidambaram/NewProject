package org.day_4_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q11_chrm_flpkrt {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Version)\\driver\\chromedriver.exe");

		WebDriver flp =new ChromeDriver();
		
		flp.get("https://www.flipkart.com/");
		
		flp.manage().window().maximize();
		
		WebElement ph = flp.findElement(By.xpath("(//input[@type='text'])[2]"));
		ph.sendKeys("9894586508");
		
		WebElement req = flp.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		req.click();
		
		String prt1 = ph.getAttribute("value");
		System.out.println(prt1);
		
	
		
	}

}
