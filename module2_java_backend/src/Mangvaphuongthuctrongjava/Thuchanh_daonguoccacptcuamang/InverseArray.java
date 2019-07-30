package Mangvaphuongthuctrongjava.Thuchanh_daonguoccacptcuamang;

import java.util.Scanner;

public class InverseArray {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.print("Enter a size:");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        }while (size>20);
        array =new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhap vao pt thu "+i);
            array[i]=sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+"\t");
        }
        for (int i = 0; i < array.length/2; i++) {
            int temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }
        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+"\t");
        }
    }
}
