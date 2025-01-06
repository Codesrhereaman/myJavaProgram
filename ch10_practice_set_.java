class circle1 {
    public int radii ;
    circle1(int r){
        this.radii = r;
    }
    double area(){
        return Math.PI*this.radii*this.radii;
    }


}
class cylinder1 extends circle1{
    public  int height;

    cylinder1(int r,int h) {
        super(r);   //super cmd must be on top
        this.height = h;
    }

    double volume(){
        return  Math.PI*this.height*this.radii*this.radii;
    }
    double calarea(){
        return  (Math.PI*2*this.radii)*(this.radii+this.height);
    }
}
class rect1{
    public int length;
    public int width;
    rect1(int l,int w){
        this.length = l;
        this.width = w;
    }
    double area(){
        return this.length*this.width;
    }
    public int getWidth() {
        return width;
    }
    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public void setLength(int length) {
        this.length = length;
    }
}
class cuboid extends rect1{
    public int height;
    cuboid(int l, int w,int h){
        super(l,w);
        this.height = h;
    }
    double vol(){
        return this.length*this.width*this.height;
    }
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}


public class ch10_practice_set_ {
    public static void main(String[] args) {
        //Q1 and Q3
//
        cylinder1 cy = new cylinder1(3,5);
//        System.out.println(cy.area());
//        System.out.println(cy.calarea());
          //Q2 and Q4
        cuboid cb = new cuboid(2,3,4);
        System.out.println(cb.vol());
        System.out.println(cb.area());

        //Q5
        //first base constructor run and then derived1 and then derived 2
    }
}
