import java.time.Duration;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IndiGo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\sharadsi\\\\OneDrive - Capgemini\\\\Documents\\\\ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=678802104188&hvpos=&hvnetw=g&hvrand=3407257522535150785&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007825&hvtargid=kwd-10573980&hydadcr=14453_2371562&gad_source=1");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		//w.until(ExpectedConditions.invisibilityOfElementLocated(By.id("salePopupCloseBtn")));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bat");
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id=\\\"nav-search-submit-button\\\"")));
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Get It by Tomorrow')] ")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//span[contains(text(),'DSC Wood David Warner Signature Cricket Mini Bat, (15-Inch)')] ")).click();
		Set<String> a=driver.getWindowHandles();
		java.util.Iterator<String> ab=a.iterator();
		String p=ab.next();
		String c=ab.next();
		driver.switchTo().window(c);
		System.out.println( driver.findElement(By.xpath("//span[contains(text(),'DSC Wood David Warner Signature Cricket Mini Bat, (15-Inch)')] ")).getText());
		driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//span[@id=\"a-autoid-47-announce\"]")).click();
		
		
	}

}
