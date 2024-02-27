
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.net.Urls;

public class BrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharadsi\\OneDrive - Capgemini\\Documents\\ChromeDriver.exe");
		  WebDriver driver=new ChromeDriver(options);
	      driver.get("https://sarkarireesult.com/");
	      List<WebElement> links=driver.findElements(By.tagName("a"));
	      for(WebElement link:links)
	      {
	      String url=link.getAttribute("href");
	      try {
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	     
	}

}
}
