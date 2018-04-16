package ClassDiagram.RegisterSystem;

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
	public double getGPAX()
	{
		return GPAXCalculator.calGPAX(this.studentID);
	}
	public double getGPA(int semester, String year)
	{
		return GPAXCalculator.calGPA(this.studentID, semester, year);
	}
	
}
