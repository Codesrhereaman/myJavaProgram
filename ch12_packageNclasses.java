
//import java.util.Scanner;  // here we fixed that only Scanner package can be called in this file
import java.util.*;   //here util is lang and *  saying that any package can be called


public class ch12_packageNclasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                   //or
//        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("enter value of i: ");
        int i = sc.nextInt();
        System.out.printf("this is the value of i = %d",i);


    }
}
