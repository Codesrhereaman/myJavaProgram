class cylinder{
    private float radius;
    private float height;

    public cylinder(int radius,int height){
        this.radius = radius;
        this.height = height;
    }
    public float getHeight() {
        return height;
    }

    public float getRadius() {
        return radius;
    }

//    public void setHeight(float height) {
//        this.height = height;
//    }
//
//    public void setRadius(float radius) {
//        this.radius = radius;
//    }

    double calarea(){
        return (Math.PI*radius*radius*(radius+height));  //math.PI can be used for the value of pie
    }
    double calvol(){
        return (Math.PI*radius*radius*height);
    }

}
class rectangle {
    private int len;
    private int width;

    public rectangle() {
        this.len = 4;
        this.width = 5;
    }

    public rectangle(int len,int width) {
        this.len = len;
        this.width = width;

    }

    public int getWidth() {
        return width;
    }

//    public void setWidth(int width) {
//        this.width = width;
//    }

    public int getLen() {
        return len;
    }

//    public void setLen(int len) {
//        this.len = len;
//    }
}

public class ch9_practice_set {
    public static void main(String[] args) {


        //Q1
        cylinder c = new cylinder(3,4);
//        c.setRadius(3.0f);
//        c.setHeight(4.0f);
        System.out.println(c.getHeight());
        System.out.println(c.getRadius());

        //Q2
        double a = c.calarea();
        System.out.printf("%.3f\n",a);
        System.out.println(c.calvol());

        //Q3
        //done for creating constructor cylinder


        //Q4
        rectangle rec = new rectangle();
        rectangle r = new rectangle(10,15);
        System.out.println(rec.getLen());
        System.out.println(rec.getWidth());
        System.out.println(r.getWidth());
        System.out.println(r.getLen());


    }
}
