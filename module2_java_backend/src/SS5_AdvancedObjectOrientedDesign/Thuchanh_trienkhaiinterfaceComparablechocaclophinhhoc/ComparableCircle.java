package SS5_AdvancedObjectOrientedDesign.Thuchanh_trienkhaiinterfaceComparablechocaclophinhhoc;

public class ComparableCircle extends Cricle implements Comparable<ComparableCircle>{

    public ComparableCircle() {
    }
    public ComparableCircle(double radius, String color) {
        super(radius, color);
    }

    @Override
    public String toString() {
        return "ComparableCircle{radius=" + super.getRadius() +"color="+this.getColor() + "}";
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}
