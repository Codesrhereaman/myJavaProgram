abstract class parent {   // it's the way of making other classes that are actually present as abstract class is virtual
                          //it acts like as default class which used by other
    public parent() {
        System.out.println("i am constructor of class parent ");
    }

    public void hello() {
        System.out.println("1- hello buddy");
    }

    abstract public void greet();  //whenever having a abstract method in any class name,it as abstract class
    abstract public void greet2();  //whenever having a abstract method in any class name,it as abstract class
}
class child1 extends parent{
    @Override
    public void greet(){        //if you are extending  an abstract class  must use abstract word before class  or override abstract method
        System.out.println("good morning");
    }
    @Override
    public void greet2(){
        System.out.println("2-hello ji");
    }
}
abstract class child2 extends parent{
    public void th(){
        System.out.println("i am good ");
    }
}

public class ch11_abstract_class_N_method {
    public static void main(String[] args) {
//abstract method is a method  that has no implementation (i.e. abstract void move(){}... )
//class having any one abstract method is abstract class
        child1 c  = new child1();
        c.hello();
        c.greet();
        c.greet2();
        parent p =new child1();  //it is possible to create dynamic inheritance.....
        p.greet();
//        parent p = new parent();   //not allowed for creating any object as parent is virtual abstract class
//        child2 c1 = new child2();  //not allowed as same

    }
}
