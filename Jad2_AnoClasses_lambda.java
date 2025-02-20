@FunctionalInterface
interface DemoAno{
    void meth1(int a);
//    public void meth2();
}

//class AnoDemo implements DemoAno{
//
//    @Override
//    public void meth1() {
//        System.out.println("i am meth 1 of demo anonymous class");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("i am meth 2 of demo anonymous class");
//    }
//}
public class Jad2_AnoClasses_lambda {

    public static void main(String[] args) {
//        AnoDemo am = new AnoDemo();
//        am.meth1(); //this is allowed
//        DemoAno sm = new AnoDemo();
//        am.meth1(); //this is also allowed using dynamic method dispatch

        //it is an anonymous class taking reference from an interface.and using its method inside the main function
//        DemoAno dm = new DemoAno(){
//
//            @Override
//            public void meth1() {
//                System.out.println("i am meth 1 of demo anonymous class in main function");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("i am meth 2 of demo anonymous class");
//            }
////        };
//        dm.meth1();

        //if you want to use an interface meth.you can traditionally implement in a class and then just use it using reference of that class
        //another way of doing it by using anonymous function which makes it easier to understand and sortern the code
        DemoAno dm =   (a)-> System.out.println("i am method 1 created using functional interface via lambda  function "+a);
        dm.meth1(6);
    }
}
