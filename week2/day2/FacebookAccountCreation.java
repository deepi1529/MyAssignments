package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccountCreation {

	public static void main(String[] args) {
		 
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://en-gb.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			//create new account
			driver.findElement(By.linkText("Create new account")).click();
			//enter details
			driver.findElement(By.name("firstname")).sendKeys("Deepika");
			driver.findElement(By.name("lastname")).sendKeys("P");
			
			driver.findElement(By.name("reg_email__")).sendKeys("deepikap@gmail.com");
			driver.findElement(By.id("password_step_input")).sendKeys("Password@123");
			//select date - dropdown field
			WebElement date = driver.findElement(By.name("birthday_day"));
			Select dates = new Select(date);
			dates.selectByIndex(4);
			//select month - dropdown field
			WebElement month = driver.findElement(By.id("month"));
			Select months = new Select(month);
			months.selectByValue("5");
			//select year - dropdown field
			WebElement year = driver.findElement(By.id("year"));
			Select years = new Select(year);
			years.selectByVisibleText("1995");
			//select radio button
			driver.findElement(By.xpath("//input[@value='1']")).click();
			
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			System.out.println("Entered all details");

	}

}
