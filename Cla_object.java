package myPack;

import java.util.Scanner;

public class Cla_object {
    int i;
    //accept number from user
    public void accept(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");
        int n= sc.nextInt();
        fibonacci(n);

    }
    //sum of two number
    public void sum(){
        int a=6;
        int b=8;
        int sum=a+b;
        System.out.println("sum of two digit is:-"+sum);

    }
    public void fibonacci(int n){
        int x=0;
        int y=1;
        int z;
        for (int i=0;i<=n;i++){
            z=x+y;
            System.out.println(z);
            x=y;
            y=z;
        }

    }
}
