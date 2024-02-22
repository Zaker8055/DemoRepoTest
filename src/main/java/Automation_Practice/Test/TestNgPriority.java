package Automation_Practice.Test;

import org.testng.annotations.Test;

public class TestNgPriority {
	
	@Test (priority=-2)
	public static void m1() {
		
		System.out.println("m1");
	}
	
	@Test (priority=-7)
public static void m2() {
		
		System.out.println("m2");
	}
	
	@Test (priority=0)
public static void m3() {
	
	System.out.println("m3");
}


}
