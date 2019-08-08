package SS4_Kethua.Baitap_ClassCircleandclassCylinder;

public class TestCircle {
    public static void main(String[] args) {
        Circle cir = new Circle("indigo", false, 1.0);
        cir.setRadius(2.0);
        cir.setColor("blue");
        System.out.println(cir);
        System.out.println("HINH TRU");
        Cylinder cyl = new Cylinder();
        cyl.setHeight(2.0);
        System.out.println(cyl);
    }
}
