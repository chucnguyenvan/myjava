package SS2_Mangvaphuongthuctrongjava.Gopmang;

import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        int size1,size2;
        Scanner sc=new Scanner(System.in);
        int[] array1,array2,array3;
        System.out.println("Nhap vao so Pt mang thu 1");
        size1=sc.nextInt();
        System.out.println("Nhap vao so Pt mang thu 2");
        size2=sc.nextInt();
        array1=new int[size1];
        array2=new int[size2];
        System.out.println("Nhap mang thu 1");
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Nhap vao gia tri "+i);
            array1[i]=sc.nextInt();
        }
        System.out.println("Nhap mang thu 2");
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Nhap vao gia tri "+i);
            array2[i]=sc.nextInt();
        }
        int size3=size1+size2;
        array3=new int[size3];
        for (int i = 0; i < array1.length; i++) {
            array3[i]=array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[i+array1.length]=array2[i];
        }
        System.out.println("Mang sau khi gop");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]+"\t");
        }
    }
}
