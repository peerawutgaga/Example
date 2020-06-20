package repository;

import enrollment.Course;
import enrollment.Enrollment;
import enrollment.Score;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EnrollmentRepo implements Repository {
    private List<Enrollment> enrollments;
    private static EnrollmentRepo instance;
    public EnrollmentRepo(){
        this.enrollments = new ArrayList<>();
    }
    public synchronized static EnrollmentRepo getInstance(){
        if(Objects.isNull(instance)){
            instance = new EnrollmentRepo();
            instance.initialData();
        }
        return instance;
    }
    private void initialData(){
        this.enrollments = new ArrayList<>();
        //Enrollment 1
        Course c1 = new Course("2110101");
        Enrollment e1 = new Enrollment("1",c1);
        Score s1 = new Score();
        s1.setGrade("A");
        e1.setSemester(1);
        e1.setYear(2562);
        e1.setScore(s1);
        this.enrollments.add(e1);
        //Enrollment 2
        Course c2 = new Course("2110102");
        Enrollment e2 = new Enrollment("1",c2);
        Score s2 = new Score();
        s2.setGrade("B+");
        e2.setSemester(1);
        e2.setYear(2562);
        e2.setScore(s2);
        this.enrollments.add(e2);
        //Enrollment 3
        Course c3 = new Course("2110101");
        Enrollment e3 = new Enrollment("2",c3);
        Score s3 = new Score();
        s3.setGrade("A");
        e3.setSemester(1);
        e3.setYear(2562);
        e3.setScore(s3);
        this.enrollments.add(e3);
        //Enrollment 4
        Course c4 = new Course("2110101");
        Enrollment e4 = new Enrollment("2",c4);
        Score s4 = new Score();
        s4.setGrade("B+");
        e4.setSemester(1);
        e4.setYear(2562);
        e4.setScore(s4);
        this.enrollments.add(e4);
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
            if(Objects.isNull(this.enrollments)){
                this.enrollments = new ArrayList<>();
            }
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
