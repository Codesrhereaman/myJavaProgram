
class ekclass{
    int a;

    public int getA() {
        return a;
    }

    ekclass(int a){
        this.a = a;   //a=a gives 0 as java get confused
        System.out.printf("mai ekclass ka ek constructor hum jismai a ki value %d hai\n",a);
    }
    public int return1(){
        return 1;
    }
}
class doclass extends ekclass{
    doclass (int a,int b){
        super(a);

        System.out.printf("mai doclass ka ek constructor hun aur meri class mai b ki value %d hai\n",b);
    }
}

public class ch10_this_super_inINHERTITANCE {
    public static void main(String[] args) {
//        ekclass e = new ekclass(100);
//        System.out.println(e.getA());
        doclass d = new doclass(10000,20000);
        System.out.println(d.return1());

    }
}
