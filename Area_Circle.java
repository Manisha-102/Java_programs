import java.util.Scanner;

public class Area_Circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter radius of the circle:");
        float r=sc.nextFloat();

        //calculate area of circle
        double Area=(3.14*r*r);//This is the formula for calculate area of circle
        System.out.println("Area of the circle is:-)"+Area);

        //calculate circumstances of circle
        double circum=(2*3.14*r);//This is the formula for calculate circumstances of circle
        System.out.println("circumstances of circle is:-)"+circum);

    }
}
