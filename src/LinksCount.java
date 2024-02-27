import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LinksCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharadsi\\OneDrive - Capgemini\\Documents\\ChromeDriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");
        //System.out.println(driver.getTitle());
        System.out.println( driver.findElements(By.tagName("a")).size());
        WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
        System.out.println(footerdriver.findElements(By.tagName("a")).size());
        WebElement subfooter=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(subfooter.findElements(By.tagName("a")).size());
        //subfooter.findElement(By.xpath("//a[text()='Discount Coupons']")).click();
        //Actions a=new Actions(driver);
        //a.moveToElement(subfooter.findElement(By.xpath("//a[text()='Discount Coupons']"))).click().build().perform();
        for(int i=1;i<subfooter.findElements(By.tagName("a")).size();i++)
        {
        	String click=Keys.chord(Keys.CONTROL,Keys.ENTER);
        	subfooter.findElements(By.tagName("a")).get(i).sendKeys(click);
        }
        Set<String> abc=driver.getWindowHandles();
        java.util.Iterator<String> it=abc.iterator();
        while(it.hasNext())
        {
        driver.switchTo().window(it.next());
        System.out.println(driver.getTitle());
	}

}
}
