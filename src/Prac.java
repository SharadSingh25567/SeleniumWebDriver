import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharadsi\\OneDrive - Capgemini\\Documents\\ChromeDriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");
        driver.findElement(By.id("checkBoxOption2")).click();
        String a=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
        WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
        Select s=new Select(dropdown);
        s.selectByVisibleText(a);
        driver.findElement(By.id("name")).sendKeys(a);
        driver.findElement(By.id("alertbtn")).click();
         File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       String text= driver.switchTo().alert().getText();
       if(text.contains(a))
       {
    	   driver.switchTo().alert().accept();
       }
       else 
       {
    	   driver.switchTo().alert().dismiss();
       }
	}

}
