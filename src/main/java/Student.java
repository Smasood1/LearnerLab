public class Student extends Person implements Learner {
    private double totalStudyTime;


    public Student(long id, double totalStudyTime) {
        super(id);
        this.totalStudyTime = totalStudyTime;
    }

    public Student(long id, String name, double totalStudyTime) {
        super(id, name);
        this.totalStudyTime = totalStudyTime;
    }

    public Student(long id) {
        super(id);
    }

    public void setTotalStudyTime(double totalStudyTime) {
        this.totalStudyTime = totalStudyTime;
    }

    public Student(long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime +=numberOfHours;
    }

    @Override
    public double getTotalStudyTime() {
        return totalStudyTime;
    }


}
