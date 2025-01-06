interface camera {
    void takeSnap();

    void recordVideo();
    private void greet(){ //not in use  via object but can call in default inside the interface
        System.out.println("good morning..");
    }
    //if you forget to add a method in the interface and you want to ad dit now in each class  so can use default method to create one in interface itself
    default void record4k(){
        greet();
        System.out.println("recording in 4k...");
    }
}
interface wifi{
    String [] getNetwork ();
    void connectToNetwork(String name);
}
class CellPhonex{    ////don't make class of same name otherwise your mind will be fucked
    void callNumber(int phoneNumber){
        System.out.println("calling..."+ phoneNumber);
    }
    void answerCall(){
        System.out.println("Connecting...");
    }
}
class SmartPhone1 extends CellPhonex implements wifi,camera{   //don't make class of same name otherwise your mind will be fucked
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
}
public class ch11_Multiple_inheritance {
    public static void main(String[] args) {
        //class can't extend multiple classes but interfaces does
        //field are not necessary to be updated ,but you can
        SmartPhone1 m14 = new SmartPhone1();
        m14.record4k();
        String  [] ar = m14.getNetwork();
        for(String item:ar){
            System.out.println(item);
        }
    }
}
