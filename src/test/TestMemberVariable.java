package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pe.Member;
import pe.MemberVariable;

public class TestMemberVariable {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		String[] expected = {"Harry Potter", "30", "2500.3"};
		String[] actual = MemberVariable.memberVariable();
		assertEquals(expected, actual);
		}
		
	}
