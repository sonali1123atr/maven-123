package dropDrown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\sonali\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		
	   WebElement wb=driver.findElement(By.id("day"));
	   
	   Thread.sleep(4000);
	   
	   Select sel=new Select(wb);
	   sel.selectByIndex(9);
	   
	   WebElement abc=sel.getFirstSelectedOption();
	   
	  String a= abc.getText();
	  System.out.println(a);
	  
	   
		
		
		
		
		
	}

}
