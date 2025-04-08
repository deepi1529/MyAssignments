package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lead {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println("Logged in successfully");
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//moving to Leads tab
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		//enter the values in fields
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Deepika");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
		String titleName = "Tester";
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys(titleName);
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		System.out.println("Lead created successfully");
		String title = driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();
		System.out.println(title);
		
		/*WebElement elementTitle = driver.findElement(By.id("viewLead_generalProfTitle_sp"));
		String t = elementTitle.getText();
		System.out.println(t);
		*/
		
		if(titleName.equals(title)) {
			System.out.println("Title is displayed correctly.");
		}
		else {
			System.out.println("Title is not displayed correctly.");
		}
		/*
		if(titleName==title) {
			System.out.println("Title is displayed correctly.");
		}
		else {
			System.out.println("Title is not displayed correctly.");
		}*/
		
		driver.close();

	}

}
