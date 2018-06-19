package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pe.Factorial;

public class TestFactorial {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		int expected = 2 ;
		int actual = Factorial.findIntFactorial(2);
		assertEquals(expected, actual);
	}
	
	@Test
	public void test2() {
		long expected = 2432902008176640000L;
		long actual =Factorial.findLongFactorial(20);
		assertEquals(expected, actual);
	}

}
