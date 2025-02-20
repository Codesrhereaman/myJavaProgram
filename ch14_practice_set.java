import java.util.Scanner;
class Q4CustomException extends Exception{
    @Override
    public String getMessage() {
        return "max tries reached in question 4";
    }
}

class Q5CustomException extends Exception{
    @Override
    public String getMessage() {
        return "max tries reached in question 5";
    }
}
public class ch14_practice_set {
    public static void Q5Method() throws Q5CustomException{
        int[] arr = {1, 2, 3, 4, 5};
        int a, i = 0;
        Scanner sc = new Scanner(System.in);
        while (i < 5) {
            try {
                System.out.println("enter a index: ");
                a = sc.nextInt();
                System.out.println("value at  index is : " + arr[a]);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("try again with valid index");
                i++;
            }
        }
        if(i>=4) {
           throw new Q5CustomException();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q1
        //syntax error-> System.out.println("hello";
        // int a =sc.nextInt()  --> input given = "hello"
        // avg = num1+num2/num1  -> logical error as wrong formula of avg

        //Q2
//        try{
//            //int a = 6/0;
//           // IllegalArgumentException --> consist of variety of things as array range or string indexing
//        }
//        catch(ArithmeticException a){
//            System.out.println("haha");
//        }
//        catch(IllegalArgumentException e){
//            System.out.println("hehe");
//        }

        //Q3
        //my approach
//        int [] arr = {1,2,3,4,5};
//        int a ,i=0;
//        while(i<5){
//        try{
//            System.out.println("enter a index: ");
//            a = sc.nextInt();
//            System.out.println("value at  index is : "+arr[a]);
//            break;
//            }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("try again with valid index");
//            i++;
//        }
//        }
//        if(i==4) {
//            System.out.println("error");
//        }

        //Q4
//        int [] arr = {1,2,3,4,5};
//        int a ,i=0;
//        while(i<5){
//            try{
//                System.out.println("enter a index: ");
//                a = sc.nextInt();
//                System.out.println("value at  index is : "+arr[a]);
//                break;
//            }
//            catch(ArrayIndexOutOfBoundsException e){
//                System.out.println("try again with valid index");
//                i++;
//            }
//        }
//        if(i>=4) {
//            try{
//                throw new Q4CustomException();
//            }
//            catch(Q4CustomException e){
//                System.out.println(e.getMessage());
//            }
//        }

        //Q5(method is above)
        //handling of that method
        try{
            Q5Method();
        }
        catch(Q5CustomException e){
            System.out.println(e.getMessage());
        }
    }
}
