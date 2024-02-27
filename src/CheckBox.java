import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sharadsi\\\\OneDrive - Capgemini\\\\Documents\\\\ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		//System.out.println(driver.findElements(By.xpath("//input[@type=\'checkbox\']")).size());
		//driver.findElement(By.linkText("Special Assistance")
		WebElement get=driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		//driver.findElement(with(By.tagName(null)));
		//driver.switchTo().w
		
	}

	

}
