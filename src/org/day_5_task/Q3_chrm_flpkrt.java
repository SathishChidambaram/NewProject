package org.day_5_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q3_chrm_flpkrt {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Version)\\driver\\chromedriver.exe");

		WebDriver fp = new ChromeDriver();

		fp.get("http://www.flipkart.com");
		
		fp.manage().window().maximize();

		Actions a = new Actions(fp);

		WebElement cls = fp.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		cls.click();

		WebElement hm = fp.findElement(By.xpath("(//img[@loading='lazy'])[5]"));
		a.moveToElement(hm).perform();
		hm.click();

		Thread.sleep(3000);
		WebElement ha = fp.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		a.moveToElement(ha).perform();

		Thread.sleep(3000);
		WebElement bt = fp.findElement(By.xpath("//a[@title='Bath Towels']"));
		a.moveToElement(bt).perform();
		bt.click();

		Thread.sleep(2000);
		WebElement prd = fp.findElement(By.xpath("(//div[@class='CXW8mj _21_khk'])[1]"));
		String text = prd.getText();
		System.out.println(text);

	}

}
