public class ch3_parctice_set {
    public static void main(String[] args){
        //Q1
        String s = "Peter PARKER";
        System.out.println(s.toLowerCase());
        //Q2
        String str = " Studio pedia";
        System.out.println(str.replace(" ","_"));
        //Q3
        String letters = "Dear <|name|>,Thanks a lot!";
        System.out.println(letters.replace("<|name|>","Aman"));
        //Q4
        String my = "this string contains double  and triple   spaces";
        System.out.println(my.indexOf(" "));
        System.out.println(my.indexOf("   "));
        //Q5
        String letter = "Dear Harry \n\t  This Java Course is nice \n\t\t Thanks!!";
        System.out.println(letter);




    }
}
