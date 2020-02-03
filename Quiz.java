public class Quiz implements Measurable{
    private int score;
    private String letterGrade;
    
    Quiz(int s, String lG){
        score=s;
        letterGrade=lG;
    }
    
    public double getMeasure(){
        return score;
    }
    
}