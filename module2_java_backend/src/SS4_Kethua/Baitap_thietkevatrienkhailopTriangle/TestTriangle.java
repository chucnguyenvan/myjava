package SS4_Kethua.Baitap_thietkevatrienkhailopTriangle;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Triangle tamgiac=new Triangle();
        System.out.println("nhap vao canh thu a:");
        tamgiac.setSide1(sc.nextDouble());
        System.out.println("nhap vao canh thu b:");
        tamgiac.setSide2(sc.nextDouble());
        System.out.println("nhap vao canh thu c:");
        tamgiac.setSide3(sc.nextDouble());
        System.out.println("nhap vao mau cua tam giac:");
        sc.nextLine();
        tamgiac.setColor(sc.nextLine());
        System.out.println(tamgiac);
    }
}
