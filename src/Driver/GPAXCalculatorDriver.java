package Driver;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ClassDiagram.RegisterSystem.*;
public class GPAXCalculatorDriver{
	@Before
	public void setUp() {
		Enrollment e1 = new Enrollment("5731083221", "2110332", 33);
		Enrollment e2 = new Enrollment("5731083221", "2110423", 1);
		Enrollment e3 = new Enrollment("5731083221", "2110499", 1);
		EnrollmentRepository.addEnrollment(e1);
		EnrollmentRepository.addEnrollment(e2);
		EnrollmentRepository.addEnrollment(e3);
	}
	@Test
	public void testCalGPA(){
		double returnValue = GPAXCalculator.calGPA("5731083221", 1, "2018");
		double expectedValue = 0.0;
		assertEquals(expectedValue,returnValue, 4.0);
	}
	@Test
	public void testCalGPAX(){
		double returnValue = GPAXCalculator.calGPAX("5731083221");
		double expectedValue = 0.0;
		assertEquals(expectedValue, returnValue, 4.0);
	}
}
