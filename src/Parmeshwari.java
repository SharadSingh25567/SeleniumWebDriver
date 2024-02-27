import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Parmeshwari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver",
						"C:\\\\Users\\\\sharadsi\\\\OneDrive - Capgemini\\\\Documents\\\\ChromeDriver.exe");
				

				WebDriver driver = new ChromeDriver();
				driver.get("https://artoftesting.com/samplesiteforselenium");
//				try {
//					Thread.sleep(2000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				driver.findElement(By.cssSelector("a.pp_close")).click();
//				driver.manage().window().maximize();
//				//driver.findElement(By.xpath("//a[text()=' Virtual-Tour ']")).click();
//				System.out.println( driver.findElements(By.tagName("a")).size());
//				Actions a=new Actions(driver);
//				a.moveToElement(driver.findElement(By.xpath("//a[text()='Fee Structure']"))).click().build().perform(); 
				System.out.println (driver.findElements(By.xpath("//input[@type=\"radio\"]")).size());

	}

}
