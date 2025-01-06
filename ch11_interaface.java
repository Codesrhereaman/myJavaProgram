interface bicycle{
    int a = 45;
    void applyBreak(int decrement);
    void speed(int increment);
}
interface hornBicycle{
    void applyHorn();
    void horn();
}
class avonCycle implements bicycle,hornBicycle{      //every method must be implemented in the  implement class
//    public int a = 90;   //there is not neccessarly need to update the elements or field
    void blowHorn(){   //we have initiate all the  method of interface for implemented class
        System.out.println("poo..pooo..peee...peeep");
    }
    public void applyBreak(int decrement){   //all method have to be public word otherwise throw an error
        System.out.println("applying break.....");
    }
   public void speed(int increment){
        System.out.println("speed is increasing");
    }
    public void applyHorn(){
        System.out.println("kabhi khsuhi kabhi gam....poooo...pooo");
    }
    public void horn(){
        System.out.println("tujhe dekha to ye  jana sanam...peee..pee");
    }
}

public class ch11_interaface {
    public static void main(String[] args) {
//interface is a point where two system meet and  interact
//in java, interface  is group  of related method with  empty bodies
        avonCycle ca = new avonCycle();
        ca.speed(3);
        ca.blowHorn();
        ca.horn();
        ca.applyHorn();
        //you can create properties in interface
        //you can not modify the properties
        System.out.println(ca.a);
        System.out.println(ca.a);
    }
}
