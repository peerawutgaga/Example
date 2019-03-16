package enrollment;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseID;
    private String courseName;
    private String headLecturerID;
    private List<SectionInfo> sectionInfos = new ArrayList<>();
    public Course(String courseID){
        this.courseID = courseID;
    }
    public Course(String courseID, String courseName){
        this.courseID = courseID;
        this.courseName = courseName;
    }
    public Course(String courseID, String courseName, String headLecturerID){
        this.courseID = courseID;
        this.courseName = courseName;
        this.headLecturerID = headLecturerID;
        SectionInfo sectionInfo = new SectionInfo();
    }
    public void openSection(int sectionNo){
      //  this.sectionInfos.se
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
