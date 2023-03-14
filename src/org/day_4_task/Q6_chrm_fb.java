package org.day_4_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q6_chrm_fb {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Version)\\driver\\chromedriver.exe");

		WebDriver fb = new ChromeDriver();
		
		fb.get("https://www.facebook.com/");
		
		fb.manage().window().maximize();
		
		WebElement email = fb.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("sathish@gmail.com");
		
		WebElement pass = fb.findElement(By.xpath("//input[@name='pass']"));
		pass.sendKeys("12345678");
		
		String prt1 = email.getAttribute("value");
		System.out.println(prt1);
		
		String prt2 = pass.getAttribute("value");
		System.out.println(prt2);
		

	}

}
