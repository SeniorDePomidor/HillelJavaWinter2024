package Competition;

public abstract class Barrier {
    private static int numberOfBarriers;
    private int id;

    public Barrier() {
        ++numberOfBarriers;
        id=numberOfBarriers;
    }
}
