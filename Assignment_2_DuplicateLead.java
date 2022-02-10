package week2.day2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_2_DuplicateLead 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Find Leads")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("thiru110298@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		String name1=driver.findElement(By.id("viewLead_firstName_sp")).getText();
		driver.findElement(By.partialLinkText("Duplicate Lead")).click();
		
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		String name2=driver.findElement(By.id("viewLead_firstName_sp")).getText();
		Thread.sleep(1000);
		if (name1.equalsIgnoreCase(name2)) 
		{
			System.out.println("The Duplicate name is "+name1);
		}
		else
		{
			System.out.println("No Duplicate Name");
		}
		driver.close();
	}
}
