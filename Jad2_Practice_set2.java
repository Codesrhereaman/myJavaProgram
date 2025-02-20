import java.io.FileWriter;
import java.io.IOException;

interface I1{
    void meth2();
    }
class MyDprecated implements I1{
    @Deprecated
    void meth1(){
        System.out.println("i am deprecated method");
    }
    public void meth2(){
        System.out.println("i am interface");
    }
}
public class Jad2_Practice_set2 {

    //Q3 adding supress warning
    @SuppressWarnings("deprecated")
    public static void main(String[] args) {

        //Q2
        MyDprecated myDprecated = new MyDprecated();
        myDprecated.meth1();  //deprecated warning will showned here

        //Q4
//        myDprecated.meth2();
//        I1 i = new MyDprecated();
//        i.meth2();

        //enhanced method
//        I1 i = () -> System.out.println("hello i am interface");

        //Q5
        int n = 5;
        int a =1;
        String table ="";
        for (int j = 1; j <= 10; j++) {
            table += n + " X " + j + " = " +n*j +"\n";
        }
        try {
            FileWriter myfile = new FileWriter("MultiplicationTable.txt");
            myfile.write(table);
            myfile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
