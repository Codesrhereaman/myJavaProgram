
public class Jad2_javadoc_tags {
    /**
     * @see <a> target =_blank </a>
     * @param args these are arguments supplied to command line arguments
     */
    public static void main(String[] args) {
        System.out.println("i am main method in java docs");
    }

    /**
     * this method will be returning the sum of two numbers
     * @throws Exception if a is 0
     * @param a first number to add
     * @param b second number to add
     * @return  sum of two numbers
     * @deprecated please use + operator
     */
    public int add(int a,int b) throws Exception{
        if (a==0){
            throw new Exception();
        }
        int c = a+b ;
        return c;
    }
}
