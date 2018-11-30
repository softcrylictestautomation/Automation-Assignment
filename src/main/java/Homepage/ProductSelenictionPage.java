package Homepage;

import org.apache.commons.collections4.KeyValue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Project.First.StartExecution;

public class ProductSelenictionPage {
	WebDriver driver=null;
	String Size=null;
	String productColour=null;

	StartExecution st= new StartExecution();
	
	public ProductSelenictionPage(WebDriver driver,String Size,String productColour)
	{
		this.driver=driver;
		
		this.Size=Size;
		
		this.productColour=productColour;
	}
	
	public void SelectProductColour()
	{
		
		String productname=driver.findElement(By.xpath("//div[@class='col-sm-5']/h3")).getText();
		
		String ProductPrice=driver.findElement(By.xpath("//div[@class='col-sm-5']//div[@id='price']//span")).getText();
		
		System.out.println("ProductName :- "+productname+"\n Product Price :-"+ProductPrice);
		
		st.mapdata.put("productname", productname);
		st.mapdata.put("productPrice", ProductPrice);
		
		driver.findElement(By.xpath("//div[@class='color-inner "+productColour+"']/..")).click();
		
		WebElement element= driver.findElement(By.xpath("//select[@class='selectpicker mobile-device']"));
		
		Select select= new Select(element);
				
		select.getFirstSelectedOption();
		
	}
	
	public void Addcart()
	{
		driver.findElement(By.xpath("//button[@class='btn btn-primary js-addToCart']")).click();
		
		System.out.println("Product is Added cart");
		
		String Count=driver.findElement(By.xpath("//span[@class='cart-count-badge js-cartItemsCount']")).getText();
		
		for(String valu: st.mapdata.keySet())
		{
			if(driver.findElement(By.xpath("//div[@class='mini-cart-item-name']//span")).getText().equals(st.mapdata.get(valu)))
			{
			
				System.out.println("ProductName is Equal");
			}
			if(driver.findElement(By.xpath("//div[@class='mini-cart-item-name']//span")).getText().equals(st.mapdata.get(valu)))
			{
				System.out.println("ProductPrice is Equal");
			}
		}
		
		
		
	}
}
