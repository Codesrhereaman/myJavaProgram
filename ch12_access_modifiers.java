import java.util.Scanner;
class c1{
    public int x =5 ;
    private int y = 10;
    int z = 0;
    protected String p = "protected";
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(p);
    }
}
class c2 extends c1{
    public void meth2(){
        System.out.println(x);
        //System.out.println(y);    //y can't be accessed as it has private access
        System.out.println(z);
        System.out.println(p);
    }
}

class tableOfModifiers{
    public tableOfModifiers(){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter type of modifier: ");
        String modi = sc.nextLine();
        System.out.print("enter where using it: ");
        String wh = sc.nextLine();
    }
}

public class ch12_access_modifiers {
    public static void main(String[] args) {
        c1 c = new c1();
//        c.meth1();  //using modifiers in a class

        System.out.println(c.x);
//        System.out.println(c.y); throws an error as we can't access private modifier access in a package directly
        System.out.println(c.z);
        System.out.println(c.p);

        c2 r = new c2();
        System.out.println(r.x);
        System.out.println(r.z);
        System.out.println(r.p);
//        System.out.println(c.y);
        r.meth2();
    }
}
