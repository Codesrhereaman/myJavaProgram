// inheritance used to use a class fully without writing its code and also changes of previous class will occur directly in new one
 class  base{       //super class
    public int x;


    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("i am in base and setting up x for me");
        this.x = x;
    }
}
class derived extends base{
    public int y;


    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

//quick quiz
class animal{
    String  habit;

    public String getHabit() {
        return habit;
    }

    public void setHabit(String habit) {
        this.habit = habit;
    }
}
class dog extends animal{

}

public class ch10_inheritance {
    public static void main(String[] args) {
        base b = new base();
        //derived  b = new derived();  // by this i can access x from base class and also from derived class
        b.setX(200);
        System.out.println(b.getX());
        //we can't access y from base class as derived is the extended version of base not vice-versa
        derived d = new derived();
        d.setY(100);
        System.out.println(d.getY());


        //quiz sol
        dog dg = new dog();
        dg.setHabit("Dogs used to barking at the strangers");
        System.out.println(dg.getHabit());

    }
}
