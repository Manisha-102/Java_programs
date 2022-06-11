import java.util.Scanner;

public class Cube_No {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num;

        System.out.println("Enter the number...!");//Enter number from user
        num=sc.nextInt();

        if(num%2==0){
            System.out.println("This number is Even:) cube of this number is:-"+(num*num*num));
        }
        else
        {
            System.out.println("This number is Odd");
        }

    }
}