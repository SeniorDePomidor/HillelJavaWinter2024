import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        OddNumbersAdder adder=new OddNumbersAdder();
        System.out.println(adder.sumOfOddNumbersFor(1,99));
        System.out.println(adder.sumOfOddNumbersWhile(1,99));
        System.out.println(adder.sumOfOddNumbersDoWhile(1,99));

        Factorial f=new Factorial();
        System.out.println(f.factorialFor(5));
        System.out.println(f.factorialWhile(5));
        System.out.println(f.factorialDoWhile(5));

        Power pow=new Power();
        System.out.println(pow.involve(7,5));

        Sequence seq=new Sequence();
        seq.getSequence(0, 10);

        MultiplyTable table=new MultiplyTable();
        table.getMultiplyTable();

        OddNumbers oddNumbers=new OddNumbers();
        oddNumbers.getOddNumbers(10);

        ExtremumsOfArray extremums=new ExtremumsOfArray();
        System.out.println(Arrays.toString(extremums.getMinimumAndMaximum()));

        ChangeOfPlaces change=new ChangeOfPlaces();
        change.changeOfPlaces();
    }
}
