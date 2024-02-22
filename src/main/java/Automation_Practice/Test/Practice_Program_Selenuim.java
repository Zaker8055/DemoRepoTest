package Automation_Practice.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice_Program_Selenuim {
	
	
	@Test
	public void Sample() throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    
    Thread.sleep(6000);
    
    driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
    driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("admin123");
    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    
    driver.findElement(By.xpath("//a[contains(@class,\"oxd-main-menu-item active\")]")).click();
    
    Thread.sleep(6000);

    
   // Alert alert=driver.switchTo().alert();
   // alert.accept();
    
   //driver.quit();
    
    
    
}
}