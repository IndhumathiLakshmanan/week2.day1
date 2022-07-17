package week2.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class createlead {

	public static void main(String[] args) {


		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Room");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ash");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("john");

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Geroge");

		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Alex");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Test case");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Ash@gmail.com");

		WebElement drop = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));

		Select select = new Select(drop);

		select.selectByVisibleText("New York");

		driver.findElement(By.className("smallSubmit")).click();

		String title = driver.getTitle();

		if(title.equals("View Lead | opentaps CRM"))
		{
			System.out.println("Added successfully");
		}
	}

}

