package AutomationFramework;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	public void toFillTheAlertForm()
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
		sleep(1000);
		
		
		
		
		
		
		
	}
	@Test
	public void toFillTheRegistrationForm()
	{
//Uncomment these 5 lines whenever we want to run the test cases separately//		driver.findElement(By.linkText("Alert")).click();
//		sleep(2000);
//		ArrayList<String> arr1 = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(arr1.get(1));
//		sleep(1000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/form/div[2]/div/p[1]/a")).click();
		sleep(2000);
		driver.findElement(By.xpath("//img[@alt='registration']")).click();
		sleep(1000);
		ArrayList<String> arr2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(arr2.get(2));
		sleep(1000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.name("name")).sendKeys("Kamal");
		sleep(1000);
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/form/fieldset[1]/p[2]/input")).sendKeys("Pahan");
		sleep(1000);
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/form/fieldset[2]/div/label[2]/input")).click();
		sleep(1000);
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/form/fieldset[3]/div/label[2]/input")).click();
		sleep(1000);
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/form/fieldset[3]/div/label[3]/input")).click();
		sleep(1000);
		WebElement country = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/form/fieldset[4]/select"));
		Select dropdown1 = new Select(country);
		dropdown1.selectByVisibleText("India");
		sleep(1000);
		Select dropdown2= new Select(driver.findElement(By.xpath("/html/body/section/div[1]/div/div/form/fieldset[5]/div[1]/select")));
		dropdown2.selectByVisibleText("1");
		sleep(1000);
		Select dropdown3= new Select(driver.findElement(By.xpath("/html/body/section/div[1]/div/div/form/fieldset[5]/div[2]/select")));
		dropdown3.selectByVisibleText("1");
		sleep(1000);
		Select dropdown4= new Select(driver.findElement(By.xpath("/html/body/section/div[1]/div/div/form/fieldset[5]/div[3]/select")));
		dropdown4.selectByVisibleText("2014");
		sleep(1000);
		WebElement upload=driver.findElement(By.xpath("/html/body/section/div[1]/div/div/form/fieldset[9]/input"));
		upload.sendKeys("C:\\Users\\shib1\\Documents\\Selenium\\Anusha\\TODO.txt");
		sleep(1000);
		System.out.println("File is uploaded successfully");
		driver.findElement(By.name("phone")).sendKeys("12345678");
		sleep(1000);
		driver.findElement(By.name("username")).sendKeys("test");
		sleep(1000);
		driver.findElement(By.name("email")).sendKeys("kamal@gmail.com");
		sleep(1000);
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/form/fieldset[10]/textarea")).sendKeys("abcd");
		sleep(1000);
		driver.findElement(By.name("password")).sendKeys("test");
		sleep(1000);
		driver.findElement(By.name("c_password")).sendKeys("test");
		sleep(1000);
		driver.findElement(By.xpath("//*[@value='submit']")).click();
		sleep(1000);
		
	}
 @AfterClass
 public void afterClass()
 {
	 //driver.quit();
 }
 
 public  void sleep(long ms) 
 {
	 try {
		Thread.sleep(ms);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
 }
}
