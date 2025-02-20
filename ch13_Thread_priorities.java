class mthr1 extends Thread  {

    public mthr1(String name){
        super(name); //
        // thread class constructor have own so using super and name
    }
    public void run(){
        int i =0;
        while (i<50) {
            System.out.println("hello ji FROM Thread " + this.getName() + this.getId() );
            i++;
        }
    }
}
public class ch13_Thread_priorities {
    public static void main(String[] args) {
        //Jvm has thread priorities and can be declared
        //it has three set MIN_PRIORITY,MAX_PRIORITY,NORM-PRIORITY
        //Threadobject.setpriorities(Thread.MAX/MIN/NORM_PRIORITIES)

        mthr1 t1 = new mthr1("AMan max imp ");
        mthr1 t2 = new mthr1("aman2 ");
        mthr1 t3 = new mthr1("aman3 norm");
        mthr1 t4 = new mthr1("aman4 ");
        mthr1 t5 = new mthr1("aman5 norm imp ");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        //also this way can be used to set priorities t1.setpriorities(6 or 9 or 100);

    }
}
