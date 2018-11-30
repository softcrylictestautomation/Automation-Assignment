package Project.First;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Homepage.Homepage;
import Homepage.MenPages;
import Homepage.ProductSelenictionPage;

/**
 * Hello world!
 *
 */
public class StartExecution 

{
	public LinkedHashMap<String, String> mapdata=new LinkedHashMap<String, String>();
	
	public static 	WebDriver driver=null;
	
	@Test
    public void addToCart()
    {
    	try {
    	System.setProperty("webdriver.chrome.driver", "./src/Driver/chromedriver.exe");
    	
    	 driver= new ChromeDriver();
    	
    	ReadData readData= new ReadData();
    	
    	driver.manage().window().maximize();
    	
    	String Value=readData.FromProperties("URL");
    	//Navigate to Login page
    	driver.navigate().to(Value);
    	
    	Homepage homepage= new Homepage(driver,readData.FromProperties("URL"));
    	//Go to Home page and choosing the merchandise --> and Choosing Men's menu 
    	homepage.Homepage();
    	
    	String Colour=readData.FromProperties("ProductColour");
    	
    	MenPages MenPage=new MenPages(driver, Colour); 
    	
    	//Choosing the Product type. 
    	MenPage.ProductChoosing();
    	
    	String Size=readData.FromProperties("Size");
    	
    	ProductSelenictionPage productSelect=new ProductSelenictionPage(driver, Size, Colour);
    	//Choosing Specific product Size, Product Color in page
    	productSelect.SelectProductColour();
    	//Add cart to page
    	
    	productSelect.Addcart();
    	
    	}
    	
    	finally
    	{
    		driver.quit();
    	}
    }
}
