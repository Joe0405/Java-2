package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pe.*;

public class TestCheckPower {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		boolean expected =true;
		boolean actual = CheckPower.checkPower(16);
		assertEquals(expected,actual);
	}
	
	@Test
	public void test2() {
		boolean expected =false;
		boolean actual = CheckPower.checkPower(17);
		assertEquals(expected,actual);
	}


}
