class threm extends Thread{
    public void run(){
        int i =0;
        while(i<10000){
        System.out.println("I am the thread 1 class runner");
        i++;
        }
        try{
            Thread.sleep(1);  //sleep this thread for 5 second
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
class threm2 extends Thread{
    public void run(){
        int i=0;
        while(i<10000){
            System.out.println("I am the thread 2 class runner");
            i++;
        }
        try{
            Thread.sleep(1);  //sleep this thread for 5 second
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
public class ch13_Thread_methods {
    public static void main(String[] args) {
        threm t1 = new threm();
        threm2 t2 = new threm2();

        //to let the one thread finish and then  other start use:
//        t1.start();
//        try{
//            t1.join();
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
//        t2.start();

        //to make one thread stop for specific time use try and catch block in the thread class
        t1.start();
        t2.start();
    }
}
