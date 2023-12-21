package Competition;

public class Human extends Participant{
    public static int numberOfHumans;
    private int id;
    private int runningEndurance;
    private int jumpingAbility;
    public int distance;
    public int barriersOvercome;

    public Human(int runningEndurance, int jumpingAbility) {
        super(runningEndurance,jumpingAbility);
        ++numberOfHumans;
        id=numberOfHumans;
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
        return "Human{" +
                "id=" + id +
                ", runningEndurance=" + runningEndurance +
                ", jumpingAbility=" + jumpingAbility +
                '}';
    }
}
