import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharadsi\\OneDrive - Capgemini\\Documents\\ChromeDriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");
        driver.manage().window().maximize();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,550)");
        System.out.println(driver.findElement(By.cssSelector("table.table-display tr:nth-child(3)")).getText());
        //String s=driver.findElement(By.cssSelector("table.table-display tr:nth-child(3)")).getText();
        //s.split(s);
        List<WebElement> value=driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));
        int sum=0;
        for(int i=0;i<value.size();i++)
        {
        //System.out.println(driver.findElement(By.cssSelector(".table-display td:nth-child(3)")).getText());
        	sum=sum+Integer.parseInt(value.get(i).getText());
        	System.out.println(sum);
        	
	}

}
}
