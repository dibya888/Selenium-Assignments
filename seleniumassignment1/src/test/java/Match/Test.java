package Match;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriver Installation
		WebDriverManager.firefoxdriver();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		
		//URL Check
		//First Method
		
		String ExpectedURL = "https://www.saucedemo.com/v1/";
		String ActualURL = driver.getCurrentUrl();
		if(ActualURL.equals(ExpectedURL)){
			System.out.println("URL Matched");
		}
		else
			System.out.println("URL didn't match");
		
		//Second Method
				Assert.assertEquals("Title Match", ActualURL, ExpectedURL);

	}

}
