package test;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testcalculator {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void x() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		// fail("Not yet implemented");
		int a  =1234;
		int b = 8765;
		calculator cal = new calculator();
		
		//act
		int actual = cal.add(a, b);
		
		//assert
		int expected = 9999;
		assertEquals(expected,actual);
		
		
	}

}
