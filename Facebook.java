package week2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	private static WebElement webElement;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Rama");
		driver.findElement(By.name("lastname")).sendKeys("Chandran");
		driver.findElement(By.name("reg_email__")).sendKeys("karthi444velan@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("karthi444velan@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Rammariya");
		
		WebElement eledropdown = driver.findElement(By.id("day"));
		Select date = new Select(eledropdown);
		date.selectByVisibleText("15");
		WebElement eledropdown1 = driver.findElement(By.id("month"));
		Select month = new Select(eledropdown1);
		month.selectByVisibleText("May");
		WebElement eledropdown2 = driver.findElement(By.id("year"));
		Select year = new Select(eledropdown2);
		year.selectByVisibleText("1995");
		
		driver.findElement(By.className("_58mt")).click();
				


	}

}