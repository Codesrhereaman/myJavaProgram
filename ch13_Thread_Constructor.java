class mthr extends Thread implements Runnable {
    public mthr(){  //for using runnable and give it a name
        super();
    }
    public mthr(String name){
        super(name); //
        // thread class constructor have own so using super and name
    }
    public void run(){
        System.out.println("hello ji");
    }
}
class mrun implements Runnable{
//    public mrun( String name){
//        super(name);
//    }
    public void run(){
        System.out.println("hello hello ji");
    }
}


public class ch13_Thread_Constructor {
    public static void main(String[] args){  //main is also a thread of java
        //thread class have its own constructor
        mthr t1 = new mthr("AMan");
        mthr t2 = new mthr("aman");
        t1.start();
        // these methods will print  lately after main as jvm decides it when to run what
        t2.start();
        System.out.println("i am the thread 1 having id : "+ t1.getId());
        System.out.println("i am the thread 2 having id : "+ t2.getId());
        System.out.println("i am the thread 1 having name : " + t1.getName());
        System.out.println("i am the thread 2 having name : " + t2.getName());

        //for runnable
        mrun m1 = new mrun();
        Thread t3 = new Thread(m1,"AMAN");   //Thread( runnable class,take runnable name) IF THAT CLASS IMPLEMENTS RUNNABLE
        mrun m2 = new mrun();
        Thread t4 = new Thread(m2,"AMAN2");
        t3.start();// start will just run the overrided method as run
        t4.start();
        System.out.println("the runnable 1 name is: "+t3.getName());
        System.out.println("the runnable 2 name is: "+t4.getName());
        System.out.println("the runnable 1 id is: "+t3.getId());
        System.out.println("the runnable 2 id is: "+t4.getId());


        //if i implements the runnable to mthr class,
        // for using mthr as runnable i have to make a no-argument constructor in class as to create the objects without passing a String name
        mthr m3 = new mthr();
        Thread t5 = new Thread(m3,"a");
        System.out.println("the runnable name 3 is: "+t5.getName());
        System.out.println("the runnable id 3 is: "+t5.getId());
        t5.start();



    }
}
