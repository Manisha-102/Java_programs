package myPack;
//Fibonacci Series
import java.util.Scanner;

public class FibonacciSeries {
    public static void fibonacci(int n){
        int a=0;//initializing value
        int b=1;
        int c;
        System.out.println(a+" "+b);

        //printing fibonacci series
        for (int i=1;i<=n;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //taking input from the user
        System.out.println("Enter the number");
        int n=sc.nextInt();

        fibonacci(n);
    }
}
