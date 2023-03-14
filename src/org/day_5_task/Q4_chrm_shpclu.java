package org.day_5_task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q4_chrm_shpclu {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Version)\\driver\\chromedriver.exe");

		WebDriver sh = new ChromeDriver();

		sh.get("https://www.shopclues.com/wholesale.html");

		sh.manage().window().maximize();

		Actions a = new Actions(sh);

		WebElement mm = sh.findElement(By.xpath("//a[text()='Mobiles & More']"));
		a.moveToElement(mm).perform();

		Thread.sleep(2000);

		WebElement sm = sh.findElement(By.xpath("(//a[@target='_blank'])[2]"));
		a.moveToElement(sm).perform();
		sm.click();

		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) sh;

		WebElement page = sh.findElement(By.xpath("(//div[@class='heading'])[4]"));
		js.executeScript("arguments[0].scrollIntoView()", page);

		
	}

}
