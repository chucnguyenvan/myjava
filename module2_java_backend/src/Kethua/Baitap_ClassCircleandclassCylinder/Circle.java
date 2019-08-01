package Kethua.Baitap_ClassCircleandclassCylinder;

public class Circle {
    private double radius=1.0;
    private  String color="green";
    public double getArea(){
        return Math.PI*Math.pow(this.radius,2);
    }
    public double getPerimeter(){
        return Math.PI*this.radius*2;
    }

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ban kinh: "+this.getRadius()+" Color "+this.getColor()+" dien tich "+this.getArea();
    }
}
