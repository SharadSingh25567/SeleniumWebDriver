import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharadsi\\OneDrive - Capgemini\\Documents\\ChromeDriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("Sharad");
        driver.findElement(By.name("inputPassword")).sendKeys("Sharad123");
        driver.findElement(By.className("signInBtn")).click();
        System.out.println (driver.findElement(By.cssSelector("p.error")).getText());
        //driver.close();
        //driver.findElement(By.className("navbar-toggle")).click();
        driver.findElement(By.linkText("Forgot your password?")).click();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Sharad");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Sharad@Gmail.com");
        driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("7668157751");
        driver.findElement(By.className("go-to-login-btn")).click();
        driver.findElement(By.className("reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.xpath("//form/p")).getText());
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");

        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

        driver.findElement(By.xpath("//input[@value='rmbrUsername']")).click();
        driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
        driver.findElement(By.className("signInBtn")).click();
        try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println( driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
	}
}
