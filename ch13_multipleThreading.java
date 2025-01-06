class MyThread1  extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<20000) {
            System.out.println("my thread 1 class is running");
            System.out.println("i am happy");
            i++;
            try {
                Thread.sleep(1); // Sleep for 1 millisecond
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class MyThread2  extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<20000) {
            System.out.println("my thread2  class is running");
            System.out.println("i am majedar");
            i++;
            try {
                Thread.sleep(1); // Sleep for 1 millisecond
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

public class ch13_multipleThreading {   //thread is way of sharing the data within a process
    public static void main(String[] args) {
        //concurency -- managing more works entirely but at a time one
        //parallel -- at a time , more works are done    ->  threading concept

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        //t1.run(); // run method automatically start when we call start method
        //t2.run();

        //to initialise thread in java, use start
        t1.start();
        t2.start();

    }
}
