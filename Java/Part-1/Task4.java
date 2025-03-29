// 4) Geometry Tutor (OOP)

abstract class Shape{
    public abstract double getArea();
}

class Circle extends Shape{
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape{
    private double length,width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        return length * width;
    }
}
public class Task4{
    public static void main(String[] args) {
        Shape[] shapes={new Circle(10),new Rectangle(10,20 )} ;
        for (Shape shape:shapes){
            System.out.println("Area: "+ shape.getArea());
        }
    }
}