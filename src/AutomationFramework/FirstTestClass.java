package AutomationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor; 
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTestClass {
	
	public static void main(String[] args)  {
		//testLogin();
		testLogin1();
	}

	public static void testLogin() {
		 //System.setProperty("webdriver.chrome.driver",path of executable file "Chromedriver.exe")
        System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.get("https://thedemosite.co.uk/login.php/");
        System.out.println("Selenium Webdriver Script in Chrome browser | Software Testing Material");
        driver.close();
	}
	
	public static void testLogin1()  {
		String text;
		//System.setProperty("webdriver.chrome.driver",path of executable file "Chromedriver.exe")
       System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver =  new ChromeDriver();
       driver.get("https://thedemosite.co.uk/login.php");
       sleep(3000);
       driver.findElement(By.linkText("4. Login")).click();
       sleep(2000);
       driver.findElement(By.name("username")).sendKeys("test");
       sleep(2000);
       driver.findElement(By.name("password")).sendKeys("test");
       sleep(2000);
       driver.findElement(By.name("FormsButton2")).click();
       sleep(2000);
       text= driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/blockquote[1]/blockquote/center/big/font/b")).getText();
      System.out.println("Error Message is" +text);
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
