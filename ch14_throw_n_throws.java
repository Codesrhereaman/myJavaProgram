class NegativeResultException extends Exception{
//    @Override
//    public String toString() {
//        return  "radius can't be negative";
//    }

    @Override
    public String getMessage() {
        return super.getMessage()+": radius can't be negative"; //it takes super cls msz and our own also
    }
}
public class ch14_throw_n_throws {
     static int div(int a ,int b) throws ArithmeticException{
         return a/b;
    }
    public static double  area(int radius) throws NegativeResultException {
         if (radius<0){
             throw new NegativeResultException();
         }
        return (Math.PI)*radius*radius;
    }
    public static void main(String[] args) {
        //throws gives indication in function if anyone using our program that have exception
        //throw just throw an exception custom or pre-defined

        try {
//            int r1 = div(6, 0);
//            System.out.println(r1);
        /*So,it gives error ,and  we have to bind it with try and catch block .so ,as to
        make others understand it to other we indicate by using throws*/

            double ar = area(-6);
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("program ended");

    }
}
