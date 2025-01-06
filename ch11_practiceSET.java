abstract class Pen{
   abstract void Write();
   abstract void Refill();
}
class FountainPen extends Pen{
    public void Write(){
        System.out.println("Writing your name...");
    }
    public void Refill(){
        System.out.println("Refilling your refill...");
    }
    void ChangeNib(){
        System.out.println("changing the nib...");
    }
}
class Monkey{
    void jump(){
        System.out.println("jumping...");
    }
    void bite(){
        System.out.println("biting...");
    }
}
interface BasicAnimal{
    void sleep();
    void eat();
}
class Human extends Monkey implements BasicAnimal{
     public void sleep(){
         System.out.println("sleeping...");
    }
    public void eat(){
        System.out.println("eating....");
    }
}
abstract class TelePhone{
    abstract void ring();
    abstract void disconnect();
    abstract void lift();
}
class SmartPhone3 extends TelePhone{
    public void ring(){
        System.out.println("ringing...");
    }
    public void disconnect(){
        System.out.println("disconnecting ...");
    }
    public void lift(){
        System.out.println("lifting...");
    }
}
interface TvRemote{
    void change();
}
interface SmartTvRemote extends TvRemote{
     default void change(){
         System.out.println("changing...");
    }
}
class Tv1 implements SmartTvRemote{
    public void change(){
        System.out.println("changing the channels of TV...");
    }
}


public class ch11_practiceSET {
    public static void main(String[] args) {
        //Q1 & Q2
        FountainPen fp = new FountainPen();
        fp.ChangeNib();
        //Q3
        System.out.println();
        Human h = new Human();
        h.jump();
        h.eat();
        h.sleep();
        h.bite();
        System.out.println();
        //Q4
        TelePhone t = new SmartPhone3();
        t.lift();
        t.ring();
        t.disconnect();
        System.out.println();
        //Q5
        BasicAnimal b = new Human();
        b.eat();
        b.sleep();
        System.out.println();
//        b.bite();  not allowed as reference taken of BasicAnimal
        //Q6 & 7
        Tv1 v  = new Tv1();
        v.change();

    }
}
