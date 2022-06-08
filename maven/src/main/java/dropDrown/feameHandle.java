package dropDrown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class feameHandle {

	public static void main(String[] args) throws InterruptedException {
        
		System.setProperty("webdriver.chrome.driver", "C:\\\\sonali\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("htpps://www.selenium.dev/selenium/docs/api/java/index.html");
		
		Thread.sleep(3000);
	
		//switch to child 2nd frame
		driver.switchTo().frame("packagerFrame");
		driver.findElement(By.linkText("AbstractHttpResponseCodec")).click();
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		//switch to Top frame
		
		driver.switchTo().defaultContent();
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		//switch to 3rd child frames 
		
		driver.switchTo().frame(2);
		driver.findElement(By.linkText("com.thoughtworks.selenium.webdriven")).click();
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
		
		
		
	}

}
