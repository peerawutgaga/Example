package RegisterSystem;

public class Teaching {
	private String teacherID;
	private String courseID;
	private int section;
	private String dateAndTime;
	private int semester;
	private String year;
	public Teaching(String teacherID, String courseID, int section)
	{
		this.teacherID = teacherID;
		this.courseID = courseID;
		this.section = section;
	}
	public int getSection() {
		return section;
	}
	public void setSection(int section) {
		this.section = section;
	}
	public String getDateAndTime() {
		return dateAndTime;
	}
	public void setDateAndTime(String dateAndTime) {
		this.dateAndTime = dateAndTime;
	}
	public String getTeacherID() {
		return teacherID;
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
