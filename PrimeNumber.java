package myPack;

import java.util.Scanner;

public class PrimeNumber {

    public static void prime(int n){
        int temp=0;//initializing a value

        //check it is a prime number or not
        for (int i=2;i<=n-1;i++){
            if(temp%i==0){
                temp=temp+1;
            }
        }
        if(temp>0){
            System.out.println("it's not a prime number");
        }
        else {
            System.out.println("it's a prime number");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //taking input from user
        System.out.println("Enter a number");
        int n=sc.nextInt();

        prime(n);
    }
}
