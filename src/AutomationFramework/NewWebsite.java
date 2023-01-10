package AutomationFramework;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewWebsite {
	
	WebDriver driver ;
	
	@BeforeClass
	public void beforeClass()
	{
		driver=new ChromeDriver();
		driver.navigate().to("https://www.way2automation.com/demo.html");
		sleep(2000);
		driver.manage().window().maximize();
		
	}
	@Test
	public void toFillTheForm()
	{
		driver.findElement(By.linkText("Alert")).click();
		sleep(2000);
		ArrayList<String> tabs= new ArrayList<String>(driver.getWindowHandles());
		int tabss = tabs.size();
		System.out.println("Number of tabs:"+tabss);
		driver.switchTo().window(tabs.get(1));
		sleep(2000);
		driver.findElement(By.name("name")).sendKeys("Pradeep");
		sleep(1000);
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("1234");
		sleep(1000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pradeep@google.com");
		sleep(1000);
		Select select= new Select(driver.findElement(By.xpath("//*[@name='country']")));
		select.selectByVisibleText("Cuba");
		sleep(1000);
		driver.findElement(By.xpath("//*[@name='city']")).sendKeys("Cubaa");
		sleep(1000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/form/fieldset[6]/input")).sendKeys("test");
		sleep(1000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/form/fieldset[7]/input")).sendKeys("test");
		sleep(1000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/form/div[1]/div[2]/input")).submit();
		sleep(1000);
		String expected ="This is just a dummy form, you just clicked SUBMIT BUTTON";
		String actual=driver.findElement(By.xpath("//p[@id='alert']")).getText();
		assertEquals(actual, expected);
		System.out.print("Message is matching");
		
		
		
		
		
		
		
		
	}
 @AfterClass
 public void afterClass()
 {
	 //driver.close();
 }
 
 public static void sleep(long ms) 
 {
	 try {
		Thread.sleep(ms);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
 }
}
