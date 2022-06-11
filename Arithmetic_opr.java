import java.util.Scanner;

public class Arithmetic_opr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //take input from the user
        System.out.println("Enter First Number");
        int num1=sc.nextInt();
        System.out.println("First no is:"+num1);

        System.out.println("Enter second Number");
        int num2=sc.nextInt();
        System.out.println("second no is:"+num2);

        //calculate sum of two no
        int sum=(num1+num2);
        System.out.println("sum of two no is:"+sum);

        //calculate subtraction of two no
        int sub=(num1-num2);
        System.out.println("Subtraction of two no is:"+sub);

        //calculate multiplication of two no
        int mult=(num1*num2);
        System.out.println("Multiplication of two no is:"+mult);

        //calculate division of two no
        int div=(num1/num2);
        System.out.println("Division of two no is:"+div);

        //calculate reminder of two no
        int mod=(num1%num2);
        System.out.println("Reminder:"+mod);
    }
}
