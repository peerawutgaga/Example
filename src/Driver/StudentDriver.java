package Driver;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import RegisterSystem.Student;

class StudentDriver {

	@Test
	void testGetGPAX() {
		Student student = new Student("","");
		assertEquals(0, student.getGPAX());
	}

}
