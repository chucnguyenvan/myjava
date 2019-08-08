package SS4_Kethua.Thuchanh_Hecacdoituonghinhhoc;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double size) {
        super(size, size);
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled, size, size);
    }
    public void setSiZe(double size){
        super.setWidth(size);
        super.setHeight(size);
    }
    public double getSiZe(){
        return super.getWidth();
    }

    @Override
    public void setHeight(double height) {
        this.setSiZe(height);
    }

    @Override
    public void setWidth(double width) {
       this.setSiZe(width);
    }

    @Override
    public String toString() {
        return "A Square with side="+this.getSiZe()+", which is a subclass of "+super.toString();
    }
}
