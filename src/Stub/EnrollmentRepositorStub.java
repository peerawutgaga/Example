package Stub;

import java.util.List;

import RegisterSystem.Enrollment;

public class EnrollmentRepositorStub {
	public static List<Enrollment> searchByStudentID(String studentID)
	{
		System.out.println(studentID);
		return null;
	}
}
