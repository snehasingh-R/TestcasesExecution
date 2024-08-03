package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FirstTest {
	public static void main(String[] args) throws InterruptedException {
		//Test case1, Open the browser and navigate to the "https://www.fitpeo.com/"
		//System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fitpeo.com/");
		Thread.sleep(2000);
		
		//Test case2, Navigate to Revenue Calculator
		WebElement revenueCalculator = driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div[3]/div[6]/a"));
		revenueCalculator.click();
		Thread.sleep(2000);
		
		WebElement scrollBar = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[2]/div/div/span[1]/span[1]"));
		scrollBar.click();
		Thread.sleep(2000);
		WebElement textBox = driver.findElement(By.xpath("//*[@id=\":r0:\"]"));
		textBox.click();
		
		WebElement checkBox = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]"));
		Thread.sleep(1000);
		
		WebElement c1 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/label"));
		c1.click();
		WebElement c2 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/label/span[1]"));
		c2.click();
		WebElement c3 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[3]/label/span[1]/input"));
		c3.click();
		WebElement c4 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[8]/label/span[1]/input"));
		c4.click();
		WebElement totalGrossRevenue  = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[1]/div/h3"));
		totalGrossRevenue.click();		
		Thread.sleep(2000);
		driver.quit();
	}
}

  
