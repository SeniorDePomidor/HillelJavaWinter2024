package Competition;

public class Robot extends Participant{
    private static int numberOfRobots;
    private int id;
    private int runningEndurance;
    private int jumpingAbility;
    public int distance;
    public int barriersOvercome;

    public Robot(int runningEndurance, int jumpingAbility) {
        super(runningEndurance,jumpingAbility);
        ++numberOfRobots;
        id=numberOfRobots;
        this.runningEndurance = runningEndurance;
        this.jumpingAbility = jumpingAbility;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public boolean run(int d) {
        return super.run(d);
    }

    @Override
    public boolean jump(int h) {
        return super.jump(h);
    }

    @Override
    public boolean overcome(Barrier barrier) {
        return super.overcome(barrier);
    }

    @Override
    public String toString() {
        return "Robot{" +
                "id=" + id +
                ", runningEndurance=" + runningEndurance +
                ", jumpingAbility=" + jumpingAbility +
                '}';
    }
}
