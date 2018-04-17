package ClassDiagram.RegisterSystem;
import Stub.*;
import java.util.List;

public class GPAXCalculator {
	public static double calGPAX(String studentID) {
		double gpax = 0;
//		List<Enrollment> enrollments = EnrollmentRepository.searchByStudentID(studentID);
//		for (Enrollment enrollment : enrollments) {
//			gpax += getGradeNumber(enrollment.getGrade());
//		}
//		return (gpax/enrollments.size());
		List<Enrollment> enrollments = EnrollmentRepositoryStub.searchByStudentID(studentID);
		EnrollmentStub e = new EnrollmentStub("5731083221", "2110499", 1);
		for (int i = 0;i<5;i++) {
			gpax += getGradeNumber(e.getGrade());
		}
		return (gpax/enrollments.size());
	}
	
	public static double calGPA(String studentID, int semester, String year)
	{
		double gpax = 0;
		List<Enrollment> enrollments = EnrollmentRepository.searchByIDSemesterAndYear(studentID, semester, year);
		for (Enrollment enrollment : enrollments) {
			gpax += getGradeNumber(enrollment.getGrade());
		}
		return (gpax/enrollments.size());
	}

	private static int getGradeNumber(char gradeLetter) {
		switch (gradeLetter) {
		case 'A':
			return 4;
		case 'B':
			return 3;
		case 'C':
			return 2;
		case 'D':
			return 1;
		case 'F':
			return 0;
		}
		return 0;
	}
	public static void main(String args[]) {
		System.out.println(calGPAX("1234"));
	}
}
