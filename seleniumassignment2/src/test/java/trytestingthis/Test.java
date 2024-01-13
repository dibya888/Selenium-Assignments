package trytestingthis;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		
		//Name
		WebElement firstname = driver.findElement(By.id("fname"));
		firstname.sendKeys("Dibya Jyoti");
		WebElement lastname = driver.findElement(By.id("lname"));
		lastname.sendKeys("Dhar");
		
		//Radio Button
		WebElement radioButton = driver.findElement(By.id("male"));
		radioButton.click();
		
		//Drop down
		WebElement testdropdown = driver.findElement(By.id("option"));
		Select dropdown = new Select(testdropdown);
				
		dropdown.selectByVisibleText("Option 2");
		
		//Scroll
		WebElement testscroll = driver.findElement(By.id("owc"));
		Select scroll = new Select(testscroll);
		
		scroll.selectByVisibleText("Option 3");	
		
		//Checklist
		WebElement checklist1 = driver.findElement(By.name("option1"));
		checklist1.click();
		WebElement checklist2 = driver.findElement(By.name("option2"));
		checklist2.click();
		WebElement checklist3 = driver.findElement(By.name("option3"));
		checklist3.click();
		
		//Upload File
		WebElement upload = driver.findElement(By.xpath("//input[@id='myfile']"));
		upload.sendKeys("C:\\Users\\Dibya\\Downloads\\1703857179690.png");
		
		//Long Message
		WebElement longmsg = driver.findElement(By.name("message"));
		longmsg.clear();
		longmsg.sendKeys("Hello, I'm Dibya. I want to build my career on Software Quality Assurance.");
		
		//Submit
		WebElement submit = driver.findElement(By.className("btn-success"));
		Thread.sleep(10000);
		submit.click();
		
		//Closing Browser
		Thread.sleep(5000);
		driver.quit();
	}

}
