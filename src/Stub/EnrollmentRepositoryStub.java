package Stub;
import ClassDiagram.RegisterSystem.*;

class EnrollmentRepositoryStub {
	public void grading(Teaching teaching, String studentID, char grade){
		System.out.println(teaching);
		System.out.println(studentID);
		System.out.println(grade);
	}
	public Enrollment searchByStudentID(String studentID){
		System.out.println(studentID);
		return null;
	}
	public Enrollment searchByIDSemesterAndYear(String studentID, int semester, String year){
		System.out.println(studentID);
		System.out.println(semester);
		System.out.println(year);
		return null;
	}
	public void addEnrollment(Enrollment enrollment){
		System.out.println(enrollment);
	}
	public void deleteEnrollment(String studentID, String courseID){
		System.out.println(studentID);
		System.out.println(courseID);
	}
	public boolean editSection(String studentID, String courseID, int newSection){
		System.out.println(studentID);
		System.out.println(courseID);
		System.out.println(newSection);
		return false;
	}
}
