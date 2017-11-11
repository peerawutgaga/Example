package RegisterSystem;

public class Student {
	private String studentID;
	private String password;
	public Student(String studentID, String password)
	{
		this.studentID = studentID;
		this.password = password;
	}
	public String getStudentID() {
		return studentID;
	}
	public String getPassword() {
		return password;
	}
	
}
