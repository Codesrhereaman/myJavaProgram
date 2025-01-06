public class ch2_precendence {
    public static void main(String[] args) {
//        int a = 3*2-10/5;
//        System.out.println(a);
        /*java compiler solve these types by precedence order and if order same then associativity
        =6-10/5
        =6-2
        =4
         */
//      int b = 60/(5-4)*5;
//        System.out.println(b);
        /*
        =60/1*5
        =60*5
        =300
         */


        // quick quiz
//        int x = 4;
//        float y = 2;
//        float k = (x-y)/2;
//        System.out.println(k);
        float b = 3;
        float a = 2;
        float c = 1;
        float l = (b*b - 4*a*c)/(2*a);//first solve parantheses() then left to right everything
        System.out.println(l);



    }
}
