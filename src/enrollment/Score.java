package enrollment;

public class Score {
    private double score;
    private String gradeLetter;
    public double getScore(){
        return this.score;
    }
    public String getGrade(){
        return this.gradeLetter;
    }
    public void setGrade(String gradeLetter){
        this.gradeLetter = gradeLetter;
    }
}
