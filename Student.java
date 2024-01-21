public class Student {
    public String name;
    public double mScore;
    public double fScore;
    
    public void showGrade(){
        double score = (mScore*0.4)+(fScore*0.4) + 20;
        char grade = 0;
        if (score >= 80){
            grade = 'A';
        }
        else if (score < 80 && score >= 70){
            grade = 'B';
        }
        else if (score < 70 && score >= 60){
            grade = 'C';
        }
        else if (score < 60 && score >= 50){
            grade = 'D';
        }
        else if (score < 50){
            grade = 'F';
        }
        System.out.println("Your grade is "+grade+".");
    }
}
    
