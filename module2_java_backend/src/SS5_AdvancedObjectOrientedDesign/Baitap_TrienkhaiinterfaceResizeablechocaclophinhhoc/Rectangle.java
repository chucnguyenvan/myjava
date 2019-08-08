package SS5_AdvancedObjectOrientedDesign.Baitap_TrienkhaiinterfaceResizeablechocaclophinhhoc;

public class Rectangle extends Shape implements Resizeable {
    private double width=1.0;
    private double height=1.0;
    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void resize(double percent) {
        this.height=this.height*percent/100;
        this.width = (this.width * percent) / 100;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.getHeight()*this.getWidth();
    }

    @Override
    public double getPrime() {
        return (this.getHeight()+this.getWidth())*2;
    }

    @Override
    public String toString() {
        return "Cdai: "+this.getHeight()+" Crong: "+this.getWidth()
                + "Chu vi: "+this.getPrime()+"Dien tich: "+this.getArea()+
                "Color "+this.getColor() +" and "+this.isFilled();
    }

}
