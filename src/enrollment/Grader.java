package enrollment;


import repository.EnrollmentRepo;

import java.util.List;

public class Grader {
    public static double getGPA(String studentID, int semester, int year){
        EnrollmentRepo enrollmentRepo = EnrollmentRepo.getInstance();
        return 0;
    }
    public static double getGPAX(String studentID){
       EnrollmentRepo enrollmentRepo = EnrollmentRepo.getInstance();
        List<Enrollment> enrollments = enrollmentRepo.select(studentID);
        double sumOfGrade = 0.0;
        for(Enrollment enrollment:enrollments){
            sumOfGrade += translateGradeLetterToNumber(enrollment.getGrade());
        }
       return sumOfGrade/enrollments.size();
    }
    private static double translateGradeLetterToNumber(String gradeLetter){
        if (gradeLetter == "A") {
            return 4.0;
        } else if (gradeLetter == "B+") {
            return 3.5;
        } else if (gradeLetter == "B") {
            return 3.0;
        } else if (gradeLetter == "C+") {
            return 2.5;
        } else if (gradeLetter == "C") {
            return 2.0;
        } else if (gradeLetter == "D+") {
            return 1.5;
        } else if (gradeLetter == "D") {
            return 1.0;
        } else if (gradeLetter == "F") {
            return 0.0;
        }
        return 0;
    }
}
