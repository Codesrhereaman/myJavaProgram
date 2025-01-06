public class ch7_variable_arguments {

//    static int sum(int a,int b){
//        return a+b;
//    }
//    static int sum(int a,int b,int c){
//        return a+b+c;
//    }
//    static int sum(int a,int b,int c,int d){
//        return a+b+c+d;
//    }
    //when doing a method repeatedly with so,e changes then varargs is used to make it easier with just one method
    static int sum(int a ,int ...arr){
        //now this is like int[]arr available to accept values
        int result = a;
        for (int ele : arr){
            result  += ele;
        }
        return result;
    }
    public static void main(String[] args) {
        //System.out.println("the sum of nothing is: " + sum()); //means arr has 0 value....result will be 0
        System.out.println("the sum of 5,4 is: " + sum(5,4));
        System.out.println("the sum of 6 ,4 and 3 is: " + sum(6,4,3));
        System.out.println("the sum of 5,4,8 and 7 is: " + sum(5,4,8,7));
        //to make at least one value compulsory add int 'a' along with ...arr
        //System.out.println("the sum of nothing is: " + sum());   //now this will throw an error
    }
}
