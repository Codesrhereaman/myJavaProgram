import java.util.InputMismatchException;
import java.util.Scanner;

public class ch14_Nested_try {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int marks[]  = new int[7];
//        for(int i =0 ; i<marks.length; i++){
//            marks[i] += i;
//        }
//        try{
//            System.out.println("enter the index number of the array: ");
//            int ind = sc.nextInt();
//            System.out.println("enter the number to divide with: ");
//            int a = sc.nextInt();
//            try{
//                System.out.println("the value at index is: "+marks[ind]);
//                System.out.println("the value after divide is: "+marks[ind]/a);
//            }
//            catch(ArrayIndexOutOfBoundsException e1){
//                System.out.println("array is out of bound!!\nplease enter a valid index");
//                System.out.println("error at level 2");
//            }
//            catch(ArithmeticException e3){
//                System.out.println("divide by 0 is not allowed");
//                System.out.println("error in level 2");
//            }
//        }
//        catch(InputMismatchException e){
//            System.out.println("please enter a number only!!");
//            System.out.println("error in level 1");
//        }


        //quick quiz
        String []subjects = {"dt","maths","physics","coi","python","c","abc","practical"};
        try{
            int pe;
            do{
                System.out.print("Enter the period number: ");
                pe = sc.nextInt();
                System.out.println("subject in this period is: "+subjects[pe].toUpperCase());
            }while(pe<=subjects.length);
        }
        catch(ArrayIndexOutOfBoundsException e3){
            System.out.println("invalid period!!\nThere is no classes in this period!!");
        }
        System.out.println("program executed...");
    }
}
