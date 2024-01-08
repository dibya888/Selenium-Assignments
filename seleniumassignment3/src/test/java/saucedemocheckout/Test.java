package saucedemocheckout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//Login
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(5000);
		driver.findElement(By.id("login-button")).click();
		
		//Add to Cart Orange T-Shirt and Bike Light (Relative Path)
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
		
		//Checkout (Normal Select)
		Thread.sleep(5000);
		driver.findElement(By.id("checkout")).click();
		
		//Information (Relative Path for Continue)
		driver.findElement(By.id("first-name")).sendKeys("Cristiano");
		driver.findElement(By.id("last-name")).sendKeys("Ronaldo");
		driver.findElement(By.id("postal-code")).sendKeys("4830");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
		
		//Finish (Absolute Path)
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div[9]/button[2]")).click();

	}

}
