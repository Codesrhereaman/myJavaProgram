//we can extend interface to interface but can not extend an interface to class
interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class MySampleInterface implements childSampleInterface{
    @Override
    public void meth1(){
        System.out.println("i am meth 1 from interface 1");
    }
    @Override
    public void meth2(){
        System.out.println("i am meth 1 from interface 2");
    }
    @Override
    public void meth3(){
        System.out.println("i am meth 1 from interface 3");
    }
    @Override
    public void meth4(){
        System.out.println("i am meth 1 from interface 4");
    }
}

public class ch11_inheritance_inInterface {
    public static void main(String[] args) {
        MySampleInterface ms= new MySampleInterface();
        ms.meth1();
        ms.meth2();
        ms.meth3();
        ms.meth4();
    }
}
