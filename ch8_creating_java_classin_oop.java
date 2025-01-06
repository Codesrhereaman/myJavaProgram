
 class employee{            //only  one public class is in one java file
    int id;
    String name;
    int salary;
    public void details(){
        System.out.println("my id is "+ id);
        System.out.println("my name is "+ name);
    }
    public int getsalary(){
        return salary;
    }
}
public class ch8_creating_java_classin_oop {
    public static void main(String[] args) {
        System.out.println("this is my first custom class");
        employee Aman = new employee();    //instantiation of  a new Aman object
        employee john = new employee();    //instantiation of  a new john object

        //adding attributes for aman
        Aman.id = 11;
        Aman.name = "aman sharma";
        Aman.salary = 3000000;
        //adding attributes for john
        john.id = 13;
        john.name = "john pandey";
        john.salary = 2000000;

        //printing  the  attributes
//        System.out.println(Aman.id);
//        System.out.println(Aman.name);
        Aman.details();
        john.details();
//      int sal = john.getsalary();
//      System.out.println(sal);   or
        System.out.println(john.getsalary());
    }
}
