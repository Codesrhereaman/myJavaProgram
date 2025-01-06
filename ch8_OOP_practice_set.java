class employe{
    String name;
    int salary;

    public String getname(){
        return name;
    }
    public int getsalary(){
        return salary;
    }
    public void setname(String n){
        name = n;
    }
}
class cellphone{
    public void incomingcall(){
        System.out.println("ringing....ringing...ringing....");
    }
    public void silentcall(){
        System.out.println("vibrating...vibrating...vibrating...");
    }
}
class square {
    int side;

    public int area() {
        return side*side;
    }

    public int peri() {
        return  4*side;
    }
}
class rect{
    int length;
    int width;

    public int area() {
        return length*width;
    }
    public int peri() {
        return  2*(length+width);
    }
}
class circle{
    float radius;

    public float area() {
        return (22*radius*radius)/7;
    }

    public float circum() {
        return  (2*radius*22)/7;
    }
}
class tv{
    public void hit(){
        System.out.println("enemy is a head...");
    }
    public void run(){
        System.out.println("running...away from the enemy");
    }
    public void fire(){
        System.out.println("firing from the enemy...");
    }
}



public class ch8_OOP_practice_set {
    public static void main(String[] args){

        //Q1
        employe ajay = new employe();
        ajay.name = "ajay mathur";    //given ajay name = ajay mathur
        ajay.setname("Aman Sharma");    //change name from ajay mathur to aman sharma by using method setname()
        ajay.salary = 70000;

        System.out.println(ajay.getname());
        int salary  = ajay.getsalary();
        System.out.println(salary);

        //Q2
        cellphone mi = new cellphone();
        mi.incomingcall();
        mi.silentcall();

        //Q3
        square square1 = new square();
        square1.side = 58;
        System.out.println(square1.peri());
        System.out.println(square1.area());

        //Q4
        rect  r1 = new rect();
        r1.length = 3;
        r1.width = 2;

        System.out.println(r1.area());
        System.out.println(r1.peri());

        //Q5
        circle cr = new circle();
        cr.radius  =12;
        System.out.printf("the value of area is %.3f cm^2\n",cr.area());
        System.out.printf("the circumference of cr is %.3f cm^2",cr.circum());

        //Q6
        tv player1 = new tv();
        player1.run();
        player1.fire();
        player1.hit();

    }
}
