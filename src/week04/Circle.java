package week04;

class Circle{
    public int radius;
    public String name;
    public final double PI = 3.14;
    public double getArea (){
        return radius * radius * PI;
    }

    public Circle (int radius, String name){
        this.radius=radius;
        this.name=name;
    }
    public Circle(){}

    public String toString(){
        return "("+this.name + ", " + this.radius+")";
    }
}