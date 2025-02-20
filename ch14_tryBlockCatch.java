public class ch14_tryBlockCatch {
    public static void main(String[] args) {
        int a = 9000,b=0;
//try and catch block can be used to try run the program if failed catch the exception and show but system don't failed
        try {
            System.out.println(a / b);
        }
        catch(Exception fail){
            System.out.println("we failed to execute the program due to: ");
            System.out.println(fail);
        }
        System.out.println("program ended");  //this will printed instead of arthmetic exception
    }
}
