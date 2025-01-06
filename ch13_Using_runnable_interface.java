//runnable interface is predefined in thread class just like run class

class MyThreadRunnable1 implements  Runnable{
    public int a =0;
    public void run(){
        while(a<4000){
            System.out.println("I am thread 1 not a joke ");
            a++;
        }

    }
}
class MyThreadRunnable2 implements  Runnable{
    public int a =0;
    public void run(){
        while(a<4000){
          System.out.println("I am thread 2 not a skid ");
          a++;
        }

    }
}

public class ch13_Using_runnable_interface {
    public static void main(String[] args) {

        // it is like a bullet and gun system
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);  // we create an object of thread class and call obj of our class....
        // this is known as runnable

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
       // a1.start(); // we can"t apply this directly

         //to solve it use thread direct object.....now
        gun1.start();
        gun2.start();

        /*how JVM  or Thread scheduler works for assigning threads
          NEW -> {RUNNABLE( ready to select by scheduler) <--> RUNNING(started running) <--> NON RUNNABLE} ->  TERMINATE */



    }
}
