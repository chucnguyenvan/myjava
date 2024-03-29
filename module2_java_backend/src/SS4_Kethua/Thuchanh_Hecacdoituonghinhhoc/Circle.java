package SS4_Kethua.Thuchanh_Hecacdoituonghinhhoc;

public class Circle extends HinhHoc {
    private double radius=1.0;

    public Circle() {
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getPerimeter() {
        return Math.PI * 2 * this.radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + getRadius()
                + ", which is a subclass of " + super.toString();
    }
}
