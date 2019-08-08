package SS5_AdvancedObjectOrientedDesign.Baitap_trienkhaiinterfaceColorablechocaclophinhhcc;

public class SquareTest {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[2];
        shapes[0]=new Square();
        shapes[1]=new Rectangle();
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        for (Shape shape : shapes) {
            if(shape instanceof Square){
                Colorable colorable = (Square)shape;
                colorable.howToColor();
            }
        }
    }
}
