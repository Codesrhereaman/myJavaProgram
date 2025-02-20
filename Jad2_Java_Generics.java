import java.util.ArrayList;
//import java.util.Scanner;
/* generics are used to define the scope inside collections(i.e. arraylist) to make them of specific datatype */

class Generics<T1,T2,T3>{
     int a1;
    private T1 t1;
    private T2 t2;
    private T3 t3;

    public Generics(int a1, T1 t1, T2 t2, T3 t3){
        this.a1 = a1;
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }
    public int getA1() {
        return a1;
    }
    public T1 getT1() {
        return t1;
    }
    public T2 getT2() {
        return t2;
    }
    public T3 getT3() {
        return t3;
    }

    //setter are redundant as constructors are created to get it
//    public void setA1(int a1) {
//        this.a1 = a1;
//    }

//    public void setT1(T1 t1) {
//        this.t1 = t1;
//    }
}

public class Jad2_Java_Generics {
    @SuppressWarnings("ExtractMethodRecommender")
    public static void main(String[] args) {
//        ArrayList al  = new ArrayList();
        ArrayList <Integer> al  = new ArrayList<>();  //"int" is not allowed as it is primitive datatype
//        al.add("hey");
        al.add(5);
        al.add(6);
//        al.add(new Scanner(System.in));
//        int a = al.get(1);   // cannot do it because the compiler don't know the datatype of this
        // to solve
//        int a = (int)al.get(1);
        //or declare the type inside the arraylist and make it integer only
        int a = al.get(1);
        System.out.println(a);


        //this is how java generics is defined
        Generics<Integer,String,String> g1 = new Generics<>(2,4+5," 2nd object:2"," 3rd object:3");
        int b = g1.getA1();
        int c = g1.getT1();
        String d = g1.getT2();
        String e = g1.getT3();
        System.out.println(b+" "+c+d+e);

    }
}
