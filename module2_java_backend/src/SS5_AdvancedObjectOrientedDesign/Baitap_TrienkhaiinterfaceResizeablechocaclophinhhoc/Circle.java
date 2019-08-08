package SS5_AdvancedObjectOrientedDesign.Baitap_TrienkhaiinterfaceResizeablechocaclophinhhoc;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public  double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double getPrime() {
        return Math.PI * 2 * this.radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + getRadius()
                + ", which is a subclass of " + super.toString()+" dien tich "+this.getArea()+"chu vi: "+this.getPrime();
    }

    @Override
    public void resize(double percent) {
        this.radius = this.radius*percent/100;
    }
}
