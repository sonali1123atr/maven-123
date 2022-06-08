package dropDrown;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenshot {

	public static void main(String[] args) {


			System.setProperty("webdriver.chrome.driver", "C:\\\\sonali\\\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get("https:/www.facebook.com/reg");

	        TakesScreenshot ts=(TakesScreenshot)driver;
	        //(to capture screenshot we are using getScreenshotAs()method)

	        File f =ts.getscreenshotAS(OutputType.FILE);


	        FileUtils.copyFile(f,new File("C:\\Users\\pradi\\OneDrive\\Desktop.abc.png");

	}



	}

	}


