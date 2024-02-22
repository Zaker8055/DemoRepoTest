package Automation_Practice.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderExample {


@Test (dataProvider="Data2",dataProviderClass= DataproviderClass.class)
public void login(String s,String s2) {
	
	
System.out.println(s + s2);
	
}

}
