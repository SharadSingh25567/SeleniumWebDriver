import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sarkari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharadsi\\OneDrive - Capgemini\\Documents\\ChromeDriver.exe");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://sarkarireesult.com/");
        System.out.println( driver.findElements(By.tagName("a")).size());
        WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5000));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.id("perfecty-push-dialog-subscribe")));
        driver.findElement(By.id("perfecty-push-dialog-subscribe")).click();
       // driver.findElements(null)
        WebElement sub=driver.findElement(By.xpath("//td[@align=\"right\"]"));
        System.out.println(sub.findElements(By.tagName("a")).size());
	}
}
