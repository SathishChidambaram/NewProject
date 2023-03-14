package org.day_2_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q9_chrm_demo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver de = new ChromeDriver();

		de.get("http://demo.automationtesting.in/Register.html");

		de.manage().window().maximize();

		WebElement nme = de.findElement(By.xpath("//input[@placeholder='First Name']"));
		nme.sendKeys("Sathish");

		WebElement lstnme = de.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lstnme.sendKeys("Chidambaram");

		WebElement add = de.findElement(By.xpath("//textarea[@rows='3']"));
		add.sendKeys("Trichy");

		WebElement ema = de.findElement(By.xpath("//input[@type='email']"));
		ema.sendKeys("sathishcivil2000@gmail.com");

		WebElement ph = de.findElement(By.xpath("//input[@type='tel']"));
		ph.sendKeys("9894586508");

		WebElement gen = de.findElement(By.xpath("(//input[@type='radio'])[1]"));
		gen.click();

		WebElement hobie = de.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		hobie.click();

		WebElement pass = de.findElement(By.id("firstpassword"));
		pass.sendKeys("Sathish@7");

		WebElement cpass = de.findElement(By.id("secondpassword"));
		cpass.sendKeys("Sathish@7");

		WebElement clk = de.findElement(By.xpath("//button[@type='submit']"));
		clk.click();

	}

}
