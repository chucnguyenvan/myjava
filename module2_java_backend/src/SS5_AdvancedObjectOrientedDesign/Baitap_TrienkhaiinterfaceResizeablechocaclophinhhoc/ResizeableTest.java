package SS5_AdvancedObjectOrientedDesign.Baitap_TrienkhaiinterfaceResizeablechocaclophinhhoc;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[4];
        shapes[0]=new Circle();
        shapes[1]=new Rectangle();
        shapes[2]=new Square();
        shapes[3]=new Rectangle();
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        shapes[0]=(Circle)(shapes[0]);
        shapes[1]=(Rectangle)shapes[1];
        shapes[2]=(Square)shapes[2];
//        shapes[3]=(Square)shapes[3];
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
