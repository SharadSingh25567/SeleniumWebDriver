import java.time.Duration;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\sharadsi\\\\OneDrive - Capgemini\\\\Documents\\\\ChromeDriver.exe");
		

		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.findElement(By.cssSelector("a[target=\"_blank\"]")).click();
        Set<String> ab=driver.getWindowHandles();
        java.util.Iterator<String> it=ab.iterator();
       String i=it.next();
       String c=it.next(); 
       driver.switchTo().window(c);
        driver.findElement(By.xpath("//div[@class='nav-outer clearfix']//a[normalize-space()='Home']")).click();
        
        
       
       

	}

}
