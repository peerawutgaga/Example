package driver.enrollment;
/*--- AUTO IMPORT START HERE ---*/
import enrollment.Enrollment;
import org.junit.Test;
import static org.junit.Assert.assertEquals;;
import repository.EnrollmentRepo;

import java.util.List;

/*--- AUTO IMPORT END HERE ---*/
public class GraderDriver{
    @Test
    public void testSelectInEnrollmentRepo(){
        EnrollmentRepo enrollmentRepo = new EnrollmentRepo();
        List<Enrollment> actualResult = enrollmentRepo.select("0PGF");
        assertEquals(null,actualResult);
    }
    @Test
    public void testSelectInEnrollmentRepo1(){
        EnrollmentRepo enrollmentRepo = new EnrollmentRepo();
        List<Enrollment> actualResult = enrollmentRepo.select("qS4Lfs2",2000820023,183935084);
        assertEquals(null,actualResult);
    }
}