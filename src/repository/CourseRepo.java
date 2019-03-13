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
    public void update(Object course, Object newCourse) {
        if(course instanceof Course && newCourse instanceof Course){
            this.courses.remove(course);
            this.courses.add((Course) newCourse);
        }
    }

    @Override
    public void delete(Object course) {
        this.courses.remove(course);
    }
}
