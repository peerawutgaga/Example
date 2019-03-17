package driver.enrollment;

import enrollment.SectionInfo;
import org.junit.Test;

public class SectionInfoDriver {
    @Test
    public void testSetLecturer(){
        SectionInfo sectionInfo = new SectionInfo();
        sectionInfo.setLecture("asdfghjkl");
    }
}
