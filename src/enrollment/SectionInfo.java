package enrollment;

import java.util.List;

public class SectionInfo {
    private int sectionNo;
    private List<String> lectureID;
    private boolean isOpen;
    public SectionInfo(int sectionNo){
        this.sectionNo = sectionNo;
    }
}
