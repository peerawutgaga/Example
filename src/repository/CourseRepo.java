package repository;

import enrollment.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CourseRepo implements Repository {

    private static List<Course> courses;
    private static CourseRepo instance;
    private CourseRepo(){
        this.courses = new ArrayList<>();
    }
    public synchronized static CourseRepo getInstance(){
        if(Objects.isNull(instance)){
            instance = new CourseRepo();
        }
        return instance;
    }
    @Override
    public List<Course> select() {
        return this.courses;
    }

    @Override
    public void insert(Object object) {
        if(object instanceof Course){
            courses.add((Course) object);
        }
    }

    @Override
    public void update(String courseID, Object newCourse) {

    }

    @Override
    public void delete(String courseID) {
        if(courseID instanceof String){
            for(Course course: courses){
                if(course.getCourseName().equals(courseID)){
                    this.courses.remove(course);
                }
            }
        }
    }
}
