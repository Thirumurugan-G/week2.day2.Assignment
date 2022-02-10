package week2.day2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_4_Button 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Button.html");
		driver.findElement(By.id("home")).click();
		driver.findElement(By.xpath("//img[@alt='Buttons']")).click();
		System.out.println("x position is : "+driver.findElement(By.id("position")).getLocation().getX());
		System.out.println("y position is : "+driver.findElement(By.id("position")).getLocation().getY());
		WebElement bgColor=driver.findElement(By.id("color"));
		String color=bgColor.getCssValue("background-color");
		System.out.println("The background color is : "+color);
		Dimension size=driver.findElement(By.id("size")).getSize();
		System.out.println("size is : "+size);
		driver.close();
	}
}
