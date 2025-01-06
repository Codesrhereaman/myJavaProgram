class a{
    public int x;
    public int meth1(){
        return 60;
    }
     void meth2(){
        System.out.println("i am method meth2 from class a");
    }
}
class b extends a{
    @Override                                    //says that the overriding is done or not... method should be same for overrides
     void meth2(){    //remember to use public before identifiers or don't use  public in base class
        System.out.println("i am the over ride method meth2  of class b");
    }
    void meth3(){
        System.out.println("i am method meth3 from class b");
    }
}

public class ch10_method_overriding {    //changing of any method of base class via extends class
    public static void main(String[] args) {
        a  A = new a();
        System.out.println(A.meth1());
        A.meth2();
        b B = new b();
        B.meth2();
        B.meth3();
    }
}
