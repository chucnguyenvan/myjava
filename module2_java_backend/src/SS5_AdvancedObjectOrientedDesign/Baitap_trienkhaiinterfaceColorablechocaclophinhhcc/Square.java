package SS5_AdvancedObjectOrientedDesign.Baitap_trienkhaiinterfaceColorablechocaclophinhhcc;

public class Square extends Shape implements Colorable {
    private double size=1.0;

    public Square() {
    }

    public Square(double size) {
        this.size = size;
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public double getArea() {
        return Math.pow(this.getSize(),2);
    }

    @Override
    public double getPrimeter() {
        return 4*this.getSize();
    }

    @Override
    public String toString() {
        return "Square{" + "size=" + size + " Area "
                +this.getArea()+"chu vi "+this.getPrimeter()+'}';
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
