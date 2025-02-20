class practice1 extends Thread{
    public void run(){
        while(true){
            System.out.println("Good morning: ");
            try {
                Thread.sleep(200);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class practice2 extends Thread{
    public void run(){
//        while(true){
//            System.out.println("Welcome");
//        try {
//            Thread.sleep(200);
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
//      }
    }
}
public class ch13_practice_set {
    public static void main(String [] args){


        //Q1
        practice1 p1 = new practice1();
        practice2 p2 = new practice2();
//        p1.setPriority(6);
//        p2.setPriority(9);
        System.out.println(p1.getPriority());   //get priorities can be used to see priorities
        System.out.println(p2.getPriority());
//        p1.start();
//        p2.start();

        //Q2
        //setting the sleep method for 200 ms

        //Q3
        //setting priorities

        //Q4
        System.out.println(p1.getState());  //means runnable or executed or what is state of the thread

        p2.start();
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());  //giving the current state as getstate()
    }
}
