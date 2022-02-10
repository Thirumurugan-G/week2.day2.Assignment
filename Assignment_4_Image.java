
package week2.day2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_4_Image 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Image.html");
		driver.findElement(By.xpath("//div[@id='contentblock']/section/div/div/div/img")).click();
		driver.findElement(By.xpath("//img[@alt='Images']")).click();
		driver.findElement(By.xpath("//div[@id='contentblock']/section/div[3]/div/div/img")).click();
		driver.findElement(By.xpath("//img[@alt='Images']")).click();
		driver.close();
	}
}
