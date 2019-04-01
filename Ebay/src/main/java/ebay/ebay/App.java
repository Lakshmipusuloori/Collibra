package ebay.ebay;
import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class App{
	
	@Test
	public void runTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lakshmi Pusuloori\\Desktop\\QA Tools\\QA Tools Installation\\chromedriver.exe");
				//WebDriver driver = new EdgeDriver();
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "http://www.ebay.com/";
				driver.get(baseUrl);
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
			
		Select drpCategory = new Select(driver.findElement(By.name("_sacat")));
		drpCategory.selectByVisibleText("Computers/Tablets & Networking");
		
		driver.findElement(By.id("gh-btn")).click();
		
		driver.findElement(By.id("w1-w0-w3-toggle-button")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Hard Drives (HDD, SSD & NAS)')]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'USB 3.0')]/preceding-sibling::input")).click();
		driver.findElement(By.xpath("//*[contains(text(),'1TB')]/preceding-sibling::input")).click();
		
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
		 
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//*[contains(@aria-labelledby,'w8-w0-w1_btn_label')]"));
		action.moveToElement(we).build().perform();
		driver.findElement(By.xpath("//*[contains(text(),'Price + Shipping: lowest first')]")).click();
				driver.close();
				System.out.println("Execution completed successfully, exiting the script!");
			    System.exit(0);
			    		
	}
	
}