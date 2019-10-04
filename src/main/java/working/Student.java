package working;

public class Student extends Person implements Learner{
    private double totalStudyTime;

    public Student(long id, String name, double totalStudyTime) {
        super(id, name);
        this.totalStudyTime=totalStudyTime;
    }

    public void learn(double numberOfHours) {
        double x= totalStudyTime+=numberOfHours;
        System.out.println(x);
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
