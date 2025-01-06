class phone{
    void music(){
        System.out.println("playing music in phone.....");
    }
    void on(){
        System.out.println("turning phone on...");
    }
}
 class smartphone extends phone{
    void smartmusic(){
        System.out.println("playing music in smartphone....");
    }
    void on(){
        System.out.println("turing on smartphone...");
    }
}
public class ch10_dynamicMETHOD_dispatch {
    public static void main(String[] args) {
//        phone nokia110 = new phone();   //alowed
//        smartphone samsung = new smartphone();   //allowed - just saying smartphone of samsung is new smartphone
//        smartphone vivo = new phone();     //not allowed it is saying that a smart phone of vivo is a phone...so
        //smartphone can't be said phone but a phone is smartphone.....object of extends class can't be a object of a base class
        //we can make obj of base class as new object of derived class
        phone vivo = new smartphone ();   //yes it is allowed and object of smartphone created at the time of execution
        //reference of phone taken and object of smartphone created
        vivo.on();
        vivo.music();
//        vivo.smartmusic();   //not allowed  // if overriding not happeneing then method of extended class can't run

    }
}
