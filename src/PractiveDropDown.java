import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PractiveDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sharadsi\\\\OneDrive - Capgemini\\\\Documents\\\\ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//driver.manage().window().maximize();
		//WebElement StaticDropdown=Select dropdown=new Select(StaticDropdown);
		//dropdown.selectByVisibleText("Adampur (AIP)");
		//dropdown.getFirstSelectedOption();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
         driver.findElement(By.xpath("//a[@value='AIP']")).click();
         try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         driver.findElement(By.xpath("(//a[@value=\"DEL\"])[2]")).click();
	}

}
