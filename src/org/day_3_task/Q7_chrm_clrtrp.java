package org.day_3_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q7_chrm_clrtrp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.diver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver clr = new ChromeDriver();

		clr.get("https://www.cleartrip.com/trains");
		
		WebElement frm = clr.findElement(By.xpath("(//input[@type='text'])[1]"));
		frm.sendKeys("Chennai");
		
		WebElement to = clr.findElement(By.xpath("(//input[@type='text'])[2]"));
		to.sendKeys("Bengaluru");
		
		WebElement srch = clr.findElement(By.xpath("//button[@type='submit']"));
		srch.click();
	}

}
