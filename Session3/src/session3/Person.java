package session3;

public class Person {
    private String fullName;
    private String yob;
    private double[] points;

    public Person() {
    }

    public Person(String fullName, String yob, double[] points) {
        this.fullName = fullName;
        this.yob = yob;
        this.points = points;
    }
    
    public double getAvgPoint(){
        double sum = 0;
        for (double x : points) {
            sum += x;
        }
        return sum;
    }
    
    private boolean hasPointBelow(double x){
        for (double point : points) {
            if(point < x)
                return true;
        }
        return false;
    }
    
    public boolean canDoThesis(){
        if(getAvgPoint() > 7 && !hasPointBelow(5))
            return true;
        return false;
    }
    
    public boolean canGraduate(){
        if(getAvgPoint() <= 7 && !hasPointBelow(5))
            return true;
        return false;
    }
    
    public boolean canRetake(){
        return hasPointBelow(5);
    }
    
    public String subjectsToRetake(){
        String s = new String();
        for (int i = 0; i < points.length; i++) {
            if(points[i] < 5)
                s += (i+1) + ", ";
        }
        return "Subject " + s;
    }
    
    public static void main(String[] args) {
        double[] points1 = {1,2,3,4,5,6,7,8,9};
        double[] points2 = {9,9,9,9,9,9,9,9,9};
        Person p1 = new Person("NVA", "1-1-2003", points1);
        Person p2 = new Person("NVB", "2-1-2003", points2);
        
        Person[] students = {p1, p2};
        
        int countThesis = 0;
        int countGraduation = 0;
        int countRetake = 0;
        String str = "";
        
        for (int i = 0; i < students.length; i++) {
            if(students[i].canDoThesis())
                countThesis++;
            if(students[i].canGraduate())
                countGraduation++;
            
            if(students[i].canRetake()){
                countRetake++;
                str += students[i].subjectsToRetake() + "of student th " + (i+1) + "\n";
            }
        }
        
        System.out.println("Number of students eligible for graduation thesis: " + countThesis);
        System.out.println("Number of students eligible for graduation: " + countGraduation);;
        System.out.println("Number of students who need to retake exams: " + countRetake);
        
        if(countRetake == 0)
            System.out.println("No student has to retake the exam!");
        else
            System.out.println(str);
    }
}
