package ngongulaptrinhjava.ungdungchuyendoitiente;

import java.util.Scanner;

public class ungdungchuyendoitiente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so tien dola");
        long dola= sc.nextInt();
        final int TIGIADOLA=23000;
        long vnd=  dola*TIGIADOLA;
        System.out.println("Doi ra tien Vnd la: "+vnd);
    }
}
