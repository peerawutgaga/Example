package Driver;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import RegisterSystem.GPAXCalculator;

class StudentDriver {

	@Test
	void testCalGPAX() {
		GPAXCalculator gpaxCalculator = new GPAXCalculator();
		gpaxCalculator.calGPAX("");
	}

}
