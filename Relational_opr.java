import java.util.Scanner;

public class Relational_opr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //taking input from the user
        System.out.println("Enter  the first value");
        int val1=sc.nextInt();
        System.out.println("yore first value is:"+val1);

        System.out.println("Enter yore second value is");
        int val2=sc.nextInt();
        System.out.println("yore second value is:"+val2);

        System.out.println("Enter  the third value");
        int val3=sc.nextInt();
        System.out.println("yore first value is:"+val3);

        //Comparing val1,val2 and val3 value
        System.out.println("val1==val2:"+(val1==val2));
        System.out.println("val1>=val3:"+(val1>=val3));
        System.out.println("val2<=val3:"+(val2<=val3));
        System.out.println("val2<val1:"+(val2<val1));
        System.out.println("val3>val1:"+(val3>val1));
        System.out.println(("val2!=val3:"+(val2!=val3)));

    }
}
