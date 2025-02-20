//finally is used when you want to return from any function or loops or code ...but with any msz or any cmd
//it works even the error occurred  or not or any return  statement
public class ch14_finally_Block {
    public static int greet(){
       try{
           int a = 4;
           int b =0;
           return a/b;
       }
       catch(Exception e){
           System.out.println(e);
       }
       finally{
           System.out.println("cleaning the logics...program executed");
       }
       return -1;
    }
    public static void main(String[] args) {
        //finally for return works
//        int k = greet();
//        System.out.println(k);

        //finally for break and loop works
        int a  =20;
        int b =5;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;  // finally is work even after break
            }
            finally{
                System.out.println(" i am finally done at value of b = "+b);
            }
            b--;
        }
    }
}
