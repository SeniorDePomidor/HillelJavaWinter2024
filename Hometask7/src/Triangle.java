public class Triangle extends Figure implements Area{
    private double oneSide;
    private double height;
    private  double secondSide;
    private  double angleBetween1and2;

    public Triangle(double oneSide, double height) {
        this.oneSide = oneSide;
        this.height = height;
    }

    public Triangle(double oneSide, double secondSide, double angleBetween1and2) {
        this.oneSide = oneSide;
        this.secondSide = secondSide;
        this.angleBetween1and2 = angleBetween1and2;
    }

    @Override
    public double getArea() {
        double result=0;
        if(height!=0){
            result=oneSide*height/2;
        }else{
            result=oneSide*secondSide*Math.sin(angleBetween1and2)/2;
        }
        return result;
    }
}
