import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Double num1,num2,res;
        System.out.println("Enter yore first num");//first number
        num1=sc.nextDouble();
        System.out.println("Enter your second number");//second number
        num2=sc.nextDouble();

        System.out.println("Enter your choice:(+,*,/,-)");
        char operator=sc.next().charAt(0);


        switch (operator) {
            case '+':
                res = num1 + num2;//calculate sum of two no
                System.out.println("The sum of no is:" + res);
                break;

            case '*':
                res = num1 * num2;//calculate multiplication of two no
                System.out.println("The Multiplication of no is:" + res);
                break;
            case '/':
                res = num1 / num2;//calculate division of two no
                System.out.println("The Division is:" + res);
                break;
            case '-':
                res = num1 - num2;//calculate multiplication of two no
                System.out.println("The subtraction is:" + res);

            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
