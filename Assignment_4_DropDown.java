package week2.day2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_4_DropDown 
{
	public static void main(String[] args) throws InterruptedException  
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement course1=driver.findElement(By.id("dropdown1"));
		Select c1=new Select(course1);
		c1.selectByIndex(1);
		WebElement course2=driver.findElement(By.name("dropdown2"));
		Select c2=new Select(course2);
		c2.selectByVisibleText("Selenium");
		WebElement course3=driver.findElement(By.id("dropdown3"));
		Select c3=new Select(course3);
		c3.selectByValue("1");
		WebElement course4=driver.findElement(By.className("dropdown"));
		Select c4=new Select(course4);
		System.out.println("The number of dropdown options are : "+c4.getOptions().size());
		driver.findElement(By.xpath("//div[@id='contentblock']/section/div[5]/select")).sendKeys("Selenium");
		driver.findElement(By.xpath("(//div[@class='example'][6])/select")).sendKeys("Selenium");
		
		Thread.sleep(2000);
		driver.close();
	}
}
