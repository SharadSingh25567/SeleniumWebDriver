import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sauce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharadsi\\OneDrive - Capgemini\\Documents\\ChromeDriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hdfcbank.com/personal/ways-to-bank/eva#");
		/*
		 * driver.findElement(By.id("user-name")).sendKeys("Admin");
		 * driver.findElement(By.id("password")).sendKeys("Sharad@123");
		 * driver.findElement(By.id("login-button")).click(); System.out.println
		 * (driver.findElement(By.xpath("//div/h3")).getText());
		 * driver.findElement(By.tagName("path")).click();
		 */
       System.out.println( driver.findElements(By.tagName("a")).size());
;        
	}
}
