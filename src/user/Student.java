package user;

import enrollment.Grader;
import stub.enrollment.GraderStub;

public class Student extends User{
    public double viewGPAX(){
        //double gpax = Grader.getGPAX(id);
        double gpax = GraderStub.getGPAX(id);
        return gpax;
    }
    public static void main(String args[]){
        Student s = new Student();
        s.setId("1");
        System.out.println(s.viewGPAX());
    }
}

