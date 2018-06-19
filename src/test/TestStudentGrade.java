package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pe.StudentGrade;

class TestStudentGrade {
	int[] gradeArray = {10,20,30,40};
	StudentGrade studentGrade = new StudentGrade();
	

	@BeforeEach
	void setUp() throws Exception {
		studentGrade.setGrade(gradeArray);
	}

	@AfterEach
	void tearDown() throws Exception {
		studentGrade.setGrade(null);
	}

	@Test
	void test1() {
		boolean expected = true;
		boolean actual = studentGrade.isInRange();
		assertEquals(expected, actual);
	
	}
	
	@Test
	void test2() {
	    int[] expected = {40,10,25};
	    int[] actual = studentGrade.computeAverage();
	    assertEquals(expected[0],actual[0]);
	    assertEquals(expected[1],actual[1]);
	    assertEquals(expected[2],actual[2]);
		
	}

}
