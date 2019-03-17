package enrollment;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseID;
    private String courseName;
    private String headLecturerID;
    private List<SectionInfo> sectionInfoList = new ArrayList<>();
    public Course(String courseID){
        this.courseID = courseID;
    }
    public Course(String courseID, String courseName){
        this.courseID = courseID;
        this.courseName = courseName;
    }
    public Course(String courseID, String courseName, String lecturerID){
        this.courseID = courseID;
        this.courseName = courseName;
        this.headLecturerID = lecturerID;
        SectionInfo sectionInfo = new SectionInfo();
        sectionInfo.setLecture(lecturerID);
        sectionInfoList.add(sectionInfo);
    }
    public void openSection(int sectionNo){
        SectionInfo sectionInfo = new SectionInfo(sectionNo);
        this.sectionInfoList.add(sectionInfo);
    }
    public void closeSection(int sectionNo){
        for(SectionInfo sectionInfo : sectionInfoList){
            if(sectionInfo.getSectionNo() == sectionNo){
                sectionInfo.setIsOpen(false);
                break;
            }
        }
    }

    public String getCourseID() {
        return courseID;
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
