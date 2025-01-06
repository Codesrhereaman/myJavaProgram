//polymorphism means  using the reference of any interface and only using that interface's methods

interface camera2 {
    void takeSnap();

    void recordVideo();
    private void greet(){ //not in use  via object but can call in default inside the interface
        System.out.println("good morning..");
    }
    //if you forget to add a method in the interface and you want to ad dit now in each class  so can use default method to create one in interface itself
    default void record4k(){
        greet();
        System.out.println("recording in 4k...in camera");
    }
}
interface wifi2{
    String [] getNetwork ();
    void connectToNetwork(String name);
}
class CellPhone2{    ////don't make class of same name otherwise your mind will be fucked
    void callNumber(int phoneNumber){
        System.out.println("calling..."+ phoneNumber);
    }
    void answerCall(){
        System.out.println("Connecting...");
    }
}
class SmartPhone2 extends CellPhone2 implements wifi2,camera2{   //don't make class of same name otherwise your mind will be fucked
    public void record4k(){
        System.out.println("recording in 4k...in Smartphone");
    }        //now greet cannot be used here
    @Override
    public void takeSnap(){
        System.out.println("Clicking the picture...");
    }
    @Override
    public void recordVideo(){
        System.out.println("recording the video...");
    }

    @Override
    public String[] getNetwork() {
        System.out.println("getting list of network");
        String [] networkList = {"akash ajamgarh" , "anuj banaras", "vicky bihar"};
        return networkList;
    }
    @Override
    public void connectToNetwork(String network){
        System.out.println("connecting to.." + network);
    }
    int valueReturn(){
        return 5;
    }
}
public class ch11_polymorphism_inInterfaces {
    public static void main(String[] args) {
        camera2 c2 = new SmartPhone2();
        //c2.connectToNetwork("jio");   //not allowed as when reference is taken by any interface only it's method can  be used
        //c2.valueReturn();  //not allowed as method is belongs to smartPhone2
        c2.takeSnap();
        c2.record4k();// override methods can be used of smartPhone class
        c2.recordVideo();
    }
}
