import java.util.Scanner;

public class Perimeter_areaOfRactangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter length of the rectangle");
        int length=sc.nextInt();

        System.out.println("Enter breath of the rectangle");
        int width=sc.nextInt();

        //calculate area of rectangle
        int  areaOfRec=(length*width);
        System.out.println("The area of rectangle is:-"+areaOfRec);

        //calculate the perimeter of rectangle
        int Parameter_rec=(length+width);
        System.out.println("The perimeter of rectangle is:-"+Parameter_rec);

    }
}
