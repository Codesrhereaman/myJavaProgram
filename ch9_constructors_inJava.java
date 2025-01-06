//constructor in java used to remove the set__ thing and with the same class name it gives the input argument of class


class myemployee{
    private int id;
    private String name;
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public void setid(int n){
        n=id;
    }
    public void setname(String i){
        name = i;
    }
    //instead of them we can use public constructor
    public myemployee(){
        name = "developing with Aman";
        id = 0001;
    }
    public myemployee(String myname,int myid){
        name = myname;
        id = myid;
    }

}

public class ch9_constructors_inJava {
    public static void main(String[] args) {
        myemployee aman = new myemployee();
        //aman.setname("AMAN SHARMA JI");
        //aman.setid(001);
        System.out.println(aman.getname());
        System.out.println(aman.getid());
        myemployee aiman = new myemployee("codewithAiman",69);// by using this we can directly give argument of constructor
        System.out.println(aiman.getid());
        System.out.println(aiman.getname());

    }
}
