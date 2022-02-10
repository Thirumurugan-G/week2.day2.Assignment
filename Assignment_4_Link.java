package week2.day2.Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_4_Link 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Link.html");
		System.out.println("The title of page is : \n"+driver.getTitle());
		System.out.println("\nThe page URL is : \n"+driver.getCurrentUrl());
		driver.findElement(By.xpath("//div[@id='contentblock']/section/div[1]/div/div/a")).click();
		driver.findElement(By.xpath("//div[@id='post-153']/div[2]/div/ul/li[3]/a")).click();
		System.out.println("\nFind where am supposed to go without clicking me? ->\n"+driver.findElement(By.partialLinkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
		driver.findElement(By.xpath("//div[@id='contentblock']/section/div[4]/div/div/a")).click();
		driver.findElement(By.xpath("//div[@id='post-153']/div[2]/div/ul/li[3]/a")).click();
		driver.findElement(By.partialLinkText("How many links are available in this page?")).click();
		List<WebElement>links=driver.findElements(By.xpath("//a"));
		System.out.println("How many links are available in this page? :\n The no.of links is : "+links.size());
		driver.findElement(By.partialLinkText("Verify am I broken?")).click();
		List<WebElement>error=driver.findElements(By.xpath("//a"));
		System.out.println("broken or not checking : "+error.size());
		if(error.size()==0)
		{
			System.out.println("The Page is Broken");
		}
		driver.close();
	}
}
