package AutomationFramework;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class NewTest {
  //@Test
	/*
	 * public void f() { String text;
	 * //System.setProperty("webdriver.chrome.driver",path of executable file
	 * "Chromedriver.exe") System.setProperty("webdriver.chrome.driver",
	 * "C:\\Software\\chromedriver_win32\\chromedriver.exe"); WebDriver driver = new
	 * ChromeDriver(); driver.get("https://thedemosite.co.uk/login.php");
	 * sleep(3000); driver.findElement(By.linkText("4. Login")).click();
	 * sleep(2000); driver.findElement(By.name("username")).sendKeys("test");
	 * sleep(2000); driver.findElement(By.name("password")).sendKeys("test");
	 * sleep(2000); driver.findElement(By.name("FormsButton2")).click();
	 * sleep(2000); text= driver.findElement(By.xpath(
	 * "/html/body/table/tbody/tr/td[1]/blockquote[1]/blockquote/center/big/font/b")
	 * ).getText(); System.out.println("Error Message is" +text); driver.close();
	 * assertEquals( text,"**No login attemptd**" );
	 * 
	 * }
	 */
	WebDriver driver;
  @Test(priority=1)
  public void toVerifyTitle()
  {
	  
	  String actualTitle= driver.findElement(By.xpath("//h3[@class=\"post-title entry-title\"]")).getText();
	  String expectedTitle = "Demo Sign-Up Selenium Automation Practice Form";
	  assertEquals(actualTitle,expectedTitle);
	  sleep(2000);
	  System.out.println("Title is matching");
	  
  }
  @Test(priority = 2)
  public void sendTextboxValue()
  {
	  
      driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Shivaraj");
      sleep(3000);
      driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Muddu");
      sleep(2000);
      
  }
  @Test(priority = 3)
  
  public void sendRadioButtonValue() 
  {
      driver.findElement(By.xpath("//*[@value='Male']")).click();
      sleep(2000);
      driver.findElement(By.xpath("//*[@value=4]")).click();
      sleep(2000);
  }
  
  @Test(priority = 4)
  public void sendDateValue()
  {
      driver.findElement(By.xpath("//*[@id='datepicker']")).sendKeys("12/06/2020");
      sleep(2000);
  }
  @Test(priority = 5)
  public void sendCheckBoxValue()
  {
      driver.findElement(By.xpath("//*[@value='Manual Tester']")).click();
      sleep(2000);
   driver.findElement(By.xpath("//*[@value='Selenium Webdriver']")).click();
     sleep(2000);
      driver.findElement(By.xpath("//*[@id='tool-0']")).click();
      sleep(2000);
  }
  
  @Test(priority = 6)
  
  public void sendDropDownValue()
  {
  
      WebElement dropDown1=driver.findElement(By.id("continents"));
      Select dropDownValue1= new Select(dropDown1);
      sleep(2000);
      dropDownValue1.selectByVisibleText("Australia");
      String txt=driver.findElement(By.id("continents")).getText();
      System.out.println("Drop down value selected" +txt);
      sleep(1000);
      WebElement dropDown2=driver.findElement(By.id("selenium_commands"));
      Select dropDownValue2= new Select(dropDown2);
      sleep(2000);
      dropDownValue2.selectByVisibleText("Navigation Commands");
      
  }
      
      
  
  
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	  
	  driver =  new ChromeDriver();
      driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
      sleep(3000);
      driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
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
