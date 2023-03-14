package org.day_4_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8_chrm_htl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Version)\\driver\\chromedriver.exe");
		
		WebDriver ht = new ChromeDriver();
		
		ht.get("http://adactinhotelapp.com/");
		
		ht.manage().window().maximize();
		
		WebElement usr = ht.findElement(By.xpath("//input[@name='username']"));
		usr.sendKeys("Sathish");
		String prt1 = usr.getAttribute("value");
		System.out.println(prt1);
		
		WebElement pass = ht.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("12345678");
		String prt2 = pass.getAttribute("value");
		System.out.println(prt2);

	}

}
