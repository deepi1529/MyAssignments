package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Account {

	public static void main(String[] args) {
		//Initialize the ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		//loading the URL
		driver.get("http://leaftaps.com/opentaps/");
		//maximize the window
		driver.manage().window().maximize();
		
		//login details
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println("Logged in successfully");
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click on accounts tab
		driver.findElement(By.linkText("Accounts")).click();
		System.out.println("Navigated to Accounts tab");
		//click on create account option
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("Test");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select IndustryOptions = new Select(industry);
		IndustryOptions.selectByValue("IND_SOFTWARE");
		
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select ownershipOptions = new Select(ownership);
		ownershipOptions.selectByVisibleText("S-Corporation");
		
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select sourceOptions = new Select(source);
		sourceOptions.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketingCampaign = driver.findElement(By.id("marketingCampaignId"));
		Select marketingCampaignOptions = new Select(marketingCampaign);
		marketingCampaignOptions.selectByIndex(6);
		
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select stateOptions = new Select(state);
		stateOptions.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		System.out.println("Account created successfully");
		
		WebElement accountName = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]"));

		String name = accountName.getText();

		if(name.contains("Deepika")) {
			System.out.println("Account name is displayed correctly");
		}
		else {
			System.out.println("Account name is not displayed correctly");
		}
		
		driver.quit();
		
	}

}
