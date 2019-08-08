package SS5_AdvancedObjectOrientedDesign.Baitap_TrienkhaiinterfaceResizeablechocaclophinhhoc;

public class SquareTest {
    public static void main(String[] args) {
        Square[] squares=new Square[3];
        squares[0]=new Square();
        squares[1]=new Square(3.0);
        squares[2]=new Square("red",true,4.0);
        for (Square square : squares) {
            System.out.println(square);
        }
        squares[0].resize(200);
        squares[1].resize(150);
        squares[2].resize(50);
        for (Square square : squares) {
            System.out.println(square);
        }
    }
}
