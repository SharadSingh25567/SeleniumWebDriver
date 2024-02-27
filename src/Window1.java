import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharadsi\\OneDrive - Capgemini\\Documents\\ChromeDriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        Set<String> first=driver.getWindowHandles();
        java.util.Iterator<String> it=first.iterator();
        String a=it.next();
        String b=it.next();
        driver.switchTo().window(b);
        System.out.println( driver.findElement(By.cssSelector("div.example")).getText());
        driver.switchTo().window(a);
        System.out.println( driver.findElement(By.cssSelector("div.example")).getText());

	}

}
