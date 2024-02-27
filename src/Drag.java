import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharadsi\\OneDrive - Capgemini\\Documents\\ChromeDriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[text()='Drag and Drop']")).click();
        Actions a=new Actions(driver);
        WebElement s=driver.findElement(By.xpath("//div[@id=\"column-b\"]"));
        WebElement t=driver.findElement(By.xpath("//div[@id=\"column-a\"]"));
        a.dragAndDrop(s, t).build().perform();

	}

}
