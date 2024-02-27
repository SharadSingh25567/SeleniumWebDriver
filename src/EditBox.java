import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\sharadsi\\\\OneDrive - Capgemini\\\\Documents\\\\ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Sharad");
		driver.findElement(By.name("email")).sendKeys("Sharad@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Sharad@1234");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement option = driver.findElement(By.id("exampleFormControlSelect1"));
		Select options = new Select(option);
		options.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.className("form-control")).sendKeys("10/05/1999");
		driver.findElement(By.xpath("//input[@type=\'submit\']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[class*=alert-dismissible]")).getText());

	}

}
