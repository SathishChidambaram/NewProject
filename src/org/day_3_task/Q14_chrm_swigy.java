package org.day_3_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q14_chrm_swigy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\NewProject(109 Ver)\\drive\\chromedriver.exe");

		WebDriver sg =new ChromeDriver();
		
		sg.get("https://www.swiggy.com/");
		
		WebElement sign = sg.findElement(By.xpath("//a[@class='r2iyh']"));
		sign.click();
		
		WebElement num = sg.findElement(By.xpath("(//input[@class='_381fS'])[1]"));
		num.sendKeys("9894586508");
		
		WebElement name = sg.findElement(By.xpath("(//input[@class='_381fS'])[2]"));
		name.sendKeys("Sathish");
		
		WebElement email = sg.findElement(By.xpath("(//input[@class='_381fS'])[3]"));
		email.sendKeys("sathish7@gmail.com");
		
		WebElement con = sg.findElement(By.xpath("//a[@class='a-ayg']"));
		con.click();
	}

}
