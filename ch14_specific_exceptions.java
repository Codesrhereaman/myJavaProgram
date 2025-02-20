import org.w3c.dom.ls.LSOutput;

import java.util.*;
;public class ch14_specific_exceptions {
    public static void main(String[] args) {
        int marks[]  = new int[7];
        Scanner sc = new Scanner(System.in);
        marks[0] = 10;
       for(int i =0 ; i<marks.length; i++){
           marks[i] += 1;
       }

        System.out.print("Enter the array index number: ");
        int a = sc.nextInt();

        System.out.println("Enter the number to divided with : ");
        int b = sc.nextInt();
       try {
           System.out.println("The value at this index in marks array is: " + marks[a]);
           System.out.println("the value after division is: " + marks[a]/b);
       }
       catch(ArithmeticException e){
           System.out.println("error! the number you have entered to divide with is 0");
           System.out.println(e);
        }
       catch(ArrayIndexOutOfBoundsException e1){
           System.out.println("error! the index number is out of range");
           System.out.println(e1);
       }

       catch(Exception e2){
           System.out.println("something not good");
       }
        System.out.println("program ended ");


    }
}
