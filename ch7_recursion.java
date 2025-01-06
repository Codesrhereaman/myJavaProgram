public class ch7_recursion{
    static int factorial(int n){   //method 1...recursive approach
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    static int factorial_it(int n){   //method 2.... iterative approach
        if(n==0 || n==1){
            return 1;
        }
        else {
            int product = 1;
            for (int i = n; i >= 1; i--) {
                product *= i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        // recursion means calling of a function to itself by repeating itself continuously
        //let you have to find the factorial of a number
        //factorial(n) = n * n-1 * .......1
        //factorial(0) = 1
        int x = 15;  //by m1
        System.out.println("the value of  factorial  n is: " + factorial(x));
        int y = 15;   //by m2
        System.out.println("the value of  factorial  n is: " + factorial_it(y));
    }
}
