package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Leafapplogin {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//moving to Leads tab
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		//enter the values in fields
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Deepika");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
		
		WebElement sourceElement = driver.findElement(By.id("createLeadForm_dataSourceId"));

		Select dropdown = new Select(sourceElement);
		dropdown.selectByIndex(4);
		
		
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select IndustryOptions = new Select(industry);
		IndustryOptions.selectByValue("IND_HEALTH_CARE");
		
		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownershipOptions = new Select(ownership);
		ownershipOptions.selectByVisibleText("Corporation");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		 driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		 
		 System.out.println("Created leads account successfully");
	}

}
