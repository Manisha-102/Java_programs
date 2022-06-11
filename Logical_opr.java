import java.util.Scanner;

public class Logical_opr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Enter input from the user
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("num1 = "+a);

        System.out.println("Enter the second number");
        int b=sc.nextInt();
        System.out.println("num2 = "+b);

        System.out.println("Enter the third number");
        int c=sc.nextInt();
        System.out.println("num3 = ");

        //Using Logical AND operator
        if((a>b)&&(b==c)){
            System.out.println("Inside the if block");
        }
        else {
            System.out.println("value of a is = "+a);
        }

        //Using Logical OR operator
        if ((a>b)||(a<c)){
            System.out.println("condition are true");
        }
        else {
            System.out.println("condition are false");
        }

        //Using Logical NOR operator
        System.out.println("!()a>b:-"+!(a>b));
        System.out.println("!(b<c):-"+!(b<c));

    }
}
