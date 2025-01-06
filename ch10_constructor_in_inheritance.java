//constructor of base class will be performed firstly even when you are making the object of derived class
class base1{
    base1 (){
        System.out.println("i am a default constructor from base1");
    }
    base1(int a){
        System.out.println("i am a overloaded constructor from base1 with value of a as: "+a);
    }
}
class derived1 extends base1{

    derived1(){
        System.out.println("i am a default derived class constructor");
    }
    derived1 (int a,int b,String c){
        super(a);   /*super can  be used only in constructor of derived class
         we can use the another  constructor by using the keyword super but by default it uses the default constructor without any argument*/
        System.out.println("i am a overloaded constructor from derived1 with value of b as: "+b+" and name as : "+c);
    }
}
class derived2 extends  derived1{
    derived2(){
        System.out.println("i am a default constructor from  derived1");
    }
    derived2(int a,int b,String c,int d){
        super(a,b,c);
        System.out.println("i am a overloaded constructor from  derived2 with value of d as "+ d);
    }
}

public class ch10_constructor_in_inheritance {
    public static void main(String[] args) {
//        b.setX(89);
//        System.out.println(b.getX());
//        base1  b = new base1();
//        derived1 d2 = new derived1(25,"constructor 2 in derived class");
//        derived2 d2 = new derived2();
        derived2 d2 = new derived2(21,225,"CONSTRUCTOR OF DERIVED1",0);

    }
}
