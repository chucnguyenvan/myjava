package SS5_AdvancedObjectOrientedDesign.Baitap_TrienkhaiinterfaceResizeablechocaclophinhhoc;

public class Square extends Rectangle implements Resizeable {
    public Square() {
    }

    public Square(double size) {
        super(size, size);
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled, size, size);
    }

    public double getSize() {
        return super.getHeight();
    }

    public void setSize(double size) {
        super.setHeight(size);
    }

    @Override
    public String toString() {
       return "A Square with side= "+this.getSize()+" Area "+ this.getArea()+" Chu vi: "+this.getPrime()
               +" color :"+this.getColor()+" and "+this.isFilled();
    }

}
