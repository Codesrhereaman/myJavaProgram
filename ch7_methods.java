public class ch7_methods {
    //to use a method repeatedly/we can create a logic(a function) basically like template to call it whenever same method
    // be used with a static command in class not in main
    static int method(int a,int b){  //if not static then have to create a object to call it out
        int c;
        if(b>a){
            System.out.println("second number is greater");
            c = (b-a)/2;
            System.out.println(c);
        }
        else if(a>b){
            System.out.println("first number is greater");
            c = (a-b)/2;
            System.out.println(c);
        }
        else{
            System.out.println("both are equal in value");
            c=0;
            System.out.println(c);
        }
        return c;
    }
     int max(int[]arr){
        int min = Integer.MAX_VALUE;
        for(int ele : arr){
            if(min>ele){
                min = ele;
            }
        }
        System.out.println(min);
        return min;
    }




    public static void main(String[] args) {
        //suppose we have to do a simple task repeatedly
        //suppose we have to do it with two or more value
        //we have to write the same codes again, but we can solve this by using method in class
        int a1 = 54;
        int b1 = 50;
        int c1 = method(a1, b1);
        int a2 = 3;
        int b2 = 7;
        int c2 = method(a2, b2);
        //in these ways , we can call out static logics to run the same type of tasks


        //if  you don't want to use static cmd then have to create an object of the class just ike Scanner object or random object
//        ch7_methods obj = new ch7_methods();
//        int a2 =3;
//        int b2 =3;
//        int c2 = obj.method(a2,b2);

        //second static method calling
//        int []vrr ={6,1,47,5,5,4,1,4};
//        int mini = max(vrr);
        //if static not using then create object and call the method
        int []vrr ={6,1,47,5,5,4,1,4};
        ch7_methods ob = new ch7_methods();
        int mini = ob.max(vrr);


    }
}
