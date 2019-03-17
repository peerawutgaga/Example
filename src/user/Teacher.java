package user;

import enrollment.Course;
import repository.CourseRepo;

public class Teacher extends User {
    public void openCourse(String courseID, String courseName,String teacherID){
        Course course = new Course(courseID,courseName,teacherID);
        CourseRepo courseRepo = CourseRepo.getInstance();
        courseRepo.insert(course);
    }
    public void closeCourse(String courseID, int section){
        Course course = new Course(courseID);
    }
    public void grading(String courseID, String studentID, char gradeLetter){
        //Grading
    }
    public void setScore(String courseID, String studentID, String item, double score){
        //Set score to course
    }
    public void addGradingItem(String courseID, String item, double fullScore, double weight){
        //Add grading item to course
    }
    public void addSectionTime(String date, String start, String end){
        //Add section date and time
    }
    public void addSectionRoom(String room, String building){
        //Add room and building for a section
    }
}
