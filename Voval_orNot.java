import java.util.Scanner;

public class Voval_orNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Alphabet for check vowel or constant");
        char ch=sc.next().charAt(0);

        switch (ch){
            case 'a':
                System.out.println("this is vowel:"+ch);
                break;
            case 'e':
                System.out.println("this is vowel:"+ch);
                break;
            case 'i':
                System.out.println("this is vowel:"+ch);
                break;
            case 'o':
                System.out.println("this is vowel:"+ch);
                break;
            case 'u':
                System.out.println("this is vowel:"+ch);
                break;
            default:
                System.out.println("this is constant");
        }

    }
}
