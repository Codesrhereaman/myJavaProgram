import java.util.Scanner;

class myExp extends Exception{
    @Override
    public String toString() {
        return   " i am an error of to string";
    }
    @Override
    public String getMessage() {
        return  " i am an error of get message";
    }
}
class Non_negative extends Exception{
    @Override
    public String toString() {
        return   "no can not be 0";
    }
    @Override
    public String getMessage() {
        return  "no can't be negative or zero";
    }
}
public class ch14_Exception_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a =sc.nextInt();
//        if (a<5){
//            try{
//                throw new myExp();  // throwing own exception class and it goes to catch block
//                throw new ArithmeticException();
//            }
//            catch(Exception e) {
//                System.out.println(e.toString());  //give a string that you want to show
//                System.out.println(e.getMessage());  //gives the message
//                System.out.println(e);//print the  error occurred firstly
//                e.printStackTrace();  //print the full exception but without crashing the codes
//                System.out.println("executed");
//            }
//        }
        int b =sc.nextInt();
        if (b<=0){
            try{
                throw new Non_negative();
            }
            catch(Non_negative e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
                System.out.println("having error class execution");
            }
        }
        System.out.println("executed fully");
    }
}
