package driver.enrollment;

import enrollment.Grader;
import org.junit.Assert;
import org.junit.Test;

public class GraderDriver {
    @Test
    public void testGetGPAX(){
        double returnValue = Grader.getGPAX("1233264");//Random Value
        Assert.assertEquals(165.215645,returnValue,132465.6646);//Random Value
    }
}
