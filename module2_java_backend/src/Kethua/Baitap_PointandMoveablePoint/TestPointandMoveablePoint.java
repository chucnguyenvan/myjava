package Kethua.Baitap_PointandMoveablePoint;

public class TestPointandMoveablePoint {
    public static void main(String[] args) {
        Point point =new Point();
        point.setXY(3.0f,5.0f);
        System.out.println(point);

        MoveablePoint poin = new MoveablePoint(3.0f,4.0f);
        System.out.println(poin);
        poin.move();
        System.out.println(poin);
        System.out.println(point);
    }
}
