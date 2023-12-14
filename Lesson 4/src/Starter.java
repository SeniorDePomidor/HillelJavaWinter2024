import java.util.Random;

public class Starter {
    public static void main(String[] args) {
        Lesson4Methods.printThreeWords();

        Lesson4Methods.checkSumSign();

        Lesson4Methods.printColour();

        Lesson4Methods.compareNumbers();

        System.out.println(Lesson4Methods.checkSumIsBetween10and20());

        Random random=new Random();
        int a=random.nextInt(10)-5;
        System.out.println(Lesson4Methods.checkSignOfNumber(a));

        Lesson4Methods.printNTimes("Kuku", 2);

        Lesson4Methods.isLeapYear(300);

    }



}
