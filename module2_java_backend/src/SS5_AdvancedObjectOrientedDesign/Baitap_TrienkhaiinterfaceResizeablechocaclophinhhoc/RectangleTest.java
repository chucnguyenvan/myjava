package SS5_AdvancedObjectOrientedDesign.Baitap_TrienkhaiinterfaceResizeablechocaclophinhhoc;

class RectangleTest {
    public static void main(String[] args) {
        Rectangle [] rectangles = new Rectangle[3];
        rectangles[0]= new Rectangle();
        rectangles[1]=new Rectangle(3.0,5.0);
        rectangles[2]=new Rectangle("yellow",true,4.0,6.0);
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
        rectangles[0].resize(150);
        rectangles[1].resize(200);
        rectangles[2].resize(50);
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }
}