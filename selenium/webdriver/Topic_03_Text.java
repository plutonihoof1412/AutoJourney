package webdriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_03_Text {
	
	@BeforeClass
	public static void main(String[] args) {
		// khi nao dung text()=, contains(), string(), starts-with()
				// contains() co 3 loai:
					// contains(text(),'Example') => khong lay trong child node duoc, chi lay index dau (/t/n or tab d-c) if nested
					// contains(.,'Example') => lay het, khong tru ngoai le nao => hạn chế dùng vì phạm vi quét quá 
					// contains(string(),'Example') = contains(.,'Example')
			
			// concat() hàm nối chuỗi
			String firstName = "Michael";
			String lastName = "Jackson";
			System.out.println(firstName.concat(" ").concat(lastName));
	}

	@Test
	public void TC_01_() {
		
	}

	@Test
	public void TC_02_() {
		
	}

	@Test
	public void TC_03_() {
		
	}

	@AfterClass
	public void afterClass() {
		
	}
}
