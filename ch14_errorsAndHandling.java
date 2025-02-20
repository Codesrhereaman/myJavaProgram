import java.util.*;
public class ch14_errorsAndHandling {
    static void prime(int n){
        for(int i =2; i<Math.sqrt(n); i++){
          if(n%i==0){
                System.out.println("no is not prime");
                return;
            }
        }
        System.out.println("no is prime");
    }
    public static void main(String[] args) {

        //syntax error are main built error --> semicolon...etc
        Scanner sc = new Scanner(System.in);

        //logical error: if logic is not correct but syntax is right then it occurs
        System.out.print("Enter the no to check whether a prime or not: ");
        int n = sc.nextInt();
        prime(n);

        /* runtime errors: occur at the time of working of the code due to bug input
        like divide by 0, log to base 0 */
        
    }
}
