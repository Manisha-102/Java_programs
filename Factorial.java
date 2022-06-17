//Find Factorial
package myPack;

import java.util.Scanner;

public class Factorial {
    public static void factorial(int n){
        if(n<0){
            System.out.println("Invalid Number");//if negative value
            return;
        }
        int factorial=1;//initializing value in factorial

        for(int i=n;i>=1;i--){
            factorial=factorial * i;
        }
        System.out.println(factorial);

        return;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //taking input from user
        System.out.println("Enter a number");
        int n=sc.nextInt();

        factorial(n);//calling the factorial method
    }
}
