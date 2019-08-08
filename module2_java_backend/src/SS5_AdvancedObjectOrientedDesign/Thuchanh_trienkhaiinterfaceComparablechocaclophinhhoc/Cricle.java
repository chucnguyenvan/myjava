package SS5_AdvancedObjectOrientedDesign.Thuchanh_trienkhaiinterfaceComparablechocaclophinhhoc;

public class Cricle {
    private double radius=1.0;
    private String color="Green";

    public Cricle() {
    }

    public Cricle(double radius, String color) {
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
        return "Cricle{" +"radius=" + radius +", color='" + color + '\'' + '}';
    }
}
