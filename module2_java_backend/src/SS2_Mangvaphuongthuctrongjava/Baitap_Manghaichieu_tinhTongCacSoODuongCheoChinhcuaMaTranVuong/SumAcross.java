package SS2_Mangvaphuongthuctrongjava.Baitap_Manghaichieu_tinhTongCacSoODuongCheoChinhcuaMaTranVuong;

import java.util.Scanner;

public class SumAcross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array;
        int size;
        System.out.println("nhap vao so pt 1 hang:");
        size=sc.nextInt();
        array =new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0;j < size; j++) {
                System.out.println("Nhap vao array["+i+"]["+j+"]");
                array[i][j]=sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Tong cac so duong cheo chinh " + sum);
    }
}
