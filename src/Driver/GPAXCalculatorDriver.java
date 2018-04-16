package Driver;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import ClassDiagram.RegisterSystem.GPAXCalculator;
class GPAXCalculatorDriver{
	@Test
	void testCalGPA(){
		double returnValue = GPAXCalculator.calGPA(null, 0, null);
		double expectedValue = 0.0;
		assertEquals(expectedValue,returnValue);
	}
	@Test
	void testCalGPAX(){
		double returnValue = GPAXCalculator.calGPAX(null);
		double expectedValue = 0.0;
		assertEquals(expectedValue,returnValue);
	}
}
