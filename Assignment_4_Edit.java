package week2.day2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_4_Edit
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("thiru110298@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("hi hello welcome");
		WebElement value=driver.findElement(By.name("username"));
		System.out.println("The Defualt text is " +value.getAttribute("value"));
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		boolean confirmDisabled=driver.findElement(By.xpath("(//input[@type='text'])[5]")).isEnabled();
		if(confirmDisabled==true)
		{
			System.out.println("The edit field is Disabled");
		}
		else
		{
			System.out.println("The field is Enabled");
		}
		driver.close();
	}
}
