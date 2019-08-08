package SS5_AdvancedObjectOrientedDesign.Baitap_TrienkhaiinterfaceResizeablechocaclophinhhoc;

public class CircleTest {
    public static void main(String[] args) {
        Circle[] circles =new Circle[3];
        circles[0]=new Circle();
        circles[1]=new Circle(3.0);
        circles[2]=new Circle("blue",true,3.0);
        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        circles[1].resize(150);
        circles[2].resize(200);
        circles[0].resize(50);
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
