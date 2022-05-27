package week2Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;


public class CreateContact {
	
	private static WebElement webElement;

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");		
		driver.findElement(By.id("password")).sendKeys("crmsfa");		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Rama Chandran");
		driver.findElement(By.id("lastNameField")).sendKeys("Krishnan");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Rama");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Chandran");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Automation Testing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("New Employee joined on May 2022");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("karthi444velan@gmail.com");
		
		WebElement eledropdown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select state = new Select(eledropdown);
		state.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();	
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Fresher");	
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//String title = driver.findElement(By.id("sectionHeaderTitle_contacts")).getText();
		//System.out.println(title);
		System.out.println("The title is : "+ driver.getTitle());
		

	}

}