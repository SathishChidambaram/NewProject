package org.day_3_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3_chrm_auto {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver a = new ChromeDriver();

		a.get("http://demo.automationtesting.in/Register.html");

		WebElement name = a.findElement(By.xpath("(//input[@type='text'])[1]"));
		name.sendKeys("Sathish");

		WebElement lname = a.findElement(By.xpath("(//input[@type='text'])[2]"));
		lname.sendKeys("Chidambaram");

		WebElement add = a.findElement(By.xpath("//textarea[@rows='3']"));
		add.sendKeys("Trichy");

		WebElement email = a.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("sathishcivil2000@gmail.com");

		WebElement ph = a.findElement(By.xpath("//input[@type='tel']"));
		ph.sendKeys("9894586508");

		WebElement gen = a.findElement(By.xpath("(//input[@type='radio'])[1]"));
		gen.click();

		WebElement hob = a.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		hob.click();

		WebElement pass = a.findElement(By.xpath("//input[@ng-model='Password']"));
		pass.sendKeys("12345678");

		WebElement cpass = a.findElement(By.xpath("//input[@ng-model='CPassword']"));
		cpass.sendKeys("12345678");

		WebElement log = a.findElement(By.xpath("//button[@type='submit']"));
		log.click();

	}

}
