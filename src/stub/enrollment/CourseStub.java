package stub.enrollment;

import enrollment.Course;

public class CourseStub {
    public void Course(String courseID){
        System.out.println(courseID);
    }
    public void Course(String courseID, String courseName){
        System.out.println(courseID);
        System.out.println(courseName);
    }
    public void Course(String courseID, String courseName, int sectionNo){
        System.out.println(courseID);
        System.out.println(courseName);
        System.out.println(sectionNo);
    }
    public void openSection(int sectionNo){
        System.out.println(sectionNo);
    }
}
