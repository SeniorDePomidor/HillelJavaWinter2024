/*Returns arithmetic mean number of RANDOM numbers */
public class ArithmeticMean {
    public static void main(String[] args) {
        final int NUMBER=(int)(Math.random()*10);
        int limit=10000;
        int[] a=new int[NUMBER];
        double sum=0;
        System.out.println("The numbers were: ");
        for (int i = 0; i < NUMBER; i++) {
            a[i]=(int)(Math.random()*limit);
            System.out.print(a[i]+"\t");
            sum+=a[i];
        }
        double result=sum/NUMBER;
        System.out.println("\nThe mean arithmetical is "+result);
    }
}

