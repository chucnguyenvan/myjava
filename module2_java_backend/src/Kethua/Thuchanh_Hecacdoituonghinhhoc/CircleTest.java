package Kethua.Thuchanh_Hecacdoituonghinhhoc;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.toString());

        circle = new Circle(3.5);
        System.out.println(circle.toString());
        System.out.println(circle.getColor());
        circle = new Circle("indigo", false, 3.5);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle("orange", true, 2.5, 3.8);
        System.out.println(rectangle);

        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square("yellow", true, 5.8);
        System.out.println(square);
    }

}
