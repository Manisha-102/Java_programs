import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Marksheet {
    public static void main(String[] args) {
        String name;
        int rollno,hin,eng,sci,s_sci,math,total_marks;
        float percentage;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        name=sc.next();
        System.out.println("Enter your rollno");
        rollno=sc.nextInt();
        System.out.println("Enter your hindi marks");
        hin=sc.nextInt();
        System.out.println("Enter your english marks");
        eng=sc.nextInt();
        System.out.println("Enter your Science marks");
        sci=sc.nextInt();
        System.out.println("Enter your Social Science marks");
        s_sci=sc.nextInt();
        System.out.println("Enter your Mathematics marks");
        math=sc.nextInt();

        total_marks=hin+eng+sci+s_sci+math;
        System.out.println("Your total marks is:"+total_marks);

        percentage=(total_marks*100/500);
        System.out.println("Your percentage is:"+percentage+"%");
    }
}
