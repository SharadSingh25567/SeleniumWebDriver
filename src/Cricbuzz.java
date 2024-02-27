import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\sharadsi\\\\OneDrive - Capgemini\\\\Documents\\\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.get("https://www.cricbuzz.com/");
		driver.findElement(By.xpath("//a[text()='AUS vs WI - Live']")).click();
		//driver.findElement(By.className("cb-nav-tab ")).click();
		driver.findElement(By.xpath("//a[@title='Australia vs West Indies, 1st T20I Scorecard']")).click();
		driver.navigate().refresh();
		

	}

}
