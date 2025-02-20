
//annotation are used to get details about the class,method or so on ...as @override....
class NewClass extends phone {
    @Override
    void music() {
        System.out.println("annotation 1");
    }

    @Deprecated
    void sum() {
        System.out.println("annotation 2");
        System.out.println("hello dear i am Aman");
        System.out.println("hey dear");
    }
}
class Thread1 extends Thread{
    public void threading()
    {
        try {
            Thread.sleep(5);
        }
        catch(Exception e) {
        System.out.println("NOT AVAILABLE");
        }
    }
}
class Thread2 extends Thread{
    public void threading()
    {
        try {
            Thread.sleep(5);
        }
        catch(Exception e) {
            System.out.println("NOT aware of this");
        }
    }
}
public class Jad2_annotation {
    @SuppressWarnings("deprecated") // --> annotation 2
    public static void main(String[] args) {
        NewClass n = new NewClass();
        n.sum(); //as it is deprecated so give warning during build time,to avoid use--@SuppressWarnings
    }
}
