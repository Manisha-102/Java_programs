import java.util.Scanner;

public class Ternary_opr {
        public static void main(String[] args)
        {

            // variable declaration
            int max,min;

            Scanner sc=new Scanner(System.in);

            //taking input from user
            System.out.println("Enter first num");
            int n1=sc.nextInt();
            System.out.println("Yore first no is:"+n1);

            System.out.println("Enter second no");
            int n2=sc.nextInt();
            System.out.println("yore second no is:"+n2);

            System.out.println("First num: " + n1);
            System.out.println("Second num: " + n2);

            // Largest among n1 and n
            max = (n1 > n2) ? n1 : n2;

            // Print the largest number
            System.out.println("Maximum is = " + max);

            //Smallest among n1 and n2
            min=(n1 < n2) ? n1 :n2;

            //print the smallest number
            System.out.println("minimum is:"+min);
        }
}
