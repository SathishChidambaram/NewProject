package org.day_4_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5_chrm_gt {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Version)\\driver\\chromedriver.exe");

		WebDriver gt = new ChromeDriver();

		gt.get("http://www.greenstechnologys.com/");
		
		gt.manage().window().maximize();

		Thread.sleep(2000);

		WebElement cls = gt.findElement(By.xpath("//button[@class='close']"));
		cls.click();

		Thread.sleep(3000);
		WebElement para = gt.findElement(By.xpath("//p[contains(text(),'Placement')]"));
		String txt = para.getText();
		System.out.println(txt);

	}

}
