package ClassDiagram.RegisterSystem;

public class Teacher {
	private String teacherID;
	private String password;
	public Teacher(String teacherID, String password)
	{
		this.teacherID = teacherID;
		this.password = password;
	}
	public String getTeacherID() {
		return teacherID;
	}
	public String getPassword() {
		return password;
	}
	
}
