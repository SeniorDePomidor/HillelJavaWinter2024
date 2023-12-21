public class Round extends Figure implements Area{
    private double radius;

    public Round(double radius) {
        this.radius=radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
