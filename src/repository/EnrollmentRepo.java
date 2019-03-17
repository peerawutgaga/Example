package repository;

import enrollment.Enrollment;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EnrollmentRepo implements Repository {
    private List<Enrollment> enrollments;
    private static EnrollmentRepo instance;
    private EnrollmentRepo(){
        this.enrollments = new ArrayList<>();
    }
    public synchronized static EnrollmentRepo getInstance(){
        if(Objects.isNull(instance)){
            instance = new EnrollmentRepo();
        }
        return instance;
    }
    @Override
    public Object select() {
        return null;
    }
    public List<Enrollment> select(String studentID){
        List<Enrollment> enrollments = new ArrayList<>();
        for(Enrollment enrollment : this.enrollments){
            if(enrollment.getStudentID().equals(studentID)){
                enrollments.add(enrollment);
            }
        }
        return enrollments;
    }
    public List<Enrollment> select(String studentID,int semester, int year){
        List<Enrollment> enrollments = new ArrayList<>();
        for(Enrollment enrollment : this.enrollments){
            if(enrollment.getStudentID().equals(studentID) && enrollment.getSemester() == semester && enrollment.getYear() == year){
                enrollments.add(enrollment);
            }
        }
        return enrollments;
    }
    @Override
    public void insert(Object enrollment) {
        if(enrollment instanceof Enrollment){
            this.enrollments.add((Enrollment) enrollment);
        }
    }

    @Override
    public void update(String key, Object object) {
        //Update logic
    }

    @Override
    public void delete(String key) {
        //Keep this method blank
    }
}
