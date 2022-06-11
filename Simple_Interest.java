import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter principle amount");
        double P=sc.nextDouble();

        System.out.println("Enter Rate of interest");
        double R=sc.nextInt();

        System.out.println("Enter number of years");
        double T=sc.nextDouble();

        //calculate the simple interest
        double sim_interest=(P*R*T/100);//Formula of simple interest
        System.out.println("Simple interest is:)"+sim_interest);

    }
}
