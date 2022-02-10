package week2.day2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_1_Facebook
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\AppData\\Local\\Temp\\Eclipse 64 bit\\eclipse\\MavenProject\\src\\main\\resources\\chromeDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Create New Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Thirumurugan");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("G");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");

		driver.findElement(By.id("password_step_input")).sendKeys("123@abc");
		
		WebElement day=driver.findElement(By.id("day"));
		Select dd=new Select(day);
		dd.selectByIndex(11);
		
		WebElement month=driver.findElement(By.id("month"));
		Select mm=new Select(month);
		mm.selectByValue("2");
		
		WebElement year=driver.findElement(By.id("year"));
		Select yy=new Select(year);
		yy.selectByVisibleText("1998");
		
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
	}
}