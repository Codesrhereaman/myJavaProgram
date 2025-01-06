public class ch7_practice_set {
        static void table(int n){
            for(int i = 1; 10>=i; i++){
                System.out.format("%d X %d = %d\n",n,i,n*i);
            }
        }
    static void pattern1(int a){
            for(int i = 1; i<=a; i++){
                for(int j = 1; j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }
    static int sum(int c){
            //base condition which stop this method at n=1
            if(c==1){
                return 1;
            }
            else{
                return c + sum(c-1);
            }

    }
    static void pattern2(int a){
        for(int i = a; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static float avg(int...arr){
           float result = 0;
            for(int ele:arr){
                result += ele;
            }
        System.out.println(result/(arr.length));
            return result;
    }
    static void pattern1_rec(int n){
        if(n>0) {
            pattern1_rec(n - 1);
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2_rec(int n){
        if(n>0) {

            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
            pattern2_rec(n - 1);
        }
    }
    static float temp(int a) {
        float change = 0;
        change = (a*9/5f)+32f;
        System.out.println(change);
        return change;
    }
    public static void main(String[] args) {
            //Q1
//            table(9);

            //Q2
//            pattern1(50);

            //Q3
//        System.out.println(sum(5));

        //Q4
//        pattern2(5);

        //Q6
//        avg(5,8,7,4,1,2,8,14);
        /*int []vrr = {5,8,7,4,1,2,8,14};
        avg(vrr);     this also works */

        //Q7
//        int a = 5;
//        pattern1_rec(a);

        //Q8
        pattern2_rec(5);

        //Q9
        temp(36);
    }
}
