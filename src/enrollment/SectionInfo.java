package enrollment;

import java.util.ArrayList;
import java.util.List;

public class SectionInfo {
    private int sectionNo;
    private List<String> lectureID;
    private boolean isOpen;
    private SectionDateTime sectionDateTime;
    class SectionDateTime{
        private String startDate;
        private String endDate;
        private String day;
        private String room;
        private String building;
        public SectionDateTime(){}
        public SectionDateTime(String startDate,String endDate,String day){
            this.startDate = startDate;
            this.endDate = endDate;
            this.day = day;
        }

        public String getRoom() {
            return room;
        }

        public void setRoom(String room) {
            this.room = room;
        }

        public String getBuilding() {
            return building;
        }

        public void setBuilding(String building) {
            this.building = building;
        }
        public String getDateAndTime(){
            return this.day+"-"+this.startDate+"-"+this.endDate;
        }
        public void setLocation(String building,String room){
            setBuilding(building);
            setRoom(room);
        }
    }
    public SectionInfo(){
        this.sectionDateTime = new SectionDateTime();
    }
    public SectionInfo(int sectionNo){
        this.sectionDateTime = new SectionDateTime();
        this.sectionNo = sectionNo;
    }

    public int getSectionNo() {
        return sectionNo;
    }

    public void setSectionNo(int sectionNo) {
        this.sectionNo = sectionNo;
    }

    public boolean isCourseOpen() {
        return isOpen;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public List<String> getLectures(){
        return lectureID;
    }

    public void setLecture(String lectureID) {
        this.lectureID.add(lectureID);
    }
    public void setRoom(String bui){

    }
}