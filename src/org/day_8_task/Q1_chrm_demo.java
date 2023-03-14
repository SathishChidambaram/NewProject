package org.day_8_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1_chrm_demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver de = new ChromeDriver();

		de.get("http://demo.automationtesting.in/Alerts.html");
		
		de.manage().window().maximize();

		de.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		Thread.sleep(3000);
		
		de.switchTo().alert().accept();
		
		System.out.println("Successfully Clicked OK in alertbox ");
		
		
	}

}
