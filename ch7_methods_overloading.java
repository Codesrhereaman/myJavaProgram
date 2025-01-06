public class ch7_methods_overloading {
    //if we don't want return in static method...no parameter used then use void
    static void telljoke(){
        System.out.println("I invented  a new word\n" +
                "plagiarism"); //no return  used means can  call without parameter
    }

    static void change(int a){
        a = 20;
    }

    static void change2(int []arr){
        arr[0] = 20;
    }

    static void voo(){
        System.out.println("i love you baby");
    }

    static void voo(int a){   //'a' is a parameter whose value we do not  know till it be given
        System.out.println("i love you " + a + " baby");
    }

    static void voo(int a,String b){
        System.out.println("i love you " +a+ " times " + "and i kiss you " + b +" times bae" );
    }


    public static void main(String[] args) {
        telljoke();

        //case1: changing the integer
        int x =3;
        change(x);
        System.out.println("the value of x after using change method is: "+x);
        /*x be 3 as x just copies to method and changes
        inside the  method for its cmd only but not changed in real(outside the method)*/

        //case 2: changing of a integer in arrays
        int[]marks = {12,545,125,88,78,0};
        change2(marks); //reference marks will be copied to change2 method not  objects of marks
        System.out.println("the value of the first element on the array marks  after the method running be: "+ marks[0]);
        //hence when reference copied then  method directly call out the values or object od marks so value changes


        //method overloading means same two method with different works to do

        voo();
        int c = 3000;  //c is a argument  and argument are actual values unlike parameters
        voo(c);
        String b = "infinite";
        voo(c,b);
        // we  do method overloading by changing parameter, but can't do it by changing the return type

    }
}
