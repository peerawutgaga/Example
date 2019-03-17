package enrollment;

import repository.EnrollmentRepo;

public class grader {
    public static double getGPA(String studentID, int semester, int year){
        EnrollmentRepo enrollmentRepo = EnrollmentRepo.getInstance();
        return 0;
    }
    public static double getGPAX(String studentID){
        return 0;
    }
    private static double translateGradeLetterToNumber(String gradeLetter){
        switch (gradeLetter){
            case "A": return 4.0;
            case "B+": return 3.5;
            case "B": return 3.0;
            case "C+": return 2.5;
            case "C": return 2.0;
            case "D+": return 1.5;
            case "D" :return 1.0;
            case "F": return 0;
            default: return 0;
        }
    }
}
