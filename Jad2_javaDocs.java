/**
 * this class is to demonstrate what javadoc is and how it is used in the java industry by Aman
 * this is <i>italic</i> <b> bold </b>words<p> this is new para</p>
* @author Aman Java(codeWithAman)
 * @version 0.a.1
*@since 2025,feb
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html"target=_blank>Java Docs</a>
*/




public class Jad2_javaDocs {
/**
 * this is giving sum
 */
    public static void sum(int a, int b){
        System.out.println("the sum of the numbers is "+ (a+b));
    }
/**
 * this is welcoming method
 */
    public static void start(){
        System.out.println("this is method of main class");
    }

    public static void main(String[] args) {
        sum(5,4);
    }
}
