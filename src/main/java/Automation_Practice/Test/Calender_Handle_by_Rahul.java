package Automation_Practice.Test;
	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
    import io.github.bonigarcia.wdm.WebDriverManager;

	public class Calender_Handle_by_Rahul {
		
	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.path2usa.com/travel-companions");
	//April 23
	
	//driver.findElementByXPath(".//*[@id='travel_date']").click();
	driver.findElement(By.xpath(".//*[@id='travel_date']")).click();


	while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
	{
	driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
	}

	List<WebElement> dates= driver.findElements(By.className("day"));
	//Grab common attribute//Put into list and iterate
	int count=driver.findElements(By.className("day")).size();

	for(int i=0;i<count;i++)
	{
	String text=driver.findElements(By.className("day")).get(i).getText();
	if(text.equalsIgnoreCase("21"))
	{
	driver.findElements(By.className("day")).get(i).click();
	break;
	}

	}
	}

	}
