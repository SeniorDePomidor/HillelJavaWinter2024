import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Classes {

}
class OddNumbersAdder{

            public int sumOfOddNumbersFor(int begin, int end){
                int sum=0;
                for (int i = begin; i <=end; i++) {
                    if(i%2!=0){
                        sum+=i;
                    }
                }
                System.out.println("Sum of odd numbers from 1 to 99 with for loop: ");
                return sum;
            }
            public int sumOfOddNumbersWhile(int begin, int end){
                int i=begin;
                int sum=0;
                while(i<=end){
                    if(i%2!=0){
                        sum+=i;
                    }
                    ++i;
                }
                System.out.println("Sum of odd numbers from 1 to 99 with while loop: ");
                return sum;
            }
    public int sumOfOddNumbersDoWhile(int begin, int end){
        int i=begin;
        int sum=0;
        do{
            if(i%2!=0){
                sum+=i;
            }
            ++i;
        }while(i<=end);
        System.out.println("Sum of odd numbers from 1 to 99 with do-while loop: ");
        return sum;
    }
}
class Factorial{
        public long factorialFor(int a){
        long result=1;
        if(a<0){
            throw new IllegalArgumentException("Illegal argument");
        }
        if(a>0){
            for(int i=2;i<=a;++i){
               result*=i;
            }
        }
        System.out.println("Factorial with for loop: ");
        return result;
    }

    public long factorialWhile(int a){
        long result=1;
        if(a<0){
            throw new IllegalArgumentException("Illegal argument");
        }
        if(a>0){
            int i=1;
            while(i<=a){
                result*=i;
                ++i;
            }
        }
        System.out.println("Factorial with while loop: ");
        return result;
    }
    public long factorialDoWhile(int a){
        long result=1;
        if(a<0){
            throw new IllegalArgumentException("Illegal argument");
        }
        if(a>0){
            int i=1;
            do{
                result*=i;
                ++i;
            }while(i<=a);
        }
        System.out.println("Factorial with do-while loop: ");
        return result;
    }
}
class Power{
    public long involve(int a, int b){
        long result=1;
        for (int i = 0; i < b; i++) {
            result*=a;
        }
        System.out.println(a+" ^ "+b+" = ");
        return result;
    }
}
class Sequence{
    public void getSequence(int a, int b){
        for (int i = 0; i < b; i++) {
            System.out.print((a-5*i));
            if(i!=b-1){
                System.out.print(",");
            }
        }
    }
}
class MultiplyTable{
    public void getMultiplyTable(){
        System.out.println("\nPlease enter the number for multiply table:");
        Scanner sc=new Scanner(System.in);
        while (!sc.hasNextInt()){
            System.out.println("Please enter a number: ");
            sc=new Scanner(System.in);
        }
        int number=sc.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(i+" * "+number+" = "+i*number);
        }
    }
}
class OddNumbers {
    public void getOddNumbers(int n) {
        int i = 1;
        int counter = 0;
        while (counter < n) {
            if (i % 2 != 0) {
                System.out.print(i);
                ++counter;
                if (counter != n ) {
                    System.out.print(", ");
                }

            }
            ++i;
        }
    }
}

class ExtremumsOfArray {
    public int[] getMinimumAndMaximum(){
        Random r=new Random();
        int sizeOfArray=1+r.nextInt(20);
        int[]array=new int[sizeOfArray];
        for (int i = 0; i<array.length; ++i) {
            array[i]=25-r.nextInt(50);
        }
        int min, max;
        min=max=array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
            }
        }
        int[]result={min, max};
        System.out.println("\nArray is: "+Arrays.toString(array));
        System.out.println("Minimum and maximum are :");
        return result;
    }
}
class ChangeOfPlaces{
    public int[] changeOfPlaces(){
        Random r=new Random();
        int sizeOfArray=1+r.nextInt(20);
        int[]array=new int[sizeOfArray];
        for (int i = 0; i<array.length; ++i) {
            array[i]=25-r.nextInt(50);
        }
        int min, max, iMax, iMin;
        iMax=iMin=0;
        min=max=array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]>max){
                max=array[i];
                iMax=i;
            }
            if(array[i]<min){
                min=array[i];
                iMin=i;
            }
        }
        System.out.println("Array before change looks like: "+Arrays.toString(array));
        array[iMin]=max;
        array[iMax]=min;
        System.out.println("Array after change looks like:  "+Arrays.toString(array));
        return array;
    }
}