package user;

import enrollment.Course;
import repository.CourseRepo;

public class Teacher extends User {
    public void openCourse(String courseID, int section, String teacherID){
        Course course = new Course(courseID);
        CourseRepo courseRepo = CourseRepo.getInstance();
        courseRepo.insert(course);
    }
    public void closeCourse(String courseID, int section){

    }
}
