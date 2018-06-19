package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pe.*;

class TestPalindrome {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test1() {
		boolean expected =true;
		boolean actual = Palindrome.paliandrome(Palindrome.reverse(2332),"2332");
		assertEquals(expected,actual);
	}
	
	@Test
	void test2() {
		boolean expected =true;
		boolean actual = Palindrome.paliandrome(Palindrome.reverse("malayalam"), "malayalam");
		assertEquals(expected,actual);
	}

}
