import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class a {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	         //driver.findElement(By.id("id=\"ctl00_mainContent_rbtnl_Trip_1\"")).click();
	        // driver.findElement(By.className("ui-datepicker-trigger")).click();
	         //driver.findElement(By.className("ui-state-default")).click();
	         //driver.findElement(By.xpath("(//input[@name='ctl00$mainContent$btn_FindFlights'])[1]")).click();
	         //driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight']]")).click();
	         //driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_view_date1\"] //following-sibling::button")).click();
	         driver.findElement(By.xpath("(//a[normalize-space()='16'])[1]")).click();
		}
		
		
	

	}


