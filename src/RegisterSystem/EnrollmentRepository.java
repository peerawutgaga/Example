package RegisterSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EnrollmentRepository {
	private List<Enrollment> enrollments;

	public void grading(Teaching teaching, String studentID, char grade) {
		for (Enrollment enrollment : enrollments) {
			if (Objects.equals(enrollment.getStudentID(), studentID)
					&& Objects.equals(enrollment.getCourseID(), teaching.getCourseID())
					&& Objects.equals(enrollment.getSection(), teaching.getSection())) {
				enrollment.setGrade(grade);
				return;
			}
		}
	}

	public List<Enrollment> searchByStudentID(String studentID) {
		List<Enrollment> result = new ArrayList<Enrollment>();
		for (Enrollment enrollment : enrollments) {
			if (Objects.equals(enrollment.getStudentID(), studentID)) {
				result.add(enrollment);
			}
		}
		return result;
	}

	public List<Enrollment> searchByIDSemesterAndYear(String studentID, int semester, String year) {
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
}
