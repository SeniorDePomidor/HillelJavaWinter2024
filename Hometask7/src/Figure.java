import java.util.Random;

public class Figure {
    public static void main(String[] args) {
        Figure[]figures=new Figure[5];
        double sumOfSquares=0.0;
        for (int i = 0; i < figures.length; i++) {
            Random random=new Random();
            int f=random.nextInt(3);
            switch (f){
                case 0:
                    double r=random.nextDouble()*50;
                    figures[i]=new Round(r);
                    double square=((Round)figures[i]).getArea();
                    sumOfSquares+=square;
                    System.out.println("There is a round with a radius of "+r+" and its square is "+square);
                    System.out.println("Total square at the moment is "+sumOfSquares);
                    break;
                case 1:
                    double a=random.nextDouble()*50;
                    figures[i]=new Square(a);
                    square=((Square)figures[i]).getArea();
                    sumOfSquares+=square;
                    System.out.println("There is a square with a side of "+a+" and its square is "+square);
                    System.out.println("Total square at the moment is "+sumOfSquares);
                    break;
                case 2:
                    a=random.nextDouble()*50;
                    double h=random.nextDouble()*30;
                    figures[i]=new Triangle(a, h);
                    square=((Triangle)figures[i]).getArea();
                    sumOfSquares+=square;
                    System.out.println("There is a triangle with a side of "+a+" and a height of "+h+" and its square is "+square);
                    System.out.println("Total square at the moment is "+sumOfSquares);
                    break;
                default:
                    System.out.println("Something went wrong =(");
            }
        }
        System.out.println("Total square of all figures is "+sumOfSquares);
    }
}
