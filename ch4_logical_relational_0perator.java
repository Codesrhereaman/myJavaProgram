public class ch4_logical_relational_0perator {
    public static void main(String[] args){
        //use of && - and(make sure each cond is true condtion) and || - or (like or, any of the contion is true)
        boolean a = true;
        boolean b = false;
        boolean c = true;
//        System.out.println("for logical and &&");
//        if(a && b && c){
//            System.out.println("yes");
//        }
//        else{
//            System.out.println("no");
//        }
//        System.out.println("for logical or ||.....");
        if(a || b && c){   //left to right associativity
            System.out.println("yes");
        }
//        else{
//            System.out.println("no");
//        }
//        System.out.println(!b);//!a means not a or inverse of a

    }
}
