package myPack;

import java.util.Scanner;

public class ArmstrongNum {
    public static int armstrong(int n){
        int t1=n;
        int length=0;
        int t2=n;
        int arm=0;
        int rem=0;
        while (t1!=0){
            length=length+1;
            t1=t1/10;
        }

        while (t2!=0){
            int mult=1;
            rem=t2%10;
            for (int i=1;i<=length;i++){
                mult=mult*rem;
            }
            arm=arm+mult;
            t2=t2/10;
        }
        if(arm==n){
            System.out.println(n+" is armstrong");
        }
        else {
            System.out.println(n+" is not armstrong");
        }
        return arm;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the no");
        int n=sc.nextInt();

        armstrong(n);
    }
}
