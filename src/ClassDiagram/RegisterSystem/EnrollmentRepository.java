package ClassDiagram.RegisterSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EnrollmentRepository {
	private static List<Enrollment> enrollments;
	
	public static void grading(Teaching teaching, String studentID, char grade) {
		if(Objects.isNull(enrollments)) {
			enrollments = new ArrayList<Enrollment>();
		}
		for (Enrollment enrollment : enrollments) {
			if (Objects.equals(enrollment.getStudentID(), studentID)
					&& Objects.equals(enrollment.getCourseID(), teaching.getCourseID())
					&& Objects.equals(enrollment.getSection(), teaching.getSection())) {
				enrollment.setGrade(grade);
				return;
			}
		}
	}

	public static List<Enrollment> searchByStudentID(String studentID) {
		if(Objects.isNull(enrollments)) {
			enrollments = new ArrayList<Enrollment>();
		}
		List<Enrollment> result = new ArrayList<Enrollment>();
		for (Enrollment enrollment : enrollments) {
			if (Objects.equals(enrollment.getStudentID(), studentID)) {
				result.add(enrollment);
			}
		}
		return result;
	}

	public static List<Enrollment> searchByIDSemesterAndYear(String studentID, int semester, String year) {
		if(Objects.isNull(enrollments)) {
			enrollments = new ArrayList<Enrollment>();
		}
		List<Enrollment> result = new ArrayList<Enrollment>();
		for (Enrollment enrollment : enrollments) {
			if (Objects.equals(enrollment.getStudentID(), studentID)
					&& Objects.equals(enrollment.getSemester(), semester)
					&& Objects.equals(enrollment.getYear(), year)) {
				result.add(enrollment);
			}
		}
		return result;
	}

	public static void addEnrollment(Enrollment enrollment) {
		if(Objects.isNull(enrollments)) {
			enrollments = new ArrayList<Enrollment>();
		}
		enrollments.add(enrollment);
	}

	public static void deleteEnrollment(String studentID, String courseID) {
		if(Objects.isNull(enrollments)) {
			enrollments = new ArrayList<Enrollment>();
		}
		for (Enrollment enrollment : enrollments) {
			if (Objects.equals(enrollment.getStudentID(), studentID)
					&& Objects.equals(enrollment.getCourseID(), courseID)) {
				enrollments.remove(enrollment);
				return;
			}
		}
	}
	public static void editSection(String studentID, String courseID, int section)
	{
		if(Objects.isNull(enrollments)) {
			enrollments = new ArrayList<Enrollment>();
		}
		for (Enrollment enrollment : enrollments) {
			if (Objects.equals(enrollment.getStudentID(), studentID)
					&& Objects.equals(enrollment.getCourseID(), courseID)) {
				enrollment.setSection(section);
				return;
			}
		}
	}
}
