package testcases;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstTestcase {

	public static void main(String[] args)throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		//Launch the Site
		driver.get("https://demo.dealsdray.com/");
		driver.manage().window().maximize();
		
		//Username credential
		WebElement username = driver.findElement(By.xpath("//input[@id='mui-1']"));
		username.click();
		username.sendKeys("prexo.mis@dealsdray.com");
		
		//password credential
		WebElement password = driver.findElement(By.xpath("//input[@id='mui-2']"));
		password.click();
		password.sendKeys("prexo.mis@dealsdray.com");
		Thread.sleep(3000);
		
		//Login to the site 
		WebElement loginbutton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		loginbutton.click();
		
		/*click on the Order dropdown and select "Orders" option.
		 But Since its throwing an error which says the Main site "https://demo.dealsdray.com/"is a secure site,
	     but the page where dashboard is loaded and some of the images/resources are not secure which are chosen from a unsecured site "http://www.w3.org/2000/svg"/".
	     Also the webelements are dynamic in nature which is causing interruption in the execution.
		 */
		
		WebElement order = driver.findElement(By.xpath("//span[normalize-space()='Dashboard']//following::span[@class='sidenavHoverShow css-1s178v5']"));
		//Select orderDropdown = new Select(orderDropdownElement);
	    //orderDropdown.selectByVisibleText("Orders");
		Actions actions = new Actions(driver);
		actions.doubleClick(order).perform();
		Thread.sleep(2000);	
		
		//Click on Orders options 
		WebElement Orders = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root has-submenu compactNavItem open css-46up3a']//following::span[@class='sidenavHoverShow MuiBox-root css-i9zxpg'][normalize-space()='Orders']"));
		Orders.click();
		
		//Click on ADD BULK ORDER button
		WebElement AddBulkOder = driver.findElement(By.xpath("//button[normalize-space()='Add Bulk Orders']"));
		AddBulkOder.click();
		
		//Select the Upload File button and uplaod the Provided XLSX File.
		WebElement UploadFile = driver.findElement(By.xpath("//div[@class='MuiBox-root css-xhd3h8']/..//input[@id='mui-15']"));
		UploadFile.sendKeys("C:\\Users\\HP\\Downloads\\demo-data.xlsx");
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
		
		
		
		

	}

}
