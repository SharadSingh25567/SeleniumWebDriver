import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\sharadsi\\\\OneDrive - Capgemini\\\\Documents\\\\ChromeDriver.exe");
		

		WebDriver driver = new ChromeDriver();
		 driver.get("https://the-internet.herokuapp.com/");
		 driver.findElement(By.linkText("Nested Frames")).click();
		// driver.findElement(By.tagName("Frame"))
		//System.out.println( driver.findElement(By.id("content")).getText());
		 driver.switchTo().frame("frame-top");
		 driver.switchTo().frame("frame-middle");
		 System.out.println( driver.findElement(By.id("content")).getText());
		 

	}

}
