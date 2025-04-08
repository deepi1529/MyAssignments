package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFacbookLogin {

	public static void main(String[] args) {
	 
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//System.out.println("Launched successfully");
		//enter login details
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com ");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		//click on login button
		driver.findElement(By.name("login")).click();
		//System.out.println("login button clicked");
		//click on link
		driver.findElement(By.linkText("Find your account and log in.")).click();
		//get title of the page
		System.out.println(driver.getTitle());

	}

}
