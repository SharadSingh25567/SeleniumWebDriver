import java.time.Duration;
import java.util.Arrays;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class base {

	public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\sharadsi\\\\OneDrive - Capgemini\\\\Documents\\\\ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();

		String[] itemsNeeded = { "iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry" };

		driver.get("https://rahulshettyacademy.com/angularpractice/shop");

		Thread.sleep(3000);

		addItems(driver, itemsNeeded);

	}

	public static void addItems(WebDriver driver, String[] itemsNeeded)

	{

		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.card-title"));

		for (int i = 0; i < products.size(); i++)

		{

//Brocolli - 1 Kg



			String[] name = products.get(i).getText().split("-");

			String formattedName = name[0].trim();

			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName))

			{

				j++;

				driver.findElements(By.xpath("//button[@class=\"btn btn-info\"]")).get(i).click();

				if (j == itemsNeeded.length)

				{

					break;

				}

			}

		}
		driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();
		driver.findElement(By.cssSelector("button.btn.btn-success")).click();
		// driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		// WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
		// w.until(ExpectedConditions.visibilityOf((WebElement) By.id("country")));
		driver.findElement(By.id(("country"))).sendKeys("Ind");

		// driver.findElement(By.cssSelector("input.btn.btn-success.btn-lg")).click();
	}

}
