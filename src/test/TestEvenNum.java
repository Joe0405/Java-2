package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pe.EvenNumTest;

class TestEvenNum {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test1() {
		boolean expected = true;
		boolean actual = EvenNumTest.isEven(4);
		assertEquals(expected,actual);
	}
	
	@Test
	void test2() {
		boolean expected = false;
		boolean actual = EvenNumTest.isEven(5);
		assertEquals(expected,actual);
	}

}
