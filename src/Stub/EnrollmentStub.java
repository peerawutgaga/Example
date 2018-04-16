package Stub;

class EnrollmentStub {
	public EnrollmentStub(String studentID, String courseID, int section){
		System.out.println(studentID);
		System.out.println(courseID);
		System.out.println(section);
	}
	public String getStudentID(){
		return null;
	}
	public String getCourseID(){
		return null;
	}
	public int getSection(){
		return 0;
	}
	public void setSection(int section){
		System.out.println(section);
	}
	public int getSemester(){
		return 0;
	}
	public String getYear(){
		return null;
	}
	public char getGrade(){
		return '\u0000';
	}
	public void setGrade(char grade){
		System.out.println(grade);
	}
}
