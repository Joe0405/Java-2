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
		int[] expected = {1,2,6,24};
		int[] actual = Factorial.findIntFactorial(4);
		assertEquals(expected[0], actual[0]);
		assertEquals(expected[1], actual[1]);
		assertEquals(expected[2], actual[2]);
		assertEquals(expected[3], actual[3]);
	}
	
	@Test
	public void test2() {
		long[] expected = {1,2,6,24,120,720,5040,40320,362880,3628800,39916800,479001600,6227020800L};
		long[] actual =Factorial.findLongFactorial(13);
		assertEquals(expected[0], actual[0]);
		assertEquals(expected[1], actual[1]);
		assertEquals(expected[2], actual[2]);
		assertEquals(expected[3], actual[3]);
		assertEquals(expected[4], actual[4]);
		assertEquals(expected[5], actual[5]);
		assertEquals(expected[6], actual[6]);
		assertEquals(expected[7], actual[7]);
		assertEquals(expected[8], actual[8]);
		assertEquals(expected[9], actual[9]);
		assertEquals(expected[10], actual[10]);
		assertEquals(expected[11], actual[11]);
		assertEquals(expected[12], actual[12]);
	}

}
