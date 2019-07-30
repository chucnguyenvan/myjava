package Mangvaphuongthuctrongjava.Thuchanh_Timgiatrilonnhattrongmang;

import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhap vao element "+i);
            array[i]=scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
        int max=array[0];
        for (int i = 0; i < array.length; i++) {
            if(max<array[i]){
                max=array[i];
            }
        }
        System.out.println("The largest property value in the list is " + max );
    }
}
