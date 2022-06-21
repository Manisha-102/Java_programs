package myPack;

import java.util.Scanner;

public class Constructor_FIndGreaterNo {
    int i,max;

    public static void main(String[] args) {
        //calling default constructor
        Constructor_FIndGreaterNo obj=new Constructor_FIndGreaterNo();
        obj.greater_no();
    }
    public void greater_no(){
        Scanner sc=new Scanner(System.in);

        //taking input from the user
        System.out.println("Enter size of the array");
        int size= sc.nextInt();

        int arr[]=new int[size];//Array
        System.out.println("size of the array are:-"+size);

        //enter element of the array
        System.out.println("Enter element of the array");
        for (i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        //print element of the array
        System.out.println("Element of the array are:-");
        for(i=0;i<size;i++){
            System.out.println(arr[i]+"\t");
        }

        //find greater number
        max=0;
        for (i=0;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The maximum no is:-"+max);
    }
}
