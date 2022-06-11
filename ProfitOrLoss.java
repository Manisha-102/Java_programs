import java.util.Scanner;

public class ProfitOrLoss {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter  the selling price of your product");
        int sel_price=sc.nextInt();

        System.out.println("Enter the cost price of your product");
        int cost_price=sc.nextInt();


        if(sel_price==cost_price){
            System.out.println("Neither profit nor loss");
        }
        else if(sel_price>cost_price){
            System.out.println("You have profit......:):-"+(sel_price-cost_price));
        }
        else {
            System.out.println("you have loss"+(cost_price-sel_price));
        }
    }
}
