package SS1_ngongulaptrinhjava.Thuchanh_kiemtranamnhuan;

import java.util.Scanner;

public class kiemtranamnhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao 1 nam:");
        int year = sc.nextInt();
        if(year%4!=0){
            System.out.println(year+" khong phai la nam nhuan");
        }else if(year%100!=0){
            System.out.println(year+" la nam nhuan");
        }else if(year%400!=0){
            System.out.println(year+" Khong phai la nam nhuan");
        }else System.out.println(year+"la nam nhuan");
    }
}
