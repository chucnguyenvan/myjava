package Mangvaphuongthuctrongjava.Baitap_xoaptkhoimang;

import java.util.Scanner;

public class DeleteElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Nhap vao so luong pt cua mang");
        size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Nhap vao cac Pt cua mang");
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhap vao pt " + i);
            array[i] = sc.nextInt();
        }
        System.out.println("nhap vao pt ban muon xoa");
        int deleteElement = sc.nextInt();
        boolean appearText = false;
        int dem = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == deleteElement) {
                appearText = true;
                System.out.println("vi tri xuat hien " +i);
            }
        }
        if (appearText) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == deleteElement) {
                    for (int j = i; j < array.length - 1; j++) {
                        array[j] = array[j + 1];
                    }
                    i--;
                    dem++;
                    array[array.length-dem]=0;
                }
            }
        } else {
            System.out.println("Khong co PT ban muon xoa");
        }
        for (int i = 0; i < array.length - dem; i++) {
            System.out.println(array[i]);
        }
    }
}
