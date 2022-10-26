package webdriver;

import org.testng.annotations.BeforeClass;

public class Topic_04_And_Or {
	
	@BeforeClass
	public static void main(String[] args) {
		boolean statusA;
		boolean statusB;
		//And - &&
		statusA = true;
		statusB = false;
		System.out.println("Kết quả = " + (statusA && statusB));
		
		statusA = false;
		statusB = true;
		System.out.println("Kết quả = " + (statusA && statusB));
		
		statusA = false;
		statusB = false;
		System.out.println("Kết quả = " + (statusA && statusB));
		
		statusA = true;
		statusB = true;
		System.out.println("Kết quả = " + (statusA && statusB));
		
		// Or - ||
		statusA = true;
		statusB = false;
		System.out.println("Kết quả = " + (statusA || statusB));
		
		statusA = false;
		statusB = true;
		System.out.println("Kết quả = " + (statusA || statusB));
		
		statusA = false;
		statusB = false;
		System.out.println("Kết quả = " + (statusA || statusB));
		
		statusA = true;
		statusB = true;
		System.out.println("Kết quả = " + (statusA || statusB));
	}
	
}
