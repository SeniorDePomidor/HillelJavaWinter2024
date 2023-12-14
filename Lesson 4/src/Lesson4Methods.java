import java.util.Random;
import java.util.Scanner;

public class Lesson4Methods {
    public static void printThreeWords(){
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign(){
        Random random=new Random();
        int a= random.nextInt(100)-50;
        int b= random.nextInt(100)-50;
        System.out.println("The numbers are "+a+" , "+b);
        String message=(a+b>=0) ? "Sum is positive" : "Sum is negative";
        System.out.println(message);
    }

    public static void printColour(){
        Random random=new Random();
        int a=random.nextInt(500)-250;
        System.out.println("The number is "+a);
        String message=(a<=0)?"Red":(a<=100)?"Yellow":"Green";
        System.out.println(message);
    }

    public static void compareNumbers(){
        Random random=new Random();
        int a=random.nextInt(50);
        int b=random.nextInt(75);
        System.out.println("a = "+ a+"\tb = "+b);
        String message=(a>=b)?"a>=b":"a<b";
        System.out.println(message);
    }

    public static boolean checkSumIsBetween10and20(){
        int[]array=new int[2];
        int counter=0;
        int sum=0;
        System.out.println("Please enter two integer numbers: ");
        do {
        Scanner scanner=new Scanner(System.in);
            while (!scanner.hasNextInt()) {
                System.out.println("Incorrect input. Please enter an INTEGER numbers: ");
                scanner=new Scanner(System.in);
            }
            array[counter]=scanner.nextInt();
            sum+=array[counter];
            ++counter;
        }while (counter<2);
        return (sum<=20&&sum>=10)?true:false;
    }

    public static boolean checkSignOfNumber(int a){
        System.out.println("The number is "+a);
        String message=(a<0)?"Negative number":"Positive number";
        System.out.println(message);
        return (a<0);
    }

    public static void printNTimes(String s,int times){
        for (int i = 0; i < times; i++) {
            System.out.println(s);
        }
    }

    public static boolean isLeapYear(int year){
        boolean result=((year%4==0&&year%100!=0)||year%400==0);
        System.out.println(result);
        return result;
    }
}
