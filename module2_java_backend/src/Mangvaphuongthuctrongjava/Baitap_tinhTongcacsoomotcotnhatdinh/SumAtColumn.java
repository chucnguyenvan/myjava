package Mangvaphuongthuctrongjava.Baitap_tinhTongcacsoomotcotnhatdinh;

import java.util.Scanner;

public class SumAtColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array;
        int row;
        System.out.println("nhap vao so hang:");
        row = sc.nextInt();
        int colum;
        System.out.println("nhap vao so cot:");
        colum = sc.nextInt();
        array = new int[row][colum];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.println("Nhap vao array[" + i + "][" + j + "]");
                array[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        int sum = 0;
        int indexColum;
        do {
            System.out.println("nhap vao cot ban muon tinh tong:");
            indexColum = sc.nextInt();
            if (indexColum < 0 || indexColum > colum - 1) {
                System.out.println("ban nhap cot khong hop le");
            }
        } while (indexColum < 0 || indexColum > colum - 1);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == indexColum) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Tong cac so cua cot " + indexColum + "la:" + sum);
    }
}
