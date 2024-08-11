package testcases;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;




public class SecondTestcase {
	
	    public static void main(String[] args) throws IOException  {
	    	
	    	WebDriver driver = new ChromeDriver();
			
	    	//resolutions specified for taking screenshot
			Dimension[] resolutions = {
		            new Dimension(1920, 1080),
		            new Dimension(1366, 768),
		            new Dimension(1280, 720)
			};

			//Create a folder to save the screenshots
			File screenshotFolder = new File("screenshots");
			if (!screenshotFolder.exists()) {
				screenshotFolder.mkdir();
			}
			
			//Loop through each resolution, Setting the browser size, Taking screenshot of the full page
			for (Dimension resolution : resolutions) {
				driver.manage().window().setSize(resolution);
			
				//Navigate to url
			   driver.get("https://www.getcalley.com/page-sitemap.xml");
			   
			   //Take full-page screenshot using AShot
			   Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
					
			//saving the file With Time and date
			String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
			File screenshotFile  = new File(screenshotFolder, "screenshot_" + timestamp +".png");
			
			try {
				ImageIO.write(screenshot.getImage(),"PNG",screenshotFile);
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
			
			 driver.close();	
	    }
	    
	}


	


