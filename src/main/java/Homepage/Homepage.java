package Homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Project.First.StartExecution;

public class Homepage {
	
	WebDriver driver=null;
	
	String URL=null;

	public Homepage(WebDriver driver,String URL)
	{
		this.driver=driver;
		this.URL=URL;
	}
	
	public void Homepage()
	{
			
		WebElement element=driver.findElement(By.xpath("(//span[text()='Merchandise']/..)[2]"));
		
		Actions action= new Actions(driver);
		
		action.moveToElement(element).click(driver.findElement(By.xpath("(//ul[@class='dropdown-menu dropdown-with-icons']//a)[3]"))).build().perform();
		
		
	}
	
}
