package RegisterSystem;

public class Enrollment {
	private String studentID;
	private String courseID;
	private int section;
	private int semester;
	private String year;
	private char grade;
	public Enrollment(String studentID, String courseID, int section)
	{
		this.studentID = studentID;
		this.courseID = courseID;
		this.section = section;
	}
	public int getSection() {
		return section;
	}
	public void setSection(int section) {
		this.section = section;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public String getStudentID() {
		return studentID;
	}
	public String getCourseID() {
		return courseID;
	}
	public int getSemester() {
		return semester;
	}
	public String getYear() {
		return year;
	}
	
}
