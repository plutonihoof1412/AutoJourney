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
	// family tree: //a[text()='Sony Xperia']/parent::h2/following-sibling::div[@class='actions']
	// test: //a[text()='Sony Xperia']/parent::*/following-sibling::div//*[@class='rating']/ancestor::*[@class='product info']/preceding-sibling::*
	// phai lay index neu k co attribute: //div[text()='Java Coding Problems']/ancestor::a/following-sibling::a/div/div[2]
}
