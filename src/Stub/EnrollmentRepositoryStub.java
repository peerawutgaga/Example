package Stub;
import java.util.List;

import ClassDiagram.RegisterSystem.*;

public class EnrollmentRepositoryStub {
	public static void grading(Teaching teaching, String studentID, char grade){
		System.out.println(teaching);
		System.out.println(studentID);
		System.out.println(grade);
	}
	public static Enrollment[] searchByStudentID(String studentID){
		System.out.println(studentID);
		return null;
	}
	public static Enrollment[] searchByIDSemesterAndYear(String studentID, int semester, String year){
		System.out.println(studentID);
		System.out.println(semester);
		System.out.println(year);
		return null;
	}
	public static void addEnrollment(Enrollment enrollment){
		System.out.println(enrollment);
	}
	public static void deleteEnrollment(String studentID, String courseID){
		System.out.println(studentID);
		System.out.println(courseID);
	}
	public static boolean editSection(String studentID, String courseID, int newSection){
		System.out.println(studentID);
		System.out.println(courseID);
		System.out.println(newSection);
		return false;
	}
}
