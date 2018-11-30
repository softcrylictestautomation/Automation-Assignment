package Homepage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Project.First.ReadData;

public class MenPages {

	WebDriver driver=null;
	String ProductColour="";
	
	public MenPages(WebDriver driver,String ProductColour)
	{
		this.driver=driver;
		this.ProductColour=ProductColour;
	}
	
		 
	public void ProductChoosing()
	{
		List<WebElement> ElemetList=driver.findElements(By.cssSelector("div.js-image.image.card-image"));
		
		System.out.println("Total product in Men page is:-"+ElemetList.size());
		
		
		/*driver.findElement(By.xpath("//a[@class='collapsed collapsed'][@aria-controls='collapse0']")).click();
		
		driver.findElement(By.xpath("//input[@id='color-"+ProductColour+"']")).click();
		*/
		
		driver.findElement(By.cssSelector("div.js-image.image.card-image")).click();
		
				
	}
}
